<p>The HTML &lt;p&gt; element represents a paragraph of text. Paragraphs are usually represented in visual media as blocks of text that are separated from adjacent blocks by vertical blank space and/or first-line indentation.</p>

<section >  
    <div ui-ace ="{useWrapMode: 'true', showGutter : 'true', theme:'monokai', mode: 'html', previewId:'preview',
		onLoad: htmlcssjsContentOnLoaded,
		rendererOptions: { fontSize: 16 },
		advanced: { highlightActiveLine: true}
	}" style="min-height:200px;"><xmp><p>This is a first paragraph of text.</p>
<p>This is a second paragraph paragraph of text</p>
<!-- Remove bellow comments and see -->
<!-- <p>This paragraph
			contains a lot of lines
			in the source code,
			but the browser
			ignores it and showing in single line.
			</p> --></xmp>
	</div>
	<div>
        <iframe id="preview"></iframe>
    </div>
</section>

<p><b>Note :</b>Browsers automatically adds  white space (a margin) before and after a paragraph.</p>
<p>The browser will remove any extra spaces and extra lines when the page is displayed.</p>
<p>The number of lines in a paragraph depends on the size of the browser window. If you resize the browser window, the number of lines in this paragraph will change. </p>

<h4>HTML Line Breaks :</h4>
<p>The HTML &lt;br&gt; element defines a line break. Use &lt;br&gt; if you want a line break (a new line) without starting a new paragraph.
The &lt;br&gt; tag is an empty tag, which means that it has no end tag.</p>

<section >  
    <div ui-ace ="{useWrapMode: 'true', showGutter : 'true', theme:'monokai', mode: 'html', previewId:'preview1',
		onLoad: htmlcssjsContentOnLoaded,
		rendererOptions: { fontSize: 16 },
		advanced: { highlightActiveLine: true}
	}" style="min-height:150px;"><xmp><p>This paragraph
contains a lot of lines
in the source code,
but the because of<br>
 br it is braken the line .
</p></xmp>
	</div>
	<div>
        <iframe id="preview1"></iframe>
    </div>
</section>


<h3>The HTML &lt;pre&gt; Element :</h3>
<p>The HTML &lt;pre&gt; element defines preformatted text. The text inside a &lt;pre&gt; element is displayed in a fixed-width font (usually Courier), and it preserves both spaces and line breaks.</p>

<section >  
    <div ui-ace ="{useWrapMode: 'true', showGutter : 'true', theme:'monokai', mode: 'html', previewId:'preview2',
		onLoad: htmlcssjsContentOnLoaded,
		rendererOptions: { fontSize: 16 },
		advanced: { highlightActiveLine: true}
	}" style="min-height:150px;"><xmp><p>The pre tag preserves both spaces and line breaks:</p>
<pre>
This text is from pre tag
Sun rises in the east.
Sun sets in the west.
</pre></xmp>
	</div>
	<div>
        <iframe id="preview2"></iframe>
    </div>
</section>
