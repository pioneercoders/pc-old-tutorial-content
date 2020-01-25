
	<style>
	ul li {
		display:block;
	}
	</style>				
<h4 >CSS Display:</h4>
<p>Display property is used to display the HTML elements.</p>
<p>Based display elements are two types.</p>
		<ul>
			<li> Block Level Elements.</li>
			<li>Inline Elements.</li>
		</ul>
		<h4>Block Level Elements</h4>
<p>A block-level element always starts on a new line and takes up the full width available (stretches out to the left and right as far as it can).</p>

<h4>Block Level Elements Example</h4>

	<ul>
	<li> div</li>
	<li>h1 to h6</li>
	<li>form</li>
	<li>header</li>
	<li>footer</li>
	<li>section</li>
	<li>p</li>
	</ul>
<h4>Inline Elements</h4>
<p>An inline element does not start on a new line and only takes up as much width as necessary.</p>
<h4>Inline Elements Example</h4>

	<ul>
	<li> span</li>
	<li>img element</li>
	<li>anchor element</li>
	<li>header</li>
	<li>footer</li>
	<li>section</li>
	<li>p</li>
	</ul>
<h4>CSS Display Values :</h4>
		<p>There are following CSS display values which are commonly used.</p>
		<p>1.display: inline;</p>
		<p>2.display: inline-block;</p>
		<p>3.display: block;</p>
		<p>4.display: none;</p>
<p><b>Simple Example on CSS display inline</b></p>

	<section>  
	<div ui-ace ="{useWrapMode: 'true', showGutter : 'true', theme:'monokai', mode: 'html', previewId:'preview1',
	onLoad: htmlcssjsContentOnLoaded,
	rendererOptions: { fontSize: 16 },
	advanced: { highlightActiveLine: true}
	}" style="min-height:200px;"><xmp> <!-- Change code and see.-->
 	<style>
   	p{
	display:inline;
	}
 	</style>
	<p> Hello pioneercoders</p>
	<p> Java Tutorial.</p>
	<p> HTML Tutorial.</p>
	<p> CSS Tutorial.</p>
	</xmp>
	</div>
	<div>
	<iframe id="preview1"></iframe>
	</div>
	</section>
	
<p> p tag is block element. we are changing it to inline.</p>
<h4 >CSS display inline-block :</h4>
<p>The CSS display inline-block element is very similar to inline element but the difference is that you are able to set the width and height.</p>
<p><b>Simple Example on CSS display inline-block</b></p>	

	<section>  
	<div ui-ace ="{useWrapMode: 'true', showGutter : 'true', theme:'monokai', mode: 'html', previewId:'preview2',
	onLoad: htmlcssjsContentOnLoaded,
	rendererOptions: { fontSize: 16 },
	advanced: { highlightActiveLine: true}
	}" style="min-height:200px;"><xmp> <!-- Change code and see.-->
	 <style>
  	 p{
	display:inline-block;
	}
 	</style>
	<p> Hello pioneercoders.com.</p>
	<p> Java Tutorial.</p>
	<p> SQL Tutorial.</p>
	<p> HTML Tutorial.</p>
	<p> CSS Tutorial.</p>
	</xmp>
	</div>
	<div>
	<iframe id="preview2"></iframe>
	</div>
	</section>					
<h4>CSS display block :</h4>
<p>The CSS display block element takes as much as horizontal space as they can. Means the block element takes the full available width. They make a line break before and after them.</p>
<p><b>Simple Example on CSS display block</b></p>

	<section>  
	<div ui-ace ="{useWrapMode: 'true', showGutter : 'true', theme:'monokai', mode: 'html', previewId:'preview3',
	onLoad: htmlcssjsContentOnLoaded,
	rendererOptions: { fontSize: 16 },
	advanced: { highlightActiveLine: true}
	}" style="min-height:200px;"><xmp> <!-- Change code and see.-->
 	<style>
  	 p{
	display:block;
	}
	 </style>
	<p> Hello pioneercoders.com.</p>
	<p> Java Tutorial.</p>
	<p> SQL Tutorial.</p>
	<p> HTML Tutorial.</p>
	<p> CSS Tutorial.</p>
	</xmp>
	</div>
	<div>
	<iframe id="preview3"></iframe>
	</div>
	</section>			
	
<h4 >Hiding Element using display property</h4>
<p>Element can be hidden by setting dispaly property to none. Another way hidding element is setting visbility to hidden. </p>
	
	<section>  
	<div ui-ace ="{useWrapMode: 'true', showGutter : 'true', theme:'monokai', mode: 'html', previewId:'preview4',
	onLoad: htmlcssjsContentOnLoaded,
	rendererOptions: { fontSize: 16 },
	advanced: { highlightActiveLine: true}
	}" style="min-height:200px;"><xmp> <!-- Change code and see.-->
 	<style>
  	div{
		display:none;
	}
	p{
		visibility:hidden;
	}
 	</style>
	<div>Pioneer Coders</div>
	<p>Pioneer Coders</p>
	</xmp>
	</div>
	<div>
	<iframe id="preview4"></iframe>
	</div>
	</section>	
<p>You can see that the hidden heading does not contain any space.</p>
<h4 > CSS display values :</h4>
<table class="pc-table">
<tr>
	<td><b>Property-value</b></p>
	<td><b>Description</b></p>
</tr>
<tr>
	<td>flex</td>
	<td>It is used to display an element as an block-level flex container. It is new in css3.</td>
</tr>
<tr>
	<td>inline-flex</td>
	<td>It is used to display an element as an inline-level flex container. It is new in css3.</td>
</tr>
<tr>
	<td>inline-table</td>
	<td>It displays an element as an inline-level table.</td>
</tr>
<tr>
	<td>list-item</td>
	<td>It makes the element behave like a <<span>li></span> element.</td>
</tr>
<tr>
	<td>table</td>
	<td>It makes the element behave like a <<span>table></span> element.</td>
</tr>
<tr>
	<td>table-caption</td>
	<td>It makes the element behave like a <<span>caption></span> element.</td>
</tr>
<tr>
	<td>table-column-group</td>
	<td>It makes the element behave like a <<span>colgroup></span> element.</td>
</tr>
<tr>
	<td>table-header-group</td>
	<td>It makes the element behave like a <<span>thead></span> element.</td>
</tr>
<tr>
	<td>table-footer-group</td>
	<td>It makes the element behave like a <<span>tfoot></span> element.</td>
</tr>
<tr>
	<td>table-row-group</td>
	<td>It makes the element behave like a <<span>tbody></span> element.</td>
</tr>
<tr>
	<td>table-cell</td>
	<td>It makes the element behave like a <<span>td></span> element.</td>
</tr>
<tr>
	<td>table-row</td>
	<td>It makes the element behave like a <<span>tr></span> element.</td>
</tr>
<tr>
	<td>table-column</td>
	<td>It makes the element behave like a <<span>col></span> element.</td>
</tr>
</table>
