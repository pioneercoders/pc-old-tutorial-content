
					<h4 >CSS Max Width :</h4>
					<p>The max-width property is used to set the maximum width of an element.</p>
					<p>This prevents the value of the width property from becoming larger than max-width.</p>
					<p><b>Note :</b>The value of the max-width property overrides width. </p>
					<h4 >Using width, max-width and margin: auto; :</h4>
					<p>A block-level element always takes up the full width available (stretches out to the left and right as far as it can).</p>
					<p>Setting the width of a block-level element will prevent it from stretching out to the edges of its container. Then, you can set the margins to auto, to horizontally center the element within its container. The element will take up the specified width, and the remaining space will be split equally between the two margins</p>
					<p>This <<span>div></span> element has a width of 500px, and margin set to auto.</p>
					<p><b>Note :</b>The problem with the &lt;div&gt; above occurs when the browser window is smaller than the width of the element. The browser then adds a horizontal scrollbar to the page.</p>
					<p>Using max-width instead, in this situation, will improve the browser's handling of small windows. This is important when making a site usable on small devices</p>
					<p>This <<span>div></span> element has a max-width of 500px, and margin set to auto.</p>
<p><b>Simple Example on CSS max-width </b></p>	
@CODE_START@@HTML@<!DOCTYPE html>
<html>
<head>
<style>
div.ex1{
	width:500px;
	margin:auto;
	border:3px solid #73AD21;
}
div.ex2{
	max-width:500px;
	margin:auto;
	border:3px solid #73AD21;
}
</style>
</head>
<body>
	<div class = "ex1"> This div element has width: 500px;</div>
	<div class = "ex2"> This div element has max-width: 500px;</div>
	<p><strong> Tip</strong> Drag the browser window to smaller than 500px wide, 
		to see the difference between the two divs</p>
</body>
</html>@CODE_END@
<div class="min-height-50" id="cssMaxwidth1"><button type="button"  class="cws-button border-radius bt-color-3 pull-right" ng-click="tryYourSelf('cssMaxwidth1','css')">Try Yourself</button></div>	
					<h4>Output</h4>
					@IMG_START@CSS/cssmaxwidth_image/png@IMG_END@
