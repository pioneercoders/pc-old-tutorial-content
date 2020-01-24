<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href='http://fonts.googleapis.com/css?family=Oxygen' rel='stylesheet' type='text/css'>
<style>
table, td, th
{
border:1px solid green;
font‐family: 'Oxygen', sans‐serif;
}th
{background‐color:green;
color:Red;
}
body
{
text‐align: center;
}
.container
{
margin‐left: auto;
margin‐right: auto;
width: 40em;
}
</style>



<!--  

<script src="https://code.jquery.com/jquery-1.11.3.min.js"></script>
<script type="text/javascript">
$(document).ready(function() {
	$("#tablediv").hide();
	$("#showTable").click(function(event) {
		$.get('PopulateTableData',function(responseJson) {
			if(responseJson != null) {
				$("#countrytable").find("tr:gt(0)").remove();
				var table1 = $("#countrytable");
				$.each(responseJson, function(index, value) {
					var rowNew = $("<tr><td></td><td></td><td></td><td></td><td></td><td></td></tr>");
					rowNew.children().eq(0).text(value.code);
					rowNew.children().eq(1).text(value.name);
					rowNew.children().eq(2).text(value.continent);
					rowNew.children().eq(3).text(value.region);
					rowNew.children().eq(4).text(value.population);
					rowNew.children().eq(5).text(value.capital);
					rowNew.appendTo(table1);
				});
			}
		});
		$("#tablediv").show();
	});
});
    
   
</script> -->
	
</head>
<body>

<h1>AJAX Retrieve Data from Database in Servlet and JSP using JSONArray</h1>
<input type="button" value="Show Table" id="showTable"/>
<div id="tablediv">
<table cellspacing="0" id="countrytable">
<tr>
<th scope="col">Code</th>
<th scope="col">Name</th>
<th scope="col">Continent</th>
<th scope="col">Region</th>
<th scope="col">Population</th>
<th scope="col">Capital</th>
</tr>
</table>
</div>
<script type="text/javascript" src="https://code.jquery.com/jquery-1.11.3.min.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/ajaxCallUsingJquery.js"></script>
</body>
</html>