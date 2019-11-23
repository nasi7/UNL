prefix :: [a] -> [a]
-- prefix "nebraska" = "nebrask"
prefix [it] = []
prefix (h:t)= h:(prefix t)
