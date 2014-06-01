
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.text.DateFormat;
import java.text.SimpleDateFormat;





//import java.util.*;
import viewPackage.View_adv;
import viewPackage.BoughtItems;
import viewPackage.SoldItems;

import javax.jws.WebService;

@WebService

public class DatabaseConnection {

	Connection con = null;
//	Statement stmt=null; 
	View_adv list[];
	
	DatabaseConnection(){
		try{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			con=DriverManager.getConnection("jdbc:mysql://localhost/marketplace","usedid","passwd");
			
		if(!con.isClosed())
			System.out.println("Successfully connected to "+ "MySQL server using TCP/IP..."); 	
					
			
		}catch(Exception e) {}		
	}
	
	public String register(String userid,String fname,String lname,String email, String passwd){
		String result ="false";
		int rowcount; 		
		try{ 		
			//Validate that user does not already exist in the database.
			
			String validatequery = "Select * from customer where userid ='"+userid+"';";
			
			ResultSet rs = con.createStatement().executeQuery(validatequery);
		//	boolean flag = rs.next(); 
						
		//	System.out.println("Flag "+ flag);
			
			if (! rs.next()){
			String query = "Insert into customer (userid,fname,lname,email,passwd)" +
					"values ('"+userid+"','"+fname+"','"+lname+"','"+email+"','"+passwd+"')";
				rowcount=con.createStatement().executeUpdate(query);
				if(rowcount > 0){
				result="true";
				System.out.println("Registration Successful"); }
				else{
					System.out.println("Registration Unsuccessful..!! Data could not be inserted");
				}
			}
				else {
					System.out.println("User id already exists!!"); } 	
			rs.close();
					
					 }catch(SQLException e){
			e.printStackTrace();
		}
	
	return result;
	}
	
	public String llogin(String userId)
	{
		String lastl="";
	 try {
		String lloginQuery = "Select llogin from lastlogin where userid = '"+userId+"';";
		ResultSet rs1 = con.createStatement().executeQuery(lloginQuery);
		while(rs1.next()){
			lastl = rs1.getString("llogin");
		} 
		 rs1.close();
	 }catch(SQLException e)	{ e.printStackTrace(); }
	
	 return lastl;
	}
	
	public boolean login(String userId,String passwd){
		boolean flag=false;
		try{
			String loginQuery = "Select passwd from customer where userid ='"+userId+"';";
			
			ResultSet rs2 = con.createStatement().executeQuery(loginQuery);
			if (rs2!= null){
				while (rs2.next()) {
				if(passwd.equals(rs2.getString("passwd"))){
					flag = true; 
					DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
					Calendar cal = Calendar.getInstance();
		//			System.out.println(dateFormat.format(cal.getTime()));
					
					String curdate = (dateFormat.format(cal.getTime())).toString();
					
					String lloginquery = "Update lastlogin SET llogin ='"+curdate+"'where userid ='"+userId+"';";
					int rowc = con.createStatement().executeUpdate(lloginquery);
					if (rowc == 0){
						String lloginq = "Insert into lastlogin (userid,llogin)" +
												"values ('"+userId+"','"+curdate+"')";
						con.createStatement().executeUpdate(lloginq); 
					}
				//	System.out.println("Insert Sucessful for llogin"+ rowc); 					
				 } 				
				}	
			}
			rs2.close();
		}catch(SQLException e){
		e.printStackTrace();
		}
		return flag;
	 }
	
	public String getUserDetails(String userid)
	{	
		String result="";
		try{
		String getUserDetails = "Select fname,lname from customer where userid='"+userid+"';";
		ResultSet rs3 = con.createStatement().executeQuery(getUserDetails);
		if(rs3.next()){
			result = rs3.getString("fname") +" " +rs3.getString("lname"); }
		rs3.close();
		}catch(Exception e){}
		
		return result;
	}
	
	public BoughtItems[] getUserAccount(String userid){
		String result="";
		int c=0,i=0;
		BoughtItems list1[]=null;
		try{
			
			String count1 = "Select count(*) from buyer where userid = '"+userid+"';";
			ResultSet count_rs = con.createStatement().executeQuery(count1);	
			
			String useraccQ = 
					"select a.itemname,a.quantity,b.quantity,a.userid,a.sellerinfo"+
					" from marketplace.advertisements a,marketplace.customer c,marketplace.buyer b"+
					" where a. ADV_ID=b.adv_id and b.userid= '"+userid+"'" + " and c.userid=b.userid;";
			
			ResultSet user_ac = con.createStatement().executeQuery(useraccQ);
			
			while(count_rs.next()){
				c = Integer.parseInt(count_rs.getString(1));
			}
			
			System.out.println("Value of C"+ c);
			list1 = new BoughtItems[c];			
			while (user_ac.next()){
				list1[i] = new BoughtItems();
				list1[i].setItemName(user_ac.getString(1));
				list1[i].setSellerId(user_ac.getString(4));
				list1[i].setSellerInfo(user_ac.getString(5));
				list1[i].setBoughtQuan(user_ac.getString(3));
				i++;
				
			}
			
			user_ac.close();
			count_rs.close();
		}catch(Exception e){ e.printStackTrace(); }
		return(list1);
	}
	
	public SoldItems[] getUserSoldItems(String userid)
	
