<h4>Display Flex</h4>
<p>The flex CSS property specifies how a flex item will grow or shrink so as to fit the space available in its flex container</p>
@IMG_START@CSS/flexbasics/png@IMG_END@
<p>If we apply display:block elemets(items) will be having unequal widths(observe the above image).</p>
<p>If we apply the display:flex elements will have equal widths.</p>
<h4>Syntax</h4>
@CODE_START@@HTML@
	flex: none | [ <'flex-grow'> <'flex-shrink'> <'flex-basis'> ]
@CODE_END@
<h4>Flex properties</h4>	
<table class="pc-table">
	<tr>
		<th>property</th>
		<th>Description</th>
	</tr>
	<tr>
		<td>flex grow</td>
		<td>A number which will specify how much the element will grow relative to the flexible items in the flex container.</td>
	</tr>
	<tr>
		<td>flex-shrink</td>
		<td>A number which will specify how much the element will shrink relative to the flexible items in the flex container.</td>
	</tr>
	<tr>
		<td>flex-basis</td>
		<td>length of an element or a number(with % or px).</td>
	</tr>
</table>
<h4>Example: Flex property</h4>
<section>  
<div ui-ace ="{useWrapMode: 'true', showGutter : 'true', theme:'monokai', mode: 'html', previewId:'preview1',
	onLoad: htmlcssjsContentOnLoaded,
	rendererOptions: { fontSize: 16 },
	advanced: { highlightActiveLine: true}
}" style="min-height:200px;"><xmp> <!-- Change code and see.-->
<style>
.flex-container{
	width:100%;
	display: flex;
	border:1px solid grey;
}
.flex-sidebar{
	padding:12px;
	flex:1;
	background-color:orange;
	color:white;

}
.flex-main{
	padding:12px;
	flex:2;
	background-color: green;
	color:white;
}
</style>
<div class="flex-container">
	<div class="flex-sidebar">sidebar</div>
	<div class="flex-main">Main</div>
	<div class="flex-sidebar">sidebar</div>
</div>
</xmp>
</div>
<div>
	<iframe id="preview1"></iframe>
</div>
</section>
<h4>Example 2: flex:auto</h4>
<section>  
<div ui-ace ="{useWrapMode: 'true', showGutter : 'true', theme:'monokai', mode: 'html', previewId:'preview2',
	onLoad: htmlcssjsContentOnLoaded,
	rendererOptions: { fontSize: 16 },
	advanced: { highlightActiveLine: true}
}" style="min-height:200px;"><xmp> <!-- Change code and see.-->
<style>
.flex-container{
	width:100%;
	display: flex;
	border:1px solid grey;
}
.flex-item{
	padding:12px;
	flex:auto;
	background-color:orange;
	color:white;
	border:1px solid white;
}

</style>
<div class="flex-container">
	<div class="flex-item">sidebar</div>
	<div class="flex-item">Main</div>
	<div class="flex-item">sidebar</div>
</div>
</xmp>
</div>
<div>
	<iframe id="preview2"></iframe>
</div>
</section>
<h4>Example 3: flex:none</h4>
<section>  
<div ui-ace ="{useWrapMode: 'true', showGutter : 'true', theme:'monokai', mode: 'html', previewId:'preview3',
	onLoad: htmlcssjsContentOnLoaded,
	rendererOptions: { fontSize: 16 },
	advanced: { highlightActiveLine: true}
}" style="min-height:200px;"><xmp> <!-- Change code and see.-->
<style>
.flex-container{
	width:100%;
	display: flex;
	border:1px solid grey;
}
.flex-item{
	padding:12px;
	flex:none;
	background-color:orange;
	color:white;
	border:1px solid white;
}

</style>
<div class="flex-container">
	<div class="flex-item">sidebar</div>
	<div class="flex-item">Main</div>
	<div class="flex-item">sidebar</div>
</div>
</xmp>
</div>
<div>
	<iframe id="preview3"></iframe>
</div>
</section>
<h4>flex-grow</h4>
<h4>Example </h4>
<section>  
<div ui-ace ="{useWrapMode: 'true', showGutter : 'true', theme:'monokai', mode: 'html', previewId:'preview4',
	onLoad: htmlcssjsContentOnLoaded,
	rendererOptions: { fontSize: 16 },
	advanced: { highlightActiveLine: true}
}" style="min-height:200px;"><xmp> <!-- Change code and see.-->
<style>
.flex-container{
	width:100%;
	display: flex;
	border:1px solid grey;
}
.flex-container div:nth-of-type(1) {flex-grow: 1;}
.flex-container div:nth-of-type(2) {flex-grow: 3;}
.flex-container div:nth-of-type(3) {flex-grow: 1;}


</style>
<div class="flex-container">
	<div class="flex-item" style="background-color: green">sidebar</div>
	<div class="flex-item" style="background-color: dodgerblue">Main</div>
	<div class="flex-item" style="background-color: orange">sidebar</div>
</div>
</xmp>
</div>
<div>
	<iframe id="preview4"></iframe>
</div>
</section>
<h4>flex-shrink</h4>
<h4>Example </h4>
<section>  
<div ui-ace ="{useWrapMode: 'true', showGutter : 'true', theme:'monokai', mode: 'html', previewId:'preview5',
	onLoad: htmlcssjsContentOnLoaded,
	rendererOptions: { fontSize: 16 },
	advanced: { highlightActiveLine: true}
}" style="min-height:200px;"><xmp> <!-- Change code and see.-->
<style>
.container{
    width: 350px;
    height: 100px;
    border: 1px solid #c3c3c3;
    display: flex;
}

.container div {
    flex-grow: 1;
    flex-shrink: 1;
    flex-basis: 100px;
}

.container div:nth-of-type(2) {
    flex-shrink: 3;
}
</style>
<div class="container">
	<div class="flex-item" style="background-color: green">shrink:1</div>
	<div class="flex-item" style="background-color: dodgerblue">shrink:3</div>
	<div class="flex-item" style="background-color: orange">shrink:1</div>
	<div class="flex-item" style="background-color: red">shrink:1</div>
	<div class="flex-item" style="background-color: lightgrey">shrink:1</div>
</div>
</xmp>
</div>
<div>
	<iframe id="preview5"></iframe>
</div>
</section>
