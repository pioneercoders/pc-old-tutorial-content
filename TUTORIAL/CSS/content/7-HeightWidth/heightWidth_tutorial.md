<h4 >CSS Height & Width :</h4>
<p>HTML element width and height can be applied using width and height properties</p>
<p>By default height and width of an element is set to auto(browser calculates the height and width), or be specified in length values, like px, cm, etc., or in percent (%) of the containing block.</p>
<p>This element has a height of 200 pixels and a width of 50%</p>
<section>  
<div ui-ace ="{useWrapMode: 'true', showGutter : 'true', theme:'monokai', mode: 'html', previewId:'preview1',
	onLoad: htmlcssjsContentOnLoaded,
	rendererOptions: { fontSize: 16 },
	advanced: { highlightActiveLine: true}
}" style="min-height:200px;"><xmp> <!-- Change code and see.-->
<style>
.box{  
	background-color: #eee;
    outline: 3px solid red;
    border: 3px solid lightgreen;
    padding: 5px 10px;
	text-align: center;
    width: 50%;
}		
</style>
<div class="box">Welcome To Pioneercoders</div>
</xmp>
</div>
<div>
	<iframe id="preview1"></iframe>
</div>
</section> 	
					
<p><b>Note :</b>The height and width properties do not include padding, borders, or margins; they set the height/width of the area inside the padding, border, and margin of the element!</p>

<h4 >max-width Property :</h4>
<p>The max-width property is used to set the maximum width of an element.</p>
<p>The max-width can be specified in length values, like px, cm, etc., or in percent (%) of the containing block, or set to none (this is default. Means that there is no maximum width).</p>
<p>The problem with the <<span>div></span> above occurs when the browser window is smaller than the width of the element (500px). The browser then adds a horizontal scrollbar to the page.</p>
<p>Using max-width instead, in this situation, will improve the browser's handling of small windows.</p>
<p><b>Note :</b>Drag the browser window to smaller than 500px wide, to see the difference between the two divs!</p>
<p><b>Note :</b>The value of the max-width property overrides width.</p>

<p><b>Simple Example on Background-color</b></p>
<section>  
<div ui-ace ="{useWrapMode: 'true', showGutter : 'true', theme:'monokai', mode: 'html', previewId:'preview2',
	onLoad: htmlcssjsContentOnLoaded,
	rendererOptions: { fontSize: 16 },
	advanced: { highlightActiveLine: true}
}" style="min-height:200px;"><xmp> <!-- Change code and see.-->
<style>
div{
	background-color:powderblue;
	max-width:500px;
	height:100px;
}		
</style>
<h2> Set the max-width of an element</h2>
<div>
	<p> This div element has a height of 100px and a max-width of 500px:</p>
</div>
</xmp>
</div>
<div>
	<iframe id="preview2"></iframe>
</div>
</section> 
<h4>min-width</h4>
<p>min-width property sets minimum width to the elements</p>
<p><b>Simple Example </b></p>	
<section>  
<div ui-ace ="{useWrapMode: 'true', showGutter : 'true', theme:'monokai', mode: 'html', previewId:'preview4',
	onLoad: htmlcssjsContentOnLoaded,
	rendererOptions: { fontSize: 16 },
	advanced: { highlightActiveLine: true}
}" style="min-height:200px;"><xmp> <!-- Change code and see.-->
<style>
body{
margin:0;
padding:0;
}
div{
	background-color:green;
	min-width:30%;
	height:300px;
	color:#fff;
}
</style>
	<div>
		<p>This elements contains min-width:30%</p>
	</div>
</xmp>
</div>
<div>
	<iframe id="preview4"></iframe>
</div>
</section> 
<section>  
<div ui-ace ="{useWrapMode: 'true', showGutter : 'true', theme:'monokai', mode: 'html', previewId:'preview3',
	onLoad: htmlcssjsContentOnLoaded,
	rendererOptions: { fontSize: 16 },
	advanced: { highlightActiveLine: true}
}" style="min-height:200px;"><xmp> <!-- Change code and see.-->
<style>
body{
margin:0;
padding:0;
}
div{
	background-color:green;
	width:80%;
	height:300px;
	color:#fff;
	padding-top:30px;
}
</style>
	<h2> bellow element has width of 80% and height of 300px</h2>
	<div>
		<p> This div element has a height of 300px and a width of 80%</p>
	</div>
</xmp>
</div>
<div>
	<iframe id="preview3"></iframe>
</div>
</section> 		
<h4>min-height</h4>
<p>min-height property sets minimum height  to the elements</p>
<h4>Example: min-height</h4>		
<section>  
<div ui-ace ="{useWrapMode: 'true', showGutter : 'true', theme:'monokai', mode: 'html', previewId:'preview5',
	onLoad: htmlcssjsContentOnLoaded,
	rendererOptions: { fontSize: 16 },
	advanced: { highlightActiveLine: true}
}" style="min-height:200px;"><xmp> <!-- Change code and see.-->
<style>
body{
margin:0;
padding:0;
}
div{
	background-color:dodgerblue;
	min-height:100px;
	color:white;
}
</style>
	<div>This element has minimum height 100px;</div>
</xmp>
</div>
<div>
	<iframe id="preview5"></iframe>
</div>
</section> 	

					
					
