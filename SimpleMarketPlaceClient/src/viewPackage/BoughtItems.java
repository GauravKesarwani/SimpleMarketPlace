/**
 * BoughtItems.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package viewPackage;

public class BoughtItems  implements java.io.Serializable {
    private java.lang.String boughtQuan;

    private java.lang.String itemName;

    private java.lang.String sellerId;

    private java.lang.String sellerInfo;

    public BoughtItems() {
    }

    public BoughtItems(
           java.lang.String boughtQuan,
           java.lang.String itemName,
           java.lang.String sellerId,
           java.lang.String sellerInfo) {
           this.boughtQuan = boughtQuan;
           this.itemName = itemName;
           this.sellerId = sellerId;
           this.sellerInfo = sellerInfo;
    }


    /**
     * Gets the boughtQuan value for this BoughtItems.
     * 
     * @return boughtQuan
     */
    public java.lang.String getBoughtQuan() {
        return boughtQuan;
    }


    /**
     * Sets the boughtQuan value for this BoughtItems.
     * 
     * @param boughtQuan
     */
    public void setBoughtQuan(java.lang.String boughtQuan) {
        this.boughtQuan = boughtQuan;
    }


    /**
     * Gets the itemName value for this BoughtItems.
     * 
     * @return itemName
     */
    public java.lang.String getItemName() {
        return itemName;
    }


    /**
     * Sets the itemName value for this BoughtItems.
     * 
     * @param itemName
     */
    public void setItemName(java.lang.String itemName) {
        this.itemName = itemName;
    }


    /**
     * Gets the sellerId value for this BoughtItems.
     * 
     * @return sellerId
     */
    public java.lang.String getSellerId() {
        return sellerId;
    }


    /**
     * Sets the sellerId value for this BoughtItems.
     * 
     * @param sellerId
     */
    public void setSellerId(java.lang.String sellerId) {
        this.sellerId = sellerId;
    }


    /**
     * Gets the sellerInfo value for this BoughtItems.
     * 
     * @return sellerInfo
     */
    public java.lang.String getSellerInfo() {
        return sellerInfo;
    }


    /**
     * Sets the sellerInfo value for this BoughtItems.
     * 
     * @param sellerInfo
     */
    public void setSellerInfo(java.lang.String sellerInfo) {
        this.sellerInfo = sellerInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BoughtItems)) return false;
        BoughtItems other = (BoughtItems) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.boughtQuan==null && other.getBoughtQuan()==null) || 
             (this.boughtQuan!=null &&
              this.boughtQuan.equals(other.getBoughtQuan()))) &&
            ((this.itemName==null && other.getItemName()==null) || 
             (this.itemName!=null &&
              this.itemName.equals(other.getItemName()))) &&
            ((this.sellerId==null && other.getSellerId()==null) || 
             (this.sellerId!=null &&
              this.sellerId.equals(other.getSellerId()))) &&
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
        if (getBoughtQuan() != null) {
            _hashCode += getBoughtQuan().hashCode();
        }
        if (getItemName() != null) {
            _hashCode += getItemName().hashCode();
        }
        if (getSellerId() != null) {
            _hashCode += getSellerId().hashCode();
        }
        if (getSellerInfo() != null) {
            _hashCode += getSellerInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BoughtItems.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://viewPackage", "BoughtItems"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("boughtQuan");
        elemField.setXmlName(new javax.xml.namespace.QName("http://viewPackage", "boughtQuan"));
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
        elemField.setFieldName("sellerId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://viewPackage", "sellerId"));
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
