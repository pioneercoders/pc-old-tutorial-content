<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<!--  <script type="text/javascript">
 
    var xmlhttp = new XMLHttpRequest();
 
    function UpdateData() {
        xmlhttp.onreadystatechange=useResponse;
        xmlhttp.open("GET", "DataServlet", true);
        xmlhttp.send(null);
    }
 
    function useResponse() {
        if (xmlhttp.readyState==4 && xmlhttp.status==200) {
            document.getElementById("dataDiv").innerHTML=xmlhttp.responseText;
        } else {
            alert("Error in AJAX");
        }
    }
 
</script>-->
</head>
 
<body>
    <div id="buttonDiv">
        <input type="button" onClick="UpdateData()" value="UpdateDataBelow">
    </div>
 
    <br><br>
 
    <div id="dataDiv">
        <h3> Data to be Changed.</h3>
    </div>
 
<script type="text/javascript" src="<%=request.getContextPath()%>/js/ajaxCallUsingJs.js"></script>
</body>
</html>