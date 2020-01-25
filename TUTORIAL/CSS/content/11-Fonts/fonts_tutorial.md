	<h4 >CSS Fonts :</h4>
	<p>CSS Font property is used to control the look of texts. By the use of CSS font property you can change the text size, color, style and more.</p>
	<table class="pc-table">
		<tr>
			<th>Property</th>
			<th>Description</th>
		</tr>
		<tr>
			<td>font-family</td>
			<td>This property is used to change the face of a font.</td>
		</tr>
		<tr>
			<td>font-size</td>
			<td>This property is used to increase or decrease the size of a font.</td>
		</tr>
		<tr>
			<td>font-style</td>
			<td>This property is used to make a font italic or oblique.</td>
		</tr>
		<tr>
			<td>font- weight</td>
			<td>This property is used to increase or decrease how bold or light a font appears.</td>
		</tr>
		<tr>
			<td>Font color </td>
			<td>This property is used to change the color of the text. (standalone attribute).</td>
		</tr>
		<tr>
			<td> font </td>
			<td>This property is used as shorthand to specify a number of other font properties.</td>
		</tr>
	</table>	
<p><b>Simple Example on CSS Font Color</b></p>
<section>  
<div ui-ace ="{useWrapMode: 'true', showGutter : 'true', theme:'monokai', mode: 'html', previewId:'preview1',
	onLoad: htmlcssjsContentOnLoaded,
	rendererOptions: { fontSize: 16 },
	advanced: { highlightActiveLine: true}
}" style="min-height:200px;"><xmp> <!-- Change code and see.-->
<style>
	body{
		font-size:20px;
	}
	h1{
		color:red;
	}
	h2{
		color:green;
	}
	p{
		color:blue;
	}
</style>
<h1>Pioneercoders</h1>
<h2>Pioneercoders</h2>
<p>Pioneercoders</p>
</xmp>
</div>
<div>
	<iframe id="preview1"></iframe>
</div>
</section>	
	<h4>The Font Family Property :</h4>
	<p>The font family of a text is set with the font-family property.</p>
	<p>The font-family property should hold several font names as a "fallback" system. If the browser does not support the first font, it tries the next font, and so on.</p>
	<p>Start with the font you want, and end with a generic family, to let the browser pick a similar font in the generic family, if no other fonts are available.</p>
	<p><b>Note :</b>If the name of a font family is more than one word, it must be in quotation marks, like: "Times New Roman".</p>
	<p>More than one font family is specified in a comma-separated list.</p>
<p><b>Simple Example on CSS Font Family</b></p>
<section>  
<div ui-ace ="{useWrapMode: 'true', showGutter : 'true', theme:'monokai', mode: 'html', previewId:'preview2',
	onLoad: htmlcssjsContentOnLoaded,
	rendererOptions: { fontSize: 16 },
	advanced: { highlightActiveLine: true}
}" style="min-height:200px;"><xmp> <!-- Change code and see.-->
<p style = "font-family:georgia,garamond,serif;"> This text is rendered in 
	either georgia, garamond, or the default serif font depending on which font 
	you have at your system.</p>
</xmp>
</div>
<div>
	<iframe id="preview2"></iframe>
</div>
</section>


<h4 >The Font Style Property :</h4>
<p>The font-style property is mostly used to specify italic text.</p>
<p>This property has three values:</p>
<p>normal - The text is shown normally</p>
<p>italic - The text is shown in italics</p>
<p>oblique - The text is "leaning" (oblique is very similar to italic, but less supported)</p>
					
<p><b>Simple Example on CSS Font Style</b></p>
<section>  
<div ui-ace ="{useWrapMode: 'true', showGutter : 'true', theme:'monokai', mode: 'html', previewId:'preview3',
	onLoad: htmlcssjsContentOnLoaded,
	rendererOptions: { fontSize: 16 },
	advanced: { highlightActiveLine: true}
}" style="min-height:200px;"><xmp> <!-- Change code and see.-->
<p style = "font-style:italic;"> This text will be rendered in italic style.</p>
</xmp>
</div>
<div>
	<iframe id="preview3"></iframe>
