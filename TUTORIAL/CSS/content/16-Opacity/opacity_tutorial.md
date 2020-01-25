<h4>CSS Opacity:</h4>
<p>The opacity CSS property specifies the level of transparency of an element. Opacity range is from 0 to 1.</p>
<p><b>Opacity:0;</b> specifies the full transperant meaning the element will be visibled clearly. </p>
<p><b>Opacity:1;</b> specifies the full opaque meaning the element will not be visibled clearly. </p>
<p><b>Example</b></p>
@CODE_START@@HTML@img{
		opacity:0.5;
	}
@CODE_END@

@IMG_START@CSS/transparent/png@IMG_END@	
	
<h4>Creating a Transparent Image</h4>
<p>You can create Transparent Background Images by using the CSS property opacity.</p>	

		<div>
			<div style="float:left">
				@IMG_START@CSS/Opacity1.0/png@IMG_END@
			</div>
			<div style="float:right">
				@IMG_START@CSS/Opacity0.2/png@IMG_END@	
			</div>
		</div>
		<div class="clear"></div>
<h4>The Opacity Property :</h4>
<p>The following example demonstrates how to make a image transparent:</p>
<p>Simple Example on CSS Opacity</p>	
<section>  
	
	<div ui-ace ="{useWrapMode: 'true', showGutter : 'true', theme:'monokai', mode: 'html', previewId:'preview1',
	onLoad: htmlcssjsContentOnLoaded,
	rendererOptions: { fontSize: 16 },
	advanced: { highlightActiveLine: true}
	}" style="min-height:200px;"><xmp> <!-- Change code and see.-->
 	<style>
  	 img{
	border:1px solid black;
	opacity:0.2;								
	}
 	</style>
<img src = "../pclogo.png" />
</xmp>
</div>
<div>
	<iframe id="preview1"></iframe>
</div>
</section>	
<h4>Output</h4>
<div>
	@IMG_START@CSS/opacity_hover-with-border/png@IMG_END@
</div>
	
<h4 >The Transparent color div:</h4>
<p>The following example demonstrates how to make a div transparent :</p>
<p><b>Simple Example on Transparent color</b></p>	

	<section>  
	<div ui-ace ="{useWrapMode: 'true', showGutter : 'true', theme:'monokai', mode: 'html', previewId:'preview2',
	onLoad: htmlcssjsContentOnLoaded,
	rendererOptions: { fontSize: 16 },
	advanced: { highlightActiveLine: true}
	}" style="min-height:200px;">
	<xmp> <!-- Change code and see.-->
 	<style>
	.sq{
	width:100px; 
	height:100px; 
	background:orange; 
	border: 1px solid black; 
	float:left; 
	align:center; 
	}
	.sq1{ 
	opacity:1.0; 
	} 
	.sq2{ 
	opacity:0.5; 
	} 
	.sq2:hover{
	background-color:green;
	color:white;
	opacity:1;
	}
 	</style>
	<div class = "sq sq1"> opacity 1.0 </div>
	<div class = "sq sq2"> opacity 0.5(hover on it) </div>
	</xmp>
	</div>
	<div>
	<iframe id="preview2"></iframe>
	</div>
	</section>			
