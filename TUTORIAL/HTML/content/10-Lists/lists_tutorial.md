
<p>HTML Lists are used to specify lists of information. There are three different types of HTML lists:</p>
<ul>
	<li>Ordered List (ol)    This will use different schemes of numbers to list your items</li>
	<li>Unordered List (ul)   This will list items using plain bullets. </li>
	<li>Description List (dl)  This arranges your items in the same way as they are arranged in a dictionary.</li>
</ul>

<h3>Ordered Lists:</h3>
<p>If you are required to put your items in a numbered list then ordered list will be used. This list is created by using &lt;ol&gt; tag. The numbering starts at one and is incremented by one for each successive ordered list item, tagged with &lt;li&gt;.</p>

<p>You can use type attribute for &lt;ol&gt; tag to specify the type of numbering you like. By default it is a number. Following are the possible options:</p>

<table class="pc-table">
	<tr> 
		<td style="font-weight:bold;width:20%;"> Type</td>
		<td style="font-weight:bold;width:40%;"> Description</td>							
	</tr>
	<tr> 
		<td style="width:20%;">1</td>
		<td style="width:20%;">Default-case Numerals</td>						
	</tr>
	<tr> 
		<td style="width:20%;">I</td>
		<td style="width:20%;">The list items will be numbered with uppercase roman numbers.</td>							
	</tr>
	<tr> 
		<td style="width:20%;">i</td>
		<td style="width:20%;">The list items will be numbered with lowercase roman numbers.</td>							
	</tr>
	<tr> 
		<td style="width:20%;">a</td>
		<td style="width:20%;">The list items will be numbered with lowercase letters.</td>							
	</tr>
	<tr> 
		<td style="width:20%;">A</td>
		<td style="width:20%;">The list items will be numbered with uppercase letters.</td>							
	</tr>
</table>

<section>  
    <div ui-ace ="{useWrapMode: 'true', showGutter : 'true', theme:'monokai', mode: 'html', previewId:'preview',
		onLoad: htmlcssjsContentOnLoaded,
		rendererOptions: { fontSize: 16 },
		advanced: { highlightActiveLine: true}
	}" style="min-height:200px;"><xmp> <!-- Change type attribute value and try once and also remove type for default.-->
<ol type="A">
	<li>HTML </li>
	<li>CSS </li>
	<li>Javascript </li>
	<li>AngularJs </li>
</ol></xmp>
	</div>
	<div>
        <iframe id="preview"></iframe>
    </div>
</section>

<h3>Unordered List :</h3>

<p>An unordered list starts with the &lt;ul&gt; tag. Each list item starts with the &lt;li&gt; tag. The list items will be marked with bullets (small black circles) by default:</p>

<table class="pc-table">
	<tr> 
		<td style="font-weight:bold;width:20%;"> Type</td>
		<td style="font-weight:bold;width:40%;"> Description</td>							
	</tr>
	<tr> 
		<td style="width:20%;">square</td>
		<td style="width:20%;">The list items will be numbered with uppercase roman numbers.</td>							
	</tr>
	<tr> 
		<td style="width:20%;">disc</td>
		<td style="width:20%;">The list items will be numbered with lowercase roman numbers.</td>							
	</tr>
	<tr> 
		<td style="width:20%;">circle</td>
		<td style="width:20%;">The list items will be numbered with lowercase letters.</td>							
	</tr>
</table>

<section>  
    <div ui-ace ="{useWrapMode: 'true', showGutter : 'true', theme:'monokai', mode: 'html', previewId:'preview1',
		onLoad: htmlcssjsContentOnLoaded,
		rendererOptions: { fontSize: 16 },
		advanced: { highlightActiveLine: true}
	}" style="min-height:200px;"><xmp> <!-- Change type attribute value and try once and also remove type for default.-->
<ul type="circle">
	<li>HTML </li>
	<li>CSS </li>
	<li>Javascript </li>
	<li>AngularJs </li>
</ul></xmp>
	</div>
	<div>
        <iframe id="preview1"></iframe>
    </div>
</section>

<h3>Definition List :</h3>
<p>HTML and XHTML support a list style which is called definition lists where entries are listed like in a dictionary or encyclopedia. The definition list is the ideal way to present a glossary, list of terms, or other name/value list.Definition List makes use of following three tags.</p>
<ul> 
	<li>&lt;dl&gt; - Defines the start of the list</li>
	<li>&lt;dt&gt; - A term</li>
	<li>&lt;dd&gt; - Term definition</li>
	<li>&lt;/dl&gt; - Defines the end of the list</li>
</ul>

<section>  
    <div ui-ace ="{useWrapMode: 'true', showGutter : 'true', theme:'monokai', mode: 'html', previewId:'preview2',
		onLoad: htmlcssjsContentOnLoaded,
		rendererOptions: { fontSize: 16 },
		advanced: { highlightActiveLine: true}
	}" style="min-height:200px;"><xmp> <!-- Change type attribute value and try once and also remove type for default.-->
<dl>
	<dt>HTML</dt>
	<dd>This stands Hyper text Markup Language </dd>
	<dt>HTTP</dt>
	<dd>This stands for Hyper Text Transfer Protocal </dd>
</dl></xmp>
	</div>
	<div>
        <iframe id="preview2"></iframe>
    </div>
</section>
