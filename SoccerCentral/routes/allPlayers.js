var express = require("express");
var router = express.Router();

var monk = require("monk");
var db = monk("localhost:27017/SoccerCentral");

router.get("/", function(req, res) {
  var collection = db.get("fifa2019");
  collection.find(
    {},
    {
      fields: {
        Name: 1,
        Club: 1,
        Overall: 1,
        Photo: 1,
        Value: 1,
        _id: 1,
        Nationality: 1,
        Position: 1
      }
    },
    function(err, players) {
      if (err) throw err;
      res.json(players);
    }
  );
});

router.get("/:id", function(req, res) {
  var collection = db.get("fifa2019");
  collection.findOne({ _id: req.params.id }, function(err, player) {
    if (err) throw err;
    res.json(player);
  });
});
module.exports = router;
