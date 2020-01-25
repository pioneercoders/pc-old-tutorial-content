<div>
	<h4>Custom Filters</h4>
	<p>Filter is selects subset of items from array and returns new array. Custom filters are registered on modules.
	Filter definition contains filter name followed by factory function which return a new filter function which takes the input value as the first argument.</p>
	<h4>Custom Filter Syntax</h4>
@CODE_START@@HTML@<script>
var app = angular.module('myApp', []);
app.filter('myFilter', function () {
  return function(array, expression, comparator, anyPropertyKey){
  
  }
});
</script>@CODE_END@
	<h4>Ex 1 : Creating custom filter for converting entered text to uppercase</h4>
@CODE_START@@HTML@<html>
<body ng-app="myApp" ng-controller="myCtrl">
	<div>
		<input type="text" ng-model="textInput" placeholder="Enter Text">
	</div>
	<div>{{ textInput | reverseText }}</div>
</body>
<script src="angular.min.js"></script>
<script>
var app = angular.module('myApp',[]);
app.controller('myCtrl',function($scope){

});
app.filter('reverseText',function(){
  return function reverse(inputText){
	var inputText = inputText || '';
	var result = inputText.toUpperCase();
	return result;
  }
});
</script>
<html>@CODE_END@
	<h4>Ex 1 : Creating custom filter for converting entered text to uppercase</h4>
@CODE_START@@HTML@<html>
<body ng-app="myApp" ng-controller="myCtrl">
	<div>
		<input type="text" ng-model="textInput" placeholder="Enter Text">
	</div>
	<div ng-repeat="emp in employees | searchFilter:textInput">&lbrace; &lbrace;  emp &rbrace; &rbrace;</div>
</body>
<script>
var app = angular.module('myApp',[]);
app.controller('myCtrl',function($scope){
	$scope.employees = ["Sundar","Satish","Vamsi","Raju","Sudhakar"];
});
app.filter('searchFilter',function(){
  return function (empList, searchString){
   if(!searchString){
            return empList;
        }
	 var result = [];
	angular.forEach(empList, function(emp) {
		emp = emp.toLowerCase();
        if(emp.indexOf(searchString) !== -1){
            result.push(emp);
        }
  })
  return result;
  }
});
</script>
<html>@CODE_END@
</div>
