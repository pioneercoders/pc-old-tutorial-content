
<p>HTML Forms are required when you want to collect some data from the user. For example during user registration you would like to collect information such as name, email address, credit card, etc.</p>
<p>A form will take input from the user and then will post it to a back-end application such as Java, ASP Script or PHP script etc. The back-end application will perform required processing on the passed data based on defined business logic inside the application or storing in Database.</p>
<p>The HTML tag is used to create an HTML form and it has following syntax:</p>

@CODE_START@@HTML@<form action = "Script URL" method = "GET|POST">
	Form elements like input , textarea etc.
</form>@CODE_END@
<p>There are various form elements available like text fields, textarea fields, drop-down menus, radio buttons, checkboxes, etc. 
There are different types of form controls that you can use to collect data using HTML form:</p>

<h3>HTML Form Controls :</h3>
<ul>
	<li>i)Text Input Controls</li>
	<li>ii)Checkboxes Controls</li>
	<li>iii)Radio Box Controls</li>
	<li>iv)Select Box Controls</li>
	<li>v)File Select Controls</li>
	<li>vi)Hidden Controls</li>
	<li>vii)Clickable Controls</li>
	<li>viii)Submit and Reset Button</li>
</ul>

<h3>Text Input Controls :</h3>
<p>There are three types of text input used on forms:</p>
<p><b>Single-line text input controls </b>-This control is used for items that require only one line of user input, such as mobile no or names. They are created using HTML &lt;input&gt; tag.</p>

<p><b>Password input controls</b>-This is also a single-line text input but it masks the character as soon as a user enters it. They are also created using HTMl &lt;input&gt; tag.</p>

<p><b>Multi-line text input controls </b>-This is used when the user is required to give details that may be longer than a single sentence. Multi-line input controls are created using HTML  &lt;textarea&gt; tag.</p>

<section>  
    <div ui-ace ="{useWrapMode: 'true', showGutter : 'true', theme:'monokai', mode: 'html', previewId:'preview',
		onLoad: htmlcssjsContentOnLoaded,
		rendererOptions: { fontSize: 16 },
		advanced: { highlightActiveLine: true}
	}" style="min-height:200px;"><xmp><!-- try to add onemore field and see. -->
<form>
	First Name :<input type="text" name="first_name" /><br>
	Email  :<input type="email" name="email" /><br>
	Password  :<input type = "password" name="pwd" /><br>
	Mobile  :<input type="text" name="mobile" /><br>	
	Address:<textarea name="address"></textarea>
</form></xmp>
	</div>
	<div>
        <iframe id="preview"></iframe>
    </div>
</section>

<h3>Checkbox Control :</h3>
<p>Checkboxes are used when more than one option is required to be selected. They are also created using HTML &lt;input&gt; tag but type attribute is set to checkbox.</p>
<section>  
    <div ui-ace ="{useWrapMode: 'true', showGutter : 'true', theme:'monokai', mode: 'html', previewId:'preview1',
		onLoad: htmlcssjsContentOnLoaded,
		rendererOptions: { fontSize: 16 },
		advanced: { highlightActiveLine: true}
	}" style="min-height:150px;"><xmp><!-- try to add onemore field and see. -->
<form>
	<input type = "checkbox" name = "Facebook" value = "on" />Facebook
	<input type = "checkbox" name = "Twitter" value = "on" />Twitter
	<input type = "checkbox" name = "Linkedin" value = "on" />Linked In
	<input type = "checkbox" name = "GooglePlus" value = "on" />Google+
</form></xmp>
	</div>
	<div>
        <iframe id="preview1"></iframe>
    </div>
</section>

<h3>Attributes :</h3>
<p>Following is the list of attributes for <<span>checkbox></span> tag.</p>
<table class="pc-table">
<tr>
	<td><b>Attribute</b></td>
	<td><b>Description</b></td>
</tr>
<tr>
	<td>type</td>
	<td>Indicates the type of input control and for checkbox input control it will be set to checkbox.</td>
</tr>
<tr>
	<td>name</td>
	<td>Used to give a name to the control which is sent to the server to be recognized and get the value.</td>
</tr>
<tr>
	<td>value</td>
	<td>The value that will be used if the checkbox is selected.</td>
