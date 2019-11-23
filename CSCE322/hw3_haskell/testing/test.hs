canMove :: [[Char]] -> Char -> Char -> Int
canMove maze move player
  | move == 'r' =
    canMoveHelper (get2D maze (fst playerPos, (snd playerPos) + 1))
  | move == 'l' =
    canMoveHelper (get2D maze (fst playerPos, (snd playerPos) - 1))
  | move == 'u' =
    canMoveHelper (get2D maze ((fst playerPos - 1), snd playerPos))
  | move == 'd' =
    canMoveHelper (get2D maze ((fst playerPos + 1), snd playerPos))
  where
    playerPos = head (find2D player maze)

canMoveHelper :: Char -> Int
canMoveHelper nextChar
  | (nextChar == 'x' || (isMemberOf nextChar (take 9 ['1' ..])) == True) = 0
  | otherwise = 1
  
isMemberOf :: Eq a => a -> [a] -> Bool
-- isMemberOf 'a' "nebraska" = True
-- isMemberOf 't' "nebraska" = False
isMemberOf _ []    = False
isMemberOf e (h:t) = e == h || (isMemberOf e t)

get :: [a] -> Int -> a
-- get ["nebraska"] 5 -> 's'
get (element:rest) 0   = element
get (element:rest) ind = get rest (ind - 1)

get2D :: [[a]] -> (Int, Int) -> a
-- get2D ["alpha","bravo","charlie"] (1,3) -> 'v'
get2D (row:rows) (0, c) = get row c
get2D (row:rows) (r, c) = get2D rows (r - 1, c)

find2D :: Eq a => a -> [[a]] -> [(Int, Int)]
-- find2D 'a' ["alpha","bravo","charlie"] = [(0,0),(0,4),(1,2),(2,2)]
-- find2D 't' ["alpha","bravo","charlie"] = []
-- find2D 'v' ["alpha","bravo","charlie"] = [(1,3)]
find2D _ [] = []
find2D el (row:rows) = add ++ next
  where
    first = ourFind el row
    add = [(0, c) | c <- first]
    rest = (find2D el rows)
    next = [(r, c) | (a, c) <- rest, let r = a + 1]

ourFind :: Eq a => a -> [a] -> [Int]
-- ourFind 'n' "nebraska" -> [0]
-- ourFind 'a' "nebraska" -> [4,7]
-- ourFind 'c' "nebraska" -> []
-- ourFind 1 [3,1,4,1,5,9] -> [1,3]
ourFind _ [] = []
ourFind e (h:t)
  | e == h = [0] ++ (map (+ 1) (ourFind e t))
  | otherwise = (map (+ 1) (ourFind e t))
