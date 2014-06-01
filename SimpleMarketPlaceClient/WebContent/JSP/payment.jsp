<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Payment</title>
<link rel="stylesheet" href="../resources/css/style.css" type="text/css">
<script type="text/javascript" src="../resources/js/validateContent.js"></script>
</head>
<body>

	<form id="payment" method="post" action="payment" onsubmit="return validatepayment();">
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
					<h3>Payment</h3>
				</td>
			</tr>
		</table>
		<table class="fontA" cellpadding="4" cellspacing="4" width="100%">
			
			<tr>
				<td height="20" colspan="20"></td>
			</tr>
			
			<tr>
				
				<td style="padding-left: 100px">Payment Amount:</td>
				<td style="padding-left: 30px"><b>$<%=session.getAttribute("amount")%></b>
				</td>

			</tr>
			<tr>
				
				<td style="padding-left: 100px">Enter Full Name:</td>
				<td style="padding-left: 30px"><input type="text"  class="SimpleControl" 
				name="fname" id="fname" onblur="validateFields(this.id);"/></td>
				<td width="40%" class="fontE" id="errfname"></td>

			</tr>
			<tr>
			
				<td style="padding-left: 100px">Enter credit card Number:</td>
				<td style="padding-left: 30px"><input  class="SimpleControl"  maxlength="16"
				type="text" name="ccard" id="ccard" onblur="validateFields(this.id);" onkeypress="return checkNumeric(event, this);chkSpace(event, this);"/>
				<td width="40%" class="fontE" id="errccard"></td>
				</td>

			</tr>
			<tr>
				<td height="20" colspan="20"></td>
			</tr>


			<tr>
				<td></td>


				<td style="padding-left: 30px"><input class="buttonStyle"
					type="submit" value="  BUY  "></td>
			</tr>
		</table>


	

		
	</form>

</body>
</html>