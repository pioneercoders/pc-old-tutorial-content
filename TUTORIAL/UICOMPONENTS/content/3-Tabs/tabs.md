<h4>Tabs</h4>
<p>Tabs make it easy to explore and switch between different views or functional aspects of an app or to browse categorized data sets.</p>
<p>Create  links to open specific content. By default tab1 content will be displayed.</p>
<p>when we click on perticular tab, corresponding content will be displayed and other tabs content will be hidden.</p>
<section>  
<div ui-ace ="{useWrapMode: 'true', showGutter : 'true', theme:'monokai', mode: 'html', previewId:'preview2',
	onLoad: htmlcssjsContentOnLoaded,
	rendererOptions: { fontSize: 16 },
	advanced: { highlightActiveLine: true}
}" style="min-height:400px;"><xmp> <!-- Change code and see.-->
<style>
.tab{
    width: 100%;
    border: 1px solid lightgrey;
    min-height: 211px;
}
.nav-bars ul{
    padding:0px;
    margin: 0px;
    border: 1px solid lightgrey;
    background: #f8f8f8;
}
.nav-bars ul li{
    list-style-type: none;
}
.nav-bars ul li a{
    text-decoration: none;
    color:black;
     display: block;
     padding:8px;
}
.nav-bars ul li a:hover{
    background-color: grey;
    cursor: pointer;
}
.nav-bars-vertical{
    width:10%;
}
.nav-bars-horizontal{
    width:100%;
}
.nav-bars-horizontal ul li {
    display: inline-block;
   }
.active{
     background-color: grey;
     color:white;
}

</style>
<div class="tab">
	<nav class="nav-bars nav-bars-horizontal">
		<ul>
			<li><a class="tablink active"  onclick="openTab(event,'tab1')">Tab1</a></li>
			<li ><a class="tablink"  onclick="openTab(event,'tab2')">Tab2</a></li>
			<li ><a class="tablink"  onclick="openTab(event,'tab3')">Tab3</a></li>
			<li ><a class="tablink"  onclick="openTab(event,'tab4')">Tab4</a></li>
		</ul>
	</nav>
	<main>
		<div id="tab1" class="content "><h3><b>Tab1</b> content goes here</h3></div>
		<div id="tab2" class="content"><h3><b>Tab2</b> content goes here</h3></div>
		<div id="tab3" class="content"><h3><b>Tab3</b> content goes here</h3></div>
		<div id="tab4" class="content"><h3><b>Tab4</b> content goes here</h3></div>
	</main>
</div>
<script type="text/javascript">
	function init(){
		hideTabs();
	}
	/*onload hide the tabs*/
	function hideTabs(){
			var tablinks = document.getElementsByClassName("content");
    	    for (i = 0; i < tablinks.length; i++) {
		            tablinks[i].style.display="none";
		    }
	}
	function openTab(evt,tab){
		hideTabs();
		   var tablinks = document.getElementsByClassName("tablink");
		    for (i = 0; i < tablinks.length; i++) {
		        tablinks[i].className = tablinks[i].className.replace(" active", "");
		    }
		document.getElementById(tab).style.display = "block";
    	 evt.currentTarget.className += " active";
	}

	init();
	document.getElementById("tab1").style.display="block";
</script>
</xmp>
</div>
<div>
	<iframe id="preview2" style="min-height: 350px;"></iframe>
</div>
</section>
