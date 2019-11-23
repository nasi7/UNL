dropn :: Int -> [a] -> [a]
-- drop 4 "nebraska" = "aska"
dropn 0 list = list
dropn _ [] = []
dropn n (h:t)= dropn (n-1) t
