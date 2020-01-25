<h4>CSS Outline :</h4>
<p>An Outline is a line to make the element "stand out".</p>
<p>@IMG_START@CSS/outline/png@IMG_END@</p>
<p>An outline does not take up space.</p>
<p>Outlines do not have to be rectangular.</p>
<p>Outline is always the same on all sides; you cannot specify different values for different sides of an element.</p>
<p><b>Note :</b>The outline properties are not supported by IE 6 or Netscape 7.You can set the following outline properties using CSS.</p>
<p>The <b>Outline-width</b> used for setting the outline width.</p>
<p>The <b>Outline-style</b> used to set the outline style.</p>
<p>The <b>Outline-color</b> used to set the outline color.</p>
<p><b>Simple Example on CSS</b></p> 
<section>  
<div ui-ace ="{useWrapMode: 'true', showGutter : 'true', theme:'monokai', mode: 'html', previewId:'preview1',
	onLoad: htmlcssjsContentOnLoaded,
	rendererOptions: { fontSize: 16 },
	advanced: { highlightActiveLine: true}
}" style="min-height:200px;"><xmp> <!-- Change code and see.-->
<p style = "border:thin solid black;"> This text is having thin solid red outline.</p>
	<p style = "border:thick dashed dodgerblue;"> This text is having thick dashed green outline.</p>
	<p style = "border:5px dotted red;"> This text is having 5px dotted blue outline.</p>
</xmp>
</div>
<div>
	<iframe id="preview1"></iframe>
</div>
</section>	
<p><b>Simple Example on  CSS outline-width</b></p>
<section>  
<div ui-ace ="{useWrapMode: 'true', showGutter : 'true', theme:'monokai', mode: 'html', previewId:'preview2',
	onLoad: htmlcssjsContentOnLoaded,
	rendererOptions: { fontSize: 16 },
	advanced: { highlightActiveLine: true}
}" style="min-height:200px;"><xmp> <!-- Change code and see.-->
<p style = "outline-width:thin;outline-style:solid;"> This text is having thin outline.</p>
<p style = "outline-width:thick;outline-style:solid;"> This text is having thick outline.</p>
<p style = "outline-width:5px;outline-style:solid;"> This text is having 5px outline.</p>
</xmp>
</div>
<div>
	<iframe id="preview2"></iframe>
</div>
</section> 					
<h4 >The outline-style Property :</h4>
<table class="pc-table">
	<tr>
		<th>S.No</th>
		<th>property</th>
		<th>Description</th>
	</tr>
	<tr>
		<td>1</td>
		<td>none</td>
		<td>No border. (Equivalent of outline-width:0;)</td>
	</tr>
	<tr>
		<td>2</td>
		<td>dotted</td>
		<td>specifies dotted outline</td>
	</tr>
	<tr>
		<td>3</td>
		<td>dashed</td>
		<td>specifies outline as series of short lines</td>
	</tr>
	<tr>
		<td>4</td>
		<td>double</td>
		<td>outline with two solid lines.</td>
	</tr>
	<tr>
		<td>5</td>
		<td>groove</td>
		<td>Outline looks as though it is carved into the page.</td>
	</tr>
	<tr>
		<td>6</td>
		<td>ridge</td>
		<td>opposite of groove</td>
	</tr>
	<tr>
		<td>7</td>
		<td>inset</td>
		<td>Outline makes the box look like it is embedded in the page.</td>
	</tr>
	<tr>
		<td>8</td>
		<td>outset</td>
		<td>Outline makes the box look like it is coming out of the canvas.</td>
	</tr>
	<tr>
		<td>9</td>
		<td>hidden</td>
		<td>Same as none</td>
	</tr>
</table>
					
<p><b>Simple Example on CSS outline-style</b></p> 	
<section>  
<div ui-ace ="{useWrapMode: 'true', showGutter : 'true', theme:'monokai', mode: 'html', previewId:'preview3',
	onLoad: htmlcssjsContentOnLoaded,
	rendererOptions: { fontSize: 16 },
	advanced: { highlightActiveLine: true}
}" style="min-height:200px;"><xmp> <!-- Change code and see.-->
<p style = "outline-width:thin;outline-style:solid;"> This text is having thin solid outline.</p>
<p style = "outline-width:thick;outline-style:dashed;"> This text is having thick dashed outline.</p>
<p style = "outline-width:5px;outline-style:dotted;"> This text is having 5px dotted outline.</p>
</xmp>
</div>
<div>
	<iframe id="preview3"></iframe>
</div>
</section> 					
					
<h4 >The outline-color Property:</h4>
<p>Outline color property is used to for specifying color property of outline.</p>

<p><b>Simple Example on CSS outline-style</b></p> 	
<section>  
<div ui-ace ="{useWrapMode: 'true', showGutter : 'true', theme:'monokai', mode: 'html', previewId:'preview4',
	onLoad: htmlcssjsContentOnLoaded,
	rendererOptions: { fontSize: 16 },
	advanced: { highlightActiveLine: true}
}" style="min-height:200px;"><xmp> <!-- Change code and see.-->
<p style = "outline-width:thin;outline-style:solid;outline-color:red"> This text is having thin solid outline.</p>
<p style = "outline-width:thick;outline-style:dashed;outline-color:green"> This text is having thick dashed outline.</p>
<p style = "outline-width:5px;outline-style:dotted;outline-color:blue"> This text is having 5px dotted outline.</p>
</xmp>
</div>
<div>
	<iframe id="preview4"></iframe>
</div>
</section> 					
					
<h4>Outline Vs Borders</h4>
<p>The outlines are generally used to highlight elements. An outline at a glance looks very similar to the border, but it differs from border in the following ways:</p>
<ul>
	<li>Outlines do not take up space, because they always placed on top of the box of the element which may cause them to overlap other elements on the page.</li>
	<li>Unlike borders, outlines won't allow us to set each edge to a different width, or set different colors and styles for each edge. An outline is the same on all sides.</li>
	<li>Outlines don't have any impact on surrounding elements apart from overlapping.</li>
	<li>Unlike borders, outlines don't change the size or position of the element.</li>
	<li>Outlines may be non-rectangular.</li>
</ul>				
<h5>Example:</h5>
<section>  
<div ui-ace ="{useWrapMode: 'true', showGutter : 'true', theme:'monokai', mode: 'html', previewId:'preview5',
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
	<iframe id="preview5"></iframe>
</div>
</section> 	
<h4>Outline Properties Overview</h4>

<table class="pc-table">
	<tr>
		<td>Property</td>
		<td>Description</td>
		<td>Values</td>
	</tr>
	<tr>	
		<td>outline-color</td>
		<td>Sets the color of an outline</td>
		<td>color<br>initial<br>inherit<br>invert</td>
	</tr>
	<tr>	
		<td>outline-offset</td>	
		<td>Specifies the space between an outline and the edge or border of an element</td>
		<td>length<br>initial<br>inherit</td>
	</tr>
	<tr>	
		<td>outline-style</td>
		<td>Sets the style of an outline</td>
		<td>none<br>
			hidden<br>
			dotted<br>
			dashed<br>
			solid<br>
			double<br>
			groove<br>
			ridge<br>
			inset<br>
			outset
		</td>
	</tr>
	<tr>
		<td>outline-width</td>	
		<td>Sets the width of an outline</td>
		<td>thin<br>
			medium<br>
			thick<br>
			length<br>
			initial<br>
			inherit
		</td>
	</tr>		
</table>		
