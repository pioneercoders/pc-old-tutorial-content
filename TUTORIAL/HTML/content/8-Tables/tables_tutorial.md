<p>Table tag is used to represents the tabular data. </p>

<h4>Table Elements:</h4>
<table class="pc-table">
	<tr>
		<th>Elements</th>
		<th>Descripion</th>
	</tr>
	<tr>
		<td>&lt;table&gt;&lt;/table&gt;</td>
		<td>start and end tags of the table</td>
	</tr>
	<tr>
		<td>&lt;th&gt;&lt;/th&gt;</td>
		<td>start and end of the table heading</td>
	</tr>
	<tr>
		<td>&lt;tbody&gt;&lt;/tbody&gt;</td>
		<td>The start and end of the main body of the table.</td>
	</tr>
	<tr>
		<td>&lt;tr&gt;&lt;/tr&gt;</td>
		<td>represents Table row which holds the table data cells.</td>
	</tr>
	<tr>
		<td>&lt;td&gt;&lt;/td&gt;</td>
		<td>represents Table Data which holds the data.</td>
	</tr>
</table>

<section>  
    <div ui-ace ="{useWrapMode: 'true', showGutter : 'true', theme:'monokai', mode: 'html', previewId:'preview',
		onLoad: htmlcssjsContentOnLoaded,
		rendererOptions: { fontSize: 16 },
		advanced: { highlightActiveLine: true}
	}" style="min-height:210px;"><xmp> <!-- Change border attribute value and see.-->
<table border="1">
	<tr>
		<td>Row1, Column 1</td>
		<td>Row1, Column 2</td>
	</tr>
	<tr>
		<td>Row2, Column 1</td>
		<td>Row2, Column 2</td>
	</tr>
</table></xmp>
	</div>
	<div>
        <iframe id="preview"></iframe>
    </div>
</section>

<p>border attribute is for table border to prevent it set border="0"</p>

<h4>Cellpadding and Cellspacing Attributes</h4>
<p>There are two attributes called cellpadding and cellspacing are used to adjust the white space in the table cells. The cellspacing attribute defines the width of the border, while cellpadding represents the distance between cell borders and the content within a cell.</p>

<section>  
    <div ui-ace ="{useWrapMode: 'true', showGutter : 'true', theme:'monokai', mode: 'html', previewId:'preview1',
		onLoad: htmlcssjsContentOnLoaded,
		rendererOptions: { fontSize: 16 },
		advanced: { highlightActiveLine: true}
	}" style="min-height:300px;"><xmp> <!-- Change border attribute value and see.-->
<table border="1" cellpadding="5" cellspacing="5">
	<tr>
		<th>Name</th>
		<th>Salary</th>
	</tr>
	<tr>
		<td>Ramesh Raman</td>
		<td>5000</td>
	</tr>
	<tr>
		<td>Shabbir Hussein</td>
		<td>7000</td>
	</tr>
</table></xmp>
	</div>
	<div>
        <iframe id="preview1"></iframe>
    </div>
</section>
	
<h4>Colspan and Rowspan Attributes</h4>
<p> to merge two or more columns into a single column in a table we can use colspan attribute . Similar manner one can use rowspan for merging two or more rows into a single row.</p>
