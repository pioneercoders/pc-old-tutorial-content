
<p>AngularJs provides to extend(add) HTML with new attributes. these new attributes are called directives.</p>
<p>Directives are two types</p>
<ul>
	<li>Built-in directives</li>
	<li>Custom directives</li>
</ul>
<h5>Built-in directives</h5>
<p>Directives which are provided by the angular is called built in directives.</p>

<table class="pc-table">
<tr>
	<td><b>Directive</b></td>
	<td><b>Description</b></td>
</tr>
<tr>
	<td>ng-app</td>
	<td>ng-app directive is responsible for initializing an AngularJS application and it tells AngularJS this is the root element of the AngularJS application to be controlled. other elements in the html will not controllred by angularjs.</td>
</tr>
<tr>
	<td>ng-controller</td>
	<td>ng-controller directive is responsible for defined an angular controller.</td>
</tr>
<tr>
	<td>ng-init</td>
	<td>ng-init directive is responsible for initializing an AngularJS application.</td>
</tr>
<tr>
	<td>ng-model</td>
	<td>ng-model directive captures data entered by the user from forms</td>
</tr>
<tr>
	<td>ng-bind</td>
	<td>ng-bind is used for displaying data.</td>
</tr>
<tr>
	<td>ng-show</td>
	<td>The ng-show directive shows the specified HTML element if the expression evaluates to true, otherwise the HTML element is hidden.</td>
</tr>
<tr>
	<td>ng-hide</td>
	<td>The ng-hide directive hides the specified HTML element if the expression evaluates to true, otherwise the HTML element is hidden.</td>
</tr>
</table>
<p> there are so many built in directives given by angular please refer the <a herf="https://docs.angularjs.org/guide/directive"> angularjs doc </a> for more info </p>

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
	var app = angular.module("myApp",[]); // app 
	app.controller("myCtrl", function($scope){ // controller function
		$scope.userName = "CodingKrishna"; // model which holding data (user name)
	});
</script>
</head>
   <body> 
      <div  ng-app="myApp" ng-controller="myCtrl"> <!-- view which is displaying model data -->
         <label>Enter Your Name :</label>
         <input type = "text" ng-model = "userName" placeholder = "Enter your Name"> 
         <h1>hii {{userName}}!</h1>
		 <div ng-bind="userName"></div>	
      </div>
   </body>
</html></xmp>
</div>
<div>
	<iframe id="preview"></iframe>
</div>
</section>
<p> in above code div tag is bootstraped with ng-app called myapp and also we attached controller ng-controller myCtrl </p>




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
		$scope.isVisiable = true; 
		$scope.toggleDiv = function(){
			$scope.isVisiable = !$scope.isVisiable;
		}
	});
</script>
</head>
   <body> 
      <div  ng-app="myApp" ng-controller="myCtrl">
         <div style="color:red" ng-show="isVisiable">This div is shown because isVisiable is {{isVisiable}}.</div>
		 <div style="color:green" ng-hide="isVisiable">This div is shown because isVisiable is {{isVisiable}}.</div>
         <button ng-click="toggleDiv()">Click for Toggle</button>
      </div>
   </body>
</html></xmp>
</div>
<div>
	<iframe id="preview1"></iframe>
</div>
</section>

