module.exports = {
  onePlayerOneSlide: onePlayerOneSlide
};

var helpers = require("./helpers");
function onePlayerOneSlide(maze) {
  function whatever(move) {
    maze = updateMaze(maze, move, "1");
    return maze;
  }
  return whatever;
}

function updateMaze(maze, move, player) {
  var playerPos = getPlayerLocation(maze,player);
  // let updatedPlayerPos;
  let updatedMaze = maze;
  const rows = maze.length;
  const cols = maze[0].length;
  
  if (move == "u") {
    let nextChar = maze[playerPos[0]-1][playerPos[1]];
    if(nextChar == '-'){
      updatedMaze[playerPos[0]-1][playerPos[1]] = player;
      updatedMaze[playerPos[0]][playerPos[1]] = 'x';
    }
  } else if (move == "d") {
    let nextChar = maze[playerPos[0]+1][playerPos[1]];
    if(nextChar == '-'){
      updatedMaze[playerPos[0]+1][playerPos[1]] = player;
      updatedMaze[playerPos[0]][playerPos[1]] = 'x';
  } else if (move == "l") {
    let nextChar = maze[playerPos[0]][playerPos[1]-1];
    if(nextChar == '-'){
      updatedMaze[playerPos[0]][playerPos[1]-1] = player;
      updatedMaze[playerPos[0]][playerPos[1]] = 'x';
  } else if (move == "r") {
    let nextChar = maze[playerPos[0]][playerPos[1]+1];
    if(nextChar == '-'){
      updatedMaze[playerPos[0]-1][playerPos[1]+1] = player;
      updatedMaze[playerPos[0]][playerPos[1]] = 'x';
  }
}
  return updatedMaze;
}

function getPlayerLocation(maze, player) {
  for (let i = 0; i < maze.length; i++) {
    for (let j = 0; j < maze[0].length; j++) {
      if (maze[i][j] == player) {
        return [i, j];
      }
    }
  }
  return undefined;
}

