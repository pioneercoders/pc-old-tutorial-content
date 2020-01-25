	<h4>What is CSS?</h4>
	<p>CSS stands for Cascading Style Sheet. CSS is used to Style or Decorate the webpage. Using CSS one can style section of webpage or elements (&lt;div&gt;, &lt;p&gt;, &lt;span&gt; etc.) of a web page.</p>
	<p>Before css was introduced, if we want to apply the bold to the perticular text and applying text color as red we need to write lot of code in HTML.</p>
	<h4>Example: Before CSS </h4>
<section>  
	<div ui-ace ="{useWrapMode: 'true', showGutter : 'true', theme:'monokai', mode: 'html', previewId:'preview1',
		onLoad: htmlcssjsContentOnLoaded,
		rendererOptions: { fontSize: 16 },
		advanced: { highlightActiveLine: true}
	}" style="min-height:200px;"><xmp> <!-- Change code and see.-->
<font color="#ff0000" face="Verdana, Helvetica, sans-serif">
<strong>Piooneer Coders IT Academy</strong></font>
		</xmp>
		</div>
		<div>
			<iframe id="preview1"></iframe>
		</div>
</section>
	<h4>Example: Using CSS </h4>
	<section>  
		<div ui-ace ="{useWrapMode: 'true', showGutter : 'true', theme:'monokai', mode: 'html', previewId:'preview2',
			onLoad: htmlcssjsContentOnLoaded,
			rendererOptions: { fontSize: 16 },
			advanced: { highlightActiveLine: true}
		}" style="min-height:200px;"><xmp> <!-- Change code and see.-->
				
<style>
p{
	font-family: Verdana, Helvetica, sans-serif;
   font-weight: bold;
   color: #ff0000;
}
</style>
<p>Piooneer Coders IT Academy</p>
			</xmp>
			</div>
			<div>
				<iframe id="preview2"></iframe>
			</div>
	</section>
	
	<p>CSS saves a lot of work. It can control the layout of multiple web pages all at once.</p>
	<p>CSS handles the look and feel part of a web page. Using CSS, you can control the color of the text, the style of fonts, the spacing between paragraphs, how columns are sized and laid out, what background images or colors are used, layout designs,variations in display for different devices and screen sizes as well as a variety of other effects.</p>
	<h4>Advantages of CSS:</h4>
	<h4>saves a lot of time</h4>
	<p>CSS style can be written in seperate file and can be included into different HTML pages. Common styles will be used for different HTML elements.One can change the entire look and feel of the webpage by just modifying the single CSS file which saves lot of time.</p>
	<h4>solved big problem</h4>
	<p>
		HTML never had tags for formating text in the webpage. font and color attributes were added in the HTML 3.2 specification. To solve the this issue CSS was introduced.
	</p>
	
<h4 >History</h4>
	<p>CSS was invited by Hakon Wium Lie on October 10, 1994 and maintained through a group of people within the W3C called the CSS Working Group.</p>
	<p><b>Note:</b>The World Wide Web Consortium, or W3C is a group that makes recommendations about how the Internet works and how it should evolve.</p>
<h4 >CSS Versions :</h4>
	<p><b>Cascading Style Sheets, level 1 (CSS1)</b> was came out of W3C as a recommendation in December 1996. This version describes the CSS language as well as a simple visual formatting model for all the HTML tags.</p>
	<p><b>CSS2</b> was became a W3C recommendation in May 1998 and builds on CSS1. This version adds support for media-specific style sheets e.g. printers and aural devices, downloadable fonts, element positioning and tables.</p>
	<p><b>CSS3</b> was became a W3C recommendation in June 1999 and builds on older versions CSS. it has divided into documentations is called as Modules and here each module having new extension features defined in CSS2.</p>
<h4 >CSS Syntax:</h4>
	<p>A CSS rule-set consists of a selector and a declaration block:</p>
	@IMG_START@CSS/introductionToCssTutorial_image1/png@IMG_END@
	<p>The selector points to the HTML element you want to style.</p>
	<p>The declaration block contains one or more declarations separated by semicolons.</p>
	<p>Each declaration includes a CSS property name and a value, separated by a colon</p>
	<p>A CSS declaration always ends with a semicolon, and declaration blocks are surrounded by curly braces.</p>
	<p>See the following example all < p></span> elements will be center-aligned, with a red text color:</p>
<p><b>Syntax:</b></p>
@CODE_START@@HTML@p{
	color:red;
	text-align:center;
}@CODE_END@	

