<h4 >CSS Tables :</h4>
<p>Table helps in organizing the data. Look of <b>table</b> can be changed using css table properties</p>
<h4>Example on table borders</h4>
<section>  
<div ui-ace ="{useWrapMode: 'true', showGutter : 'true', theme:'monokai', mode: 'html', previewId:'preview1',
	onLoad: htmlcssjsContentOnLoaded,
	rendererOptions: { fontSize: 16 },
	advanced: { highlightActiveLine: true}
}" style="min-height:200px;"><xmp> <!-- Change code and see.-->
<style>
table, th, td {
    border: 1px solid green;
	color:red;
}
</style>
<table>
  <tr>
    <th>First Column</th>
    <th>Second Column</th>
  </tr>
  <tr>
    <td>Pioneer</td>
    <td>Coders</td>
  </tr>
  <tr>
    <td>IT</td>
    <td>Academy</td>
  </tr>
</table>
</xmp>
</div>
<div>
	<iframe id="preview1"></iframe>
</div>
</section>			
<h4>Border Collapse</h4>	
<p><b>Simple Program on Border Collapse Property</b></p>	
<p>border-collapse property collapse double borders into single borders</p>
<section>  
<div ui-ace ="{useWrapMode: 'true', showGutter : 'true', theme:'monokai', mode: 'html', previewId:'preview2',
	onLoad: htmlcssjsContentOnLoaded,
	rendererOptions: { fontSize: 16 },
	advanced: { highlightActiveLine: true}
}" style="min-height:350px;"><xmp> <!-- Change code and see.-->
<style>
table {
	border-collapse:collapse;
}
table, th, td {
    border: 1px solid red;
	color:black;
}
</style>
<table>
  <tr>
    <th>First Column</th>
    <th>Second Column</th>
  </tr>
  <tr>
    <td>Pioneer</td>
    <td>Coders</td>
  </tr>
  <tr>
    <td>IT</td>
    <td>Academy</td>
  </tr>
</table>
</xmp>
</div>
<div>
	<iframe id="preview2"></iframe>
</div>
</section>	
<h4 >The border-spacing Property :</h4>
<p>The border-spacing property specifies the distance that separates adjacent cells'. border-spacing takes two values vertical spaceing value and horizontal spacing value</p>
<p><b>Simple Program on Border Spacing Property</b></p>	
<section>  
<div ui-ace ="{useWrapMode: 'true', showGutter : 'true', theme:'monokai', mode: 'html', previewId:'preview3',
	onLoad: htmlcssjsContentOnLoaded,
	rendererOptions: { fontSize: 16 },
	advanced: { highlightActiveLine: true}
}" style="min-height:350px;"><xmp> <!-- Change code and see.-->
<style>
table {
	border-collapse:seperate;
	border-spacing:10px;
}
table, th, td {
    border: 1px solid red;
	color:black;
}
</style>
<table>
  <tr>
    <th>First Column</th>
    <th>Second Column</th>
  </tr>
  <tr>
    <td>Pioneer</td>
    <td>Coders</td>
  </tr>
  <tr>
    <td>IT</td>
    <td>Academy</td>
  </tr>
</table>
</xmp>
</div>
<div>
	<iframe id="preview3"></iframe>
</div>
</section>
<h4>Table width and height</h4>
<section>  
<div ui-ace ="{useWrapMode: 'true', showGutter : 'true', theme:'monokai', mode: 'html', previewId:'preview4',
	onLoad: htmlcssjsContentOnLoaded,
	rendererOptions: { fontSize: 16 },
	advanced: { highlightActiveLine: true}
}" style="min-height:350px;"><xmp> <!-- Change code and see.-->
<style>
table {
	width:100%;
	border-collapse:collapse;

}
table, th {
    height:40px;
	text-align:left;
}
table, th ,td{
	border:1px solid blue;
}
</style>
<table>
  <tr>
    <th>First Column</th>
    <th>Second Column</th>
  </tr>
  <tr>
    <td>Pioneer</td>
    <td>Coders</td>
  </tr>
  <tr>
    <td>IT</td>
    <td>Academy</td>
  </tr>
</table>
</xmp>
</div>
<div>
	<iframe id="preview4"></iframe>
</div>
</section>		
<h4>Horizontal Dividers</h4>
<section>  
<div ui-ace ="{useWrapMode: 'true', showGutter : 'true', theme:'monokai', mode: 'html', previewId:'preview5',
	onLoad: htmlcssjsContentOnLoaded,
	rendererOptions: { fontSize: 16 },
	advanced: { highlightActiveLine: true}
}" style="min-height:350px;"><xmp> <!-- Change code and see.-->
<style>
table {
	width:100%;
	border-collapse:collapse;

}
table, th {
    height:40px;
	text-align:left;
}
table, th ,td{
	border-bottom:1px solid green;
}
</style>
<table>
  <tr>
    <th>First Column</th>
    <th>Second Column</th>
  </tr>
  <tr>
    <td>Pioneer</td>
    <td>Coders</td>
  </tr>
  <tr>
    <td>IT</td>
    <td>Academy</td>
  </tr>
</table>
</xmp>
</div>
<div>
	<iframe id="preview5"></iframe>
</div>
</section>		
<h4>Table Padding</h4>
<section>  
<div ui-ace ="{useWrapMode: 'true', showGutter : 'true', theme:'monokai', mode: 'html', previewId:'preview6',
	onLoad: htmlcssjsContentOnLoaded,
	rendererOptions: { fontSize: 16 },
	advanced: { highlightActiveLine: true}
}" style="min-height:350px;"><xmp> <!-- Change code and see.-->
<style>
table {
	width:100%;
	border-collapse:collapse;

}
table, th {
    height:40px;
	text-align:left;
}
table, th ,td{
	border-bottom:1px solid green;
	padding:8px;
}
</style>
<table>
  <tr>
    <th>First Column</th>
    <th>Second Column</th>
  </tr>
  <tr>
    <td>Pioneer</td>
    <td>Coders</td>
  </tr>
  <tr>
    <td>IT</td>
    <td>Academy</td>
  </tr>
</table>
</xmp>
</div>
<div>
	<iframe id="preview6"></iframe>
</div>
</section>	
<h4>Stripped Tables</h4>
<section>  
<div ui-ace ="{useWrapMode: 'true', showGutter : 'true', theme:'monokai', mode: 'html', previewId:'preview7',
	onLoad: htmlcssjsContentOnLoaded,
	rendererOptions: { fontSize: 16 },
	advanced: { highlightActiveLine: true}
}" style="min-height:350px;"><xmp> <!-- Change code and see.-->
<style>
table {
    border-collapse: collapse;
    width: 100%;
}

th, td {
    text-align: left;
    padding: px;
}

tr:nth-child(even){background-color: lightgrey}
</style>
<table>
  <tr>
    <th>First Column</th>
    <th>Second Column</th>
  </tr>
  <tr>
    <td>Pioneer</td>
    <td>Coders</td>
  </tr>
  <tr>
    <td>IT</td>
    <td>Academy</td>
  </tr>
   <tr>
    <td>IT</td>
    <td>Academy</td>
  </tr>
   <tr>
    <td>IT</td>
    <td>Academy</td>
  </tr>
</table>
</xmp>
</div>
<div>
	<iframe id="preview7"></iframe>
</div>
</section>	
