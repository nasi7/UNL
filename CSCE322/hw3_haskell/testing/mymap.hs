mymap :: (a->b) -> [a] -> [b]
-- mymap sqrt [1,4,9] = [1,2,3]
mymap _ [] = []
mymap f (h:t) = (f h):(mymap f t)
