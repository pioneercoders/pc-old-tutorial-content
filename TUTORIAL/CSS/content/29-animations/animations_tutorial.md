<style>
	#preview6{

		min-height: 320px;
	}

</style>
<h4>CSS Animations</h4>
<p><b>CSS animations</b> allows to animate transitions from one CSS style configuration to another style configuration.</p>
<p>Animations mainly consists of two components</p>
<ul>
	<li><b>Style</b> that describing CSS animations.</li>
	<li>set of <b>Keyframes</b> which indicate start and end state of animation's style.</li>
</ul>
<h4>Animation Properties</h4>
<table class="pc-table">
	<tr>
		<th>Property</th>
		<th>Description</th>
	</tr>
	<tr>
		<td>animation</td>
		<td>Short hand property for setting all animation properties. </td>
	</tr>
	<tr>
		<td>animation-duration	</td>
		<td>Length of time that an animation should take to complete one cycle. </td>
	</tr>
	<tr>
		<td>animation-direction	</td>
		<td>Specifies whether an animation should play forwards, backwards, or alternating back and forth.</td>
	</tr>
	<tr>
		<td>animation-delay</td>
		<td>Specifies when an animation should start.</td>
	</tr>
	<tr>
		<td> animation-iteration-count</td>
		<td>Specifies the number of times an animation cycle should be played before stopping.</td>
	</tr>
	<tr>
		<td> animation-name</td>
		<td>Specifies one or more animations that should be applied to an element.</td>
	</tr>
	<tr>
		<td> animation-timing-function</td>
		<td> Specifies how a CSS animation should progress over the duration of each cycle.</td>
	</tr>
	<tr>
		<td> animation-play-state</td>
		<td> Specifies whether the animation is running or paused</td>
	</tr>
</table>
<h4>The @keyframes Rule</h4>
<p><b>@keyframes</b> is used to create the animations.</p>
<p> Inside the <b>@keyframes</b>, we will specify the animations for particular element (gradually change from current style to new style.) </p>
<section>  
<div ui-ace ="{useWrapMode: 'true', showGutter : 'true', theme:'monokai', mode: 'html', previewId:'preview1',
	onLoad: htmlcssjsContentOnLoaded,
	rendererOptions: { fontSize: 16 },
	advanced: { highlightActiveLine: true}
}" style="min-height:200px;"><xmp> <!-- Change code and see.-->
 <style>
    .animate{
    	width:80px;
    	height:80px;
    	animation: changecolor;
    	animation-duration: 6s;
    	background-color: yellow;
    }
    @keyframes changecolor{
    	from{
    		background-color: green;
    	}
    	to{
    		background-color: orange;
    	}
    }
 </style>
<div class="animate"></div>
<p>Try chaning the background color to observe the animation.</p>
</xmp>
</div>
<div>
	<iframe id="preview1"></iframe>
</div>
</section>
<p>No animation effect if <b>animation-duration</b> is not specified. Because by default animation-duration is 0.</p>
<p>Inside <b>@keyframes</b> we have used <b class="color-red">from</b> and  <b class="color-red">to</b></p>
<p> <b class="color-red">from</b> represents <b>0%(start of animation)</b></p>
<p> <b class="color-red">to</b> represents <b>100%(end or complete)</b></p>
<h4>Example @keyframes</h4>
<section>  
<div ui-ace ="{useWrapMode: 'true', showGutter : 'true', theme:'monokai', mode: 'html', previewId:'preview2',
	onLoad: htmlcssjsContentOnLoaded,
	rendererOptions: { fontSize: 16 },
	advanced: { highlightActiveLine: true}
}" style="min-height:350px;"><xmp> <!-- Change code and see.-->
 <style>
    .animate{
    	width:80px;
    	height:80px;
    	animation: coloranimation;
    	animation-duration: 4s;
    	background-color: yellow;
    }
    @keyframes coloranimation{
    	0%{background-color: blue;}
    	25%{background-color: orange;}
    	50%{background-color: red;}
    	75%{background-color: dodgerblue;}
    	100%{background-color: green}
    }
 </style>
<div class="animate"></div>
<p>Try chaning the background color to observe the animation.</p>
</xmp>
</div>
<div>
	<iframe id="preview2"></iframe>
</div>
</section>
<p>In the above example we specified five break points(0% to 100%). background-color of div element will change from 0% to 100% with in the animation-duration(4s).</p>
<h4>animation-delay</h4>
<p><b>animation-delay</b> specifies delay for starting animation. For example if we specify animation-delay:4s, the animation will start after 4s.</p>
<h4>Example animation-delay</h4>
<section>  
<div ui-ace ="{useWrapMode: 'true', showGutter : 'true', theme:'monokai', mode: 'html', previewId:'preview3',
	onLoad: htmlcssjsContentOnLoaded,
	rendererOptions: { fontSize: 16 },
	advanced: { highlightActiveLine: true}
}" style="min-height:350px;"><xmp> <!-- Change code and see.-->
 <style>
    .animate{
    	width:80px;
    	height:80px;
    	animation: coloranimation;
    	animation-duration: 4s;
    	background-color: yellow;
    	animation-delay:3s;
    }
    @keyframes coloranimation{
    	0%{background-color: blue;}
    	25%{background-color: orange;}
    	50%{background-color: red;margin-top:80px;}
    	75%{background-color: dodgerblue;}
    	100%{background-color: green}
    }
 </style>
