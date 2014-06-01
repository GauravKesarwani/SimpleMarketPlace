<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ page import="viewPackage.View_adv" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Buy Product</title>
<link rel="stylesheet" href="../resources/css/style.css" type="text/css">
<script type="text/javascript" src="../resources/js/validateContent.js"></script>
</head>
<body>




	<form id="buyProduct" method="post" action="buyProd">


		<table width="100%" class="fontB">
			<tr>
				<td style="padding-left: 150px" align="left" class="fontH">
					<h2>
						<u>Simple Market Place</u>
					</h2>
				</td>
			</tr>
			
			<tr>
				<td style="padding-left: 100px" align="left" class="fontB">
					<h3>Shopping Cart</h3>
				</td>
			</tr>
		</table>
		<table class="fontA"  width="80%">
		
			<tr>
				<td class="fontB" style="padding-left: 100px;" width="20%">Seller-name</td>
				<td class="fontB" width="10%">Product</td>
				<td class="fontB" width="10%">Product-Desc</td>
				<td class="fontB" width="10%">Location</td>
				<td class="fontB" width="10%">Price</td>
				<td class="fontB" width="10%">Quantity</td>
				
			</tr>
	<tr><td style="padding-left: 100px;" colspan="6"><hr></td></tr>
			<%
				
				int i=0;
				ArrayList<View_adv> l = (ArrayList<View_adv>)session.getAttribute("List");
				if(l!=null){
				for(i=0;i<l.size();i++){
					View_adv val=l.get(i);
					out.print("<tr><td style=\"padding-left:100px;\" width=\"10%\"></td><td width=\"10%\">"+val.getSellerInfo()+"</td>");
					out.print("<td width=\"10%\">"+val.getItemName()+"</td><td>"+val.getItemDesc()+"</td>");
					out.print("<td width=\"10%\">"+val.getItemPrice()+"</td><td width=\"10%\">"+val.getItemPrice()+"</td>");	 
					out.print("<td width=\"10%\">"+val.getNewQuantity()+"</td><td><input class=buttonStyle type=submit value=Delete><input type=hidden name=action value=DELETE><input type=hidden name=delindex value="+i+"></td></tr>");
						
					}
				} 	%>
										
		</table>
		<br>

</form> 

		<table class="fontA" cellpadding="4" cellspacing="4" width="100%">
			
			


		
		
		
			<tr>
				<td height="20" colspan="20"></td>
			</tr>
			<tr>
			<td style="padding-left: 100px;"><form action="buyProd" >
			
			<input type="hidden" name="action" value="SHOPPING"><input class="buttonStyle"
					type="submit" value="SHOP MORE" onclick=""></form></td>
				
				<td><form action="buyProd">
				
				<input type="hidden" name="action" value="ORDER"><input class="buttonStyle"
					type="submit" value="CHECK OUT"></form></td>
			</tr>
		</table>

		<a style="padding-left: 220px;" href="/SimpleMarketPlaceClient/JSP/signin.jsp"><b>Home</b></a> <a
			style="padding-left: 20px;" href="/SimpleMarketPlaceClient/JSP/signout.jsp"><b>Sign out</b></a>

	
</body>
</html>