
<h3>What is Service?</h3>
<p>Service is a function or an object or a piece of code which is available for entire angularJS application as a service.</p>
<p>Advantage of services are code reusability i.e services code is can be shared across multiple applications. </p>
<p>Angular provides nearly 30 built-in service like $log, $location, $http</p>
<p><b>Note: </b>Before using service make sure that the services are injected into the controllers.</p>

<h4>Angular Built-in Services</h4>
<p>Like built-in directives angular also provides built-in services.</p>

<table class="pc-table">
	<tr>
		<th>Name</th>
		<th>Description</th>
	</tr>
	<tr>
		<td>$window</td>
		<td>It is same like as window or document object in Javascript</td>
	</tr>
	<tr>
		<td>$location</td>
		<td>It is same like as location in Javascript. Redirects to the given URL(Universal Resource Locator).</td>
	</tr>
	<tr>
		<td>$log</td>
		<td>It is same like as console.log in Javascript</td>
	</tr>
	<tr>
		<td>$http</td>
		<td>It is used to make the AJAX(Asynchronous JavasScript and XML) Calls. Used for sendig data to server and receiving data from server..</td>
	</tr>
	<tr>
		<td>$interval</td>
		<td>Used for executing a peice of code continusouly with specified interval</td>
	</tr>
	<tr>
		<td>$timeout</td>
		<td>Used when to delay the function execution</td>
	</tr>
</table>


<h4>Example on $log, $location and $timeout</h4>

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
	app.controller("myCtrl", function($scope, $location, $timeout){

		$scope.open = function(){
			$location.path('http://www.pioneercoders.com');
		};
		
		$scope.alertOnTimeout = function(){
			$timeout(function(){
				alert("alert popup will be opened after 2 seconds")
			},2000)
		};
		
	});
</script>
</head>
   <body> 
      <div  ng-app="myApp" ng-controller="myCtrl">
		<button type="button" ng-click="open()">Click here</button>
		<button type="button" ng-click="alertOnTimeout()">Click here to alert</button>
      </div>
   </body>
</html></xmp>
</div>
<div>
	<iframe id="preview"></iframe>
</div>
</section>
