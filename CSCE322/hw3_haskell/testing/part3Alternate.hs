-- YOUR CODE SHOULD COME AFTER THIS POINT
manyPlayersOneSlide :: [[Char]] -> [Char] -> [[Char]]
manyPlayersOneSlide maze moves =
  manyPlayersOneSlideHelper maze truncatedMoves players
  where
    players = listAllPlayers maze
    truncatedMoves = take playerCount moves
    playerCount = length (listAllPlayers maze)

manyPlayersOneSlideHelper :: [[Char]] -> [Char] -> [Char] -> [[Char]]
manyPlayersOneSlideHelper maze (a:b) (c:d) =
  manyPlayersOneSlideHelper updatedMaze b d
  where
    updatedMaze = onePlayerOneSlideHelper maze a c

onePlayerOneSlideHelper :: [[Char]] -> Char -> Char -> [[Char]]
onePlayerOneSlideHelper maze move player
  | (find2D 'g' maze == []) = maze
  | canMove maze move player == 0 = maze
  | otherwise = onePlayerOneSlideHelper updatedMaze move player
  where
    updatedMaze = set2D newPos player tempMaze
    tempMaze = set2D playerPos '-' maze
    newPos = getDirection playerPos move
    playerPos = head (find2D player maze)

listAllPlayers :: [[Char]] -> [Char]
listAllPlayers maze = listAllPlayersHelper maze allPlayers
  where
    allPlayers = take 9 ['1' ..]

listAllPlayersHelper :: [[Char]] -> [Char] -> [Char]
listAllPlayersHelper maze [] = []
listAllPlayersHelper maze (h:t)
  | find2D h maze == [] = listAllPlayersHelper maze t
  | otherwise = (h : listAllPlayersHelper maze t)

getDirection :: (Int, Int) -> Char -> (Int, Int)
getDirection (x, y) move
  | move == 'r' = (x, y + 1)
  | move == 'l' = (x, y - 1)
  | move == 'u' = (x - 1, y)
  | move == 'd' = (x + 1, y)

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
  | nextChar == 'x' = 0
  | otherwise = 1

ourReverse :: [a] -> [a]
-- list = []
-- list = element list
-- reverse "nebraska" = "aksarben"
-- reverse "racecar" = "racecar"
-- reverse [4] = [4]
ourReverse []             = []
ourReverse (element:rest) = (ourReverse rest) ++ [element]

getRow :: [[Char]] -> Int -> [Char]
-- getRow ["alpha","bravo","charlie"] 1 -> "bravo"
getRow (row:rows) 0 = row
getRow (row:rows) r = getRow rows (r - 1)

getCol :: [[a]] -> Int -> [a]
-- getCol ["123","456","789"] 2 -> ["369"]
getCol [] _       = []
getCol (ro:ros) c = (get ro c) : (getCol ros c)

set :: Int -> a -> [a] -> [a]
-- set 3 'x' "nebraska" = "nebxaska"
set 0 el (h:t) = (el : t)
set n el (h:t) = h : (set (n - 1) el t)

set2D :: (Int, Int) -> a -> [[a]] -> [[a]]
-- set2D (1,3) 'w' ["alpha","bravo","charlie"] = ["alpha","brawo","charlie"]
set2D (0, c) el (row:rows) = (set c el row) : (rows)
set2D (r, c) el (row:rows) = row : (set2D ((r - 1), c) el rows)

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
