	<p><b>What is use of iframes?</b></p>
	
	<p>iframe stands for <strong>Inline Frame</strong>. iframe is used to include the one HTML page into the another HTML page. &lt;frameset&gt; can also be used in place &lt;iframe&gt;. but the disadvantage of frameset tag is if we use the frameset tag we cannot use the body tag a web page may contain 
	a head and a body or a head and a frameset, but not both a body and a frameset.However iframe can used inside the body tag(nested inside the body tag).
		
@CODE_START@@HTML@<!DOCTYPE html>
<html>
	<head>
		<title>HTML Iframes</title>
	</head>
	<body>
		Document content also go here...
		<p>Document content goes here...</p>
			<iframe src="menu.htm"width="999"height="800"></iframe>
		<p>Document content also goes here...</p>
	</body>
</html>@CODE_END@
<div class="min-height-30" id="htmliframesCode1"><button type="button"  class="cws-button border-radius bt-color-3 pull-right" ng-click="tryYourSelf('htmliframesCode1')">Try Yourself</button></div>
	<table class="pc-table">
		<tr> 
			<td style="font-weight:bold;width:30%;"> Attribute</td>
			<td style="font-weight:bold;">Description</td>
		</tr>
		<tr> 
			<td style="font-weight:bold;width:30%;"> src</td>
			<td>URL of the page to be loaded</td>
		</tr>
		<tr> 
			<td style="font-weight:bold;width:30%;"> name</td>
			<td>By using name attribute we can name the iframes. when multiple iframes are defined with in a document if we want to refer a perticular, iframe we can name iframe using name attribute.</td>
		</tr>
		<tr> 
			<td style="font-weight:bold;width:30%;"> frameborder</td>
			<td>Frameborder attribute specifies the border around the iframe. the frameborder takes two values. frameborder="0" border around the iframe will not displayed and frameborder="1", borders around the iframe are displayed</td>
		</tr>
		<tr> 
			<td style="font-weight:bold;width:30%;">marginheight</td>
			<td>Space between the frame's content and its top and bottom margins.</td>
		</tr>
		<tr> 
			<td style="font-weight:bold;width:30%;"> scrolling</td>
			<td>This attribute controls the appearance of the scrollbars that appear on the frame. This takes values either "yes", "no" or "auto". For example scrolling="no" means it should not have scroll bars.</td>
		</tr>
		<tr> 
			<td style="font-weight:bold;width:30%;"> longdesc</td>
			<td>This attribute allows you to provide a link to another page containing a long description of the contents of the frame. For example longdesc="framedescription.htm"</td>
		</tr>
		<tr>
			<td  style="font-weight:bold;width:30%;">width and height</td>
			<td>Specifies the width and height of an iframe in pixels or percentage.</td>
		</tr>
	</table>
<h4>Example on iframe</h4>
<h5>home.html</h5>
@CODE_START@@HTML@<!DOCTYPE html>
<html>
	<head>
		<title>HTML Iframes</title>
	</head>
	<body>
		<iframe align="center" frameborder="1" width="100%" src="header.html"></iframe>
		<iframe align="center" frameborder="1" width="20%" height="100%" src="sidemenu.html"></iframe>
		<iframe align="center" frameborder="1" name="bodycontent" marginheight="10px" marginwidth="200px" width="75%" height="100%" src="bodycontent.html"></iframe>
	</body>	
</html>@CODE_END@
<div class="min-height-30" id="htmliframesCode2"><button type="button"  class="cws-button border-radius bt-color-3 pull-right" ng-click="tryYourSelf('htmliframesCode2')">Try Yourself</button></div>
<h5>header.html</h5>
@CODE_START@@HTML@
<h1><center>Header of the document</center></h1>
@CODE_END@
<h5>sidemenu.html</h5>
@CODE_START@@HTML@
<ul>
	<li><a href="#">Home</a></li>
	<li><a href="#">HTML</a></li>
	<li><a href="#">HTML 5</a></li>
<ul>

@CODE_END@
<h5>bodycontent.html</h5>
@CODE_START@@HTML@
<h1><center>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever </center></h1>
@CODE_END@
<strong>Note:</strong> Place all the html files in the same directory(folder).
<h4>disadvantages of using iframes</h4>
<ul>
	<li>Unreliability of different users</li>
	<li>Some Browsers Dont Support iFrames</li>
	<li>each Engines Find it Difficult to Index Your Website</li>
</ul>
<h4>Websites which are using the iframes</h4>
<ul>
	<li>Facebook</li>
	<li>about.com</li>
	<li>StumbleUpon</li>
	<li>Krumlr</li>
</ul>
