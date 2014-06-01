<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Advertisement</title>
<link rel="stylesheet" href="../resources/css/style.css" type="text/css">
<script type="text/javascript" src="../resources/js/validateContent.js"></script>

</head>
<body>
	<table width="100%">
		<tr >
			<td style="padding-left:100px" align="left" class="fontB">
				<h2>Your last login was !      <%= session.getAttribute("llogin") %></h2>
			</td>
				
		</tr>
		
	</table>
		
	<a href="postAdd.jsp"><br>Post Advertisements !!!</a>
	<a href="viewAdv.jsp"><br>View Advertisements !!!</a>
	<a href="userAccount.jsp"><br>View Profile !!!</a>

</body>
</html>