</div>
</section>					
<h4 >The Font Variant Property :</h4>
<p>The font-variant property specifies whether or not a text should be displayed in a small-caps font.</p>
<p>In a small-caps font, all lowercase letters are converted to uppercase letters. However, the converted uppercase letters appears in a smaller font size than the original uppercase letters in the text.</p>
<p><b>Simple Example on CSS Font Variant</b></p>
<section>  
<div ui-ace ="{useWrapMode: 'true', showGutter : 'true', theme:'monokai', mode: 'html', previewId:'preview4',
	onLoad: htmlcssjsContentOnLoaded,
	rendererOptions: { fontSize: 16 },
	advanced: { highlightActiveLine: true}
}" style="min-height:200px;"><xmp> <!-- Change code and see.-->
<p style = "font-variant:small-caps;"> This text will be rendered as small caps.</p>
</xmp>
</div>
<div>
	<iframe id="preview4"></iframe>
</div>
</section>

<h4 >The Font Weight Property :</h4>
<p>The font-weight property provides the functionality to specify how bold a font is. Possible values could be normal, bold, bolder, lighter, 100, 200, 300, 400, 500, 600, 700, 800, 900.</p>
<p><b>Simple Example on CSS Font Weight</b></p>
<section>  
<div ui-ace ="{useWrapMode: 'true', showGutter : 'true', theme:'monokai', mode: 'html', previewId:'preview5',
	onLoad: htmlcssjsContentOnLoaded,
	rendererOptions: { fontSize: 16 },
	advanced: { highlightActiveLine: true}
}" style="min-height:200px;"><xmp> <!-- Change code and see.-->
<p style = "font-weight:bold;"> This font is bold.</p>
<p style = "font-weight:bolder;"> This font is bolder.</p>
<p style = "font-weight:500;"> This font is 500 weight.</p>
</xmp>
</div>
<div>
	<iframe id="preview5"></iframe>
</div>
</section>
<h4 >The Font Size Property :</h4>
<p>The font-size property sets the size of the text.</p>
<p>Being able to manage the text size is important in web design. However, you should not use font size adjustments to make paragraphs look like headings, or headings look like paragraphs.</p>
<p>Always use the proper HTML tags, like <<span>h1></span> - <<span>h6></span> for headings and <<span>p></span> for paragraphs.</p>
<p>The font-size value can be an absolute, or relative size.</p>
<p><b>Absolute size:</b></p>
<p>Sets the text to a specified size</p>
<p>Does not allow a user to change the text size in all browsers (bad for accessibility reasons)</p>
<p>Absolute size is useful when the physical size of the output is known. </p>
<p><b>Relative size :</b></p>
<p>Sets the size relative to surrounding elements.</p>
<p>Allows a user to change the text size in browsers.</p>
<p><b>Note :</b>If you do not specify a font size, the default size for normal text, like paragraphs, is 16px (16px=1em).</p>
<p>The font-size property is used to control the size of fonts. Possible values could be xx-small, x-small, small, medium, large, x-large, xx-large, smaller, larger, size in pixels or in %.</p>
<p><b>Simple Example on CSS Font Size</b></p>
<section>  
<div ui-ace ="{useWrapMode: 'true', showGutter : 'true', theme:'monokai', mode: 'html', previewId:'preview6',
	onLoad: htmlcssjsContentOnLoaded,
	rendererOptions: { fontSize: 16 },
	advanced: { highlightActiveLine: true}
}" style="min-height:200px;"><xmp> <!-- Change code and see.-->
<p style = "font-size:20px;">Pioneercoders</p>
<p style = "font-size:small;">Pioneercoders</p>
<p style = "font-size:large;">Pioneercoders</p>
</xmp>
</div>
<div>
	<iframe id="preview6"></iframe>
