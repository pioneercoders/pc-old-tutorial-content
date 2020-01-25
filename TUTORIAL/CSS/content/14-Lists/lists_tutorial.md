<h4>CSS Lists :</h4>

<p>Lists are two types</p>
<ul>
	<li>Unordered Lists - Items are marked with bullets<li>
	<li>Ordered Lists - list items are marked with numbers or letters</li>
</ul>
<h4>Unordered List Example</h4>
<section>  
<div ui-ace ="{useWrapMode: 'true', showGutter : 'true', theme:'monokai', mode: 'html', previewId:'preview1',
	onLoad: htmlcssjsContentOnLoaded,
	rendererOptions: { fontSize: 16 },
	advanced: { highlightActiveLine: true}
}" style="min-height:200px;"><xmp> <!-- Change code and see.-->
 	<style>
    							 ul{
         					background-color:green;
        				 padding:20px;
         
         }
         ul li{
             background-color:lightgrey;
			 margin:5px;
         }
	 </style>
<ul>
	<li>Unordered Lists - Items are marked with bullets</li>
	<li>Ordered Lists - list items are marked with numbers or letters.</li>
</ul>
</xmp>
</div>
<div>
	<iframe id="preview1"></iframe>
</div>
</section>
<h4>Ordered List Example</h4>
<section>  
<div ui-ace ="{useWrapMode: 'true', showGutter : 'true', theme:'monokai', mode: 'html', previewId:'preview2',
	onLoad: htmlcssjsContentOnLoaded,
	rendererOptions: { fontSize: 16 },
	advanced: { highlightActiveLine: true}
}" style="min-height:200px;"><xmp> <!-- Change code and see.-->
 <style>
     
     ol{
         background-color:blue;
         padding:20px;
         
         }
         ol li{
             background-color:orange;
			 color:white;
			 margin:5px;
         }
 </style>
<ol>
	<li>Unordered Lists - Items are marked with bullets</li>
	<li>Ordered Lists - list items are marked with numbers or letters.</li>
</ol>
</xmp>
</div>
<div>
	<iframe id="preview2"></iframe>
</div>
</section>

<h4>The list-style-type Property :</h4>
<p>The list-style-type property is used to style the bullet in unordered lists and numbers in case ordered lists.</p>
<p><b>Here are the values which can be used for an unordered list</b> </p>
<table class="pc-table">
	<tr>
		<td><b>Value</b></td>
		<td><b>Description</b></td>
	</tr>
	<tr>
		<td>none</td>
		<td>NA</td>
	</tr>
	<tr>
		<td>disc(default)</td>
		<td>A filled in circle</td>
	</tr>
	<tr>
		<td>circle</td>
		<td>An empty circle</td>
	</tr>
	<tr>
		<td>square</td>
		<td>A filled in square</td>
	</tr>
</table>
<p><b>Simple Program on CSS Lists</b></p>
</section>
<h4>Ordered List Example</h4>
<section>  
<div ui-ace ="{useWrapMode: 'true', showGutter : 'true', theme:'monokai', mode: 'html', previewId:'preview3',
	onLoad: htmlcssjsContentOnLoaded,
	rendererOptions: { fontSize: 16 },
	advanced: { highlightActiveLine: true}
}" style="min-height:300px;"><xmp> <!-- Change code and see.-->
<ul style = "list-style-type:circle">
		<li>Maths </li>
		<li>Social Science </li>
		<li>Physics </li>
	</ul>
	<ul style = "list-style-type:square">
		<li>Maths </li>
		<li>Social Science </li>
		<li>Physics </li>
	</ul>
		<ol style = "list-style-type:decimal">
		<li>Maths </li>
		<li>Social Science </li>
		<li>Physics </li>
	</ol>
	<ol style = "list-style-type:lower-alpha">
		<li>Maths </li>
		<li>Social Science </li>
		<li>Physics </li>
	</ol>
	<ol style = "list-style-type:lower-roman">
		<li>Maths </li>
		<li>Social Science </li>
		<li>Physics </li>
	</ol>
</xmp>
</div>
<div>
	<iframe id="preview3"></iframe>
</div>
</section>	
<h4>The list-style-position Property :</h4>
<p>The list-style-position property indicates whether the marker should appear inside or outside of the content flow.</p>
<table class="pc-table">
	<tr>
		<td><b>Value</b></td>
		<td><b>Description</b></td>
	</tr>
	<tr>
		<td>none</td>
		<td>NA</td>
	</tr>
	<tr>
		<td>inside</td>
		<td>If the text goes onto a second line, the text will wrap underneath the marker. It will also appear indented to where the text would have started if the list had a value of outside.</td>
	</tr>
	<tr>
		<td>outside</td>
		<td>If the text goes onto a second line, the text will be aligned with the start of the first line (to the right of the bullet).</td>
	</tr>
