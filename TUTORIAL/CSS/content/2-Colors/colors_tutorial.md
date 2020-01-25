<h3>CSS Colors</h3>
	<p>The color property typically defines the color of the text content of an element.</p>
<p>You can specify your color values in various formats. Following table lists all the possible formats.</p>
	<table class="pc-table">
		<tr>
			<td><b>Format</b></td>
			<td><b>Syntax</b></td>
			<td><b>Example</b></td>
		</tr>
		<tr>
			<td>Key word</td>
			<td>black</td>
			<td>body{color:black;}</td>
		</tr>
		<tr>
			<td>Hex Code</td>
			<td>#RRGGBB</td>
			<td>body{color:#FF0000;}</td>
		</tr>
		<tr>
			<td>Short Hex Code</td>
			<td>#RGB</td>
			<td>body{color:#647;}</td>
		</tr>
		<tr>
			<td>RGB%</td>
			<td>rgb(rrr%,ggg%,bbb%)</td>
			<td>body {color:rgb(50%,50%,50%);}</td>
		</tr>
		<tr>
			<td>RGB Absolute</td>
			<td>rgb(rrr,ggg,bbb)</td>
			<td>body{color:rgb(0,0,255);}</td>
		</tr>
	</table>
<h4>CSS Colors - color name:</h4>	
<div class="row clear-fix">
	<div class="grid-md-2">
		<button type="button"  class="btn btn-md" style="background-color:tomato;color:white">Tomato</button>
	</div>
	<div class="grid-md-2">
		<button type="button"  class="btn btn-md" style="background-color:green;color:white;">green</button>
	</div>
	<div class="grid-md-2">
		<button type="button"  class="btn btn-md" style="background-color:orange;color:white;">orange</button>
	</div>
	<div class="grid-md-2">
		<button type="button"  class="btn btn-md" style="background-color:black;color:white;">black</button>
	</div>
	<div class="grid-md-2">
		<button type="button"  class="btn btn-md" style="background-color:lightgrey;color:white;">lightgrey</button>
	</div>
	<div class="grid-md-2">
		<button type="button"  class="btn btn-md" style="background-color:yellow;color:black;">yellow</button>
	</div>
</div>
<h4>CSS Colors - Hex Codes :</h4>
	<p>Colors are represented using hexadecimal numbers.In this notation colors are represented using 6 digit notation</p>
	<h5>Syntax</h5>
	@CODE_START@@HTML@
		color:#RR GG BB;
	@CODE_END@
	<p>A hexadecimal value can be taken from any graphics software like Adobe Photoshop, Jasc Paintshop Pro, or even using Advanced Paint Brush.</p>
	<p>Each hexadecimal code will be preceded by hash sign '#'.</p>
			<table class="pc-table">
				<tr>
					<td><b>Color</b></td>
					<td><b>Color HEX</b></td>
				</tr>
				<tr>
					<td style="background-color:#000000;width:300px;"></td>
					<td>#000000</td>
				</tr>
				<tr>
					<td style="background-color:#FF0000;width:300px;"></td>
					<td>#FF0000</td>
				</tr>
				<tr>
					<td style="background-color:#00FF00;width:300px;"></td>
					<td>#00FF00</td>
				</tr>
				<tr>
					<td style="background-color:#0000FF;width:300px;"></td>
					<td>#0000FF</td>
				</tr>
				<tr>
					<td style="background-color:#FFFF00;width:300px;"></td>
					<td>#FFFF00</td>
				</tr>
				<tr>
					<td style="background-color:#00FFFF;width:300px;"></td>
					<td>#00FFFF</td>
				</tr>
				<tr>
					<td style="background-color:#FFFFFF;width:300px;"></td>
					<td>#FFFFFF</td>
				</tr>
				<tr>
					<td style="background-color:#FF00FF;width:300px;"></td>
					<td>#FF00FF</td>
				</tr>
				<tr>
					<td style="background-color:#C0C0C0;width:300px;"></td>
					<td>#C0C0C0</td>
				</tr>
				
			</table>
<p><b>Example</b></p>		
@CODE_START@@HTML@<!DOCTYPE html>
<html>
<head>
<title>Example of CSS color</title>
<style type="text/css">   
	<!-- Hexadecimal Representation -->
    h1 {
        color: #ff0000;
    }
    p {
        color: #00ff00;
    }
</style>
</head>
<body>
    <h1>www.Pioneercoders.com</h1>
    <p>Pionnercoders is group of R&D team and we will share our knowledge</p>
</body>
</html>@CODE_END@
<div class="min-height-50" id="cssColors1"><button type="button"  class="cws-button border-radius bt-color-3 pull-right" ng-click="tryYourSelf('cssColors1','css')">Try Yourself</button></div>	
<p>Output</p>		
@IMG_START@CSS/csscolorstutorial_images1/png@IMG_END@			
			
			
			<h3>CSS Colors - Short Hex Codes :</h3>
			<p>This is a shorter form of the six-digit notation. In this format, each digit is replicated to arrive at an equivalent six-digit value. For example: #6A7 becomes #66AA77.</p>
			<table class="pc-table">
				<tr>
					<td><b>Color</b></td>
					<td><b>Color HEX</b></td>
				</tr>
				<tr>
					<td style="background-color:#000;width:300px;"></td>
					<td>#000</td>
				</tr>
				<tr>
					<td style="background-color:#F00;width:300px;"></td>
					<td>#F00</td>
				</tr>
				<tr>
					<td style="background-color:#0F0;width:300px;"></td>
					<td>#0F0</td>
				</tr>
				<tr>
					<td style="background-color:#0FF;width:300px;"></td>
					<td>#0FF</td>
				</tr>
				<tr>
					<td style="background-color:#FFF;width:300px;"></td>
					<td>#FFF</td>
				</tr>
				<tr>
					<td style="background-color:#FF0;width:300px;"></td>
					<td>#FF0</td>
				</tr>
				<tr>
					<td style="background-color:#F0F;width:300px;"></td>
					<td>#F0F</td>
				</tr>
			</table>
<p><b>Example</b></p>		
<section>  
<div ui-ace ="{useWrapMode: 'true', showGutter : 'true', theme:'monokai', mode: 'html', previewId:'preview1',
	onLoad: htmlcssjsContentOnLoaded,
	rendererOptions: { fontSize: 16 },
	advanced: { highlightActiveLine: true}
}" style="min-height:200px;"><xmp> <!-- Change code and see.-->
<style type="text/css">   
    h1 {
        color: #ff0000;
    }
    p {
        color: #00ff00;
    }
</style>
<h1>www.Pioneercoders.com</h1>
    <p>Pionnercoders is group of R&D team and we will share our knowledge</p>
</xmp>
</div>
<div>
	<iframe id="preview1"></iframe>
</div>
</section>
			<h3>CSS Colors - RGB Values :</h3>
			<p>This color value is specified using the rgb( ) property. This property takes three values, one each for red, green, and blue. The value can be an integer between 0 and 255 or a percentage.</p>
			<p><b>Note :</b>All the browsers does not support rgb() property of color so it is recommended not to use it.</p>
			<p>Following is the example to show few colors using RGB values.</p>
			<table class="pc-table">
				<tr>
					<td><b>Color</b></td>
					<td><b>Color RGB</b></td>
				</tr>
				<tr>
					<td style="background-color:rgb(0,0,0);width:300px;"></td>
					<td>rgb(0,0,0)</td>
				</tr>
				<tr>
					<td style="background-color:rgb(255,0,0);width:300px;"></td>
					<td>rgb(255,0,0)</td>
				</tr>
				<tr>
					<td style="background-color:rgb(0,255,0);width:300px;"></td>
					<td>rgb(0,255,0)</td>
				</tr>
				<tr>
					<td style="background-color:rgb(0,0,255);width:300px;"></td>
					<td>rgb(0,0,255)</td>
				</tr>
				<tr>
					<td style="background-color:rgb(255,255,0);width:300px;"></td>
					<td>rgb(255,255,0)</td>
				</tr>
				<tr>
					<td style="background-color:rgb(0,255,255);width:300px;"></td>
					<td>rgb(0,255,255)</td>
				</tr>
				<tr>
					<td style="background-color:rgb(0,0,0);width:300px;"></td>
					<td>rgb(0,0,0)</td>
				</tr>
				<tr>
					<td style="background-color:rgb(255,0,255);width:300px;"></td>
					<td>rgb(255,0,255)</td>
				</tr>
				<tr>
					<td style="background-color:rgb(192,192,192);width:300px;"></td>
					<td>rgb(192,192,192)</td>
				</tr>
				<tr>
					<td style="background-color:rgb(255,255,255);width:300px;"></td>
					<td>rgb(255,255,255)</td>
				</tr>
			</table>
			
			<!-- <h3>Building Color Codes :</h3>
			<p>You can build millions of color codes using our Color Code Builder. Check our HTML Color Code Builder. To use this tool you would need a Java Enabled Browser.</p>
			<h3>Browser Safe Colors :</h3>
			<p>Here is the list of 216 colors which are supposed to be most safe and computer independent colors. These colors vary from hexa code 000000 to FFFFFF. These colors are safe to use because they ensure that all computers would display the colors correctly when running a 256 color palette.</p>
			@IMG_START@CSS/colorstutorial_image1/png@IMG_END@ -->
		
