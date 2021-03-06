grammar csce322a01part01;

// tokens
SECTIONBEGIN: '{';
SECTIONEND: '}';
SECTIONTITLE: 'Moves' | 'Maze';
ASSIGNVALUE: '@';
MOVES: 'u' | 'd' | 'l' | 'r';
MAZE: 'x' | '-' | 'g' | [0-9]+;
NUM: [0-9];
UNDERSCORE: '_';
ROWEND: '$';
MAZEBEGIN: '(';
MAZEEND: ')';
LISTBEGIN: '[';
LISTEND: ']';
WS: [ \t\r\n]+ { skip(); };
ANYTHING: .;

//rules 
mazeGame: (sectionTitle | sectionBegin | sectionEnd | listBegin | listEnd | mazeBegin | mazeEnd | moveChar | underscore| mazeChar | endRow | assignval | number | error)* EOF{System.out.println("File Ending");};
sectionTitle: SECTIONTITLE {System.out.println("Section Title: " + $SECTIONTITLE.text);} | error;
sectionBegin: SECTIONBEGIN {System.out.println("Section Beginning: " + $SECTIONBEGIN.text);} | error;
sectionEnd: SECTIONEND {System.out.println("Section Ending: " + $SECTIONEND.text);} | error;
listBegin: LISTBEGIN {System.out.println("List Beginning: [" );} | error;
listEnd: LISTEND {System.out.println("List Ending: ]" );} | error;
mazeBegin: MAZEBEGIN {System.out.println("Maze Beginning: (" );} | error;
mazeEnd: MAZEEND {System.out.println("Maze Ending: )" );} | error;
moveChar: MOVES {System.out.println("Move Symbol: " + $MOVES.text);} | error;
mazeChar: MAZE {System.out.println("Maze Symbol: " + $MAZE.text);} | error;
endRow: ROWEND {System.out.println("Row Ending: $" );} | error;
assignval: ASSIGNVALUE {System.out.println("Assign Value: @");} | error;
number: NUM {System.out.println("Number: " + $NUM.text);} | error;
underscore: UNDERSCORE | error;
error: ANYTHING {System.out.println("Something on Line "+ $ANYTHING.line + " is Unrecognized."); System.exit(1);};