<div class="animate"></div>
<p>Try chaning the background color to observe the animation.</p>
</xmp>
</div>
<div>
	<iframe id="preview3"></iframe>
</div>
</section>
<h4>animation-iteration-count</h4>
<p>we can aslo specifies how many times an animation can run. for example if we set <b>animation-iteration-count:3;</b> then animation will be repeated for 3 consecutive times</p>
<h4>Example: animation-iteration-count</h4>
<section>  
<div ui-ace ="{useWrapMode: 'true', showGutter : 'true', theme:'monokai', mode: 'html', previewId:'preview4',
	onLoad: htmlcssjsContentOnLoaded,
	rendererOptions: { fontSize: 16 },
	advanced: { highlightActiveLine: true}
}" style="min-height:350px;"><xmp> <!-- Change code and see.-->
 <style>
    .animate{
    	width:80px;
    	height:80px;
    	animation: coloranimation;
    	animation-duration: 4s;
    	background-color: yellow;
    	animation-delay:3s;
    	animation-iteration-count:3;
    }
    @keyframes coloranimation{
    	0%{background-color: blue;}
    	25%{background-color: orange;}
    	50%{background-color: red;margin-top:80px;}
    	75%{background-color: dodgerblue;}
    	100%{background-color: green}
    }
 </style>
<div class="animate"></div>
<p>Try chaning the CSS to observe the animation.</p>
</xmp>
</div>
<div>
	<iframe id="preview4"></iframe>
</div>
</section>
<h4>Example: animation-iteration-count:infinite</h4>
<section>  
<div ui-ace ="{useWrapMode: 'true', showGutter : 'true', theme:'monokai', mode: 'html', previewId:'preview5',
	onLoad: htmlcssjsContentOnLoaded,
	rendererOptions: { fontSize: 16 },
	advanced: { highlightActiveLine: true}
}" style="min-height:350px;"><xmp> <!-- Change code and see.-->
 <style>
    .animate{
    	width:80px;
    	height:80px;
    	animation: coloranimation;
    	animation-duration: 2s;
    	background-color: yellow;
    	animation-delay:3s;
    	animation-iteration-count:infinite;
    }
    @keyframes coloranimation{
    	0%{background-color: blue;}
    	25%{background-color: orange;}
    	50%{background-color: red;margin-top:80px;}
    	75%{background-color: dodgerblue;}
    	100%{background-color: green}
    }
 </style>
<div class="animate"></div>
<p>Above animation will run continuously</p>
<p>Try chaning the CSS to observe the animation.</p>
</xmp>
</div>
<div>
	<iframe id="preview5"></iframe>
</div>
</section>
<h4>animation-timing-function</h4>
<p>Specifies how a CSS animation should progress over the duration of each cycle.</p>
<h4>Types of animation timing functions</h4>
<table class="pc-table">
	<tr>
		<th>Property</th>
		<th>Description</th>
	</tr>
	<tr>
		<td>ease</td>
		<td>slow start, then fast and then end slowly (this is default) </td>
	</tr>
	<tr>
		<td>linear</td>
		<td>Maintains constant(same) speed through out the animation.</td>
	</tr>
	<tr>
		<td>ease-in	</td>
		<td>Indicates animation with slow start.</td>
	</tr>
	<tr>
		<td>ease-out</td>
		<td>Indicates animation with slow end.</td>
	</tr>
	<tr>
		<td> ease-in-out</td>
		<td>animation will start slowly and ends slowly.</td>
	</tr>
	<tr>
		<td> cubic-bezier(n,n,n,n)</td>
		<td>Allows us to define our own function.</td>
	</tr>
</table>
<h4>Example: animation-timing-function</h4>
<section>  
<div ui-ace ="{useWrapMode: 'true', showGutter : 'true', theme:'monokai', mode: 'html', previewId:'preview6',
	onLoad: htmlcssjsContentOnLoaded,
	rendererOptions: { fontSize: 16 },
	advanced: { highlightActiveLine: true}
}" style="min-height:450px;"><xmp> <!-- Change code and see.-->
 <style>
    .animate{
    	position: relative;
    	width:120px;
    	height:30px;
    	animation: coloranimation;
    	animation-duration: 2s;
    	background-color: green;
    	animation-delay:3s;
    	animation-iteration-count:infinite;
    	color:white;
    }
    .ease{
    	animation-timing-function: ease;
    	margin-bottom:3px;
    }
    .linear{
    	animation-timing-function: linear;
    	margin-bottom:3px;
    }
    .ease-in{
    	animation-timing-function: ease-in;
    	margin-bottom:3px;
    }
    .ease-out{
    	animation-timing-function: ease-out;
    	margin-bottom:3px;
    }
    .ease-in-out{
    	animation-timing-function: ease-in-out;
    	margin-bottom:3px;
    }
    @keyframes coloranimation{
    	from{left:0px;}
    	to{left:250px;}
    }
 </style>
<div style="border:1px slid lightgrey">
	<div class="animate ease">ease</div>
	<div class="animate ease-in">ease-in</div>
	<div class="animate ease-out">ease-out</div>
	<div class="animate linear">linear</div>
	<div class="animate ease-in-out">ease-in-out</div>
</div>
<p>Above animation will run continuously</p>
</xmp>
</div>
<div>
	<iframe id="preview6" ></iframe>
</div>
</section>
