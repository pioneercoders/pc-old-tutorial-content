
<h4>Popover</h4>
<p>A Popover can be used as an alternative to a Drop Down Menu that can contain elements inside.</p>
<p>Popover appears when user clicks on buttons</p>
<section>  
<div ui-ace ="{useWrapMode: 'true', showGutter : 'true', theme:'monokai', mode: 'html', previewId:'preview5',
    onLoad: htmlcssjsContentOnLoaded,
    rendererOptions: { fontSize: 16 },
    advanced: { highlightActiveLine: true}
}" style="min-height:400px;"><xmp> <!-- Change code and see.-->
<style>
.btn{
    background-color:dodgerblue;
    padding:6px 12px;
    color:white;
    border:1px solid dodgerblue;
    cursor:pointer;
}
nav {
    width: 20%;

}
nav ul {
    padding:0px;
}

nav ul li {
    list-style-type:none;
    padding:6px;
    
}
nav ul li:hover{
    background-color:green;
    color:white;
}
.dropdown{
    position:relative;
}
.dropdown-body{
    position:absolute;
    top:30px;`
    background-color:white;
    box-shadow:1px 1px 2px rgba(0,0,0,0.4);
}
</style>
 <div class="dropdown">
      <button onclick="showDropdown()" class="btn">Click here</button>
      <nav id="myDropdown" class="dropdown-body">
        <ul>
            <li>Home</li>
            <li>ContactUs</li>
            <li>Careers</li>
            <li>Programs</li>
        </ul>
      </nav>
</div>
<script type="text/javascript">
    function showDropdown(){
        if(document.getElementById('myDropdown').style.display=='' || document.getElementById('myDropdown').style.display=='none'){
                document.getElementById('myDropdown').style.display= "block";
        }else{
             document.getElementById('myDropdown').style.display= "none";
        }
    }
     document.getElementById('myDropdown').style.display= "none";

     
</script>
</xmp>
</div>
<div>
    <iframe id="preview5" style="min-height: 350px;"></iframe>
</div>
</section>
