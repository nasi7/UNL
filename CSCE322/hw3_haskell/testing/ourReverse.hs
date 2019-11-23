




ourReverse :: [a] -> [a]
-- list = []
-- list = elment list
-- reverse "nebraska" = "aksarben"
-- reverse "racecar" = "racecar"
-- reverse [4] = [4]
ourReverse [] = []
ourReverse (element:rest) = (ourReverse rest) ++ [element]
