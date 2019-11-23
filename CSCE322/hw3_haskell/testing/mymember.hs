mymember :: Eq a => a -> [a] -> Bool
-- mymember 'a' "nebraska" = True
-- mymember 't' "nebraska" = False
mymember _ [] = False
mymember e (h:t) = e == h || (mymember e t)

