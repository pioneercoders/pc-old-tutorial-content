<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <title>Insert title here</title>
 <script src="http://code.jquery.com/jquery-latest.min.js"></script>
 <script>
 /*
// When HTML DOM "click" event is invoked on element with ID "somebutton", execute the following function...
               // Execute Ajax GET request on URL of "someservlet" and execute the following function with Ajax response text...
                              // Locate HTML DOM element with ID "somediv" and set its text content with the response text.
                
            
 
 */
 $(document).on("click","#somebutton",function(){//related to button like events 
	 $.get("SomeServlet",function(responseText){//related to get or post method   of corresponding servlet url 
     $("#somediv").text(responseText);//response will stored in div tag response will be getting from someservlet
	 });
	 
 });
 </script>
</head>
<body>
<button id="somebutton">Press Here </button>
<div id="somediv"></div>
</body>
</html>