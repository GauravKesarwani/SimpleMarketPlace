/**
 * MarketService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package DefaultNamespace;

public interface MarketService extends java.rmi.Remote {
    public java.lang.String register(java.lang.String id, java.lang.String fname, java.lang.String lname, java.lang.String passwd, java.lang.String email) throws java.rmi.RemoteException;
    public void postAdv(java.lang.String itemName, java.lang.String desc, java.lang.String sellerInfo, java.lang.String price, java.lang.String quty, java.lang.String userid) throws java.rmi.RemoteException;
    public java.lang.String llogin(java.lang.String userId) throws java.rmi.RemoteException;
    public viewPackage.View_adv[] viewAdv(java.lang.String userid) throws java.rmi.RemoteException;
    public void updateBoughtItems(java.lang.String advid, java.lang.String sellerInfo, java.lang.String qty) throws java.rmi.RemoteException;
    public void updateSoldItems(java.lang.String advid, java.lang.String qty) throws java.rmi.RemoteException;
    public viewPackage.SoldItems[] getUserSoldItems(java.lang.String userid) throws java.rmi.RemoteException;
    public viewPackage.BoughtItems[] getUserAccount(java.lang.String userid) throws java.rmi.RemoteException;
    public java.lang.String getUserDetails(java.lang.String userid) throws java.rmi.RemoteException;
    public boolean login(java.lang.String userid, java.lang.String passwd) throws java.rmi.RemoteException;
}