</tr>
<tr>
	<td>checked</td>
	<td>Set to checked if you want to select it by default.</td>
</tr>
</table>



<h3>Radio Button Control :</h3>
<p>Radio buttons are used when out of many options, just one option is required to be selected. They are also created using HTML &lt;input&gt; tag but type attribute is set to radio.</p>

<section>  
    <div ui-ace ="{useWrapMode: 'true', showGutter : 'true', theme:'monokai', mode: 'html', previewId:'preview2',
		onLoad: htmlcssjsContentOnLoaded,
		rendererOptions: { fontSize: 16 },
		advanced: { highlightActiveLine: true}
	}" style="min-height:100px;"><xmp><!-- try to add onemore field and see. -->
<form>
	<input type = "radio" name = "gender" value = "Male" />Male
	<input type = "radio" name = "gender" value = "Female" />Female
</form></xmp>
	</div>
	<div>
        <iframe id="preview2"></iframe>
    </div>
</section>


<table class="pc-table">
<tr>
	<td><b>Attribute</b></td>
	<td><b>Description</b></td>
</tr>
<tr>
	<td>type</td>
	<td>Indicates the type of input control and for Radiobutton input control it will be set to radio.</td>
</tr>
<tr>
	<td>name</td>
	<td>Used to give a name to the control which is sent to the server to be recognized and get the value.</td>
</tr>
<tr>
	<td>value</td>
	<td>The value that will be used if the radio box is selected.</td>
</tr>
<tr>
	<td>checked</td>
	<td>Set to checked if you want to select it by default.</td>
</tr>
</table>

<h3>Select Box Control :</h3>
<p>A select box, also called drop down box which provides option to list down various options in the form of drop down list, from where a user can select one or more options.</p>

<section>  
    <div ui-ace ="{useWrapMode: 'true', showGutter : 'true', theme:'monokai', mode: 'html', previewId:'preview3',
		onLoad: htmlcssjsContentOnLoaded,
		rendererOptions: { fontSize: 16 },
		advanced: { highlightActiveLine: true}
	}" style="min-height:200px;"><xmp><!-- try to add onemore field and see. -->
<form>
<select name = "dropdown">
	<option value = "India" selected>India</option>
	<option value = "China">China</option>
	<option value = "China">U.K</option>
</select>
</form></xmp>
	</div>
	<div>
        <iframe id="preview3"></iframe>
    </div>
</section>

<h3>Attributes :</h3>
<p>Following is the list of important attributes of &lt;select&gt; tag:</p>
<table class="pc-table"> 
<tr>
	<td><b>Attribute</b></td>
	<td><b>Description</b></td>
</tr>
<tr>
	<td>name</td>
	<td>Used to give a name to the control which is sent to the server to be recognized and get the value.</td>
</tr>
<tr>
	<td>size</td>
	<td>This can be used to present a scrolling list box.</td>
</tr>
<tr>
	<td>multiple</td>
	<td>If set to "multiple" then allows a user to select multiple items from the menu.</td>
</tr>
</table>
<p>Following is the list of important attributes of &lt;option&gt; tag:</p>
<table class="pc-table">
<tr>
	<td><b>Attribute</b></td>
	<td><b>Description</b></td>
</tr>
<tr>
	<td>value</td>
	<td>The value that will be used if an option in the select box is selected.</td>
</tr>
<tr>
	<td>selected</td>
	<td>Specifies that this option should be the initially selected value when the page loads.</td>
</tr>
<tr>
	<td>label</td>
	<td>An alternative way of labeling options.</td>
</tr>
</table>
<h3>File Upload Box :</h3>
<p>If you want to allow a user to upload a file to your web site, you will need to use a file upload box, also known as a file select box. This is also created using the &lt;input&gt; element but type attribute is set to file.</p>
	
@CODE_START@@HTML@<!DOCTYPE html>
<html>
	<body>
		<form>
			<input type = "file" name = "fileupload" accept = "image/*" />
		</form>
	</body>
</html>@CODE_END@

<h3>Attributes :</h3>
<p>Following is the list of important attributes of file upload box :</p>
<table class="pc-table">
<tr>
	<td><b>Attribute</b></td>
	<td><b>Description</b></td>
