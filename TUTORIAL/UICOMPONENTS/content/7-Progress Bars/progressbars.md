

<h4>Progress Bars</h4>
<p>Progress bars fill from 0% to 100% to show the progress of a task. </p>
<p>take any html element to create the progress bar</p>
@CODE_START@@HTML@ <div class="progress">
    <div class="progress-content">70%</div>
</div>
@CODE_END@
<section>  
<div ui-ace ="{useWrapMode: 'true', showGutter : 'true', theme:'monokai', mode: 'html', previewId:'preview6',
    onLoad: htmlcssjsContentOnLoaded,
    rendererOptions: { fontSize: 16 },
    advanced: { highlightActiveLine: true}
}" style="min-height:400px;"><xmp> <!-- Change code and see.-->
<style>
.progress{
    border: 1px solid f5f5f5;
    width: 100%;
    background-color: #f5f5f5;
    margin-bottom: 15px;
    box-shadow: inset 0px 1px rgba(0,0,0,0.1);
    border-radius: 5px;
}
.progress-content{
    width: 70%;
    background-color: green;
    height: 20px;
    margin: 0px;
    color: white;
    text-align: center;
}
</style>
<div>
    <diiv><h4>Progress Bars</h4></diiv>
    <div class="progress">
        <div class="progress-content">70%</div>
    </div>
    <div  class="progress">
        <div id ="progressBar" class="progress-content" style="width:20%;">20%</div>
    </div>
    <button type="button" class="btn btn-md btn-info" onclick="progressBarFun()">Click</button>
</div>
<script>
    function progressBarFun() {
      var elem = document.getElementById("progressBar");   
      var width = 20;
      var id = setInterval(moveBar, 10);
      function moveBar() {
        if (width >= 100) {
          clearInterval(id);
        } else {
          width++; 
          elem.style.width = width + '%'; 
          elem.innerHTML = width * 1  + '%';
        }
      }
    }
</script>
</xmp>
</div>
<div>
    <iframe id="preview6"></iframe>
</div>
</section>

<section>  
<div ui-ace ="{useWrapMode: 'true', showGutter : 'true', theme:'monokai', mode: 'html', previewId:'preview2',
    onLoad: htmlcssjsContentOnLoaded,
    rendererOptions: { fontSize: 16 },
    advanced: { highlightActiveLine: true}
}" style="min-height:400px;"><xmp> <!-- Change code and see.-->
<style>
.progress{
    border: 1px solid f5f5f5;
    width: 100%;
    background-color: #f5f5f5;
    margin-bottom: 15px;
    box-shadow: inset 0px 1px rgba(0,0,0,0.1);
    border-radius: 5px;
}
.progress-content{
    width: 70%;
    background-color: green;
    height: 20px;
    margin: 0px;
    color: white;
    text-align: center;
}
.bg-red{
  background-color: red;
}
.bg-orange{
  background-color: orange;
}
.bg-blue{
  background-color: blue;
}
</style>
<div>
    <diiv><h4>Progress Bars</h4></diiv>
    <div class="progress">
        <div class="progress-content">70%</div>
    </div>
    <div  class="progress">
        <div id ="progressBar" class="progress-content bg-blue" style="width:20%;">20%</div>
    </div>
     <div  class="progress">
        <div id ="progressBar" class="progress-content bg-orange" style="width:50%;">50%</div>
    </div>
     <div  class="progress">
        <div id ="progressBar" class="progress-content bg-red" style="width:70%;">70%</div>
    </div>
</div>
</xmp>
</div>
<div>
    <iframe id="preview2" style="min-height:300px;"></iframe>
</div>
</section>
