
<h4>Model Popup</h4>
<p>A modal is a  box/popup  that is displayed on top of the current page.</p>
<section>  
<div ui-ace ="{useWrapMode: 'true', showGutter : 'true', theme:'monokai', mode: 'html', previewId:'preview5',
    onLoad: htmlcssjsContentOnLoaded,
    rendererOptions: { fontSize: 16 },
    advanced: { highlightActiveLine: true}
}" style="min-height:400px;"><xmp> <!-- Change code and see.-->
<style>
.overlay{
    position: fixed;;
    visibility: visible;
    z-index: 1; 
    left: 0;
    top: 0;
     overflow: auto;
    width: 100%;
    height: 100%;
    background-color: rgb(0,0,0);
    background-color: rgba(0,0,0,0.4);

}
.popup{
    position: absolute;
    visibility: visible;
    width: 50%;
    min-height: 200px;
    z-index: 1111;
    margin: 10% 25%;
    background-color:white;
     box-shadow: 3px 4px 2px #5d5c5c;

}
.popup-heading{
    padding: 5px 8px;
    background: green;
    color: white;
    font-size: 14px;
    font-weight: bold;
}
.btn-close{
    float: right;
    color: white;
    cursor: pointer;
}
</style>
    <button onclick="openPopup()">Open Popup</button>
    <div>
        <div class="overlay" id="overlayCover">
            <div class="popup" id="popupModel">
                <div class="popup-heading">Heading<span class="btn-close" onclick="closePopup()">X</span></div>
                <div class="popup-body">
                    <h3 style="text-align: center;">Popup Body</h3>
                </div>
            </div>
        </div>
    </div>
<script type="text/javascript">
    function openPopup(){
        document.getElementById('overlayCover').style.display= "block";
        document.getElementById('popupModel').style.display= "block";
    }

    function closePopup(){
        document.getElementById('overlayCover').style.display= "none";
        document.getElementById('popupModel').style.display= "none";
    }
    closePopup();
</script>
</xmp>
</div>
<div>
    <iframe id="preview5" style="min-height: 350px;"></iframe>
</div>
</section>
