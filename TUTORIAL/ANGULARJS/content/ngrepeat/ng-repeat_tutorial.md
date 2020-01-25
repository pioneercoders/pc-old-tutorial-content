<p>ng-repeat is built-in AngularJS directive used for looping items. It is same like as the for loop in javascript but ng-repeat is used for presenting the data to user(used in views like HTML).</p>

<section>  
<div ui-ace ="{useWrapMode: 'true', showGutter : 'true', theme:'monokai', mode: 'html', previewId:'preview',
	onLoad: htmlcssjsContentOnLoaded,
	rendererOptions: { fontSize: 16 },
	advanced: { highlightActiveLine: true}
}" style="min-height:450px;"><xmp><!doctype html>
<html>
   <body> 
      <div  ng-app="myApp" ng-controller="myCtrl">
		<ul>
			<li ng-repeat="tech in technologies"> {{tech}} </li>
		</ul>
	  </div>
   </body>
   <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.4/angular.min.js"></script>
   <script> 
	var app = angular.module("myApp",[]);
	app.controller("myCtrl", function($scope){
		$scope.technologies = ["C","C++","Java", "J2EE"]; 
	});
   </script>

</html></xmp>
</div>
<div>
	<iframe id="preview"></iframe>
</div>
</section>

<p>if there are array of (lets say 10) students records are there. To display the student details we cannot follow above approach. Instead one can use ng-repeat for looping student objects and get one by one object then access the properties. Object properties are accessed through dot(.) operator. </p>

<h5>Example to display array of students using ng-repeat</h5>
<section>  
<div ui-ace ="{useWrapMode: 'true', showGutter : 'true', theme:'monokai', mode: 'html', previewId:'preview1',
	onLoad: htmlcssjsContentOnLoaded,
	rendererOptions: { fontSize: 16 },
	advanced: { highlightActiveLine: true}
}" style="min-height:650px;"><xmp><!doctype html>
<html>
   <body> 
      <div  ng-app="myApp" ng-controller="myCtrl">
		<table>
			<tr><th>S.No</th><th>ID</th><th>Name</th><th>City</th></tr>
			<tr ng-repeat="studentObj in studentsList">
				<td ng-bind="$index+1"></td>
				<td ng-bind="studentObj.id"></td>
				<td ng-bind="studentObj.name"></td>
				<td ng-bind="studentObj.city"></td>
			</tr>
		</table>
	  </div>
   </body>
   <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.4/angular.min.js"></script>
   <script> 
	var app = angular.module("myApp",[]);
	app.controller("myCtrl", function($scope){
		$scope.studentsList = [
			{id:"1415",name:"Sundar",city:"Bangalore"},
			{id:"1234",name:"Raj",city:"Hyderbad"},
			{id:"4321",name:"Sagar",city:"Pune"},
			{id:"12312",name:"Phani",city:"Bangalore"},
			{id:"1442",name:"Rajesh",city:"Bangalore"},
		];
	});
   </script>
</html></xmp>
</div>
<div>
	<iframe id="preview1"></iframe>
</div>
</section>


<h5>Example: Nested ng-repeat</h5>

<section>  
<div ui-ace ="{useWrapMode: 'true', showGutter : 'true', theme:'monokai', mode: 'html', previewId:'preview2',
	onLoad: htmlcssjsContentOnLoaded,
	rendererOptions: { fontSize: 16 },
	advanced: { highlightActiveLine: true}
}" style="min-height:750px;"><xmp><!doctype html>
<html>
   <body> 
      <div  ng-app="myApp" ng-controller="myCtrl">
		<table>
			<tr><th>S.No</th><th>ID</th><th>Name</th><th>City</th><th>Courses Taken</th></tr>
			<tr ng-repeat="studentObj in studentsList">
				<td ng-bind="$index+1"></td>
				<td ng-bind="studentObj.id"></td>
				<td ng-bind="studentObj.name"></td>
				<td ng-bind="studentObj.city"></td>
				<td>
					<span ng-repeat="course in studentObj.coursesTaken">{{course}}, </span>
				</td>
			</tr>
		</table>
	  </div>
   </body>
   <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.4/angular.min.js"></script>
   <script> 
	var app = angular.module("myApp",[]);
	app.controller("myCtrl", function($scope){
$scope.studentsList = [
{id:"1415",name:"Sundar",city:"Bangalore",coursesTaken:["Java","C","C++"]},
{id:"1234",name:"Raj",city:"Hyderbad",coursesTaken:["Java","C"]},
{id:"4321",name:"Sagar",city:"Pune",coursesTaken:["SQL","PL/SQL","DBA"]},
{id:"12312",name:"Phani",city:"Bangalore",coursesTaken:["HTML","JS"]},
{id:"1442",name:"Rajesh",city:"Bangalore",coursesTaken:["CSS","JS"]},
];
	});
   </script>
</html></xmp>
</div>
<div>
	<iframe id="preview2"></iframe>
</div>
</section>
