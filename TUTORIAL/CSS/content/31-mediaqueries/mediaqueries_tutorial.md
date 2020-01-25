<h4> CSS Media Queries</h4>
<p>CSS <b>@media</b> queries are used to make the web pages responsive.</p>
<h4>Responsive</h4>
<p>Responsive is nothing but the web pages should look good in all devices</p>
<h4>Responsive Web Design Example</h4>
@IMG_START@CSS/RWD/png@IMG_END@
<h4>Devices</h4>
<ul>
	<li>Extra small Devices(Mobile)</li>
	<li>Small Devices(Tablets)</li>
	<li>Medium Devices(Laptaps)</li>
	<li>Large Devices(Desktops screen width>1200 pixcels)</li>
</ul>
<h4>Mobile View Example</h4>
@IMG_START@CSS/mobileview/png@IMG_END@
<h4>viewport</h4>
<p>before writing media queries to make web pages responsive, we need to set the viewport in head</p>

@CODE_START@@HTML@
	<head>
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
	</head>
@CODE_END@
<p>A &lt;meta&gt; viewport element gives the browser instructions on how to control the page's dimensions and scaling</p>
<p><b>width=device-width</b> sets the page with to the device with</p>
<p><b>initial-scale=1.0</b> sets initial zoom level</p>
<h4>Grid view</h4>
<p>Web pages are devided into columns. most of the web pages designed using grid view.</p>
<p>The advantage of using grid system is we can place elements easly in the web page.</p>
@IMG_START@CSS/12-grid/png@IMG_END@
<h4>Example</h4>
<section>  
<div ui-ace ="{useWrapMode: 'true', showGutter : 'true', theme:'monokai', mode: 'html', previewId:'preview1',
	onLoad: htmlcssjsContentOnLoaded,
	rendererOptions: { fontSize: 16 },
	advanced: { highlightActiveLine: true}
}" style="min-height:200px;"><xmp> <!-- Change code and see.-->
<head>
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<style>
		@media only screen and(max-width:600px){
			div{background-color:green;}
		}
		div{background-color:orange;
			color:white;
		}
	</style>
</head>

<div>Background color will change when window size is less than 600px.</div>
<div>Resize the browser window to observe.</div>
</xmp>
</div>
<div>
	<iframe id="preview1"></iframe>
</div>
</section>
<h4>Media Queries</h4>
<section>  
<div ui-ace ="{useWrapMode: 'true', showGutter : 'true', theme:'monokai', mode: 'html', previewId:'preview2',
	onLoad: htmlcssjsContentOnLoaded,
	rendererOptions: { fontSize: 16 },
	advanced: { highlightActiveLine: true}
}" style="min-height:500px;"><xmp> <!-- Change code and see.-->
<head>
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<style>

	[class*="grid-"] {
		float: left;
		
	}
		
		[class*='grid-md-'] { width: 100% }
		.grid-md-1 { width: 8.333333%; }
		.grid-md-2 { width: 16.666667%; }
		.grid-md-3 { width: 25%; }
		.grid-md-4 { width: 33.333333%; }
		.grid-md-5 { width: 41.666667%; }
		.grid-md-6 { width: 50%; }
		.grid-md-7 { width: 58.333333%; }
		.grid-md-8 { width: 66.666667%; }
		.grid-md-9 { width: 75%; }
		.grid-md-10 { width: 83.333333%; }
		.grid-md-11 { width: 91.666667%; }
		.grid-md-12 { width: 100%; }
		
		@media only screen and(max-width:768px){
		[class*='grid-xs-'] { width: 100% }
		.grid-xs-1 { width: 8.333333%; }
		.grid-xs-2 { width: 16.666667%; }
		.grid-xs-3 { width: 25%; }
		.grid-xs-4 { width: 33.333333%; }
		.grid-xs-5 { width: 41.666667%; }
		.grid-xs-6 { width: 50%; }
		.grid-xs-7 { width: 58.333333%; }
		.grid-xs-8 { width: 66.666667%; }
		.grid-xs-9 { width: 75%; }
		.grid-xs-10 { width: 83.333333%; }
		.grid-xs-11 { width: 91.666667%; }
		.grid-xs-12 { width: 100%; }
		}
	</style>
</head>
<div class="row">
	<div class="grid-md-12 grid-xs-12"><h1>Header</h1></div>
</div>
<div class="row">
	<div class="grid-md-12 grid-xs-12"><h1>main content</h1></div>
</div>
<div class="row">
	<div class="grid-md-12 grid-xs-12"><h1>Footer</h1></div>
</div>
</xmp>
</div>
<div>
	<iframe id="preview2" style="min-height:350px;"></iframe>
</div>
</section>
