<h4>Buttons</h4>
<p>Buttons represents a clickable button. Buttons are used to perform the click events.</p>
<p>For example if we want to submit the form data we can use buttons.</p>
<h5>Shadow buttons</h5>
<p>on hover box-shadow will be applied to the buttons.</p>
<section>  
<div ui-ace ="{useWrapMode: 'true', showGutter : 'true', theme:'monokai', mode: 'html', previewId:'preview1',
	onLoad: htmlcssjsContentOnLoaded,
	rendererOptions: { fontSize: 16 },
	advanced: { highlightActiveLine: true}
}" style="min-height:400px;"><xmp> <!-- Change code and see.-->
<style>
.btn{
     display: inline-block;
    padding: 6px 12px;
    margin-bottom: 0;
    font-size: 14px;
    font-weight: 400;
    line-height: 1.42857143;
    text-align: center;
    white-space: nowrap;
    vertical-align: middle;
    cursor: pointer;
    -webkit-user-select: none;
    -moz-user-select: none;
    -ms-user-select: none;
    user-select: none;
    background-image: none;
    border: 1px solid transparent;
    border-radius: 4px;
}
.btn-default {
    color: #333;
    background-color: #fff;
    border-color: #ccc;
}
.btn-default:hover{
    color: #333;
    background-color: #e6e6e6;
    border-color: #adadad;
}
.btn-primary{
    color: #fff;
    background-color: #337ab7;
    border-color: #2e6da4;
}
.btn-primary:hover{
     color: #fff;
    background-color: #286090;
    border-color: #204d74;
}
.btn-success{
    color: #fff;
    background-color: #5cb85c;
    border-color: #4cae4c;
}
.btn-success:hover{
    color: #fff;
    background-color: #449d44;
    border-color: #398439;
}
.btn-info{
    color: #fff;
    background-color: #5bc0de;
    border-color: #46b8da;
}
.btn-info:hover{
    color: #fff;
    background-color: #31b0d5;
    border-color: #269abc;
}
.btn-warning{
    color: #fff;
    background-color: #f0ad4e;
    border-color: #eea236;
}
.btn-warning:hover{
     color: #fff;
    background-color: #ec971f;
    border-color: #d58512;
}
.btn-danger{
    color: #fff;
    background-color: #d9534f;
    border-color: #d43f3a;
}
.btn-danger:hover{
     color: #fff;
    background-color: #c9302c;
    border-color: #ac2925;
}
.btn-lg{
     padding: 10px 16px;
    font-size: 18px;
    border-radius: 5px;
}
.btn-md{
     padding: 5px 10px;
    font-size: 12px;
    border-radius: 5px;
}
.btn-sm{
     padding: 1px 5px;
    font-size: 12px;
    border-radius: 3px;
}
.btn-rounded{
    border-radius: 20px;
}
.btn-shadow:hover{
    box-shadow: 0 8px 16px 0 rgba(0,0,0,0.2), 0 6px 20px 0 rgba(0,0,0,0.19);
}
</style>
    <h3>Buttons normal</h3>
	<div class="row" style="margin: 20px;">
		<button type="button" class="btn">Basic</button>
		<button type="button" class="btn btn-default">Default</button>
		<button type="button" class="btn btn-primary">Primary</button>
		<button type="button" class="btn btn-success">Success</button>
		<button type="button" class="btn btn-info">Info</button>
		<button type="button" class="btn btn-warning">Warning</button>
		<button type="button" class="btn btn-danger">Danger</button>
	</div>
    <h3>Buttons with Rounded Corners</h3>
    <div class="row" style="margin: 20px;">
        <button type="button" class="btn btn-rounded">Basic</button>
        <button type="button" class="btn btn-default btn-rounded">Default</button>
        <button type="button" class="btn btn-primary btn-rounded">Primary</button>
        <button type="button" class="btn btn-success btn-rounded">Success</button>
        <button type="button" class="btn btn-info btn-rounded">Info</button>
        <button type="button" class="btn btn-warning btn-rounded">Warning</button>
        <button type="button" class="btn btn-danger btn-rounded">Danger</button>
    </div>
    <h3>Button sizes</h3>
	<div style="margin: 20px;">
		<button class="btn btn-lg">Large</button>
		<button class="btn btn-md">Medium</button>
		<button class="btn btn-sm">Small</button>
	</div>
    <h3>Shadow Buttons</h3>
     <div class="row" style="margin: 20px;">
       
        <button type="button" class="btn btn-success btn-lg  btn-shadow">Shadow</button>
       
    </div>
</xmp>
</div>
<div>
	<iframe id="preview1"  style="min-height:400px;"></iframe>
</div>
</section>
