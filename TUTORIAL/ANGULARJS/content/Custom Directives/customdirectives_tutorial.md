<div>
	<h4>Custom Directives</h4>
	<p>A directive in AngularJS is a <b>reusable component</b>. Built-in directives which are provided by the angular can used n number of times in the angualr applications. For example <b>ng-model</b> can be used multiple times in single angularjs application. This statement clarifies that the directives are reusable web components.</p>
	<h4>Definition</h4>
	<p><b>Directives are the functions that manipulate and extends functionality of HTML.</b> One can define their own directives. The custom directives are defined using <b>.directive</b> function. The directives are defined same like as controllers, services,factories, etc.</p>
	<h5>How directivies are idenfied and loaded into HTML ?</h5>
	<p> AngularJS's HTML compiler matches the directives. The directives names are seperated by dash(<b>-</b>) in the templates(view). To name the directive we must follow the camelcase method. For example ng-model can be named as ngModel while defining it.</p>
@CODE_START@@HTML@<!DOCTYPE html>
<html>
	<input type="text" ng-model="name">
</html>@CODE_END@
<p>In the above example input element matches ngModel.</p>
<h4>Directive Types</h4>
	<ul>
		<li>Element Directives</li>
		<li>Attribute Directives</li>
		<li>Class Directives</li>
		<li>Comment Directives</li>
	</ul>
	<h4>Element Directives</h4>
	<p>To define the element directive, create an HTML element. Tha tag name should same as directive name. For example </p>
	<p>The words of the directive name are seperated using delimiter called dash(<b>-</b>) in HTML templates.</p>
	<p>While naming a directve camelcase method is used</p>
@CODE_START@@HTML@<!DOCTYPE html>	
<html ng-app="myApp" ng-controller="myCtrl">
<!-- Multiple directives can also defined in single HTML -->
<my-directive></my-directive>
<sample-directive></sample-directive>
<script>
	// directive is defined on app( here the app is myApp)
	var app = angular.module('myApp', []);
	//it defined using directive method
	app.directive('myDirective', function(){
		// directive code goes here.
	});
	// camelcase naming convention for naming a directive
	app.directive('sampleDirective', function(){
		// directive code goes here.
	});
</script>
</html>@CODE_END@
<h4>Directive properties</h4>
<table class="pc-table">
	<tr>
		<th>Property</th>
		<th>Description</th>
	</tr>
	<tr>
		<td>scope</td>
		<td>used to create new scope or isolate scope which is completely different from controller scope.</td>
	</tr>
	<tr>
		<td>template</td>
		<td>This the output of the directive. In this, we can include HTML code, data-binding exapressions and other directives.</td>
	</tr>
	<tr>
		<td>templateUrl</td>
		<td>It is used to specify the HTML template(directive's output) path</td>
	</tr>
	<tr>
		<td>controller</td>
		<td>Used to define associated directive's controller</td>
	</tr>
	<tr>
		<td>restrict</td>
		<td>Used to restrict the directive to Element,attribute,class or comment.</td>
	</tr>
</table>
<h4>Ex 1: Display the string 'Hello World!' by creating custom directive.</h4>

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
	var app = angular.module('myApp', []);
	
	//it defined using directive method
	app.directive('diaplayString', function(){
		return {
			template:"<h1>Hello World! from directive..</h1>"
		}
	});
</script>
</head>
   <body> 
      <div  ng-app="myApp" ng-controller="myCtrl">
		<diaplay-string></diaplay-string>
      </div>
   </body>
</html></xmp>
</div>
<div>
	<iframe id="preview"></iframe>
</div>
</section>


<h4>Ex 2: Passing data from parent controller to directive controller.</h4>
@CODE_START@@HTML@<!DOCTYPE html>	
<html ng-app="myApp" ng-controller="myCtrl">
<!-- variable string is from parent controller to the directive -->
<!-- passed-from-parent is variable which is defined in directive's scope using camelcase convention like directives names -->
<!-- passed-from-parent is available to both directive view(template) and the controller -->
<diaplay-string passed-from-parent="{{string}}" from-parent="name"></diaplay-string>
<script>
	var app = angular.module('myApp', []);
	// parent controller
	app.controller('myCtrl',function($scope){
		$scope.string = "Hello World" // pass this string to the directive
		$scope.name = "Pioneer Coders";
	});
	app.directive('diaplayString', function(){
		return {
			restrict:'E' // restrict to elements
			scope:{
				passedFromParent:'@', // '@' binding defines one-way binding 
				fromParent:'='
			},
			template:"<h1>'&lbrace; &lbrace;passedFromParent&rbrace; &rbrace;!</h1><h1>'&lbrace; &lbrace;fromParent&rbrace; &rbrace;!</h1>",
			controller:function($scope){
				console.log($scope.passedFromParent);
			}
		}
	});
</script>
</html>@CODE_END@
<h4>Directive scope properties</h4>
<table class="pc-table">
	<tr>
		<th>Property</th>
		<th>Description</th>
	</tr>
	<tr>
		<td>@</td>
		<td>Defines one-way binding. if there are any changes in parent variable, affect the changes in child(directive scope). if changes in child does not affect the parent.</td>
	</tr>
	<tr>
		<td>=</td>
		<td>Defines the two-way binding.If parent changes affect child and child changes affect parent.</td>
	</tr>
	<tr>
		<td>&</td>
		<td>The '& operator allows you to invoke or evaluate an expression on the parent scope of whatever the directive is inside of.</td>
	</tr>
</table>
<h4>Ex 1: Executing or calling parent function from child scope or passing data from directive controller to parent controller.</h4>
@CODE_START@@HTML@<!DOCTYPE html>	
<html ng-app="myApp" ng-controller="myCtrl">
<diaplay-string on-load="display(name)"></diaplay-string>
<script>
	var app = angular.module('myApp', []);
	app.controller('myCtrl',function($scope){
		// function display will be called when onload is evaluated in directive controller.
		$scope.display = function(name){ 
			console.log(name);
		}
	})
	app.directive('diaplayString', function(){
		return {
			scope:{
				onLoad:'&'
			},
			controller:function($scope){
				$scope.onLoad({name:"Pioneer Coders"});
			};
		}
	});
</script>
</html>@CODE_END@
</div>