	{
		int c=0,i=0;
		SoldItems[] list1=null;
		try{
			
		System.out.println(" Before error");
		String soldc= "Select count(*) from marketplace.advertisements a,marketplace.customer u,marketplace.buyer b "+
		 "where a.adv_id in(select c.adv_id from marketplace.advertisements c where  c.userid = '"+userid+"')"+
		 " and a.adv_id=b.adv_id and u.userid= a.userid;";
		ResultSet rs_soldc = con.createStatement().executeQuery(soldc);
		
		while(rs_soldc.next()){
			
			c = Integer.parseInt(rs_soldc.getString(1));
		}
		
		
		
		String usersoldQ = 
				"select a.itemname,a.quantity,b.quantity,a.userid, a.sellerinfo "+
				 "from marketplace.advertisements a,marketplace.customer u,marketplace.buyer b "+
				 "where a.adv_id in(select c.adv_id from marketplace.advertisements c where  c.userid = '"+userid+"')"+
				 " and a.adv_id=b.adv_id and u.userid= a.userid;";
		
		ResultSet usersold_rs= con.createStatement().executeQuery(usersoldQ);
		
		list1 = new SoldItems[c];			
		while (usersold_rs.next()){
			list1[i] = new SoldItems();
			list1[i].setItemName(usersold_rs.getString(1));
			list1[i].setAvailquan(usersold_rs.getString(2));
			list1[i].setSoldQuan(usersold_rs.getString(3));
			list1[i].setUserid(usersold_rs.getString(4));
			list1[i].setSellerInfo(usersold_rs.getString(5));
			i++;
			
		}
		
		usersold_rs.close();
		rs_soldc.close();
		}catch(SQLException e){e.printStackTrace(); }
		return(list1);
	}
	public void postAdv(String itemName, String desc,String sellerInfo,String price,String Qty,String userid){
		try{
	    String advQ = "Select ADV_ID from advertisements";
	    String advId="";
	    ResultSet rs4 = con.createStatement().executeQuery(advQ);
	    Integer advid = 0;
	    
	   // System.out.println(r.last);
	    if(rs4.last())
	    	{
	    	 advId = rs4.getString("ADV_ID");
	    	 advid = Integer.parseInt(advId);
	    	 advid+=1;
	    	}
	    else
	    	{
	    	   advid = 1;
	    	}
	  //  Integer advid = Integer.parseInt(advId);
	   
	    System.out.println(""+advid);
	    System.out.println(""+userid);
	    
		String postQuery = "Insert into advertisements (ADV_ID,ITEMNAME,ITEMDESCRIPTION,SELLERINFO,ITEMPRICE,QUANTITY,USERID)"
				+ "VALUES('"+advid+"','"+itemName+"','"+desc+"','"+sellerInfo+"','"+price+"','"+Qty+"','"+ userid+"');";
		int updc= con.createStatement().executeUpdate(postQuery);
		}catch(SQLException e){ e.printStackTrace();}
	}
	
	public void updateSoldItems(String advid,String qty){
		try{
		int availqty=0;
		ResultSet get_Quan= con.createStatement().executeQuery("Select Quantity from advertisements where ADV_ID ='"+advid+"';");
		while(get_Quan.next()){
			availqty = Integer.parseInt(get_Quan.getString(1));
		}		 
		
		int rem_qty = availqty - Integer.parseInt(qty);
		con.createStatement().executeUpdate("Update advertisements SET QUANTITY ='"+rem_qty+"'where ADV_ID ='"+advid+"';");
		}catch(SQLException e){ e.printStackTrace();}
	}
	
	public void updateBoughtItems(String advid,String sellerInfo,String quantity){
		try{
		con.createStatement().executeUpdate("Insert into buyer (adv_id,userid,quantity)" +
		" values ('"+advid+"','"+sellerInfo+"','"+quantity+"');");
		}catch(SQLException e){ e.printStackTrace();}
	}
	
	public View_adv[] viewAdv(String userid) {
		try{
		int count = 0;	
	//	System.out.println("User is passed is "+ userid);
	
		String viewq = "Select count(*) from advertisements where userid <> '"+userid+"';";
		ResultSet count_rs = con.createStatement().executeQuery(viewq);	
				
		while(count_rs.next()){
			count = Integer.parseInt(count_rs.getString(1));
		} 	
		
		list = new View_adv[count];	
		ResultSet adv_rs= con.createStatement().executeQuery("Select * from advertisements where userid <> '"+userid+"';");
	//	ResultSet adv_rs= con.createStatement().executeQuery(viewq);
		
		int i=0;
		while(adv_rs.next())
		{
	
			list[i] = new View_adv();
			list[i].setAdvID(adv_rs.getString(1));
			list[i].setItemName(adv_rs.getString(2));
			list[i].setItemDesc(adv_rs.getString(3));
			list[i].setItemPrice(adv_rs.getString(5));
			list[i].setItemQuantity(adv_rs.getString(6));
			list[i].setSellerInfo(adv_rs.getString(7));
	//		hm.put(i, list[i]);
			i++;
		}
	//	System.out.println(" "+ list);
		count_rs.close();
		adv_rs.close();
		}catch(Exception e){e.printStackTrace();}
		return(list);
}
}
