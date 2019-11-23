getRow :: [[Char]] -> Int -> [Char]
-- getRow ["alpha","bravo","charlie"] 1 -> "bravo"
getRow (row:rows) 0 = row 
getRow (row:rows) r = getRow rows (r-1)