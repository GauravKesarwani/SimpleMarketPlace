<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register</title>
<link rel="stylesheet" href="../resources/css/style.css" type="text/css">
<script type="text/javascript" src="../resources/js/validateContent.js"></script>
</head>
<body>
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
				<h3>Sign up</h3>
			</td>
		</tr>
		<tr>
			<td>
				<form method="post" id="frmSignup" name="myForm" onsubmit="return validatefrmSignup();"
					action="/SimpleMarketPlaceClient/DefaultNamespace/Register">
					<table align="center" width="80%" cellpadding="2" cellspacing="2"
						class="fontA">
						<tr>
							<td colspan="2" class="fontE">
								<div id="errorMsg">${errorMessage}</div>
							</td>
						</tr>
						<tr>
							<td width="30%">First Name:</td>
							<td width="20%"><input type="text" class="SimpleControl"
								value="${param.firstname}" name="firstname" id="firstname"
								onblur="validateFields(this.id);"></td>
							<td width="40%" class="fontE" id="errfirstname"></td>
						</tr>
						<tr>
							<td>Last Name:</td>
							<td><input type="text" class="SimpleControl" name="lastname"
								value="${param.lastname}" id="lastname"
								onblur="validateFields(this.id);"></td>
							<td class="fontE" id="errlastname"></td>
						</tr>
						<tr>
							<td>Choose your Username:</td>
							<td><input type="text" class="SimpleControl" name="userid"
								value="${param.userid}" id="userid"
								onblur="validateFields(this.id);"></td>
							<td class="fontE" id="erruserid"></td>
						</tr>
						<tr>
							<td>Create a password:</td>
							<td><input type="password" class="SimpleControl"
								name="passwd" value="${param.passwd}" id="passwd"
								onblur="validateFields(this.id);"></td>
							<td class="fontE" id="errpasswd"></td>
						</tr>
						<tr>
							<td>Confirm your Password:</td>
							<td><input type="password" class="SimpleControl"
								name="confirmPasswd" value="${param.confirmPasswd}"
								id="confirmPasswd" onblur="validateFields(this.id);"></td>
							<td class="fontE" id="errconfirmPasswd"></td>
						</tr>
						<tr>
							<td>Email:</td>
							<td><input type="text" name="email" class="SimpleControl"
								id="email" value="${param.email}"
								onblur="validateFields(this.id);"></td>
							<td class="fontE" id="erremail"></td>
						</tr>
						<tr>
							<td height="20" colspan="20"></td>
						</tr>
						<tr>
							<td></td>
							<td><input id="btnRegister" type=submit value=REGISTER
								class="buttonStyle" onclick="validateForm()" /></td>
						
							<td ><input type="button" class="buttonStyle"
					value="SIGN IN" onClick="JavaScript:window.location='signin.jsp';"></td>

						</tr>
					</table>
				</form>
			</td>
		</tr>
	</table>
</body>
</html>
