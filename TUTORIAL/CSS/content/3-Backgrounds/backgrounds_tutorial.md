<h4>CSS Backgrounds :</h4>
<p>Background property will be helpful setting in bellow mentioned properties for a web page(HTML).</p>
<table class="pc-table">
	<tr>
		<th>Property</th>
		<th>Description</th>
	</tr>
	<tr>
		<td>background-color</td>
		<td>This property used to apply the background color for a web page</td>
	</tr>
	<tr>
		<td>background-image</td>
		<td>This property used to apply the background image for a web page</td>
	</tr>
	<tr>
		<td>background-repeat</td>
		<td>This property is used to repeat the image horizontally or vertically</td>
	</tr>
	<tr>
		<td>background-position</td>
		<td>sets the position of background image</td>
	</tr>
</table>	
<h4>Example for Background</h4>
<section>  
<div ui-ace ="{useWrapMode: 'true', showGutter : 'true', theme:'monokai', mode: 'html', previewId:'preview1',
	onLoad: htmlcssjsContentOnLoaded,
	rendererOptions: { fontSize: 16 },
	advanced: { highlightActiveLine: true}
}" style="min-height:200px;"><xmp> <!-- Change code and see.-->
<style>
div{
	background-color:lightgrey;
	max-width:100%;
	height:200px;
}		
</style>
<div>
	<h1>Pioneer Coders</h1>
</div>
</xmp>
</div>
<div>
	<iframe id="preview1"></iframe>
</div>
</section>
<h4>CSS background-color :</h4>
<p>Background color property is used to set the background-color to the web page.</p>
<section>  
<div ui-ace ="{useWrapMode: 'true', showGutter : 'true', theme:'monokai', mode: 'html', previewId:'preview2',
	onLoad: htmlcssjsContentOnLoaded,
	rendererOptions: { fontSize: 16 },
	advanced: { highlightActiveLine: true}
}" style="min-height:200px;"><xmp> <!-- Change code and see.-->
<style>
h1{
	background-color:lightgrey;
}
h2{
	background-color:green;
	color:white;
}	
h3{
	background-color:purple;
	color:white
}			
</style>
<div>
	<h1>Pioneer Coders</h1>
	<h2>Pioneer Coders</h2>
	<h3>Pioneer Coders</h3>
</div>
</xmp>
</div>
<div>
	<iframe id="preview2"></iframe>
</div>
</section>
<h4>CSS background-Image :</h4>
<p>CSS has a powerfull property for setting backgrounds to web pages. using background-image css property we can set the background for a web page.</p>
<span><b>background-image example:</b></span>
<section>  
<div ui-ace ="{useWrapMode: 'true', showGutter : 'true', theme:'monokai', mode: 'html', previewId:'preview3',
	onLoad: htmlcssjsContentOnLoaded,
	rendererOptions: { fontSize: 16 },
	advanced: { highlightActiveLine: true}
}" style="min-height:200px;"><xmp> <!-- Change code and see.-->
<style>
	div{
		background-image:url("resources/img/pc-logo.png");
	}		
</style>
<div>
</div>
</xmp>
</div>
<div>
	<iframe id="preview3"></iframe>
</div>
</section>				
@IMG_START@CSS/cssbackgroundstutorial_images7/png@IMG_END@
<h4>CSS background-repeat :</h4>
<p>background-repeat is used to repeat the background image horizontally and vertically. By default background-repeat will repeats the background image horizontally and vertically.</p>
<p><b>Example: background-repeat</b></p>
<section>  
<div ui-ace ="{useWrapMode: 'true', showGutter : 'true', theme:'monokai', mode: 'html', previewId:'preview3',
	onLoad: htmlcssjsContentOnLoaded,
	rendererOptions: { fontSize: 16 },
	advanced: { highlightActiveLine: true}
}" style="min-height:200px;"><xmp> <!-- Change code and see.-->
<style>
	div{
		background-image:url("resources/img/pc-logo.png");
		background-repeat:repeat-x;
	}		
</style>
<div>
</div>
</xmp>
</div>
<div>
	<iframe id="preview3"></iframe>
</div>
</section>			
<h4>Output:</h4>					
@IMG_START@CSS/cssbackgroundstutorial_images6/png@IMG_END@
					
