/**
 * 
 */
 var xmlhttp = new XMLHttpRequest();
 
    function UpdateData() {
        xmlhttp.onreadystatechange=useResponse;
        xmlhttp.open("GET", "DataServlet", true);
        xmlhttp.send(null);
    }
 
    function useResponse() {
        if (xmlhttp.readyState==2 && xmlhttp.status==200) {
            document.getElementById("dataDiv").innerHTML=xmlhttp.responseText;
        } else {
            alert("Error in AJAX");
        }
    }
