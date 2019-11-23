var one = require("./csce322a02part01.js");
var helper = require("./helpers.js");

// one.onePlayerOneSlide('part01maze.txt');
var maze = helper.readMazeFile("part01maze.txt");
var moves = helper.readMovesFile("part01moves.txt");
var oneMove = helper.readMovesFile("part01moves.txt")[0];
console.log(oneMove);
console.log(moves);
console.log(typeof moves);
console.log(maze.length);
console.log(typeof maze);
console.log(maze[5][10]);
