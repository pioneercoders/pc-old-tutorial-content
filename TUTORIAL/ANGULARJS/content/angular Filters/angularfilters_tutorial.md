
</p>AngularJS provided filters for formating the data. For example to convert the date object to string, date filter can used</p>
<h4>Filter Syntax in views(templates)</h4>
@CODE_START@@HTML@ &lbrace; &lbrace;  expression | filter &rbrace; &rbrace;
@CODE_END@
<h4>Filter Syntax in JS(templates)</h4>
@CODE_START@@HTML@$filter('filter')(array, expression, comparator, anyPropertyKey)
@CODE_END@
<h4>Filters Chaining</h4>
<p>Applying filters to the result of another filter is filter chaining. The syntax is </p>
@CODE_START@@HTML@ &lbrace; &lbrace;  expression | filter1 | filter2 | ...  &rbrace; &rbrace;
@CODE_END@
<h4>Filters with arguments</h4>
@CODE_START@@HTML@ &lbrace; &lbrace;  expression | filter:argument1:argument2:... &rbrace; &rbrace;
@CODE_END@
<h4>Filters List</h4>
<p>Filters are applied using pipe( <b>| </b>) symbol.</p>
<table class="pc-table">
	<tr>
		<th>Name</th>
		<th>Description</th>
	</tr>
	<tr>
		<td>lowercase </td>
		<td>Formats the data to lowercase data</td>
	</tr>
	<tr>
		<td>uppercase </td>
		<td>Formats the data to uppercase data</td>
	</tr>
	<tr>
		<td>filter </td>
		<td>Selects subset of items from array and returns it as new array.</td>
	</tr>
	<tr>
		<td>limitTo </td>
		<td>limits string or array. Ex 10 members students list is there. The condition is only 5 should be displayed, here we can apply limitsTo:5</td>
	</tr>
	<tr>
		<td>currency </td>
		<td>Formats the number as currency.<br> For example: <b>100 | currency</b>. The result will be <b>$100.00</b></td>
	</tr>
	<tr>
		<td>orderBy </td>
		<td>Orders an array by an expression.</td>
	</tr>
	 <tr>
		<td>number </td>
		<td>Formats number to text.</td>
	 </tr>
	  <tr>
		<td> date</td>
		<td>Formats date to string depending condition.</td>
	 </tr>
	  <tr>
		<td>json</td>
		<td>Converts JavaScript object into JSON string.</td>
	 </tr>
</table>
<h5>Example 1 uppercase Filter</h5>

<section>  
<div ui-ace ="{useWrapMode: 'true', showGutter : 'true', theme:'monokai', mode: 'html', previewId:'preview',
	onLoad: htmlcssjsContentOnLoaded,
	rendererOptions: { fontSize: 16 },
	advanced: { highlightActiveLine: true}
}" style="min-height:450px;"><xmp><!doctype html>
<html>
<head>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.4/angular.min.js"></script>
<script> 
	var app = angular.module("myApp",[]);
	app.controller("myCtrl", function($scope){
		$scope.name = "Pioneer Coders"; 
		$scope.currentDate = new Date();
	});
</script>
</head>
   <body> 
      <div  ng-app="myApp" ng-controller="myCtrl">
       <p>The name is {{name | uppercase}}</p>
	    <p>The name is {{name | lowercase}}</p>
	   <p>Today date is {{ currentDate | date:'yyyy-MM-dd'}}</p>
      </div>
   </body>
</html></xmp>
</div>
<div>
	<iframe id="preview"></iframe>
</div>
</section>



<h5>Example search filter using filter</h5>
<section>  
<div ui-ace ="{useWrapMode: 'true', showGutter : 'true', theme:'monokai', mode: 'html', previewId:'preview1',
	onLoad: htmlcssjsContentOnLoaded,
	rendererOptions: { fontSize: 16 },
	advanced: { highlightActiveLine: true}
}" style="min-height:450px;"><xmp><!doctype html>
<html>
<head>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.4/angular.min.js"></script>
<script> 
	var app = angular.module("myApp",[]);
	app.controller("myCtrl", function($scope){
		$scope.fruits = ["Mango","Apple", "Lemon", "Banana", "orange", "Blueberries", "Grapes", "Guava"];
	});
</script>
</head>
   <body> 
      <div  ng-app="myApp" ng-controller="myCtrl">
       <input type="text" ng-model="searchString" placeholder="Enter word from below list">
		<ul>
			<li ng-repeat="fruit in fruits | filter:searchString">
				{{fruit}}
			</li>
		</ul>
      </div>
   </body>
</html></xmp>
</div>
<div>
	<iframe id="preview1"></iframe>
</div>
</section>
