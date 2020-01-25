<h4>Z-index</h4>
<p> CSS property specifies the z-order of a positioned element 	</p>
@IMG_START@CSS/basicz-index/png@IMG_END@
<p>z-order determines which one covers the other. An element with a larger z-index generally covers an element with a lower one</p>
<p>In the above example the element with greater z-index covers the element with lower z-index.<p>
<h4>z-index Example</h4>
<section>  
<div ui-ace ="{useWrapMode: 'true', showGutter : 'true', theme:'monokai', mode: 'html', previewId:'preview2',
	onLoad: htmlcssjsContentOnLoaded,
	rendererOptions: { fontSize: 16 },
	advanced: { highlightActiveLine: true}
}" style="min-height:200px;"><xmp> <!-- Change code and see.-->
 <style>
 .main{
	position:relative;
 }
.div1{
	position:absolute;
	width:20%;
	background-color:orange;
	color:white;
	z-index:1;
	height:100px;
}
.div2{
	left:20px;
    top:20px;
	position:absolute;
	width:10%;
	background-color:green;
	color:white;
	z-index:10;
	height:50px;
}
 </style>
	<div class="main">
		<div class = "div1">Div 1 </div>
		<div class = "div2"> div 2</div>
	</div>
</xmp>
</div>
<div>
	<iframe id="preview2"></iframe>
</div>
</section>	
<p>In the above example div 2 has greater z-index than div 1.</p>
