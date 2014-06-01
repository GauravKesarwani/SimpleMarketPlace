<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Post Advertisements</title>
<link rel="stylesheet" href="../resources/css/style.css" type="text/css">
<script type="text/javascript" src="../resources/js/validateContent.js"></script>
</head>
<body>


<form id="postform" method="post" action="/SimpleMarketPlaceClient/DefaultNamespace/postAdd" onsubmit="return validatepostform();">

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
					<h3>Post Advertisements</h3>
				</td>
			</tr>
			</table><table class="fontA">
			<tr>
				<td style="padding-left: 100px" >Session User is:</td>
				<td style="padding-left: 50px"><%=session.getAttribute("loginUser")%></td>
			</tr>
			
			<tr>
				<td style="padding-left: 100px" >Item Name:</td>
				<td style="padding-left: 50px"><input type="text" id="itemName" name="itemName" class="SimpleControl" onblur="validateFields(this.id);"></td>
					<td width="40%" class="fontE" id="erritemName"></td>
			</tr>
			<tr>
				<td style="padding-left: 100px" >Description:</td>
				<td style="padding-left: 50px"><input type="text" name="desc" id="desc" class="SimpleControl" onblur="validateFields(this.id);"></td>
					<td width="40%" class="fontE" id="errdesc"></td>
			</tr>
			<tr>
				<td style="padding-left: 100px" >Seller Info:</td>
				<td style="padding-left: 50px"><input type="text" id="sellerInfo" name="sellerInfo" class="SimpleControl" onblur="validateFields(this.id);" onkeypress="return checkAlphaNumeric(event, this);"></td>
					<td width="40%" class="fontE" id="errsellerInfo"></td>
			</tr>
			<tr>
				<td style="padding-left: 100px" >Price:</td>
				<td style="padding-left: 50px"><input type="text" id="price" name="price" class="SimpleControl" onblur="validateFields(this.id);" onkeypress="return checkNumericDecimal(event, this);chkSpace(event, this);"></td>
					<td width="40%" class="fontE" id="errprice"></td>
			</tr>
			<tr>
				<td style="padding-left: 100px" >Quantity:</td>
				<td style="padding-left: 50px"><input type="text" id="quty" name="quty" maxlength="3" class="SimpleControl" onblur="validateFields(this.id);" onkeypress="return checkNumeric(event, this);chkSpace(event, this);"></td>
					<td width="40%" class="fontE" id="errquty"></td>
			</tr>
				<tr>
							<td height="20" colspan="20"></td>
						</tr>
			<tr><td></td>
				<td style="padding-left: 50px"><input class="buttonStyle" type="submit"
					value="POST ADD"></td>
			</tr>
		</table>

		<br> <br>


	</form>
	<a style="padding-left:220px;" href="signin.jsp"><b>Home</b></a>
	<a style="padding-left:20px;" href="signout.jsp"><b>Sign out</b></a>

</body>
</html>