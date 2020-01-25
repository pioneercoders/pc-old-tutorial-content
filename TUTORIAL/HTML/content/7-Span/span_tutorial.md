
<p>The span tag is like the div tag. It has no meaning at all and is mostly used for styling by using an id or class. The difference between the two is that div is a block element, It's on a seperate line. span however is an inline element, meaning that it can be on a line with other elements.</p>

<section>  
    <div ui-ace ="{useWrapMode: 'true', showGutter : 'true', theme:'monokai', mode: 'html', previewId:'preview',
		onLoad: htmlcssjsContentOnLoaded,
		rendererOptions: { fontSize: 16 },
		advanced: { highlightActiveLine: true}
	}" style="min-height:150px;"><xmp> <!-- Change code and see.-->
<div id = "mydiv">
	<p><span style = "color:red">Highlighted text</span> and non-highlighted text</p>
	<h3> This is my <span style = "color:red"> Awesome</span> Headline</h3>
</div></xmp>
	</div>
	<div>
        <iframe id="preview"></iframe>
    </div>
</section>

<p>Use span when you want to change the style of content without defining that content as a new block-level element in the document.</p>
<p>For example, if you want the second word of an h3 heading to be red, you could surround that word with a span element that would style that word as red text. The word still remains part of the h3 element, but now also displays in red.</p>
