


getCol :: [[a]] -> Int -> [a]
-- getCol ["123","456","789"] 2 -> ["369"]
getCol [] _ = []
getCol (ro:ros) c = (getItem ro c):(getCol ros c)

getItem :: [a] -> Int -> a
getItem (h:t) 0 = h
getItem (h:t) i = getItem t (i-1)
