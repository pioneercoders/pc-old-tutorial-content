<h4>Boxshadow</h4>
@IMG_START@CSS/boxshadow/jpg@IMG_END@
<p>Boxshadow is used to apply the shadow to HTML elements.</p>
<h4>Syntax</h4>
@CODE_START@@HTML@p{
	box-shadow:horizontal-shadow(in px) vertical-shadow(in px) blur(in px) box-shadow-color;
}@CODE_END@	
<h4>Example</h4>
@IMG_START@CSS/shadowsyntax/png@IMG_END@
<p>Box shadow takes four values </p>
<table class="pc-table">
	<tr>
		<th>value</th>
		<th>Description</th>
	</tr>
	<tr>
		<td>horizontal shadow</td>
		<td>Specifies the horizontal shadow of an element</td>
	</tr>
	<tr>
		<td>vertical shadow</td>
		<td>Specifies the vertical shadow of an element</td>
	</tr>
	<tr>
		<td>blur</td>
		<td>Specifies the blur </td>
	</tr>
	<tr>
		<td>Color</td>
		<td>Specifies shadow color</td>
	</tr>
</table>
<h4>Example: box-shadow</h4>
<section>  
<div ui-ace ="{useWrapMode: 'true', showGutter : 'true', theme:'monokai', mode: 'html', previewId:'preview1',
	onLoad: htmlcssjsContentOnLoaded,
	rendererOptions: { fontSize: 16 },
	advanced: { highlightActiveLine: true}
}" style="min-height:200px;"><xmp> <!-- Change code and see.-->
<style>
div{
	width:150px;
	height:80px;
	background-color:green;
	color:white;
	box-shadow: 10px 10px grey;
}
</style>
<div></div>
</xmp>
</div>
<div>
	<iframe id="preview1"></iframe>
</div>
</section>
<h4>Example: box-shadow with blur effect</h4>
<section>  
<div ui-ace ="{useWrapMode: 'true', showGutter : 'true', theme:'monokai', mode: 'html', previewId:'preview2',
	onLoad: htmlcssjsContentOnLoaded,
	rendererOptions: { fontSize: 16 },
	advanced: { highlightActiveLine: true}
}" style="min-height:200px;"><xmp> <!-- Change code and see.-->
<style>
div{
	width:150px;
	height:80px;
	padding:10px;
	background-color:dodgerblue;
	color:white;
	box-shadow: 10px 10px 10px grey;
}
</style>
<div>Box shadow with blur effect</div>
</xmp>
</div>
<div>
	<iframe id="preview2"></iframe>
</div>
</section>
<h4>Example: card using box-shadow</h4>
<section>  
<div ui-ace ="{useWrapMode: 'true', showGutter : 'true', theme:'monokai', mode: 'html', previewId:'preview3',
	onLoad: htmlcssjsContentOnLoaded,
	rendererOptions: { fontSize: 16 },
	advanced: { highlightActiveLine: true}
}" style="min-height:300px;"><xmp> <!-- Change code and see.-->
<style>
.card{
	background-color:dodgerblue;
	color:white;
	box-shadow: 4px 6px 5px grey;
	width:25%;
}
.name{
	background-color:white;
	color:black;
	hieght:30px;
    margin-bottom:0px;
     text-align:center;
}
.heading{
    min-height:80px;
    text-align:center;
    font-size:28px;
    padding-top:13px;
}
</style>
<div class="card">
<div class="heading">PC</div>
<div class="name">Pioneer Coders</div>
</div>
</xmp>
</div>
<div>
	<iframe id="preview3"></iframe>
</div>
</section>