</tr>
<tr>
	<td>name</td>
	<td>Used to give a name to the control which is sent to the server to be recognized and get the value.</td>
</tr>
<tr>
	<td>accept</td>
	<td>Specifies the types of files that the server accepts.</td>
</tr>
</table>

<h3>Button Controls :</h3>
<p>There are various ways in HTML to create clickable buttons. You can also create a clickable button using &lt;input&gt; tag by setting its type attribute to button. The type attribute can take the following values :</p>
<table class="pc-table">
<tr>
	<td><b>Type</b></td>
	<td><b>Description</b></td>
</tr>
<tr>
	<td>submit</td>
	<td>This creates a button that automatically submits a form.</td>
</tr>
<tr>
	<td>reset</td>
	<td>This creates a button that automatically resets form controls to their initial values.</td>
</tr>
<tr>
	<td>button</td>
	<td>This creates a button that is used to trigger a client-side script when the user clicks that button.</td>
</tr>
<tr>
	<td>image</td>
	<td>This creates a clickable button but we can use an image as background of the button.</td>
</tr>
</table>

<section>  
    <div ui-ace ="{useWrapMode: 'true', showGutter : 'true', theme:'monokai', mode: 'html', previewId:'preview4',
		onLoad: htmlcssjsContentOnLoaded,
		rendererOptions: { fontSize: 16 },
		advanced: { highlightActiveLine: true}
	}" style="min-height:200px;"><xmp><!-- try to add onemore field and see. -->
<form>
	<input type = "submit" name = "submit" value = "Submit" />
	<input type = "reset" name = "reset" value = "Reset" />
	<input type = "button" name = "ok" value = "Ok" />
	<input type = "image" name = "imagebutton" src = "../../../pioneercoders/resources/images/imagetutorial_image1.png" />
</form></xmp>
	</div>
	<div>
        <iframe id="preview4"></iframe>
    </div>
</section>

<h3>Hidden Form Controls :</h3>
<p>Hidden form controls are used to hide data inside the page which later on can be pushed to the server. This control hides inside the code and does not appear on the actual page. For example, following hidden form is being used to keep current page number. When a user will click next page then the value of hidden control will be sent to the web server and there it will decide which page has be displayed next based on the passed current page.</p>
		
<section>  
    <div ui-ace ="{useWrapMode: 'true', showGutter : 'true', theme:'monokai', mode: 'html', previewId:'preview5',
		onLoad: htmlcssjsContentOnLoaded,
		rendererOptions: { fontSize: 16 },
		advanced: { highlightActiveLine: true}
	}" style="min-height:150px;"><xmp><!-- try to add onemore field and see. -->
<form>
	<p>This is page 10</p>
	<input type = "hidden" name = "pagename" value = "10" />
	<input type = "Submit" name = "submit" value = "Submit" />
</form></xmp>
	</div>
	<div>
        <iframe id="preview5"></iframe>
    </div>
</section>


<h3>Form Attributes :</h3>
<p>Apart from common attributes, following is a list of the most frequently used form attributes:</p>
<table class="pc-table">
<tr>
	<td><b>Attribute</b></td>
	<td><b>Description</b></td>
</tr>
<tr>
	<td>Action</td>
	<td>Backend script ready to process your passed data.</td>
</tr>
<tr>
	<td>Method</td>
	<td>Method to be used to upload data. The most frequently used are GET and POST methods.</td>
</tr>
<tr>
	<td>Target</td>
	<td>Specify the target window or frame where the result of the script will be displayed. It takes values like _blank, _self, _parent etc.</td>
</tr>
<tr>
	<td>Enctype</td>
	<td>You can use the enctype attribute to specify how the browser encodes the data before it sends it to the server. Possible values are:	application/x-www-form-urlencoded - This is the standard method most forms use in simple scenarios.	multipart/form-data - This is used when you want to upload binary data in the form of files like image, word file etc.</td>
</tr>
</table>
<p><b>Note :</b>You can refer to Java & PHP for a detail on how form data upload works.</p>


<!-- @PROJECT_START@HTML/HTML_Form1@PROJECT_END@ -->
<a class="cws-button border-radius bt-color-3" target="_blank" href="project/download/HTML/HTML_Form1">Exercise</a>
</div>		
