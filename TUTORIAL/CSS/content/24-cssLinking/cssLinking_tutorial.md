<h4>There are three different ways to include the CSS</h4>
	<ul>
		<li>External CSS</li>
		<li>Internal CSS</li>
		<li>Inline CSS</li>
	<ul>
<h4>External CSS</h4>
<p>CSS styles are written in seperate file. CSS file should be saved with .css extention</p>
<p>Using link element, the external css can be included into the web page</p>
<h4>Syntax</h4>
@CODE_START@@HTML@<!DOCTYPE html>
<html>
<head>
	<title>External Style Example</title>
	<link rel="stylesheet" type="text/css" href="mystyle.css"></link>
</head>
<body>
	
</body>
</html>@CODE_END@	

<h4 >Internal Style Sheet :</h4>
	<ul>
		<li>Internal styles are defined within the &lt;style&gt; element, inside the &lt;head&gt; section of an HTML page</li>
	</ul>

<section>  
<div ui-ace ="{useWrapMode: 'true', showGutter : 'true', theme:'monokai', mode: 'html', previewId:'preview1',
	onLoad: htmlcssjsContentOnLoaded,
	rendererOptions: { fontSize: 16 },
	advanced: { highlightActiveLine: true}
}" style="min-height:200px;"><xmp> <!-- Change code and see.-->
<style type="text/css">
	h1{
		color:maroon;
		margin-left:40px;
	}
	</style>
	<h1>Pioneercoders</h1>
</xmp>
</div>
<div>
	<iframe id="preview1"></iframe>
</div>
</section>
<h4 >Inline Style Sheet :</h4>
	<ul>
		<li>An inline style may be used to apply a unique style for a single element.</li>
		<li>To use inline styles, add the style attribute to the relevant element. The style attribute can contain any CSS property.</li>
	</ul>
	<p>The example below shows how to change the color and the left margin of a <&lt;h1&gt;element</p>
@CODE_START@@HTML@<!DOCTYPE html>
<html>
<head>
	<title>Inline Style Example</title>
</head>
<body>
	<h1 style = "color:blue;background-color: powderblue;">Pioneercoders</h1>
</body>
</html>@CODE_END@	
<section>  
    <div ui-ace ="{useWrapMode: 'true', showGutter : 'true', theme:'monokai', mode: 'html', previewId:'preview2',
		onLoad: htmlcssjsContentOnLoaded,
		rendererOptions: { fontSize: 16 },
		advanced: { highlightActiveLine: true}
	}" style="min-height:200px;"><xmp> <!-- Change code and see.-->
	<h1 style = "color:blue;background-color: powderblue;">Pioneercoders</h1>
</xmp>
	</div>
	<div>
        <iframe id="preview2"></iframe>
    </div>
</section>

	<p><b>Note :</b>An inline style loses many of the advantages of a style sheet (by mixing content with presentation). Use this method sparingly</p>
	<h4 >CSS Comments :</h4>
	<p>Comments are used to explain the code, and may help when you edit the source code at a later date.</p>
	<p>Comments are ignored by browsers.</p>
	<p>A CSS comment starts with /* and ends with */. Comments can also span multiple lines:</p>
<p><b>Syntax:</b></p>
@CODE_START@@HTML@p{
	color:red;
	/* This is a single-line comment */
	text-align:center;
	/* This is 
	a multi-level 
	comment */
}@CODE_END@		
	<h4>Cascading Order :</h4>
	<p>Generally speaking we can say that all the styles will "cascade" into a new "virtual" style sheet by the following rules, where number one has the highest priority: </p>
	<p>1.Inline style (inside an HTML element)</p>
	<p>2.External and internal style sheets (in the head section)</p>
	<p>3.Browser default</p>
	<p>So, an inline style (inside a specific HTML element) has the highest priority, which means that it will override a style defined inside the < head></span> tag, or in an external style sheet, or a browser default value.</p>


