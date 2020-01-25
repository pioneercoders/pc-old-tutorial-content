<h4>Panels</h4>
<p>A panel is a bordered box with some padding around its content. Panel also contans panel heading and panel body.</p>
<section>  
<div ui-ace ="{useWrapMode: 'true', showGutter : 'true', theme:'monokai', mode: 'html', previewId:'preview13',
    onLoad: htmlcssjsContentOnLoaded,
    rendererOptions: { fontSize: 16 },
    advanced: { highlightActiveLine: true}
}" style="min-height:200px;"><xmp> <!-- Change code and see.-->
<style>
.panel{
    border: 1px solid lightgrey;
    background: #ffffff;
    border-radius: 5px;
    margin-bottom: 20px;
    box-shadow: 0px 0px 0px rgba(0,0,0,0.5);
}
.panel-body{
    padding:10px;
}

.panel-heading{
    font-size: 18px;
    font-weight: bold;
    border-bottom: 1px solid transparent;
    border-top-left-radius: 3px;
    border-top-right-radius: 3px;
    padding: 10px 12px;
}
.panel-default{
    border: 1px solid #ddd;
}
.panel-default>.panel-heading{
    color: #333;
    background-color: lightgrey;
    border-color: #ddd;
}
.panel-info{
    border: 1px solid #5BC0DE;
}
.panel-info>.panel-heading{
    color: #ffffff;
    background-color: #5BC0DE;
    border-color: #5BC0DE;
}
.panel-success{
    border-color: #5CB85C;
}
.panel-success>.panel-heading{
    color: #ffffff;
    background-color: #5CB85C;
    border-color: #5CB85C;
}
.panel-primary{
    border-color: #337AB7;
}
.panel-primary>.panel-heading{
    color: #ffffff;
    background-color: #337AB7;
    border-color: #337AB7;
}
.panel-warning{
    border-color: #F0AD4E;
}
.panel-warning>.panel-heading{
    color: #ffffff;
    background-color: #F0AD4E;
    border-color: #F0AD4E;
}
.panel-danger{
    border-color: #D9534F;
}
.panel-danger>.panel-heading{
    color: #ffffff;
    background-color: #D9534F;
    border-color: #D9534F;
}
</style>
<h4>Panels</h4>
<h4>Panel Default</h4>
<div class="panel panel-default">
        <div class="panel-heading">Panel Heading</div>
        <div class="panel-body">Panel default</div>
</div>
<h4>Panel info</h4>
<div class="panel panel-info">
        <div class="panel-heading">Panel Heading</div>
        <div class="panel-body">Panel info</div>
</div>
<h4>Panel Success</h4>
<div class="panel panel-success">
        <div class="panel-heading">Panel Heading</div>
        <div class="panel-body">Panel success</div>
</div>
<h4>Panel Primary</h4>
<div class="panel panel-primary">
        <div class="panel-heading">Panel Heading</div>
        <div class="panel-body">Panel primary</div>
</div>
<h4>Panel Warning</h4>
<div class="panel panel-warning">
        <div class="panel-heading">Panel Heading</div>
        <div class="panel-body">Panel warning</div>
</div>
<h4>Panel Danger</h4>
<div class="panel panel-danger">
    <div class="panel-heading">Panel Heading</div>
    <div class="panel-body">Panel danger</div>
</div>
</xmp>
</div>
<div>
    <iframe id="preview13" style="min-height:400px;"></iframe>
</div>
</section>
