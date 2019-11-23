module.exports = {
    onePlayerManySlides: onePlayerManySlides
}

var helpers = require( './helpers' );

function onePlayerManySlides(maze){
    
    function whatever(moves){
	console.log( moves );
	return maze;
    }

    return whatever;
}
