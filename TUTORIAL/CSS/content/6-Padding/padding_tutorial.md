					<h4>CSS Padding :</h4>
					<p>The padding property allows you to specify how much space should appear between the content of an element and its border.</p>
					<p>The value of this attribute should be either a length, a percentage, or the word inherit. If the value is inherit, it will have the same padding as its parent element. If a percentage is used, the percentage is of the containing box.</p>
					<p>The following CSS properties can be used to control lists. You can also set different values for the padding on each side of the box using the following properties.</p>
					<p>The <b>padding</b> serves as shorthand for the preceding properties.</p>
					<p>The <b>padding-bottom</b> specifies the bottom padding of an element.</p>
					<p>The <b>padding-top</b> specifies the top padding of an element.</p>
					<p>The <b>padding-left</b> specifies the left padding of an element.</p>
					<p>The <b>padding-right</b> specifies the right padding of an element.</p>
					<h4>The Padding Property :</h4>
					<p>The padding property sets the left, right, top and bottom padding (space) of an element. This can take a value in terms of length of %.</p>
					
<p><b>Simple Example on CSS padding</b></p>					
@CODE_START@@HTML@<!DOCTYPE html>
<html>
<head>
</head>
<body>
	<p style = "border:1px solid black;padding:15px;"> all four padding will be 15px.</p>
	<p style = "border:1px solid black;padding:10px 2%;"> top and bottom padding will be 10px, left and right padding will be 2% of the total width of the document.</p>
	<p style = "border:1px solid black;padding:10px 2% 10px;"> top padding will be 10px, left and right padding will be 2% of the total width of the document, bottom padding will be 10px.</p>
	<p style = "border:1px solid black;padding:10px 2% 10px 10px;"> top padding will be 10px, right padding will be 2% of the total width of the document, bottom padding and top padding will be 10px.</p>
</body>
</html>@CODE_END@	
<div class="min-height-50" id="csspadding1"><button type="button"  class="cws-button border-radius bt-color-3 pull-right" ng-click="tryYourSelf('csspadding1','css')">Try Yourself</button></div>					
			<h4>Output</h4>
			@IMG_START@CSS/csspaddingtutorial_image1/png@IMG_END@
					<h4>The padding-bottom Property :</h4>
					<p>The padding-bottom property sets the bottom padding (space) of an element. This can take a value in terms of length of %.</p>

<p><b>Simple Example on CSS padding-bottom</b></p>						
@CODE_START@@HTML@<!DOCTYPE html>
<html>
<head>
</head>
<body>
	<p style = "border:1px solid black;padding-bottom:15px;"> This is a paragraph with a specified bottom padding</p>
	<p style = "border:1px solid black;padding-bottom:5%;"> This is another paragraph with a specified bottom padding in percent</p>
</body>
</html>@CODE_END@	
<div class="min-height-50" id="csspadding2"><button type="button"  class="cws-button border-radius bt-color-3 pull-right" ng-click="tryYourSelf('csspadding2','css')">Try Yourself</button></div>							
					<h4>Output</h4>
					@IMG_START@CSS/csspaddingtutorial_image2/png@IMG_END@
					<h4>The padding-top Property :</h4>
					<p>The padding-top property sets the top padding (space) of an element. This can take a value in terms of length of %.</p>
					
<p><b>Simple Example on CSS padding-top</b></p>						
@CODE_START@@HTML@<!DOCTYPE html>
<html>
<head>
</head>
<body>
	<p style = "border:1px solid black;padding-top:15px;"> This is a paragraph with a specified top padding</p>
	<p style = "border:1px solid black;padding-top:5%;"> This is another paragraph with a specified top padding in percent</p>
</body>
</html>@CODE_END@		
<div class="min-height-50" id="csspadding3"><button type="button"  class="cws-button border-radius bt-color-3 pull-right" ng-click="tryYourSelf('csspadding3','css')">Try Yourself</button></div>						
					<h4>Output</h4>
				@IMG_START@CSS/csspaddingtutorial_image3/png@IMG_END@
					<h4>The padding-left Property :</h4>
					<p>The padding-left property sets the left padding (space) of an element. This can take a value in terms of length of %.</p>
