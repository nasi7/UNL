



quicksort :: Ord el => [el] -> [el]
quicksort [] = []
quicksort (f:r) = (quicksort [x|x<-r,x<=f]) ++ [f] ++ (quicksort [y|y<-r,y>f])