evenSum :: Integral a => [a] -> a
evenSum [] = 0
evenSum (h:t)
	| (even h) = h + (evenSum t)
	| otherwise= (evenSum t)
