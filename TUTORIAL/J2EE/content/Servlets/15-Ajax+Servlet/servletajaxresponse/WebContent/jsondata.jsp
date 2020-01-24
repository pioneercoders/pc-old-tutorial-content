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
 *  // When HTML DOM "click" event is invoked on element with ID "somebutton", execute the following function...
    // Execute Ajax GET request on URL of "someservlet" and execute the following function with Ajax response JSON...
    // Create HTML <ul> element and append it to HTML DOM element with ID "somediv".
      // Iterate over the JSON array.
              // Create HTML <li> element, set its text content with currently iterated item and append it to the <ul>.
 */


$(document).on("click","#jsondatabutton",function(){//related to events 
$.get("JsonDataServlet",function(responseJson){//related to which response we are getting
	 var $ul = $("<ul>").appendTo($("#jsondatadiv"));//we are stored response in ul(unordered list) and appending to jsondatadiv
	$.each(responseJson, function(index,item){//iterating json data array based on index and value 
		//$("<li>").text(item).appendTo($("#jsondatadiv"));//appending data to li
		$("<li>").text(item).appendTo($ul);
		
	});
	
});
});



/*
 * $.ajax({
	  url: url,
	  data: data,
	  success: success,
	  dataType: dataType
	});
 */
</script>
</head>
<body>
<button id="jsondatabutton">press to see json data</button>
<div id="jsondatadiv"></div>

</body>
</html>