<p><b>Example</b></p>
<section>  
<div ui-ace ="{useWrapMode: 'true', showGutter : 'true', theme:'monokai', mode: 'html', previewId:'preview4',
	onLoad: htmlcssjsContentOnLoaded,
	rendererOptions: { fontSize: 16 },
	advanced: { highlightActiveLine: true}
}" style="min-height:200px;"><xmp> <!-- Change code and see.-->
<style>
	div{
		background-image:url("resources/img/pc-logo.png");
		background-repeat:repeat-y;
	}		
</style>
<div>
</div>
</xmp>
</div>
<div>
	<iframe id="preview4"></iframe>
</div>
</section>						
<h4>Output:</h4>
@IMG_START@CSS/cssbackgroundstutorial_images4/png@IMG_END@
					
<h4>CSS background-attachment :</h4>
<p>if background attachement is fixed the then background image will not be moved with rest of the page. if it is set to scroll. the background image will be movel with rest of the pages. if background-repeat is set to no-repeat the image won't be repeated horizontally and vertically.</p>
<section>  
<div ui-ace ="{useWrapMode: 'true', showGutter : 'true', theme:'monokai', mode: 'html', previewId:'preview5',
	onLoad: htmlcssjsContentOnLoaded,
	rendererOptions: { fontSize: 16 },
	advanced: { highlightActiveLine: true}
}" style="min-height:200px;"><xmp> <!-- Change code and see.-->
<style>
	div{
		background-image:url("../imagetutorial_image1.png");
		background-repeat:no-repeat;
		background-attachment:fixed;
	}		
</style>
<div>
</div>
</xmp>
</div>
<div>
	<iframe id="preview5"></iframe>
</div>
</section>		
<h4>Output:</h4>
@IMG_START@CSS/cssbackgroundstutorial_images5/png@IMG_END@
					
<h4>CSS background-Position :</h4>
<p>Using background position one can set the position of the background image.</p>
<p>default position will be <b>top left</b></p>
<p>You can set the following positions : <b>center, top, bottom, left, right</b></p>
<section>  
<div ui-ace ="{useWrapMode: 'true', showGutter : 'true', theme:'monokai', mode: 'html', previewId:'preview5',
	onLoad: htmlcssjsContentOnLoaded,
	rendererOptions: { fontSize: 16 },
	advanced: { highlightActiveLine: true}
}" style="min-height:200px;"><xmp> <!-- Change code and see.-->
<style>
	div{
		background-image:url("../imagetutorial_image1.png");
		background-repeat:no-repeat;
		background-attachment:fixed;
		background-position:bottom right;
	}		
</style>
<div>
</div>
</xmp>
</div>
<div>
	<iframe id="preview5"></iframe>
</div>
</section>	
<h4>Output:</h4>
@IMG_START@CSS/cssbackgroundstutorial_images8/png@IMG_END@
<h4>background-Short hand Property syntax</h4>

@IMG_START@CSS/css-background-5/jpg@IMG_END@	
@CODE_START@@HTML@
body{
	background: #ffffff url("pc-logo.png") no-repeat right top;
	}
@CODE_END@
<h4>Background Propertys Overview</h4>
<div class="main-panel">
	<table class="pc-table">
	<tr>
		<th>Property</th>
		<th>Description</th>
		<th>Values</th>
	</tr>
	<tr>
		<td>background-color</span></td>
		<td>Sets the background color of an element</td>
		<td>color-rgb<br> color-hex<br> color-name<br> transparent</td>
	</tr>
	<tr>
		<td>background-image</td>
		<td>Sets an image as  the background</td>
		<td>url<br> none</td>
	</tr>
	<tr>
		<td>background-<br>attachment</td>
		<td>Sets Whether a background image is fixed or scrolls<br>with the rest of page</td>
		<td>scroll<br> fixed</td>
	</tr>
	<tr>
		<td>background-<br>position</td>
		<td>Sets the starting position of a background image</td>
		<td>top left<br>top center<br> top right<br>center left<br>center center<br>center right<br>bottom left<br>bottom<br>center<br>bottom-right<br>
		x-% y-%<br>x-pos y-pos</td>
	</tr>
	<tr>
		<td>background-repeat</td>
		<td>Sets if/how a background image will be repeated</td>
		<td>repeat<br> repeat-x<br>repeat-Y<br> no-repeat</td>
	</tr>
	</table>
	
</div>
