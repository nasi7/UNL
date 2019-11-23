

find :: Eq a => a -> [a] -> [Int]
-- find 'n' "nebraska" -> [0]
-- find 'a' "nebraska" -> [4,7]
-- find 'c' "nebraska" -> []
-- find 1 [3,1,4,1,5,9] -> [1,3]
find _ [] = []
find e (h:t)
	| e == h = [0] ++ (map (+ 1) (find e t))
	| otherwise = (map (+ 1) (find e t))

find2D :: Eq a => a -> [[a]] -> [(Int,Int)]
-- find2D 'a' ["alpha","bravo","charlie"] = [(0,0),(0,4),(1,2),(2,2)]
-- find2D 't' ["alpha","bravo","charlie"] = []
-- find2D 'v' ["alpha","bravo","charlie"] = [(1,3)]
find2D _ [] = []
find2D el (row:rows) = add ++ next
	where 	first = find el row
		add   = [(0,c)|c<-first]
		rest  = (find2D el rows)
		next  = [(r,c)|(a,c)<-rest,let r=a+1]




