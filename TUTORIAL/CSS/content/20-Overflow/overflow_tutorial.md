<h4 >CSS Overflow :</h4>
<p>Overflow property is used to dispaly the element content with in the element content area</p>
<p>This text is really long and the height of its container is only 100 pixels. Then using overflow we can use scroll bar to display whole content</p> 
<table class="pc-table">
	<tr>
		<th>Property</th>
		<th>Description</th>
	</tr>
	<tr>
		<td>visible</td>
		<td>The overflow is clipped, and  overflowing content is invisible</td>
	</tr>
	<tr>
		<td>hidden</td>
		<td>The overflowed content will be hidden, but a scrollbar is added to see the hidden content</td>
	</tr>
	<tr>
		<td>scroll</td>
		<td>This property is used to make a font italic or oblique.</td>
	</tr>
	<tr>
		<td>auto</td>
		<td>If overflow is clipped, a scrollbar should be added to see the rest of the content</td>
	</tr>
</table>	
<p><b>Note :</b>The overflow property works for only block level elements with a specified height.</p>
<h4 >overflow : visible;</h4>
<p>You can use the overflow property when you want to have better control of the layout. The overflow property specifies what happens if content overflows an element's box.</p>
<p><b>Simple Example on CSS overflow visible</b></p>	
<section>  
<div ui-ace ="{useWrapMode: 'true', showGutter : 'true', theme:'monokai', mode: 'html', previewId:'preview1',
	onLoad: htmlcssjsContentOnLoaded,
	rendererOptions: { fontSize: 16 },
	advanced: { highlightActiveLine: true}
}" style="min-height:200px;"><xmp> <!-- Change code and see.-->
<style>
div{
	border:1px dotted black;
	width:200px;
	height:50px;
	background-color:#eee;
	overflow:visible;
}
</style>

<h2> CSS Overflow</h1>
	<p> By default, the overflow is visible,
		it renders outside the element's box.</p>
	<div> With our predefined filtering process, we are pool up the productive resources. we are once of the pioneer in consulting and outsourcing pioneer coders to companies</div>
</xmp>
</div>
<div>
	<iframe id="preview1"></iframe>
</div>
</section>	



<h4 >Overflow : hidden;</h4>
<p>With the hidden value, the overflow is clipped, and the rest of the content is hidden.</p>
<p>You can use the overflow property when you want to have better control of the layout. The overflow property specifies what happens if content overflows an element's box.</p>
<p><b>Simple Example on CSS overflow hidden</b></p>	
<section>  
<div ui-ace ="{useWrapMode: 'true', showGutter : 'true', theme:'monokai', mode: 'html', previewId:'preview2',
	onLoad: htmlcssjsContentOnLoaded,
	rendererOptions: { fontSize: 16 },
	advanced: { highlightActiveLine: true}
}" style="min-height:200px;"><xmp> <!-- Change code and see.-->
<style>
div{
	border:1px dotted black;
	width:200px;
	height:50px;
	background-color:#eee;
	overflow:hidden;
}
</style>

<h2> CSS Overflow</h1>
	<p> By default, the overflow is visible,
		it renders outside the element's box.</p>
	<div> With our predefined filtering process, we are pool up the productive resources. we are once of the pioneer in consulting and outsourcing pioneer coders to companies</div>
</xmp>
</div>
<div>
	<iframe id="preview2"></iframe>
</div>
</section>				
<h4 >Overflow : scroll;</h4>
<p>Setting the value to scroll, the overflow is clipped and a scrollbar is added to scroll inside the box. Note that this will add a scrollbar both horizontally and vertically (even if you do not need it).</p>
<p>You can use the overflow property when you want to have better control of the layout. The overflow property specifies what happens if content overflows an element's box.</p>
<p><b>Simple Example on CSS overflow scroll</b></p>	
<section>  
<div ui-ace ="{useWrapMode: 'true', showGutter : 'true', theme:'monokai', mode: 'html', previewId:'preview3',
	onLoad: htmlcssjsContentOnLoaded,
	rendererOptions: { fontSize: 16 },
	advanced: { highlightActiveLine: true}
}" style="min-height:200px;"><xmp> <!-- Change code and see.-->
<style>
div{
	border:1px dotted black;
	width:200px;
	height:50px;
	background-color:#eee;
	overflow:scroll;
}
</style>

<h2> CSS Overflow</h1>
	<p> By default, the overflow is visible,
		it renders outside the element's box.</p>
	<div> After setting the overflow to scroll overflowed content will be added and scrollbar is added to scroll inside the box. overflow scroll will add the scrollbar 
	both horizontally and vertically.</div>
	</xmp>
</div>
<div>
	<iframe id="preview3"></iframe>
</div>
</section>	
<h4 >Overflow : auto;</h4>
<p>The auto value is similar to scroll, only it add scrollbars when necessary.</p>
<p>You can use the overflow property when you want to have better control of the layout. The overflow property specifies what happens if content overflows an element's box.</p>
<p><b>Simple Example on CSS overflow auto</b></p>	
<section>  
<div ui-ace ="{useWrapMode: 'true', showGutter : 'true', theme:'monokai', mode: 'html', previewId:'preview4',
	onLoad: htmlcssjsContentOnLoaded,
	rendererOptions: { fontSize: 16 },
	advanced: { highlightActiveLine: true}
}" style="min-height:200px;"><xmp> <!-- Change code and see.-->
<style>
div{
	border:1px dotted black;
	width:200px;
	height:50px;
	background-color:#eee;
	overflow:auto;
}
</style>

<h2> CSS Overflow</h1>
	<p> By default, the overflow is visible,
		it renders outside the element's box.</p>
	<div> After setting the overflow to auto overflowed content will be added and scrollbar is added when necessary. overflow scroll will add the scrollbar 
	both horizontally and vertically.</div>
	</xmp>
</div>
<div>
	<iframe id="preview4"></iframe>
</div>
</section>
<h4 >Overflow-x and overflow-y :</h4>
<p>The overflow-x and overflow-y properties specifies whether to change the overflow of content just horizontally or vertically (or both).</p>
<p>overflow-x specifies what to do with the left/right edges of the content.</p>
<p>overflow-y specifies what to do with the top/bottom edges of the content.</p>
<p>You can use the overflow property when you want to have better control of the layout. The overflow property specifies what happens if content overflows an element's box.</p>
<p><b>Simple Example on CSS overflow-x and overflow-y</b></p>	
<section>  
<div ui-ace ="{useWrapMode: 'true', showGutter : 'true', theme:'monokai', mode: 'html', previewId:'preview5',
	onLoad: htmlcssjsContentOnLoaded,
	rendererOptions: { fontSize: 16 },
	advanced: { highlightActiveLine: true}
}" style="min-height:200px;"><xmp> <!-- Change code and see.-->
<style>
div{
	border:1px dotted black;
	width:200px;
	height:50px;
	background-color:#eee;
	overflow-y:scroll;
}
</style>

<h2> CSS Overflow</h1>
	<p> By default, the overflow is visible,
		it renders outside the element's box.</p>
	<div> You can use the overflow property when you want to have better control of the layout. The overflow property specifies what happens if content overflows an element's box.</div>
	</xmp>
</div>
<div>
	<iframe id="preview5"></iframe>
</div>
</section>
