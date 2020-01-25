<h4>@font-face property</h4>
<p>The <b>@font-face</b> rule allows custom fonts to be loaded on a webpage</p>
<table class="pc-table">
	<tr>
		<th>Value</th>
		<th>Description</th>
	</tr>
	<tr>
		<td>font-family</td>
		<td>Used to define the font name</td>
	</tr>
	<tr>
		<td>src</td>
		<td>Used to define location of(URL) of the custom font.</td>
	</tr>
	<tr>
		<td>font-weight	</td>
		<td>Used to define the font Boldness </td>
	</tr>
	<tr>
		<td>font-style</td>
		<td>Used to define the font style(normal, italic and oblique)</td>
	</tr>
</table>
<h4>Example</h4>
<section>  
<div ui-ace ="{useWrapMode: 'true', showGutter : 'true', theme:'monokai', mode: 'html', previewId:'preview2',
	onLoad: htmlcssjsContentOnLoaded,
	rendererOptions: { fontSize: 16 },
	advanced: { highlightActiveLine: true}
}" style="min-height:200px;"><xmp> <!-- Change code and see.-->
<style>
@font-face{
	font-family:mycustomfont;
	src:url('roboto.ttf')
}
div{
	font-family:roboto-regular;
}		
</style>
<div>Pioneer Coders</div>
</xmp>
</div>
<div>
	<iframe id="preview2"></iframe>
</div>
</section> 	
<h4>Example</h4>
<section>  
<div ui-ace ="{useWrapMode: 'true', showGutter : 'true', theme:'monokai', mode: 'html', previewId:'preview1',
	onLoad: htmlcssjsContentOnLoaded,
	rendererOptions: { fontSize: 16 },
	advanced: { highlightActiveLine: true}
}" style="min-height:200px;"><xmp> <!-- Change code and see.-->
<style>
@font-face{
	font-family:roboto-regular;
	src:url('../fonts/roboto.ttf');
	font-weight:bold;
	font-style:italic;
	
}
div{
	font-family:roboto-regular;
}		
</style>
<div>Pioneer Coders</div>
</xmp>
</div>
<div>
	<iframe id="preview1"></iframe>
</div>
</section> 
<h4>Font File Types</h4>	
<table class="pc-table">
	<tr>
		<th>Value</th>
		<th>Description</th>
	</tr>
	<tr>
		<td>TTF</td>
		<td>TrueType Fonts </td>
	</tr>
	<tr>
		<td>EOT	</td>
		<td>Embedded OpenType Fonts </td>
	</tr>
	<tr>
		<td>WOFF</td>
		<td>Web Open Font Format </td>
	</tr>
	<tr>
		<td> OTF</td>
		<td>OpenType Fonts</td>
	</tr>
</table>
<p>Font files are downloaded and using @font-face rule we can add to the web page.</p>
