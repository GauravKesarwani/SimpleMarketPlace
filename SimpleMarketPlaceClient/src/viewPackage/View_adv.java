/**
 * View_adv.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package viewPackage;

public class View_adv  implements java.io.Serializable {
    private java.lang.String advID;

    private java.lang.String itemDesc;

    private java.lang.String itemName;

    private java.lang.String itemPrice;

    private java.lang.String itemQuantity;

    private java.lang.String newQuantity;

    private java.lang.String sellerInfo;

    public View_adv() {
    }

    public View_adv(
           java.lang.String advID,
           java.lang.String itemDesc,
           java.lang.String itemName,
           java.lang.String itemPrice,
           java.lang.String itemQuantity,
           java.lang.String newQuantity,
           java.lang.String sellerInfo) {
           this.advID = advID;
           this.itemDesc = itemDesc;
           this.itemName = itemName;
           this.itemPrice = itemPrice;
           this.itemQuantity = itemQuantity;
           this.newQuantity = newQuantity;
           this.sellerInfo = sellerInfo;
    }


    /**
     * Gets the advID value for this View_adv.
     * 
     * @return advID
     */
    public java.lang.String getAdvID() {
        return advID;
    }


    /**
     * Sets the advID value for this View_adv.
     * 
     * @param advID
     */
    public void setAdvID(java.lang.String advID) {
        this.advID = advID;
    }


    /**
     * Gets the itemDesc value for this View_adv.
     * 
     * @return itemDesc
     */
    public java.lang.String getItemDesc() {
        return itemDesc;
    }


    /**
     * Sets the itemDesc value for this View_adv.
     * 
     * @param itemDesc
     */
    public void setItemDesc(java.lang.String itemDesc) {
        this.itemDesc = itemDesc;
    }


    /**
     * Gets the itemName value for this View_adv.
     * 
     * @return itemName
     */
    public java.lang.String getItemName() {
        return itemName;
    }


    /**
     * Sets the itemName value for this View_adv.
     * 
     * @param itemName
     */
    public void setItemName(java.lang.String itemName) {
        this.itemName = itemName;
    }


    /**
     * Gets the itemPrice value for this View_adv.
     * 
     * @return itemPrice
     */
    public java.lang.String getItemPrice() {
        return itemPrice;
    }


    /**
     * Sets the itemPrice value for this View_adv.
     * 
     * @param itemPrice
     */
    public void setItemPrice(java.lang.String itemPrice) {
        this.itemPrice = itemPrice;
    }


    /**
     * Gets the itemQuantity value for this View_adv.
     * 
     * @return itemQuantity
     */
    public java.lang.String getItemQuantity() {
        return itemQuantity;
    }


    /**
     * Sets the itemQuantity value for this View_adv.
     * 
     * @param itemQuantity
     */
    public void setItemQuantity(java.lang.String itemQuantity) {
        this.itemQuantity = itemQuantity;
    }


    /**
     * Gets the newQuantity value for this View_adv.
     * 
     * @return newQuantity
     */
    public java.lang.String getNewQuantity() {
        return newQuantity;
    }


    /**
     * Sets the newQuantity value for this View_adv.
     * 
     * @param newQuantity
     */
    public void setNewQuantity(java.lang.String newQuantity) {
        this.newQuantity = newQuantity;
    }


    /**
     * Gets the sellerInfo value for this View_adv.
     * 
     * @return sellerInfo
     */
    public java.lang.String getSellerInfo() {
        return sellerInfo;
    }


    /**
     * Sets the sellerInfo value for this View_adv.
     * 
     * @param sellerInfo
     */
    public void setSellerInfo(java.lang.String sellerInfo) {
        this.sellerInfo = sellerInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof View_adv)) return false;
        View_adv other = (View_adv) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.advID==null && other.getAdvID()==null) || 
             (this.advID!=null &&
              this.advID.equals(other.getAdvID()))) &&
            ((this.itemDesc==null && other.getItemDesc()==null) || 
             (this.itemDesc!=null &&
              this.itemDesc.equals(other.getItemDesc()))) &&
            ((this.itemName==null && other.getItemName()==null) || 
             (this.itemName!=null &&
              this.itemName.equals(other.getItemName()))) &&
            ((this.itemPrice==null && other.getItemPrice()==null) || 
             (this.itemPrice!=null &&
              this.itemPrice.equals(other.getItemPrice()))) &&
            ((this.itemQuantity==null && other.getItemQuantity()==null) || 
             (this.itemQuantity!=null &&
              this.itemQuantity.equals(other.getItemQuantity()))) &&
            ((this.newQuantity==null && other.getNewQuantity()==null) || 
             (this.newQuantity!=null &&
              this.newQuantity.equals(other.getNewQuantity()))) &&
            ((this.sellerInfo==null && other.getSellerInfo()==null) || 
             (this.sellerInfo!=null &&
              this.sellerInfo.equals(other.getSellerInfo())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getAdvID() != null) {
            _hashCode += getAdvID().hashCode();
        }
        if (getItemDesc() != null) {
            _hashCode += getItemDesc().hashCode();
        }
        if (getItemName() != null) {
            _hashCode += getItemName().hashCode();
        }
        if (getItemPrice() != null) {
            _hashCode += getItemPrice().hashCode();
        }
        if (getItemQuantity() != null) {
            _hashCode += getItemQuantity().hashCode();
        }
        if (getNewQuantity() != null) {
            _hashCode += getNewQuantity().hashCode();
        }
        if (getSellerInfo() != null) {
            _hashCode += getSellerInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(View_adv.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://viewPackage", "View_adv"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("advID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://viewPackage", "advID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://viewPackage", "itemDesc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://viewPackage", "itemName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://viewPackage", "itemPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemQuantity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://viewPackage", "itemQuantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newQuantity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://viewPackage", "newQuantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sellerInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://viewPackage", "sellerInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
