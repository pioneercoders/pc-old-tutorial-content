<div>

<p>Angular Forms are nothing but simple HTML forms only. The HTML forms contains input controls like input, select, textarea, checkbox and radio button etc.</p>
<p>In angular, The two-way data binding is achieved by using the ng-model directive. <b>ng-model</b> binds the model data to view as well as to the controller.</p>
<p>Example on ng-model</p>

<section>  
<div ui-ace ="{useWrapMode: 'true', showGutter : 'true', theme:'monokai', mode: 'html', previewId:'preview',
	onLoad: htmlcssjsContentOnLoaded,
	rendererOptions: { fontSize: 16 },
	advanced: { highlightActiveLine: true}
}" style="min-height:550px;"><xmp><!doctype html>
<html>
<body> 
<div  ng-app="myApp" ng-controller="myCtrl">
<form>	
First Name<input type="text" name="firstName" ng-model="firstName"/><br>
Last Name<input type="text" name="lastName" ng-model="lastName"/><br>
Address<textarea name="address" ng-model="address"></textarea><br>
<button ng-click="showFormData()"> show data </button>
</form>
</div>
</body>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.4/angular.min.js"></script>
<script> 
var app = angular.module("myApp",[]);
app.controller("myCtrl", function($scope){
	$scope.showFormData = function(){
		console.log($scope.firstName);
		console.log($scope.lastName);
		console.log($scope.address);
	}
});
</script>

</html></xmp>
</div>
<div>
	<iframe id="preview"></iframe>
</div>
</section>

<p>In the above example, data entered by the user in the input field is stored in the ng-model(here the model name is name). The user entered data will be immediately available to the controller and view.</p>


<section>  
<div ui-ace ="{useWrapMode: 'true', showGutter : 'true', theme:'monokai', mode: 'html', previewId:'preview1',
	onLoad: htmlcssjsContentOnLoaded,
	rendererOptions: { fontSize: 16 },
	advanced: { highlightActiveLine: true}
}" style="min-height:800px;"><xmp><!doctype html>
<html>
<body> 
<div ng-app="myApp">
<form action="#" ng-controller="formCtrl" ng-submit="submitForm()">

<div><label>Name:</label> <input type="text" ng-model="user.name"></div>
<div><label>Email:</label><input type="email" ng-model="user.email"></div>
<div><label>Mobile:</label><input type="number" ng-model="user.mobile"></div>
<div><label>Address:</label><textarea ng-model="user.address"></textarea></div>

<div><input type="radio" ng-model="user.gender" value="female" />Female
<input type="radio" ng-model="user.gender" value="male" />Male </div>

<div><input type="checkbox" ng-model="user.member" value="true"/>New User
<input type="checkbox" ng-model="user.member" value="false"/>Existing User</div>

<div><input type="file" ng-model="user.file_profile" id="file_profile"><div>
	
	<input type="submit" ngClick="Submit" >
</form>
</div>

</body>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.4/angular.min.js"></script>
<script> 
var app = angular.module('myApp', []);
app.controller('formCtrl', function ($scope, $http) {
	$scope.submitForm = function() {
		console.log("posting data....");
		console.log($scope.user);
		//$http.post('form.php', JSON.stringify(data)).success(function(){/*success callback*/});
		return false;
	};

});
</script>

</html></xmp>
</div>
<div>
	<iframe id="preview1"></iframe>
</div>
</section>
