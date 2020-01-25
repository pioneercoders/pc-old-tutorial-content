<h3>CSS Margins :</h3>
	<p>The margin property defines the space around an HTML element. It is possible to use negative values to overlap content.</p>
	<p>The values of the margin property are not inherited by the child elements. Remember that the adjacent vertical margins (top and bottom margins) will collapse into each other so that the distance between the blocks is not the sum of the margins, but only the greater of the two margins or the same size as one margin if both are equal.</p>
	<p>We have the following properties to set an element margin.</p>
	<p>The <b>margin</b> specifies a shorthand property for setting the margin properties in one declaration.</p>
	<p>The <b>margin-bottom</b> specifies the bottom margin of an element.</p>
	<p>The <b>margin-top</b> specifies the top margin of an element.</p>
	<p>The <b>margin-left</b> specifies the left margin of an element.</p>
	<p>The <b>margin-right</b> specifies the right margin of an element.</p>
	<p>All the margin properties can have the following values:</p>
	<p><b>auto </b>-the browser calculates the margin</p>
	<p><b>length </b>-specifies a margin in px, pt, cm, etc.</p>
	<p><b>%</b>-specifies a margin in % of the width of the containing element</p>
	<p><b>inherit</b>-specifies that the margin should be inherited from the parent element</p>
	<p><b>Note :</b>Negative values are allowed.</p>
	<h3>The Margin Property :</h3>
	<p>The margin property allows you set all of the properties for the four margins in one declaration. Here is the syntax to set margin around a paragraph </p>
					
<p><b>Simple Example on CSS margin</b></p>					
@CODE_START@@HTML@<!DOCTYPE html>
<<html>
<head>
</head>
<body>
	<p style = "border:1px solid black;margin:15px;"> All margins will be 15px.</p>
	<p style = "border:1px solid black;margin:10px 2%;"> Top and bottom margin will be 10px, left and right margin will be 2% of the total width of the document.</p>
	<p style = "border:1px solid black;margin:10px 2% -10px;"> Top margin will be 10px, left and right margin will be 2% of the total width of the document, bottom margin will be -10px.</p>
	<p style = "border:1px solid black;margin:10px 2% -10px auto;"> top margin will be 10px, right margin will be 2% of the total width of the document, bottom margin will be -10px, left margin will be set by the browser.</p>
</body>
</html>@CODE_END@			
<div class="min-height-50" id="cssmargins1"><button type="button"  class="cws-button border-radius bt-color-3 pull-right" ng-click="tryYourSelf('cssmargins1','css')">Try Yourself</button></div>				
			<h4>Output</h4>
			@IMG_START@CSS/cssmargintutorial_images1/png@IMG_END@
			<h3>The margin-bottom Property :</h3>
					<p>The margin-bottom property allows you set bottom margin of an element. It can have a value in length, % or auto.</p>

<p><b>Simple Example on CSS margin-bottom</b></p>					
@CODE_START@@HTML@<!DOCTYPE html>
<html>
<head>
</head>
<body>
	<p style = "border:1px solid black;margin-bottom:15px;"> This is a paragraph with a specified bottom margin..</p>
	<p style = "border:1px solid black;margin-bottom:5%;"> This is another paragraph with a specified bottom margin in percent.</p>
</body>
</html>@CODE_END@			
<div class="min-height-50" id="cssmargins2"><button type="button"  class="cws-button border-radius bt-color-3 pull-right" ng-click="tryYourSelf('cssmargins2','css')">Try Yourself</button></div>		
					<h4>Output</h4>
					@IMG_START@CSS/cssmargintutorial_images2/png@IMG_END@
					<h3>The margin-top Property :</h3>
					<p>The margin-top property allows you set top margin of an element. It can have a value in length, % or auto.</p>

<p><b>Simple Example on CSS margin-top</b></p>					
@CODE_START@@HTML@<!DOCTYPE html>
<html>
<head>
</head>
<body>
	<p style = "border:1px solid black;margin-top:15px;"> This is a paragraph with a specified top margin.</p>
	<p style = "border:1px solid black;margin-top:5%;"> This is another paragraph with a specified top margin in percent.</p>
