import           Data.Char
import           Data.List
import           Helpers
import           Prelude
import           System.Environment (getArgs)

-- The main method that will be used for testing / command line access
main = do
  args <- getArgs
  filename <- readFile (head args)
  (moves, maze) <- readMazeFile filename
  print "Result"
  printMaze (manyPlayersManySlides maze moves)

-- YOUR CODE SHOULD COME AFTER THIS POINT
manyPlayersManySlides :: [[Char]] -> [Char] -> [[Char]]
manyPlayersManySlides maze moves =
  manyPlayersManySlidesHelper maze moves players
  where
    players = take (length moves) tempPlayers
    tempPlayers = updatePlayerList allPlayers (quotient + 1)
    quotient = div (length moves) (length allPlayers)
    allPlayers = listAllPlayers maze

manyPlayersManySlidesHelper :: [[Char]] -> [Char] -> [Char] -> [[Char]]
manyPlayersManySlidesHelper maze [] [] = maze
manyPlayersManySlidesHelper maze (a:b) (c:d)
  | (find2D 'g' maze == []) = maze
  | otherwise = manyPlayersManySlidesHelper updatedMaze b d
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

updatePlayerList :: [Char] -> Int -> [Char]
updatePlayerList [] _ = []
updatePlayerList lst n = updatePlayerListHelper newLst
  where
    newLst = replicate n lst

updatePlayerListHelper :: [[Char]] -> [Char]
updatePlayerListHelper [[]]       = []
updatePlayerListHelper (row:rows) = row ++ updatePlayerListHelper (rows)

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
  | (nextChar == 'x' || (isMemberOf nextChar (take 9 ['1' ..])) == True) = 0
  | otherwise = 1

ourReverse :: [a] -> [a]
-- list = []
-- list = element list
-- reverse "nebraska" = "aksarben"
-- reverse "racecar" = "racecar"
-- reverse [4] = [4]
ourReverse []             = []
ourReverse (element:rest) = (ourReverse rest) ++ [element]

isMemberOf :: Eq a => a -> [a] -> Bool
-- isMemberOf 'a' "nebraska" = True
-- isMemberOf 't' "nebraska" = False
isMemberOf _ []    = False
isMemberOf e (h:t) = e == h || (isMemberOf e t)

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
