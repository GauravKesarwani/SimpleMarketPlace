<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sign In</title>
<link rel="stylesheet" href="../resources/css/style.css" type="text/css">
<script type="text/javascript" src="../resources/js/validateContent.js"></script>
</head>
<body>
	<form id="form1" method="post" action="/SimpleMarketPlaceClient/DefaultNamespace/login" onsubmit="return validateFormSignin();">
		<table width="100%">
		<tr >
			<td style="padding-left:150px" align="left" class="fontH">
				<h2><u>Welcome to Simple Market Place !!!</u></h2>
			</td>
		</tr>
		<tr>
			<td style="padding-left:100px" align="left" class="fontB">
				<h3>Sign in</h3>
			</td>
		</tr>
		</table>
		<table width="80%" align="center" class="fontA" cellpadding="4"
			cellspacing="4">
			<tr>
							<td colspan="2" class="fontE">
								<div id="errorMsg">${errorSignup}</div>
							</td>
						</tr>
			<tr>
				<td width="20%">Username:</td>
				<td width="20%"><input type="text" class="SimpleControl"
					name="username" id="username" value="${param.username}" onblur="validateFields(this.id);"></td>
				<td width="40%" class="fontE" id="errusername"></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type="password" class="SimpleControl" name="passwd1"
					id="passwd1" onblur="validateFields(this.id);" value="${param.passwd1}"></td>
				<td width="40%" class="fontE" id="errpasswd1" ></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="SIGN IN" class="buttonStyle"></td>
			</tr>
			<tr>
							<td height="30" colspan="30"></td>
						</tr>
			</table>
			<table cellpadding="5" cellspacing="5" width="58%">
			<tr >
				<td style="padding-left:50px;" class="fontB">New to Simple Market Place?</td>
				<td ><input type="button" class="buttonStyle"
					value="CREATE AN ACCOUNT" onClick="JavaScript:window.location='signup.jsp';"></td>
			</tr>
		</table>
	</form>
</body>
</html>