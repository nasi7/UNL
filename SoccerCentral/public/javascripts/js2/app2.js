(function() {
  "use strict";
  angular.module("dribbling", [
    "dribbling.controllers",
    "dribbling.directives"
  ]);
  angular.module("d3", []);
  angular.module("dribbling.controllers", []);
  angular.module("dribbling.directives", ["d3"]);
})();
