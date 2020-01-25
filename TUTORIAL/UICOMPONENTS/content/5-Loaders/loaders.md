<h4>Loaders</h4>
<p>If a web page is still loading, we will indicate inprogress of a webpage using loaders.</p>
<p>To create the loaders take a div</p>
<p>size of the loader can be varied depending upon width and height properties.</p>
@CODE_START@@HTML@ <div class="loader"></div>
@CODE_END@
<p>border color and border size are used for specifying the loader. To make the rounded loader border-radius property will be used.</p>
<p>For rotating the loader we will use animation (<b>@keyframes</b>)</p>
@CODE_START@@HTML@ animation: spin 1s linear infinite;
@CODE_END@
<p>spin is a animation name</p>
@CODE_START@@HTML@ @keyframes spin{
    0%{
        transform:rotate(0deg);
    }
    100%{
        transform: rotate(360deg);
    }
}
@CODE_END@
<section>  
<div ui-ace ="{useWrapMode: 'true', showGutter : 'true', theme:'monokai', mode: 'html', previewId:'preview1',
	onLoad: htmlcssjsContentOnLoaded,
	rendererOptions: { fontSize: 16 },
	advanced: { highlightActiveLine: true}
}" style="min-height:400px;"><xmp> <!-- Change code and see.-->
<style>
.loader{
     width: 65px;
    height: 65px;
    border: 10px solid lightgrey;
    border-top:10px solid green;
    border-radius: 50%;
    animation: spin 1s linear infinite;
}
@keyframes spin{
    0%{
        transform:rotate(0deg);
    }
    100%{
        transform: rotate(360deg);
    }
}
</style>
<div>
	<h4>Loader</h4>
	<div class="loader"></div>
</div>
</xmp>
</div>
<div>
	<iframe id="preview1"></iframe>
</div>
</section>
<h4>loader with different colors</h4>
<section>  
<div ui-ace ="{useWrapMode: 'true', showGutter : 'true', theme:'monokai', mode: 'html', previewId:'preview2',
    onLoad: htmlcssjsContentOnLoaded,
    rendererOptions: { fontSize: 16 },
    advanced: { highlightActiveLine: true}
}" style="min-height:400px;"><xmp> <!-- Change code and see.-->
<style>
.loader{
     width: 65px;
    height: 65px;
    border: 10px solid lightgrey;
    border-top:10px solid green;
     border-right:10px solid dodgerblue;
      border-left:10px solid orange;
    border-radius: 50%;
    animation: spin 1s linear infinite;
}
@keyframes spin{
    0%{
        transform:rotate(0deg);
    }
    100%{
        transform: rotate(360deg);
    }
}
</style>
<div>
    <h4>Loader</h4>
    <div class="loader"></div>
</div>
</xmp>
</div>
<div>
    <iframe id="preview2"></iframe>
</div>
</section>