</table>
<p><b>Simple Program on CSS list-style-position property</b></p>
<section>  
<div ui-ace ="{useWrapMode: 'true', showGutter : 'true', theme:'monokai', mode: 'html', previewId:'preview4',
	onLoad: htmlcssjsContentOnLoaded,
	rendererOptions: { fontSize: 16 },
	advanced: { highlightActiveLine: true}
}" style="min-height:200px;"><xmp> <!-- Change code and see.-->
	<ul style = "list-style-type:circle;list-style-position:outside;">
		<li>Maths </li>
		<li>Social Science </li>
		<li>Physics </li>
	</ul>
	<ul style = "list-style-type:square;list-style-position:inside;">
		<li>Maths </li>
		<li>Social Science </li>
		<li>Physics </li>
	</ul>
	<ol style = "list-style-type:decimal;list-style-position:outside;">
		<li>Maths </li>
		<li>Social Science </li>
		<li>Physics </li>
	</ol>
	<ol style = "list-style-type:lower-alpha;list-style-position:inside;">
		<li>Maths </li>
		<li>Social Science </li>
		<li>Physics </li>
	</ol>
</xmp>
</div>
<div>
	<iframe id="preview4"></iframe>
</div>
</section>	

<h4>The list-style-image Property :</h4>
<p>There is case where we want to set custom list-stype like instead of bulltes and number we want to set our own image as list-style-type.</p>
<p><b>Simple Program on CSS list-style-image property</b></p>	
<section>  
<div ui-ace ="{useWrapMode: 'true', showGutter : 'true', theme:'monokai', mode: 'html', previewId:'preview5',
	onLoad: htmlcssjsContentOnLoaded,
	rendererOptions: { fontSize: 16 },
	advanced: { highlightActiveLine: true}
}" style="min-height:200px;"><xmp> <!-- Change code and see.-->
	<ul style = "list-style-image:url(../imagetutorial_image.png);">
		<li>Maths </li>
		<li>Social Science </li>
		<li>Physics </li>
	</ul>
	<ol style = "list-style-image:url(../imagetutorial_image.png);">
		<li>Maths </li>
		<li>Social Science </li>
		<li>Physics </li>
	</ol>
</xmp>
</div>
<div>
	<iframe id="preview5"></iframe>
</div>
</section>	
<h4>List - Shorthand property :</h4>
<p>Using <b>list-style</b> property we can set the all list properties like <b>list-style-type</b>, <b>list-style-position</b> and <b>list-style-image</b></p>
<p><b>Simple Program on CSS list-style property</b></p>	
<section>  
<div ui-ace ="{useWrapMode: 'true', showGutter : 'true', theme:'monokai', mode: 'html', previewId:'preview6',
	onLoad: htmlcssjsContentOnLoaded,
	rendererOptions: { fontSize: 16 },
	advanced: { highlightActiveLine: true}
}" style="min-height:200px;"><xmp> <!-- Change code and see.-->
	<ul style = "list-style: inside square">
		<li>Maths </li>
		<li>Social Science </li>
		<li>Physics </li>
	</ul>
	<ol style = "list-style:outside upper-alpha">
		<li>Maths </li>
		<li>Social Science </li>
		<li>Physics </li>
	</ol>
</xmp>
</div>
<div>
	<iframe id="preview6"></iframe>
</div>
</section>
<h4>The marker-offset Property :</h4>
<p>The marker-offset property allows you to specify the distance between the marker and the text relating to that marker. Its value should be a length as shown in the following example</p>
<p><b>Simple Program on marker-offset property</b></p>	
<section>  
<div ui-ace ="{useWrapMode: 'true', showGutter : 'true', theme:'monokai', mode: 'html', previewId:'preview7',
	onLoad: htmlcssjsContentOnLoaded,
	rendererOptions: { fontSize: 16 },
	advanced: { highlightActiveLine: true}
}" style="min-height:200px;"><xmp> <!-- Change code and see.-->
	<ul style = "list-style: inside square;marker-offset:2em;">
		<li>Maths </li>
		<li>Social Science </li>
		<li>Physics </li>
	</ul>
	<ol style = "list-style:outside upper-alpha;marker-offset:2em;">
		<li>Maths </li>
		<li>Social Science </li>
		<li>Physics </li>
	</ol>
</xmp>
</div>
<div>
	<iframe id="preview7"></iframe>
</div>
</section>
<h4>List Properties Overview</h4>				
<table class="pc-table">
	<tr>
		<th>Property</th>
		<th>Description</th>
		<th>Values</th>
	</tr>
	<tr>
		<td>list-style-image</td>
		<td>Sets an image as the list-item marker</td>
		<td>url<br>none</td>
	</tr>
	<tr>
		<td>list-style-position</td>
		<td>Places the list-item marker in the list</td>
		<td>inside<br>outside</td>
	</tr>
	<tr>
		<td>list-style-type</td>
		<td>Sets the type of the list-item marker</td>
		<td>none<br>disc<br>circle<br>square<br>decimal<br>decimal-leading-zero<br>lower-roman<br>upper-roman<br>lower-alpha<br>upper-alpha<br>
		 lower-greek<br>lower-latin<br>upper-latin</td>
	</tr>
</table>				
				
				
