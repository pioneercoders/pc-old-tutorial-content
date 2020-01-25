<h4>Toasters</h4>
<p>Toaster is used to  displayg toast notifications</p>
<section>  
<div ui-ace ="{useWrapMode: 'true', showGutter : 'true', theme:'monokai', mode: 'html', previewId:'preview14',
    onLoad: htmlcssjsContentOnLoaded,
    rendererOptions: { fontSize: 16 },
    advanced: { highlightActiveLine: true}
}" style="min-height:300px;"><xmp> <!-- Change code and see.-->
<style>
.alert{
    width:20%;
    padding:12px;
    border-radius: 4px;
     border:1px solid lightgrey;
     margin-bottom: 20px;
}

.alert-close{
    float:right;
    cursor: pointer;

}
.alert-default{
    border:1px solid lightgrey;
    background-color: lightgrey;
    color: black;

}
.alert-info{
    border:1px solid #5BC0DE;
    background-color: #5BC0DE;
    color: #ffffff;

}
.alert-success{
    border:1px solid #5CB85C;
    background-color: #5CB85C;
    color: #ffffff;

}

.alert-primary{
    border:1px solid #337AB7;
    background-color: #337AB7;
    color: #ffffff;

}

.alert-warning{
    border:1px solid #F0AD4E;
    background-color: #F0AD4E;
    color: #ffffff;

}

.alert-danger{
    border:1px solid #D9534F;
    background-color: #D9534F;
    color: #ffffff;

}
</style>
<h5>Toastrs</h5>
<div>
    <div id="defaultAlert" class="alert alert-default">
        <div class="alert-close" onclick="closeAlert('default')">X</div>
        toast default
    </div>
    <div id="infoAlert" class="alert alert-info">
        <div class="alert-close" onclick="closeAlert('info')">X</div>
        toast info
    </div>
    <div id="primaryAlert" class="alert alert-primary">
        <div class="alert-close" onclick="closeAlert('primary')">X</div>
        toast primary
    </div>
    <div id="successAlert" class="alert alert-success">
        <div class="alert-close" onclick="closeAlert('success')">X</div>
        toast success
    </div>
    <div id="warningAlert" class="alert alert-warning">
        <div class="alert-close" onclick="closeAlert('warning')">X</div>
        toast warning
    </div>
    <div id="dangerAlert" class="alert alert-danger">
        <div class="alert-close" onclick="closeAlert('danger')">X</div>
        toast danger
    </div>
</div>
<script type="text/javascript">
    function closeAlert(statusText){
        if(statusText=='default'){
            document.getElementById("defaultAlert").style.display = "none";
        }else if(statusText=='info'){
            document.getElementById("infoAlert").style.display = "none";
        }else if(statusText=='primary'){
            document.getElementById("primaryAlert").style.display = "none";
        }else if(statusText=='success'){
            document.getElementById("successAlert").style.display = "none";
        }else if(statusText=='warning'){
            document.getElementById("warningAlert").style.display = "none";
        } else{
            document.getElementById("dangerAlert").style.display = "none";
        }

        
    }
</script>
</xmp>
</div>
<div>
    <iframe id="preview14" style="min-height:300px;"></iframe>
</div>
</section>