<p><b>Simple Example on CSS padding-left</b></p>							
@CODE_START@@HTML@<!DOCTYPE html>
<html>
<head>
</head>
<body>
	<p style = "border:1px solid black;padding-left:15px;"> This is a paragraph with a specified left padding</p>
	<p style = "border:1px solid black;padding-left:5%;"> This is another paragraph with a specified left padding in percent</p>
</body>
</html>@CODE_END@	
<div class="min-height-50" id="csspadding4"><button type="button"  class="cws-button border-radius bt-color-3 pull-right" ng-click="tryYourSelf('csspadding4','css')">Try Yourself</button></div>		
					<h4>Output</h4>
				@IMG_START@CSS/csspaddingtutorial_image4/png@IMG_END@
					<h4>The padding-right Property :</h4>
					<p>The padding-right property sets the right padding (space) of an element. This can take a value in terms of length of %.</p>
<p><b>Simple Example on CSS padding-right</b></p>							
@CODE_START@@HTML@<!DOCTYPE html>
<html>
<head>
</head>
<body>
	<p style = "border:1px solid black;padding-right:15px;"> This is a paragraph with a specified right padding</p>
	<p style = "border:1px solid black;padding-right:5%;"> This is another paragraph with a specified right padding in percent</p>
</body>
</html>@CODE_END@	
<div class="min-height-50" id="csspadding5"><button type="button"  class="cws-button border-radius bt-color-3 pull-right" ng-click="tryYourSelf('csspadding5','css')">Try Yourself</button></div>		
					<h4>Output</h4>
				@IMG_START@CSS/csspaddingtutorial_image5/png@IMG_END@
					<h4>Padding: Shorthand Property :</h4>
					<p>CSS shorthand property is used to shorten the code. It specifies all the padding properties in one property.</p>
					<p>There are four types to specify the Padding property. You can use one of them</p>
					<p>1.padding: 50px 100px 150px 200px;</p>
					<p>2.padding: 50px 100px 150px;</p>
					<p>3.padding: 50px 100px;</p>
					<p>4.padding: 50px;</p>
					<h4>1)padding: 50px 100px 150px 200px; :</h4>
					<p>It identifies that:</p>
					<p>top padding value is 50px</p>
					<p>right padding value is 100px</p>
					<p>bottom padding value is 150px</p>
					<p>left padding value is 200px</p>
					<h4>2)padding: 50px 100px 150px; :</h4>
					<p>It identifies that:</p>
					<p>top padding value is 50px</p>
					<p>left and right padding values is 100px</p>
					<p>bottom padding value is 150px</p>
					<h4>3)padding: 50px 100px; :</h4>
					<p>It identifies that:</p>
					<p>top and bottom padding values is 50px</p>
					<p>left and right padding values is 100px</p>
					<h4>4)padding: 50px; :</h4>
					<p>It identifies that:</p>
					<p>top right bottom and left padding values is 50px</p>
<h4>Padding Properties Overview</h4>

<table class="pc-table">
	<tr>
		<td>Property</td>
		<td>Description</td>
	</tr>
	<tr>
		<td>padding</td>
		<td> set all the padding properties in one declaration</td>
	</tr>
	<tr>	
		<td>padding-bottom</td>
		<td>Sets the bottom padding of an element</td>
	</tr>
	<tr>	
		<td>padding-left</td>
		<td>Sets the left padding of an element</td>
	</tr>
	<tr>	
		<td>padding-right</td>
		<td>Sets the right padding of an element</td>
	</tr>
	<tr>
		<td>padding-top</td>	
		<td>Sets the top padding of an element</td>
	</tr>
</table>		
<a class="cws-button border-radius bt-color-3 ng-scope" target="_blank" href="project/download/CSS/padding"> Exercise </a>
