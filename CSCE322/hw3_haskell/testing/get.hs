

get :: [a] -> Int -> a
get (element:rest) 0 = element
get (element:rest) ind = get rest (ind-1)

get2D :: [[a]] -> (Int,Int) -> a
-- get2D ["alpha","bravo","charlie"] (r,c) -> something
get2D (row:rows) (0,c) = get row c
get2D (row:rows) (r,c) = get2D rows (r-1,c)
