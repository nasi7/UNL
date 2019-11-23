grammar csce322a01part02;

@members {
int players = 0;
int countG = 0;
int xSymbols = 0;
int allSymbols = 0;
boolean up = false;
boolean down = false;
boolean left = false;
boolean right = false;
boolean isValid = true;
}

// tokens
SECTIONBEGIN: '{';
SECTIONEND: '}';
SECTIONTITLE: 'Moves' | 'Maze';
ASSIGNVALUE: '@';
UP: 'u';
DOWN: 'd';
LEFT: 'l';
RIGHT: 'r';
MAZE1: 'x';
MAZE2: '-';
MAZE3: 'g';
MAZE4: [0-9];
UNDERSCORE: '_';
ROWEND: '$';
MAZEBEGIN: '(';
MAZEEND: ')';
LISTBEGIN: '[';
LISTEND: ']';
WS: [ \t\r\n]+ { skip(); };

//rules 
mazeGame:
	(maze moves semanticRules EOF)
	| (moves maze semanticRules EOF);
moves:
	sectionBegin sectionTitle assignval listBegin moveSymbol listEnd sectionEnd;
moveSymbol:
	moveChar UNDERSCORE moveChar UNDERSCORE moveChar UNDERSCORE moveChar UNDERSCORE (
		moveChar UNDERSCORE
		| moveChar
	)+;
moveChar: moveUP | moveDOWN | moveLEFT | moveRIGHT;
moveUP: UP {up = true;};
moveDOWN: DOWN {down = true;};
moveLEFT: LEFT {left = true;};
moveRIGHT: RIGHT {right = true;};
maze:
	sectionBegin sectionTitle assignval mazeBegin firstRow column lastRow mazeEnd sectionEnd;
firstRow: maze1 maze1 maze1 maze1 maze1 maze1 maze1+ endRow;
lastRow: maze1 maze1 maze1 maze1 maze1 maze1 maze1+;
column: row row row row row+;
row: maze1 mazeChar mazeChar mazeChar mazeChar+ maze1 endRow;
maze1: MAZE1 {xSymbols++;allSymbols++;};
maze2: MAZE2 {allSymbols++;};
maze3: MAZE3 {countG++;allSymbols++;};
maze4: MAZE4 {allSymbols++;players++;};
mazeChar: maze1 | maze2 | maze3 | maze4;
sectionTitle: SECTIONTITLE;
sectionBegin: SECTIONBEGIN;
sectionEnd: SECTIONEND;
listBegin: LISTBEGIN;
listEnd: LISTEND;
mazeBegin: MAZEBEGIN;
mazeEnd: MAZEEND;
endRow: ROWEND;
assignval: ASSIGNVALUE;
semanticRules:
	{
    if(players > 4)
    {
        System.out.println("Semantic Violation: Rule 1");
        isValid = false;
    }
    if(countG > 1)
    {
        System.out.println("Semantic Violation: Rule 2");
        isValid = false;
    }
    if(xSymbols > (allSymbols/2))
    {
        System.out.println("Semantic Violation: Rule 3"); 
        isValid = false;    

    }
    if(up == false || down == false || left == false || right == false)
    {
        System.out.println("Semantic Violation: Rule 4");  
        isValid = false;  
    }
    if(isValid == true)
    {
        System.out.println("There are " + players + " players.");
    }
};
