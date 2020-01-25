<h4 >CSS Box model :</h4>
<p>In the HTML all the elements can be consindered as box.</p>
<p>The CSS box model is essentially a box that wraps around every HTML element. It consists of margins, borders, padding, and the actual content. The image below illustrates the box model:</p>
	@IMG_START@CSS/boxmodel/png@IMG_END@
<p><b>Content</b> The content of the box, where content and images appear.</p>
<p><b>Padding</b> Generates the space around the content</p>
<p><b>Border</b> border is applied around the content and padding</p>
<p><b>Margin</b> applied outside the border. The margin is transparent.</p>
<p><b>Simple Example on Boxmodel</b></p>
<section>  
<div ui-ace ="{useWrapMode: 'true', showGutter : 'true', theme:'monokai', mode: 'html', previewId:'preview1',
	onLoad: htmlcssjsContentOnLoaded,
	rendererOptions: { fontSize: 16 },
	advanced: { highlightActiveLine: true}
}" style="min-height:200px;"><xmp> <!-- Change code and see.-->
<style>
	p{
	color:white
	background-color:green;
	border:20px solid red;
	padding:20px;
	margin:20px;
	width:300px;
}
</style>
<p> The CSS box model is essentially a box that wraps around every HTML element. It consists of: borders, padding, margins, and the actual content.</p>
</xmp>
</div>
<div>
	<iframe id="preview1"></iframe>
</div>
</section>	
		
<h4 >Width and Height of an Element :</h4>
<p>In order to set the width and height of an element correctly in all browsers, you need to know how the box model works.</p>
<p><b>Note :</b>When you set the width and height properties of an element with CSS, you just set the width and height of the content area. To calculate the full size of an element, you must also add padding, borders and margins.</p>
<p><b>Simple Example on Boxmodel</b></p>
<section>  
<div ui-ace ="{useWrapMode: 'true', showGutter : 'true', theme:'monokai', mode: 'html', previewId:'preview2',
	onLoad: htmlcssjsContentOnLoaded,
	rendererOptions: { fontSize: 16 },
	advanced: { highlightActiveLine: true}
}" style="min-height:200px;"><xmp> <!-- Change code and see.-->
<style>
	p{
	width:320px;
	border:5px solid grey;
	padding:20px;
	margin:0px;
}
</style>
<h2> Calculate the total width</h2>
@IMG_START@CSS/imagetutorial_image1/png@IMG_END@
<div> The picture above is 350px wide. The total width of this element is also 350px.</div>
</xmp>
</div>
<div>
	<iframe id="preview2"></iframe>
</div>
</section>	
	
				
					<p>Here is the math: 320px (width) + 20px (left + right padding) + 10px (left + right border) + 0px (left + right margin) = 350px</p>
					<p>Total element width = width + left padding + right padding + left border + right border + left margin + right margin</p>
					<p>The total height of an element should be calculated like this:</p>
					<p>Total element height = height + top padding + bottom padding + top border + bottom border + top margin + bottom margin</p>
				
