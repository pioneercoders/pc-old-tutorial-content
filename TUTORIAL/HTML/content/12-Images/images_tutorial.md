
<h3>HTML Image :</h3>
<p>In HTML, images can be included using  &lt;img&gt; tag. It has no end tag that's why it is called as empty tag. The <b>src</b> attribute specifies the path of the image</p>

@CODE_START@@HTML@<!DOCTYPE html>
<html>
<body>
	<p>Simple Image Insert</p>
	<img src = "../../../pioneercoders/resources/images/imagetutorial_image1.png"/>
</body>
</html>@CODE_END@

<div class="min-height-30" id="htmlImgCode1"><button type="button"  class="cws-button border-radius bt-color-3" ng-click="tryYourSelf('htmlImgCode1')">Try Yourself</button></div>

@IMG_START@HTML/imagetutorial_image1/png@IMG_END@
	
<p>You can use PNG, JPEG or GIF image file based on your comfort but make sure you specify correct image file name in src attribute. Image name is always case sensitive.</p>

<p> Usually in real time  projects all the images in a separate directory. So let's keep HTML file test.htm in home directory and create a subdirectory images inside the home directory where we will keep our image test.png. to refere this imgs we will use different file paths.</p>

@IMG_START@HTML/project-folder-structure/png@IMG_END@

<h4>File Paths </h4>
<p> A file path describes the location of a file in a project folder structure. There are 2 ways of accessing file paths </p>
<ul>
	<li> Absolute File Paths </li>
	<li> Relative File Paths </li>
</ul>

<h4> Absolute Paths </h4>
<p> An absolute file path is the full URL of local or internet file </p>

@CODE_START@@HTML@<img src = "E:/pioneercoders/resources/images/imagetutorial_image1.png"/>@CODE_END@

<h4> Relative Path </h4>
<p> A relative file path points to a file relative to the current page. we will use (..) while relative path, it means from working directory to parent directory. </p>
	
@CODE_START@@HTML@<img src = "../../pioneercoders/resources/images/imagetutorial_image1.png"/>@CODE_END@
	
<h3>The alt Attribute</h3>
	<p>The alt attribute provides an alternate text for an image, if the user for some reason cannot view it (because of slow connection, an error in the src attribute, or if the user uses a screen reader).</p>
	<p>If a browser cannot find an image, it will display the value of the alt attribute:</p>
	@CODE_START@@HTML@<!DOCTYPE html>
<html>
<body>
	<p>Simple Image Insert</p>
	<img src = "../../../pioneercoders/resources/images/imagetutorial_image1.png" alt = "Test Image"/>
</body>
</html>@CODE_END@
<div class="min-height-30" id="htmlImgCode2"><button type="button"  class="cws-button border-radius bt-color-3" ng-click="tryYourSelf('htmlImgCode2')">Try Yourself</button></div>
	<h4>Output</h4>
	<p>Simple Image Insert</p>
	@IMG_START@HTML/imagetutorial_image2/png@IMG_END@
	
	
<h3>Image Width and Height :</h3>
<p>You can set image width and height based on your requirement using widthand height attributes. You can specify width and height of the image in terms of either pixels or percentage of its actual size.</p>
@CODE_START@@HTML@<!DOCTYPE html>
	<html>
	<body>
		<p>Simple Image Insert</p>
		<img src = "../../../pioneercoders/resources/images/imagetutorial_image1.png" alt = "Test Image"  width = "300" height = "150"/>
	</body>
	</html>@CODE_END@
	<div class="min-height-50" id="htmlImgCode4"><button type="button"  class="cws-button border-radius bt-color-3 pull-right" ng-click="tryYourSelf('htmlImgCode4')">Try Yourself</button></div>
	<h4>Output</h4>
	<p>Setting Image Height and width</p>
	@IMG_START@HTML/imagetutorial_image1/png@IMG_END@
	

<h4>Attributes</h4>
<table class="pc-table">
	<tr> 
		<td style="font-weight:bold;width:20%;"> Attribute</td>
		<td style="font-weight:bold;width:20%;">value</td>
		<td style="font-weight:bold;width:40%;"> Description</td>							
	</tr>
	<tr> 
		<td style="width:20%;">src</td>
		<td style="width:20%;">path of the file</td>
		<td style="width:40%;"> it used to sepecify the path of the file. </td>							
	</tr>
	<tr> 
		<td style="width:20%;">alt</td>
		<td style="width:20%;">alternativ text for the image.</td>
		<td style="width:40%;">if image is not randered then this alternative text will be randered. </td>							
	</tr>
	<tr> 
		<td style="width:20%;">Height and width </td>
		<td style="width:20%;">height and width of the imgage</td>
		<td style="width:40%;"> it used to sepecify the height and width of the image. </td>							
	</tr>
</table>
