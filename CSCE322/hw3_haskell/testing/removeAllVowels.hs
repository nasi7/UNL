

removeAllVowels :: [Char] -> [Char]
-- removeAllVowels "nebraska" = "n-br-sk-"
-- a,e,i,o,u are vowels
removeAllVowels "" = ""
removeAllVowels (h:t)
	| (member h "aeiou") 	= '-':(removeAllVowels t)
	| otherwise		= h:(removeAllVowels t)

member :: Eq a => a -> [a] -> Bool
member _ [] = False
member e (h:t) = (e == h) || (member e t)
