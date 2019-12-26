var app = angular.module("SoccerCentral", ["ngResource", "ngRoute"]);

app.config([
  "$routeProvider",
  "$locationProvider",
  function($routeProvider, $locationProvider) {
    $routeProvider
      .when("/", {
        templateUrl: "partials/home.html",
        controller: "HomeCtrl",
        controllerAs: "home"
      })
      .when("/api/allPlayers/:id", {
        templateUrl: "partials/playerInfo.html",
        controller: "playerDetailsCtrl",
        controllerAs: "details"
      })
      .otherwise({
        redirectTo: "/"
      });
    $locationProvider.html5Mode(false);
    $locationProvider.hashPrefix("");
  }
]);

app.controller("HomeCtrl", [
  "$scope",
  "$resource",
  "$location",
  function($scope, $resource, $location) {
    var allPlayers = $resource("/api/allPlayers");
    allPlayers.query(function(allPlayers) {
      $scope.allPlayers = allPlayers;
    });
    var app = this;
    app.limit = 10;
    // Function: Show more results on page
    app.showMore = function() {
      app.limit += 20;
    };
    // Function: Clear all fields
    app.clear = function() {
      app.limit = 10; // Clear all results
      $scope.searchKeyword = undefined; // Clear the search word
    };
    //Function: search bar
    app.search = function(searchKeyword, number) {
      // Check if a search keyword was provided
      if (searchKeyword) {
        // Check if the search keyword actually exists
        if (searchKeyword.length > 0) {
          app.limit = 0; // Reset the limit number while processing
          $scope.searchFilter = searchKeyword; // Set the search filter to the word provided by the user
          app.limit = number; // Set the number displayed to the number entered by the user
        } else {
          $scope.searchFilter = undefined; // Remove any keywords from filter
          app.limit = 0; // Reset search limit
        }
      } else {
        $scope.searchFilter = undefined; // Reset search limit
        app.limit = 0; // Set search limit to zero
      }
    };
  }
]);

app.controller("playerDetailsCtrl", [
  "$scope",
  "$resource",
  "$routeParams",
  function($scope, $resource, $routeParams) {
    var playerInfo = $resource("/api/allPlayers/:id");
    playerInfo.get({ id: $routeParams.id }, function(player) {
      $scope.player = player;
      $scope.anotherPlayer = player;
    });
  }
]);
