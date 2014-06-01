<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="viewPackage.BoughtItems"%>
    <%@ page import="viewPackage.SoldItems"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customer Account</title>
<link rel="stylesheet" href="../resources/css/style.css" type="text/css">
<script type="text/javascript" src="../resources/js/validateContent.js"></script>

</head>
<body>
			<% 	String user = (String) session.getAttribute("loginUser"); 
				out.println("<h3 class=fontB>Current Logged in User : " + user+"</h3>");
				out.println("<h3 class=fontB>Transaction Details </h3>"); %>
<h3 style="padding-left:50px;" class="fontB">Bought Items</h3>

<table width="90%" style="padding-left:100px;" class="fontA" border="1" bgcolor="#F0F0F0" cellpadding="2"
		cellspacing="2">
		<%
			if (null != session.getAttribute("userA")) {
				out.println("<tr></tr><tr></tr>");
				out.print("<tr class=fontB><th>Product Name</th><th>Seller Id</th><th>Seller Info</th><th>Quantity Bought</th></tr>");
				BoughtItems[] l = (BoughtItems[]) session.getAttribute("userA");
				
				
				for (int i = 0; i < l.length; i++) {
				
				out.println("<tr><td align=center>"
							+ l[i].getItemName()
							+ "</td><td align=center>"
							+ l[i].getSellerId()
							+ "</td><td align=center>"
							+ l[i].getSellerInfo()
							+ "</td><td align=center>"
							+ l[i].getBoughtQuan()
							+ "</td></tr>");							
				}
			}
		%>

	</table>
	
	<h3 style="padding-left:50px;" class="fontB">Sold Items</h3>
	
	<table width="90%" style="padding-left:100px;" class="fontA" border="1" bgcolor="#F0F0F0" cellpadding="2"
		cellspacing="2">
		<%
			if (null != session.getAttribute("soldA")) {
				out.println("<tr></tr><tr></tr>");
				out.print("<tr class=fontB><th>Item Name</th><th>Available Quantity</th><th>Sold Quantity</th><th>SellerInfo</th></tr>");
				SoldItems[] l = (SoldItems[]) session.getAttribute("soldA");
				
				
				for (int i = 0; i < l.length; i++) {
				
				out.println("<tr><td align=center>"
							+ l[i].getItemName()
							+ "</td><td align=center>"
							+ l[i].getAvailquan()
							+ "</td><td align=center>"
							+ l[i].getSoldQuan()
							+ "</td><td align=center>"
							+ l[i].getSellerInfo()
							+ "</td></tr>");							
				}
			}
		%>

	</table>

</body>
</html>