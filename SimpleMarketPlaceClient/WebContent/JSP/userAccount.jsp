<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View Profile</title>
<link rel="stylesheet" href="../resources/css/style.css" type="text/css">
<script type="text/javascript" src="../resources/js/validateContent.js"></script>
</head>
<body>

	<form id="viewProfileform" method="post" action="/SimpleMarketPlaceClient/DefaultNamespace/viewUserDetails">
		

		<table width="100%">
			<tr>
				<td style="padding-left: 150px" align="left" class="fontH">
					<h2>
						<u>Simple Market Place</u>
					</h2>
				</td>
			</tr>
			<tr>
				<td style="padding-left: 100px" align="left" class="fontB">
					<h3>View Account</h3>
				</td>
			</tr>
			</table>
			<table class="fontA"> 		
				<tr>
						<td height="20" colspan="20"></td>
				</tr>
			<tr><td></td>
				<td style="padding-left: 100px"><input class="buttonStyle" type="submit"
					value="VIEW ACCOUNT"></td>
			</tr>
		</table>

		<br> <br>


	</form>
	<a style="padding-left:220px;" href="signin.jsp"><b>Home</b></a>
	<a style="padding-left:20px;" href="signout.jsp"><b>Sign out</b></a>
</body>
</html>