




set :: Int -> a -> [a] -> [a]
-- set 3 'x' "nebraska" = "nebxaska"
set 0 el (h:t) = (el:t)
set n el (h:t) = h:(set (n-1) el t)

set2D :: (Int,Int) -> a -> [[a]] -> [[a]]
-- set2D (1,3) 'w' ["alpha","bravo","charlie"] = ["alpha","brawo","charlie"]
set2D (0,c) el (row:rows) = (set c el row):(rows)
set2D (r,c) el (row:rows) = row:(set2D ((r-1),c) el rows)
