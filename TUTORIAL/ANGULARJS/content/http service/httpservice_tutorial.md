<div>
<h4>$http</h4>
<p>The $http service is a core AngularJS service that is used for communicating with remote HTTP servers via the browser's XMLHttpRequest object or via JSON Object.</p>
<h4>Syntax 1</h4>
@CODE_START@@HTML@
<script>
// Simple GET request example:
$http({
  method: 'GET',
  url: '/someUrl'
}).then(function successCallback(response) {
    // this callback will be called asynchronously
    // when the response is available
  }, function errorCallback(response) {
    // called asynchronously if an error occurs
    // or server returns response with an error status.
 });
 </script>@CODE_END@
  <h4>Syntax 2</h4>
 @CODE_START@@HTML@
<script>
// Simple GET request example:
$http.get(url).then(function successCallback(response) {
    // this callback will be called asynchronously
    // when the response is available
  }, function errorCallback(response) {
    // called asynchronously if an error occurs
    // or server returns response with an error status.
 });
 </script>@CODE_END@
 <h4>HTTP methods</h4>
 <p>There are seven http methods are</p>
 <ul>
	<li>get()</li>
	<li>post()</li>
	<li>delete()</li>
	<li>put()</li>
	<li>head()</li>
	<li>jsonp()</li>
	<li>patch()</li>
 </ul>
 <p>Commonly used methods are get and post.</p>
 <h5>Example 1</h5>
@CODE_START@@HTML@<!DOCTYPE html>
<body>
	<div><button type="button" ng-click="getData()">Get Data</button></div>
	<div>&lbrace; &lbrace; response &rbrace; &rbrace;</div>
	<script>
	angular.module('myApp', []).controller('myCtrl', function($scope, $http) {
	$scope.name="sundar";
	$scope.getData = function() {
		$http.get("welcome.html",$scope.name).then(function(res){
			if(res){
				$scope.response = res.data.response;
			}
		}, function(err){
			$scope.response = res.data.response;
		})
		}
	});
	</script>
</body>
</html>@CODE_END@
 <h5>Example 2</h5>
@CODE_START@@HTML@<!DOCTYPE html>
<body>
	<div><button type="button" ng-click="getData()">Get Data</button></div>
	<div>&lbrace; &lbrace; response &rbrace; &rbrace;</div>
	<script>
	angular.module('myApp', []).controller('myCtrl', function($scope, $http) {
	$scope.name="sundar";
	$scope.getData = function() {
		var config = {
			url:'welcome.html',
			method:"POST",
			data:$scope.name
		}
		$http(config).then(function(res){
			if(res){
				$scope.response = res.data.response;
			}
		}, function(err){
			$scope.response = res.data.response;
		})
		}
	});
	</script>
</body>
</html>@CODE_END@
</div>
