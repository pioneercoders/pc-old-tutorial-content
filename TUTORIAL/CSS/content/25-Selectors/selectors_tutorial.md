<h4 >CSS Selectors :</h4>
	<p>CSS selectors are used to "find" (or select) HTML elements based on their element name, id, class, attribute, and more.</p>
	<h4>Universal Selector :</h4>
	<p>universal selector selects all the elements in web page.</p>
	<h4>set the font-size 14 px for a web page.</h4>
	<p><b>Syntax:</b></p>
		@CODE_START@@HTML@
			*{
				font-size:14px;
			}@CODE_END@	
		<p><strong> ('*') indicates the all the elements in the web page.</strong></p>
	<h4>The element Selector :</h4>
	<p> Also called Element Type selector. element selector select the elements based on name. The selector of all p elements should match the p elements in HTML.</p>
	<p>You can select all < p></span> elements on a page like this (in this case, all < p></span> elements will be center-aligned, with a red text color):</p>
<p><b>Example:</b></p>
<section>  
<div ui-ace ="{useWrapMode: 'true', showGutter : 'true', theme:'monokai', mode: 'html', previewId:'preview4',
	onLoad: htmlcssjsContentOnLoaded,
	rendererOptions: { fontSize: 16 },
	advanced: { highlightActiveLine: true}
}" style="min-height:200px;"><xmp> <!-- Change code and see.-->
		<style>
			p{
				color:red;
				text-align:center;
			}
		</style>
		<p>Piooneer Coders IT Academy.</p>
</xmp>
</div>
<div>
	<iframe id="preview4"></iframe>
</div>
</section>
<h4 >Id Selector :</h4>
	<p>The ID selector is declared using  	hash(#) symbol preceding the string of characters. String of character is ID attribute of specific element in the web page.</p>
	<p>Id of an element should be unique so that the id selector will select only one element.</p>
<p><b>Example: ID selector</b></p>
<section>  
<div ui-ace ="{useWrapMode: 'true', showGutter : 'true', theme:'monokai', mode: 'html', previewId:'preview3',
	onLoad: htmlcssjsContentOnLoaded,
	rendererOptions: { fontSize: 16 },
	advanced: { highlightActiveLine: true}
}" style="min-height:200px;"><xmp> <!-- Change code and see.-->
<style>
#myelement{
	color:red;
	text-align:center;
}
</style>
<p id="myelement">Piooneer Coders IT Academy.</p>
</xmp>
</div>
<div>
	<iframe id="preview3"></iframe>
</div>
</section>
<p><b>Note</b>: An id & class name cannot start with a number!</p>
<h4 >Class Selector :</h4>
	<p>The class selector selects elements with a specific class attribute.</p>
	<p>Class selector is declared using period (<b>.</b>) character, followed by the name of the class. </p>
	<p>In the example below, all HTML elements with class="center" will be red and center-aligned:</p>
	<p><b>Example: class selector</b></p>
	
<section>  
<div ui-ace ="{useWrapMode: 'true', showGutter : 'true', theme:'monokai', mode: 'html', previewId:'preview2',
	onLoad: htmlcssjsContentOnLoaded,
	rendererOptions: { fontSize: 16 },
	advanced: { highlightActiveLine: true}
}" style="min-height:200px;"><xmp> <!-- Change code and see.-->
<style>
.myelement{
	color:green;
	text-align:left;
	font-size:20px;
}
</style>
<p class="myelement">Piooneer Coders IT Academy.</p>
</xmp>
</div>
<div>
	<iframe id="preview2"></iframe>
</div>
</section>
<h4>Grouping Selectors :</h4>
	<p>If we have common style for two or more elements we can group the common styles</p>
	<p>To group selectors, separate each selector with a comma.</p>
<section>  
<div ui-ace ="{useWrapMode: 'true', showGutter : 'true', theme:'monokai', mode: 'html', previewId:'preview1',
	onLoad: htmlcssjsContentOnLoaded,
	rendererOptions: { fontSize: 16 },
	advanced: { highlightActiveLine: true}
}" style="min-height:300px;"><xmp> <!-- Change code and see.-->
	<style>
	<!--  -->
		h1{
			color:red;
			text-align:center;
		}
		h2{
			color:red;
			text-align:center;
		}
		p{
			color:red;
			text-align:center;
		}
	</style>
	<p class="myelement">Piooneer Coders IT Academy.</p>
	<h1>This is heading 1</h1>
	<h2>This is heading 2</h2>
</xmp>
</div>
<div>
	<iframe id="preview1"></iframe>
</div>
</section>
