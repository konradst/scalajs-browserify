module.exports = Bundle;

function Bundle() {
  this.$ = require("jquery-browserify")
  this._ = require("lodash")
};

Bundle.prototype.go = function() {
  console.log("hello");
}
