<h4>Service definition</h4>
<p>In angularjs services are objects or functions that performs a specific task. In the angular controller one can write "Bussiness Logic", but it is not recomended because it the violates principle of "Seperation of Concerns". The 
<b>angular Controller</b> is responsible for only binding model to views using $scope. The <b>Business Logic </b>Should be written inside the services.</p>
<p>The code which is written inside the services are common and can be shared across the angularjs application.</p>
<h4>Advantage of services</h4>
<p>Suppose there are two angularjs controller that require a user data to display. To get the user data we will make a call to the server using $http.</p>
<h5>Controller 1: making call to get user data</h5>
@CODE_START@@HTML@<!DOCTYPE html>
<html>
	<body ng-app="myApp" ng-controller="firstCtrl">
		<div>&lbrace; &lbrace; userData &rbrace; &rbrace;</div>
		</body>
		<script>
			angular.module('myApp', [])
			.controller('firstCtrl', function($scope,$http) {
				$htttp.get('url for getting user data').then(function(res){
					if(res){
						$scope.userData = res.data.response;
					}
				})
			});
		</script>
</html>@CODE_END@
<h5>Controller 2: making call to get user data</h5>
@CODE_START@@HTML@<!DOCTYPE html>
<html>
	<body ng-app="myApp" ng-controller="secondCtrl">
		<div>&lbrace; &lbrace; userData &rbrace; &rbrace;</div>
		</body>
		<script>
			angular.module('myApp', [])
			.controller('secondCtrl', function($scope,$http) {
				$htttp.get('url for getting user data').then(function(res){
					if(res){
						$scope.userData = res.data.response;
					}
				})
			});
		</script>
</html>@CODE_END@
<p>If we observe the above two controllers. The code which written for retrieving user data is common in the both controllers(firstCtr and secondCtrl). writing the same code in multiple controllers will increases the code redundancy(duplcate code). To avoid this redudancy  we can make use of angualar custom services.</p>
<h4>Creating Cusom service</h4>
<p>The services are created on module using service keyword.</p>
<h5>Syntax for creating custom service</h5>
@CODE_START@@HTML@<!DOCTYPE html>
<html>
	<body ng-app="myApp" ng-controller="myCtrl">
		</body>
		<script>
			var app = angular.module('myApp', []);
			app.service('myService', function(){
			// bussiness logic goes here
			});
		</script>
</html>@CODE_END@
<p> In the above mentioned code. app is defined using angular.module API(Application Programming Interface). Then myService is created on myApp using service keyword. The business logic can be written inside the service.</p>
<p>After defining the services. To make use of the defined services, the defined services should be injected into controllers using dependency Injection(DI)</p>
<h5>Injecting myService into myCtrl</h5>
@CODE_START@@HTML@<!DOCTYPE html>
<html>
	<body ng-app="myApp" ng-controller="myCtrl">
		</body>
		<script>
			var app = angular.module('myApp', []);
			app.controller('secondCtrl', function($scope, myService) {
				$htttp.get('url for getting user data').then(function(res){
					if(res){
						$scope.userData = res.data.response;
					}
				})
			app.service('myService', function(){
			// bussiness logic goes here
			});
		</script>
</html>@CODE_END@
<h4>Example: Retrieving user data by creating service and displaying user data in multiple controllers.</h4>
@CODE_START@@HTML@<!DOCTYPE html>
<html>
	<body ng-app="myApp">
			<!-- first controller start-->
		<div  ng-controller="firstCtrl">
				<div>&lbrace; &lbrace; userData &rbrace; &rbrace;</div>
		</div>
		<!-- first controller end-->
		
		<!-- second controller start-->
		<div  ng-controller="secondCtrl">
			<div>&lbrace; &lbrace; userData &rbrace; &rbrace;</div>
		</div>
		<!-- second controller end-->
	</body>
	<script>
		var app = angular.module('myApp', []);
		//first controller
		app.controller('firstCtrl', function($scope, myService) {
			$scope.getUserData= function(){
				myService.getUserData().then(function(res){
					$scope.userData = res.data.response;
				})
			}
		});
		// second controller
		app.controller('secondCtrl', function($scope,myService) {
			$scope.getUserData= function(){
				myService.getUserData().then(function(res){
					$scope.userData = res.data.response;
				},function(error) {
					console.log("error occured while getting user data", error);
						defer.reject(error);
					})
			}
		});
		// service
		app.service('myService', function($http,$q,$log){
			this.getUserData = getUserData;
			function getUserData(){
				var defer = $q.defer();
				// url = user/getuserData;
				$http.get('url to get user data').then(function(res){
					if(res){
						defer.resolve(res);
				
				},function(error) {
						defer.reject(error);
					}
				);
				return defer.promise();
			}
		})
	</script>
</html>@CODE_END@
<h4>Factory</h4>
<p>
<b>.factory()</b> is same like as service defined on the module and it takes factory name and a function that defines factory.
</p>
@CODE_START@@HTML@<script>
var app = angular.module('myApp', []);
app.factory('myFactory', function () {
  return {
    welcome: function () {
      console.log('Hello World');
    }
  }
});
</script>@CODE_END@
<h4>Simple Caluculator example using factory</h4>
@CODE_START@@HTML@<!DOCTYPE html>
<html>
	<body ng-app="myApp" ng-controller="firstCtrl">
		<div>
			<form>
				<div>
					<label>First Number</label>
					<input type="text" ng-model="number1">
				</div>
				<div>
					<label>Second Number</label>
					<input type="text" ng-model="number2">
				</div>
				<div>
					<button type="button" ng-click="calculate('add')">Addition</button>
					<button type="button" ng-click="calculate('sub')">Subtraction</button>
					<button type="button" ng-click="calculate('mul')">Multiplication</button>
					<button type="button" ng-click="calculate('div')">division</button>
				</div>
			</form>
				<div>&lbrace; &lbrace; result &rbrace; &rbrace;</div>
		</div>
	<script>
		var app = angular.module('myApp', []);
		//first controller
		app.controller('firstCtrl', function($scope, myFactory) {
			$scope.calculate= function(conditionalText){
			
				if(conditionalText == 'add'){
					$scope.result = myFactory.addition($scope.number1, $scope.number2)
				}else if(conditionalText == 'sub'){	
					$scope.result = myFactory.subtraction($scope.number1, $scope.number2)
					
				}else if(conditionalText == 'mul'){
					$scope.result = myFactory.multiplication($scope.number1, $scope.number2)
				}else {
					$scope.result = myFactory.division($scope.number1, $scope.number2) 	 
				}
				
			}
		});
		// factory
		app.factory('myFactory', function(){
		return{
			addition = addition;
			subtraction = subtraction;
			multiplication = multiplication
			division = division;
		};
			
		function addition(number1, number2){
			var sum = number1+number2;
			return sum;
		}
		function subtraction(number1, number2){
			var res = number1-number2;
			return res;
		}
		function multiplication(number1, number2){
			var res = number1*number2;
			return res;
		}
		function division(number1, number2){
			var res = number1/number2;
			return res;
		}
		})
	</script>
</html>@CODE_END@
