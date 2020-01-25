
<p>Angular Provides the mechanism for validating data entered by the user. Angular can validate the form input controls data.</p>
<h4>Angular Form Properties</h4>
<p>Angular form properties are helpful in validatating user inputs. The following table describes about them. </p>
<table class="pc-table">
	<tr>
		<th>Property</th>
		<th>Class</th>
		<th>Description</th>
	</tr>
	<tr>
		<td>$valid</td>
		<td>ng-valid</td>
		<td>Entered data is valid.returns true if data is valid</td>
	</tr>
	<tr>
		<td>$invalid</td>
		<td>ng-invalid</td>
		<td>Entered data is Invalid.returns true if data is Invalid</td>
	</tr>
	<tr>
		<td>$dirty</td>
		<td>ng-dirty</td>
		<td>Entered data is modified.returns true if data is modified</td>
	</tr>
	<tr>
		<td>$touched</td>
		<td>ng-touched</td>
		<td>The input field is touched.returns true if input field is touched</td>
	</tr>
	<tr>
		<td>$untouched</td>
		<td>ng-untouched</td>
		<td>The input field is untouched.returns true if input field is untouched</td>
	</tr>
	<tr>
		<td>$pristine</td>
		<td>ng-pristine</td>
		<td>The input field has not been modified yet</td>
	</tr>
</table>
<h4>Form States</h4>
<table class="pc-table">
	<tr>
		<th>Property</th>
		<th>Description</th>
	</tr>
	<tr>
		<td>$valid</td>
		<td>The form content is valid. Returns true if form content is valid</td>
	</tr>
	<tr>
		<td>$invalid</td>
		<td>The form content is invalid. Return true if form content is Invalid</td>
	</tr>
	<tr>
		<td>$dirty</td>
		<td>Returns true if form is modified</td>
	</tr>
	<tr>
		<td>$pristine</td>
		<td>Return true if the form fields are not modified</td>
	</tr>
	<tr>
		<td>$submitted</td>
		<td>Return true if the form is submitted</td>
	</tr>
</table>
<h5>Before Applying the validations make sure that the following attributes are set to input fileds and form.</h5>
<p>AngularJS validations will work based on</p>
	<ul>
		<li>HTML form name</li>
		<li>input field name</li>
		<li>required attribute of input field.</li>
		<li>set the form to "novalidate" because by default HTML5 validations will apply to the form </li>
	</ul>
	
<h5>Display the error msg if the input field is modified and empty</h5>
<section>  
<div ui-ace ="{useWrapMode: 'true', showGutter : 'true', theme:'monokai', mode: 'html', previewId:'preview',
	onLoad: htmlcssjsContentOnLoaded,
	rendererOptions: { fontSize: 16 },
	advanced: { highlightActiveLine: true}
}" style="min-height:570px;"><xmp><!doctype html>
<html>
<head>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.4/angular.min.js"></script>
<script> 
	var app = angular.module("myApp",[]);
	app.controller("myCtrl", function($scope){
	
		$scope.handleFormSubmit = function() {
			alert($scope.firstName);
		};
	});
</script>
</head>
<body> 
<div  ng-app="myApp" ng-controller="myCtrl">
	<form name="form" novalidate>
	<div>First Name :<input type="text" name="firstName" ng-model="firstName" required /></div>
	<span style="color:red" ng-if="form.firstName.$error.required && form.firstName.$dirty">*This field is required</span>
	<div><input type="submit" value="submit" ng-click="handleFormSubmit();"></div>
	</form>
</div>
</body>
</html></xmp>
</div>
<div>
	<iframe id="preview"></iframe>
</div>
</section>

<h4>ng-pattern</h4>
<p>input field can also be validated using ng-pattern. in the ng-pattern we will specify the regular expression </p>
<p>Show the error message if user enters other than text in firstname field.</p>
<p>Show the error message if user enters other than text mobile number in mobile field.</p>

<section>  
<div ui-ace ="{useWrapMode: 'true', showGutter : 'true', theme:'monokai', mode: 'html', previewId:'preview1',
	onLoad: htmlcssjsContentOnLoaded,
	rendererOptions: { fontSize: 16 },
	advanced: { highlightActiveLine: true}
}" style="min-height:570px;"><xmp><!doctype html>
<html>
<head>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.4/angular.min.js"></script>
<script> 
	var app = angular.module("myApp",[]);
	app.controller("myCtrl", function($scope){
	
		$scope.handleFormSubmit = function() {
			alert('Name::'+ $scope.firstName+' Mobile::'+ $scope.mobileNo);
		};
	});
</script>
</head>
<body> 
<div  ng-app="myApp" ng-controller="myCtrl">
	<form name="form" novalidate>
	<div>First Name :<input type = "text" name = "firstName" ng-model="firstName" ng-pattern="/^[a-zA-Z]$/" required /></div>
	<span ng-if="form.firstName.$error.required && form.firstName.$dirty">*This field is required</span>
	<span ng-if="form.firstName.$error.pattern">*Please Enter Characters only</span>
	
	<div>Mobile :<input type="number" name="mobileNo" ng-model="mobileNo" ng-pattern="/^[0-9]{10,10}$/"  ng-maxlength="10" maxlength="10"  required> </div>
	<div class="error-msg absolute" ng-if="form.mobileNo.$error.required && form.mobileNo.$dirty">MobileNo Is Required</div>
	<div class="error-msg absolute" ng-if="form.mobileNo.$error.pattern">Enter 10 digit mobile Number</div>
			
	<div><input type="submit" value="submit" ng-click="handleFormSubmit();"></div>
	</form>
</div>
</body>
</html></xmp>
</div>
<div>
	<iframe id="preview1"></iframe>
</div>
</section>
