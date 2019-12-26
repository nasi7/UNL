(function() {
  "use strict";

  angular.module("dribbling.directives").directive("dribblingScatter", [
    "d3",
    function(d3) {
      return {
        restrict: "EA",
        link: function(scope) {
          var margin = { top: 50, right: 50, bottom: 60, left: 110 },
            width = 660 - margin.left - margin.right,
            height = 600 - margin.top - margin.bottom;
          // creating a div to contain line charts.
          var svg = d3
            .select("#my_dataviz")
            .append("svg")
            .attr("width", width + margin.left + margin.right)
            .attr("height", height + margin.top + margin.bottom)
            .append("g")
            .attr(
              "transform",
              "translate(" + margin.left + "," + margin.top + ")"
            );
          scope.render = d3.csv("../partials/khot.csv", function(data) {
            // Add X axis
            var x = d3
              .scaleLinear()
              .domain([0, 100])
              .range([0, width]);
            svg
              .append("g")
              .attr("transform", "translate(0," + height + ")")
              .call(d3.axisBottom(x));

            // Add Y axis
            var y = d3
              .scaleLinear()
              .domain([0, 100])
              .range([height, 0]);
            svg.append("g").call(d3.axisLeft(y));

            // text label for the x axis
            svg
              .append("text")
              .attr(
                "transform",
                "translate(" +
                  width / 2 +
                  " ," +
                  (height + margin.top + 5) +
                  ")"
              )
              .style("text-anchor", "middle")
              .text("Ball Control");

            //text label for y axis
            svg
              .append("text")
              .attr("transform", "rotate(-90)")
              .attr("y", 0 - margin.left)
              .attr("x", 0 - height / 2)
              .attr("dy", "1em")
              .style("text-anchor", "middle")
              .text("Dribbling");

            svg
              .append("text")
              .attr("x", width + 5 + margin)
              .attr("y", -10)
              .attr("text-anchor", "middle")
              .text("Ball Control Vs Dribbling");

            // Add dots
            svg
              .append("g")
              .selectAll("dot")
              .data(data)
              .enter()
              .append("circle")
              .attr("cx", function(d) {
                return x(d.ball);
              })
              .attr("cy", function(d) {
                return y(d.dribbling);
              })
              .attr("r", 1.5)
              .style("fill", "#69b3a2");
          });
        }
      };
    }
  ]);
})();
