

<h4>Corousel</h4>
<p> Corousel used to cycle through elements:</p>
<section>  
<div ui-ace ="{useWrapMode: 'true', showGutter : 'true', theme:'monokai', mode: 'html', previewId:'preview8',
    onLoad: htmlcssjsContentOnLoaded,
    rendererOptions: { fontSize: 16 },
    advanced: { highlightActiveLine: true}
}" style="min-height:400px;"><xmp> <!-- Change code and see.-->
<style>
.slideShow{
    position:relative;
    width: 50%;
    min-height: 200px;
    height:200px;
}
.slide-btn{
    position: absolute;
    color: white;
    background-color: black;
      top: 77px;
    cursor: pointer;
}
.slides{
    min-height:200px;
}
.left-btn{
    left:0;
}
.right-btn{
     right: 0;
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
.bg-green{
  background-color:green;
}
</style>
<div class="slideShow">
<div class="slides bg-green" style="width: 100%;"></div>
<div class="slides bg-red" style="width: 100%;"></div>
<div class="slides bg-orange" style="width: 100%;"></div>
<div class="slides bg-blue" style="width: 100%;"></div>
     <button class="slide-btn left-btn" onclick="slideImages(-1)">&#10094;</button>
     <button class="slide-btn right-btn" onclick="slideImages(1)">&#10095;</button>
</div>
<script>
    var slideIndex = 1;
    showImg(slideIndex);

    function slideImages(number) {
      showImg(slideIndex += number);
    }

    function showImg(number) {
      var elements = document.getElementsByClassName("slides");
      if (number > elements.length) {
        slideIndex = 1
      }    
      if (number < 1) {
            slideIndex = elements.length
        }
      var i;
      for (i = 0; i < elements.length; i++) {
         elements[i].style.display = "none";  
      }
      elements[slideIndex-1].style.display = "block";  
}
</script>
</xmp>
</div>
<div>
    <iframe id="preview8" style="min-height:400px;"></iframe>
</div>
</section>
