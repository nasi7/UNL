module.exports = {
    manyPlayersOneSlide: manyPlayersOneSlide
}

var helpers = require( './helpers' );

function manyPlayersOneSlide(maze){
    
    function whatever(moves){
	console.log( moves );
	return maze;
    }

    return whatever;
}
