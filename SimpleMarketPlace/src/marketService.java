
import java.sql.SQLException; 
import javax.jws.WebService;
import viewPackage.View_adv;
import viewPackage.BoughtItems;
import viewPackage.SoldItems;

//import java.util.*;

@WebService
public class marketService {
	DatabaseConnection conn=null;
	public marketService(){
		conn = new DatabaseConnection();
	}
	
	public String register(String id,String fname,String lname,String passwd, String email) {
		
		String result="";		
		result = conn.register(id,fname,lname,passwd,email);
		return result;
	}

	public String llogin(String userId){
		String result = conn.llogin(userId);
		return result;
	}
	
	public boolean login(String userid,String passwd){
		boolean result = conn.login(userid,passwd); 	
		return result;
	}
	
	public String getUserDetails(String userid){
		String result = conn.getUserDetails(userid);
		return result;
		
	}
	
	public BoughtItems[] getUserAccount(String userid){
		BoughtItems[] result = conn.getUserAccount(userid);
		return result;
		
	}

	public SoldItems[] getUserSoldItems(String userid){
		SoldItems[] result = conn.getUserSoldItems(userid);
		return result;
		
	}
	
	
	public void postAdv(String itemName,String desc,String sellerInfo,String price,String quty,String userid){
		 conn.postAdv(itemName,desc,sellerInfo,price,quty,userid);
		//return result;
	}
				
	public View_adv[] viewAdv(String userid) {
		View_adv[] list = conn.viewAdv(userid);
		return list;
	}
	
	public void updateSoldItems(String advid,String qty){
		conn.updateSoldItems(advid,qty);
	}
	
	public void updateBoughtItems(String advid,String sellerInfo,String qty){
		conn.updateBoughtItems(advid,sellerInfo,qty);
	}
}
