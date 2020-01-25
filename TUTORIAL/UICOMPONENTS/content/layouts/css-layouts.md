<h4>CSS Layout</h4>
<p>CSS Layout are used to divide page into different sections.Most of the web pages contains header, side menu and body</p>
<h4>Web page as grid view</h4>
@IMG_START@UICOMPONENTS/grid-view/PNG@IMG_END@
<p>Above image container conains header part, side menu , body and the footer. many ways are there to develop above mentioned layout.but here we will follow CSS grid</p>
<p>Using CSS grid system we can divide the web page into different parts or sections. The grid system makes easier to place elements on a page</p>
<p>The web page width is considered as 100%. using css grid system we will divide the web page into 12 columns.</p>
@IMG_START@UICOMPONENTS/grid-view2/jpg@IMG_END@
<p>CSS Grid System</p>

@CODE_START@@HTML@
[class*="grid-"] {
    float: left;
    padding: 5px;
    border: 1px solid red;
}
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
@CODE_END@
<p> The web page width is 100% so we will divide the 100% into 12 defferent equal parts</p>
@CODE_START@@HTML@
grid-md-1=100%/12=8.33%
grid-md-2 = 8.33%+8.33% = 16.6667% and so on.
@CODE_END@
<p>To arrange the grids side by side, float property can be used</p>
<h4>Example using grids dividing page into two equal halfs</h4>

<section>  
<div ui-ace ="{useWrapMode: 'true', showGutter : 'true', theme:'monokai', mode: 'html', previewId:'preview1',
	onLoad: htmlcssjsContentOnLoaded,
	rendererOptions: { fontSize: 16 },
	advanced: { highlightActiveLine: true}
}" style="min-height:400px;"><xmp> <!-- Change code and see.-->
 <style>
 .row::after{
	width: 100%;
 	content: '';
 	clear: both;
 	display: flex;
 }
 [class*="grid-"] {
	float: left;
	}
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
 </style>
<div class="grid-md-12">
	<div class="grid-md-6">
		<div style="border:1px solid red">First Half</div>
	</div>
	<div class="grid-md-6">
		<div style="border:1px solid red">Second Half</div>
	</div>
</div>
</xmp>
</div>
<div>
	<iframe id="preview1"></iframe>
</div>
</section>
<h4>Example 2</h4>
<section>  
<div ui-ace ="{useWrapMode: 'true', showGutter : 'true', theme:'monokai', mode: 'html', previewId:'preview2',
	onLoad: htmlcssjsContentOnLoaded,
	rendererOptions: { fontSize: 16 },
	advanced: { highlightActiveLine: true}
}" style="min-height:400px;"><xmp> <!-- Change code and see.-->
 <style>
    .row::after{
	width: 100%;
 	content: '';
 	clear: both;
 	display: flex;
	 }
	 [class*="grid-"] {
		float: left;
		}
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
		 nav ul{
            padding:0px;
        }
        nav ul li {
            list-style-type:none;
            text-align:left;
            padding-left:20px;
            cursor:pointer;
        }
 </style>
 <div class="row">
	<div class="grid-md-12 header" style="border:1px solid red;text-align: center;"><h2>Pioneer Coders</h2></div>
	<div class="grid-md-12 page-content">
		<div class="grid-md-2" >
			<div style="border:1px solid red;min-height:200px;text-align:center;">
				<nav>
					<ul>
						<li>Home</li>
						<li>Tutorials</li>
						<li>Courses</li>
						<li>ContactUs</li>
					</ul>
				</nav>
			</div>
		</div>
		<div class="grid-md-10">
			<div style="border:1px solid red;min-height:200px;text-align:center;"><h3>#Container</h3></div>
		</div>
	</div>
	<div class="grid-md-12 Footer" style="border:1px solid red;text-align:center;">All rights Reserved@2017.</div>
</div>
</xmp>
</div>
<div>
	<iframe id="preview2" style="min-height:350px;"></iframe>
</div>
</section>
<p class="row">
	<a class="cws-button border-radius bt-color-3" target="_blank" href="project/download/UICOMPONENTS/grid-example">Download Code</a>
</p>
