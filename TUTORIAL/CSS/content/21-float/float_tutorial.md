					<h4>CSS Float :</h4>
						<p>The <b>float</b> CSS property specifies that an element should be floated(placed) along the left or right side of its container.</p>
						<p>using float elments can be placed side by side</p>
						<p>Generally used for placing text and images side by side.</p>
						<div style="border:3px solid green;clear:both;height:60px;padding:5px;">
							<button class="button-fullwidth cws-button bt-color-2 border-radius alt pull-left" style=""><b>Float Left</b></button> 
							<button class="button-fullwidth cws-button bt-color-1 border-radius alt pull-right"><b>Float Right</b></button>
						</div>
					<h4>CSS Float Properties :</h4>
					<table class="pc-table">
						<tr>
							<td><b>clear</b></td>
							<td><b>Description</b></p>
						</tr>
						<tr>
							<td>clear</td>
							<td>The clear property is used to avoid elements after the floating elements which flow around it.</td>
						</tr>
						<tr>
							<td>float</td>
							<td>It specifies whether the box should float or not.</td>
						</tr>
					</table>
					<h4>CSS Float Property Values :</h4>
					<table class="pc-table">
						<tr>
							<td><b>Value</b></td>
							<td><b>Description</b></p>
						</tr>
						<tr>
							<td>none</td>
							<td>element will not float(default value)</td>
						</tr>
						<tr>
							<td>left</td>
							<td>It is used to float the element to the left.</td>
						</tr>
						<tr>
							<td>right</td>
							<td>It is used to float the element to the right.</td>
						</tr>
						<tr>
							<td>initial</td>
							<td>It sets the property to its initial value.</td>
						</tr>
						<tr>
							<td>inherit</td>
							<td>It is used to inherit this property from its parent element.</td>
						</tr>
					</table>
<p><b>Simple Example on CSS Float</b></p>	
<section>  
<div ui-ace ="{useWrapMode: 'true', showGutter : 'true', theme:'monokai', mode: 'html', previewId:'preview1',
	onLoad: htmlcssjsContentOnLoaded,
	rendererOptions: { fontSize: 16 },
	advanced: { highlightActiveLine: true}
}" style="min-height:200px;"><xmp> <!-- Change code and see.-->
 <style>
    img{
		float:right;
	}
 </style>
<p>The following paragraph contains an image with style<b>float:right</b>The result is that the image will float to the right in the paragraph.
	<img src ="../imagetutorial_image.png" /> 
	<p>This is some Text</p>
</p>
</xmp>
</div>
<div>
	<iframe id="preview1"></iframe>
</div>
</section>
<h4>Output</h4>
@IMG_START@CSS/cssfloattutorial/png@IMG_END@
<p><b>Clear property</b></p>	
<p>The clear property will clear the elements which are around the floating elements.</p>
<section>  
<div ui-ace ="{useWrapMode: 'true', showGutter : 'true', theme:'monokai', mode: 'html', previewId:'preview2',
	onLoad: htmlcssjsContentOnLoaded,
	rendererOptions: { fontSize: 16 },
	advanced: { highlightActiveLine: true}
}" style="min-height:200px;"><xmp> <!-- Change code and see.-->
 <style>
    p{
		float:left;
		clear:both;
	}
 </style>
<p> floated to left</p>
<p>Pioneer Coders.</p>
</xmp>
</div>
<div>
	<iframe id="preview2"></iframe>
</div>
</section>
<h4>Example</h4>
<section>  
<div ui-ace ="{useWrapMode: 'true', showGutter : 'true', theme:'monokai', mode: 'html', previewId:'preview3',
	onLoad: htmlcssjsContentOnLoaded,
	rendererOptions: { fontSize: 16 },
	advanced: { highlightActiveLine: true}
}" style="min-height:200px;"><xmp> <!-- Change code and see.-->
 <style>
    p{
		float:left;
		width:30%;
		border:1px solid orange;
		min-height:50px;
        margin:4px;
		
	}
	div{
        float:left;
        margin:4px;
		min-height:50px;
		width:60%;
		border:1px solid green;
	}
	.one{
		width:100%;
	}
 </style>
<div class="one">
	<p> floated to left</p>
	<div><h1>Pioneer Coders.</h1></div>
</div>
</xmp>
</div>
<div>
	<iframe id="preview3"></iframe>
</div>
</section>
				
