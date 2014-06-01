package DefaultNamespace;

public class MarketServiceProxy implements DefaultNamespace.MarketService {
  private String _endpoint = null;
  private DefaultNamespace.MarketService marketService = null;
  
  public MarketServiceProxy() {
    _initMarketServiceProxy();
  }
  
  public MarketServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initMarketServiceProxy();
  }
  
  private void _initMarketServiceProxy() {
    try {
      marketService = (new DefaultNamespace.MarketServiceServiceLocator()).getmarketService();
      if (marketService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)marketService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)marketService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (marketService != null)
      ((javax.xml.rpc.Stub)marketService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public DefaultNamespace.MarketService getMarketService() {
    if (marketService == null)
      _initMarketServiceProxy();
    return marketService;
  }
  
  public java.lang.String register(java.lang.String id, java.lang.String fname, java.lang.String lname, java.lang.String passwd, java.lang.String email) throws java.rmi.RemoteException{
    if (marketService == null)
      _initMarketServiceProxy();
    return marketService.register(id, fname, lname, passwd, email);
  }
  
  public void postAdv(java.lang.String itemName, java.lang.String desc, java.lang.String sellerInfo, java.lang.String price, java.lang.String quty, java.lang.String userid) throws java.rmi.RemoteException{
    if (marketService == null)
      _initMarketServiceProxy();
    marketService.postAdv(itemName, desc, sellerInfo, price, quty, userid);
  }
  
  public java.lang.String llogin(java.lang.String userId) throws java.rmi.RemoteException{
    if (marketService == null)
      _initMarketServiceProxy();
    return marketService.llogin(userId);
  }
  
  public viewPackage.View_adv[] viewAdv(java.lang.String userid) throws java.rmi.RemoteException{
    if (marketService == null)
      _initMarketServiceProxy();
    return marketService.viewAdv(userid);
  }
  
  public void updateBoughtItems(java.lang.String advid, java.lang.String sellerInfo, java.lang.String qty) throws java.rmi.RemoteException{
    if (marketService == null)
      _initMarketServiceProxy();
    marketService.updateBoughtItems(advid, sellerInfo, qty);
  }
  
  public void updateSoldItems(java.lang.String advid, java.lang.String qty) throws java.rmi.RemoteException{
    if (marketService == null)
      _initMarketServiceProxy();
    marketService.updateSoldItems(advid, qty);
  }
  
  public viewPackage.SoldItems[] getUserSoldItems(java.lang.String userid) throws java.rmi.RemoteException{
    if (marketService == null)
      _initMarketServiceProxy();
    return marketService.getUserSoldItems(userid);
  }
  
  public viewPackage.BoughtItems[] getUserAccount(java.lang.String userid) throws java.rmi.RemoteException{
    if (marketService == null)
      _initMarketServiceProxy();
    return marketService.getUserAccount(userid);
  }
  
  public java.lang.String getUserDetails(java.lang.String userid) throws java.rmi.RemoteException{
    if (marketService == null)
      _initMarketServiceProxy();
    return marketService.getUserDetails(userid);
  }
  
  public boolean login(java.lang.String userid, java.lang.String passwd) throws java.rmi.RemoteException{
    if (marketService == null)
      _initMarketServiceProxy();
    return marketService.login(userid, passwd);
  }
  
  
}