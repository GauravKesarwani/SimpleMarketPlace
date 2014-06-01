package viewPackage;

public class View_adv {
	private String advID;
	private String itemName;
	private String itemDesc;
	private String itemPrice;
	private String itemQuantity;
	private String newQuantity;
	private String sellerInfo;
	

	
	public void setAdvID(String advID){
		this.advID = advID;
	}
	
	public String getAdvID(){ return advID;
	}
	
	public void setItemName(String itemName){
		this.itemName = itemName;
	}
	
	public String getItemName(){return itemName;}
	
	public void setItemDesc(String desc){
		this.itemDesc = desc;
	}
	
	public String getItemDesc(){ return itemDesc;}
	
	public void setItemPrice(String itemPrice){
		this.itemPrice = itemPrice;
	}
	
	public String getItemPrice(){ return itemPrice;}
	
	public void setItemQuantity(String itemQuantity)
	{ this.itemQuantity = itemQuantity; }
	
	public String getItemQuantity(){ 
		return itemQuantity;
	}

	public String getNewQuantity() {
		return newQuantity;
	}

	public void setNewQuantity(String newQuantity) {
		this.newQuantity = newQuantity;
	}

	public String getSellerInfo() {
		return sellerInfo;
	}

	public void setSellerInfo(String sellerInfo) {
		this.sellerInfo = sellerInfo;
	}

	
}
