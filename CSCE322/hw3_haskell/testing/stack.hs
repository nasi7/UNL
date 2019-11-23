



-- pop
-- push
-- size
-- peek
-- clear

pop :: [a] -> (a,[a])
pop (el:rst) = (el,rst)

push :: a -> [a] -> [a]
push el stack = (el:stack)

size :: [a] -> Integer
-- size stack = length stack
size [] = 0
size (el:rst) = 1 + (size rst)

peek :: [a] -> a
peek (el:rst) = el

clear :: [a] -> [a]
clear _ = []