</body>
</html>@CODE_END@	
<div class="min-height-50" id="cssmargins3"><button type="button"  class="cws-button border-radius bt-color-3 pull-right" ng-click="tryYourSelf('cssmargins3','css')">Try Yourself</button></div>				
					<h4>Output</h4>
					@IMG_START@CSS/cssmargintutorial_images3/png@IMG_END@
					<h3>The margin-left Property :</h3>
					<p>The margin-left property allows you set left margin of an element. It can have a value in length, % or auto.</p>

<p><b>Simple Example on CSS margin-left</b></p>					
@CODE_START@@HTML@<!DOCTYPE html>
<html>
<head>
</head>
<body>
	<p style = "border:1px solid black;margin-left:15px;"> This is a paragraph with a specified left margin.</p>
	<p style = "border:1px solid black;margin-left:5%;"> This is another paragraph with a specified top margin in percent.</p>
</body>
</html>@CODE_END@
<div class="min-height-50" id="cssmargins4"><button type="button"  class="cws-button border-radius bt-color-3 pull-right" ng-click="tryYourSelf('cssmargins4','css')">Try Yourself</button></div>										
					@IMG_START@CSS/cssmargintutorial_images4/png@IMG_END@
					<h3>The margin-right Property :</h3>
					<p>The margin-right property allows you set right margin of an element. It can have a value in length, % or auto.</p>

<p><b>Simple Example on CSS margin-right</b></p>					
@CODE_START@@HTML@<!DOCTYPE html>
<html>
<head>
</head>
<body>
	<p style = "border:1px solid black;margin-right:15px;"> This is a paragraph with a specified right margin.</p>
	<p style = "border:1px solid black;margin-right:5%;"> This is another paragraph with a specified right margin in percent.</p>
</body>
</html>@CODE_END@	
<div class="min-height-50" id="cssmargins5"><button type="button"  class="cws-button border-radius bt-color-3 pull-right" ng-click="tryYourSelf('cssmargins5','css')">Try Yourself</button></div>					
			<h4>Output</h4>
			@IMG_START@CSS/cssmargintutorial_images5/png@IMG_END@
				<h3>Margin: Shorthand Property :</h3>
					<p>CSS shorthand property is used to shorten the code. It specifies all the margin properties in one property.</p>
				<p>There are four types to specify the margin property. You can use one of them</p>
					<p>1.margin: 50px 100px 150px 200px;</p>
					<p>2.margin: 50px 100px 150px;</p>
					<p>3.margin: 50px 100px;</p>
					<p>4.margin: 50px;</p>
				<h3>1)margin: 50px 100px 150px 200px; :</h3>
					<p>It identifies that:</p>
					<p>top margin value is 50px</p>
					<p>right margin value is 100px</p>
					<p>bottom margin value is 150px</p>
					<p>left margin value is 200px</p>
				<h3>2)margin: 50px 100px 150px; :</h3>
					<p>It identifies that:</p>
					<p>top margin value is 50px</p>
					<p>left and right margin values is 100px</p>
					<p>bottom margin value is 150px</p>
				<h3>3)margin: 50px 100px; :</h3>
					<p>It identifies that:</p>
					<p>top and bottom margin values is 50px</p>
					<p>left and right margin values is 100px</p>
				<h3>4)margin: 50px; :</h3>
					<p>It identifies that:</p>
					<p>top right bottom and left margin values is 50px</p>
<h4>margin Properties Overview</h4>

<table class="pc-table">
	<tr>
		<td>Property</td>
		<td>Description</td>
	</tr>
	<tr>
		<td>margin</td>
		<td> set all the margin properties in one declaration</td>
	</tr>
	<tr>	
		<td>margin-bottom</td>
		<td>Sets the bottom margin of an element</td>
	</tr>
	<tr>	
		<td>margin-left</td>
		<td>Sets the left margin of an element</td>
	</tr>
	<tr>	
		<td>margin-right</td>
		<td>Sets the right margin of an element</td>
	</tr>
	<tr>
		<td>margin-top</td>	
		<td>Sets the top margin of an element</td>
	</tr>
</table>					
