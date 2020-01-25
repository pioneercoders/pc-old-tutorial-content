
<h3>MVC Architechture</h3>
<p>MVC stands for Model View Controller. It is a software design pattern for developing web applications. Angular supports MVC style of application design. </p>

<h3> Model</h3>
<p>Model is Responsible for storing and managing data. A model in angular can be a primitive type such as string, number, boolean or a complex type such as object which hold the data.</p>

<h3>View</h3>
<p>View is used for displaying data. For displaying data one can use html,jsp pages..etc to display the data to users</p>

<h3>Controller</h3>
<p>Controller controlls interaction between the Model and View. </p>

@IMG_START@ANGULARJS/angularjs_mvc/jpg@IMG_END@

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
      </div>
   </body>
</html></xmp>
</div>
<div>
	<iframe id="preview"></iframe>
</div>
</section>

