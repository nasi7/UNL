

ourSize :: [[a]] -> (Int,Int)
-- ourSize (row:rows) = something
ourSize [] = (0,0)
ourSize (row:rows) = ((length (row:rows)),(length row))
