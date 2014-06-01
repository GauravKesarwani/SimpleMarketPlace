<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="viewPackage.View_adv"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View Advertisements</title>
<link rel="stylesheet" href="../resources/css/style.css" type="text/css">
<script type="text/javascript" src="../resources/js/validateContent.js"></script>
</head>

<%
String count =(String) session.getAttribute("counter");

%>
<body onload="<%if(!"1".equals(count))%>loadJSP();">

	<form id="viewProfileform" method="post"
		action="/SimpleMarketPlaceClient/DefaultNamespace/viewAdd">


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
					<h3>View Advertisements</h3>
				</td>
			</tr>
		</table>

		<table class="fontA">
			<tr>
				<td style="padding-left: 100px">Session User is:</td>
				<td style="padding-left: 100px"><%=session.getAttribute("loginUser")%></td>
			</tr>
			<tr>
				<td height="20" colspan="20"></td>
			</tr>
			
			<tr>
				<td height="20" colspan="20"></td>
			</tr>

			<tr>
				<td></td>
				<td style="padding-left: 100px">
		</table>

	</form>

	<table width="90%" style="padding-left:100px;" class="fontA" border="1" bgcolor="#F0F0F0" cellpadding="2"
		cellspacing="2">
		<%
			if (null != session.getAttribute("l")) {
				out.print("<tr class=fontB><th>Product id</th><th>Seller Id</th><th>Product Name</th><th>Product Description</th><th>Product Price</th><th>Available Quantity</th><th>Enter Quantity</th></tr>");
				View_adv[] l = (View_adv[]) session.getAttribute("l");

				for (int i = 0; i < l.length; i++) {
					if(null==l[i].getNewQuantity()){l[i].setNewQuantity("1");}
					out.print("<form id=buyProduct"+i+" action=\"/SimpleMarketPlaceClient/DefaultNamespace/buyProd\"><tr><td align=center>"
							+ l[i].getAdvID()
							+ "</td><td align=center>"
							+ l[i].getSellerInfo()
							+ "</td><td align=center>"
							+ l[i].getItemName()
							+ "</td><td align=center>"
							+ l[i].getItemDesc()
							+ "</td><td align=center>"
							+ l[i].getItemPrice()
							+ "</td><td id=availqty"+i+" align=center>"
							+ l[i].getItemQuantity()
							+ "</td><td align=center><input type=text id=qty"+i+" name=\"qty\" onblur=\"autoFill(this.id,"+i+");\" class=SimpleControl    onkeypress=\"return checkNumeric(event, this);chkSpace(event, this);\" maxlength=3 SIZE=4 value="+l[i].getNewQuantity()+"></td><td align=\"center\"  width=\"50px\"><input class=\"buttonStyle\" type=\"submit\" value =\"Add To Cart\"></input><input type=\"hidden\" name=\"action\" value=\"BUYPRODUCT\">");
			out.print("<input type=hidden name=htmlFormName value=myForm"+i+"></td></tr></form>");
				}
			}
		%>

	</table>
	<br />
	<br>

	<a style="padding-left: 220px;"
		href="/SimpleMarketPlaceClient/JSP/signin.jsp"><b>Home</b></a>
	<a style="padding-left: 20px;"
		href="/SimpleMarketPlaceClient/JSP/signout.jsp"><b>Sign out</b></a>
</body>

</html>