</div>
</section>
<p><b>Simple Example on CSS Font Size in Em</b></p>
<section>  
<div ui-ace ="{useWrapMode: 'true', showGutter : 'true', theme:'monokai', mode: 'html', previewId:'preview7',
	onLoad: htmlcssjsContentOnLoaded,
	rendererOptions: { fontSize: 16 },
	advanced: { highlightActiveLine: true}
}" style="min-height:200px;"><xmp> <!-- Change code and see.-->
<style>
h1 {
	font-size: 2.5em;
}

h2 {
	font-size: 1.875em;
}

p {
	font-size: 0.875em;
}
</style>
<h1>This is heading 1</h1>
<h2>This is heading 2</h2>
<p>This is a paragraph.</p>
</xmp>
</div>
<div>
	<iframe id="preview7"></iframe>
</div>
</section>
<h4 >The Font Size Adjust :</h4>
<p>This property enables you to adjust the x-height to make fonts more legible. Possible value could be any number.</p>
<p><b>Simple Example on CSS Font Size Adjust</b></p>
<section>  
<div ui-ace ="{useWrapMode: 'true', showGutter : 'true', theme:'monokai', mode: 'html', previewId:'preview8',
	onLoad: htmlcssjsContentOnLoaded,
	rendererOptions: { fontSize: 16 },
	advanced: { highlightActiveLine: true}
}" style="min-height:200px;"><xmp> <!-- Change code and see.-->
<p style = "font-size-adjust:0.61;">Pioneercoders</p>
</xmp>
</div>
<div>
	<iframe id="preview8"></iframe>
</div>
</section>
<h4 >The Font Stretch :</h4>
<p>This property relies on the user's computer to have an expanded or condensed version of the font being used.</p>
<p>Possible values could be normal, wider, narrower, ultra-condensed, extra-condensed, condensed, semi-condensed, semi-expanded, expanded, extra-expanded, ultra-expanded.</p>
<p><b>Simple Example on Font Stretch </b></p>
<section>  
<div ui-ace ="{useWrapMode: 'true', showGutter : 'true', theme:'monokai', mode: 'html', previewId:'preview9',
	onLoad: htmlcssjsContentOnLoaded,
	rendererOptions: { fontSize: 16 },
	advanced: { highlightActiveLine: true}
}" style="min-height:200px;"><xmp> <!-- Change code and see.-->
<p style = "font-stretch:ultra-expanded;"> If this doesn't appear to work, it is likely that your computer doesn't have a condensed or expanded version of the font being used.</p>
</xmp>
</div>
<div>
	<iframe id="preview9"></iframe>
</div>
</section>
<h4>Font Propertys Overview</h4>
<head>
<body>
<div class="main-pane">
	<table class="pc-table">
	<tr>
		<th>Property</th>
		<th>Description</th>
		<th>Values</th>
	</tr>
	<tr>
		<td>font-family</td>
		<td>A prioritized list of font family names and/or generic family names for an<br>element</td>
		<td>family-name<br>generic-<br>family</td>
	</tr>
	<tr>
		<td>font-size</td>
		<td>Sets the size of a font</td>
		<td>xx-small<br>x-small<br>small<br>medium<br>large<br>x-large<br>xx-large<br>smaller<br>larger<br>length<br>%</td>
	</tr>
	<tr>
		<td>font-style</td>
		<td>Sets the style of the font</td>
		<td>normal<br>Italic<br>oblique</td>		
	</tr>
	<tr>
		<td>font-<br>weight</td>
		<td>Sets the weight of a font</td>
		<td>normal<br>bold<br>bolder<br>lighter<br>100<br>200<br>300<br>400<br>500<br>600<br>700<br>800<br>900</td>
	</tr>
	</table>	
</div>
</body>
