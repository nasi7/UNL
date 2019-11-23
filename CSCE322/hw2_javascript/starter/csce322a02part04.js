module.exports = {
    manyPlayersManySlides: manyPlayersManySlides
}

var helpers = require( './helpers' );

function manyPlayersManySlides(maze){
    
    function whatever(moves){
	console.log( moves );
	return maze;
    }

    return whatever;
}
