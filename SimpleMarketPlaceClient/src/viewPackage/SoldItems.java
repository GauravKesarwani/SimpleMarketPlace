/**
 * SoldItems.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package viewPackage;

public class SoldItems  implements java.io.Serializable {
    private java.lang.String availquan;

    private java.lang.String itemName;

    private java.lang.String sellerInfo;

    private java.lang.String soldQuan;

    private java.lang.String userid;

    public SoldItems() {
    }

    public SoldItems(
           java.lang.String availquan,
           java.lang.String itemName,
           java.lang.String sellerInfo,
           java.lang.String soldQuan,
           java.lang.String userid) {
           this.availquan = availquan;
           this.itemName = itemName;
           this.sellerInfo = sellerInfo;
           this.soldQuan = soldQuan;
           this.userid = userid;
    }


    /**
     * Gets the availquan value for this SoldItems.
     * 
     * @return availquan
     */
    public java.lang.String getAvailquan() {
        return availquan;
    }


    /**
     * Sets the availquan value for this SoldItems.
     * 
     * @param availquan
     */
    public void setAvailquan(java.lang.String availquan) {
        this.availquan = availquan;
    }


    /**
     * Gets the itemName value for this SoldItems.
     * 
     * @return itemName
     */
    public java.lang.String getItemName() {
        return itemName;
    }


    /**
     * Sets the itemName value for this SoldItems.
     * 
     * @param itemName
     */
    public void setItemName(java.lang.String itemName) {
        this.itemName = itemName;
    }


    /**
     * Gets the sellerInfo value for this SoldItems.
     * 
     * @return sellerInfo
     */
    public java.lang.String getSellerInfo() {
        return sellerInfo;
    }


    /**
     * Sets the sellerInfo value for this SoldItems.
     * 
     * @param sellerInfo
     */
    public void setSellerInfo(java.lang.String sellerInfo) {
        this.sellerInfo = sellerInfo;
    }


    /**
     * Gets the soldQuan value for this SoldItems.
     * 
     * @return soldQuan
     */
    public java.lang.String getSoldQuan() {
        return soldQuan;
    }


    /**
     * Sets the soldQuan value for this SoldItems.
     * 
     * @param soldQuan
     */
    public void setSoldQuan(java.lang.String soldQuan) {
        this.soldQuan = soldQuan;
    }


    /**
     * Gets the userid value for this SoldItems.
     * 
     * @return userid
     */
    public java.lang.String getUserid() {
        return userid;
    }


    /**
     * Sets the userid value for this SoldItems.
     * 
     * @param userid
     */
    public void setUserid(java.lang.String userid) {
        this.userid = userid;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SoldItems)) return false;
        SoldItems other = (SoldItems) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.availquan==null && other.getAvailquan()==null) || 
             (this.availquan!=null &&
              this.availquan.equals(other.getAvailquan()))) &&
            ((this.itemName==null && other.getItemName()==null) || 
             (this.itemName!=null &&
              this.itemName.equals(other.getItemName()))) &&
            ((this.sellerInfo==null && other.getSellerInfo()==null) || 
             (this.sellerInfo!=null &&
              this.sellerInfo.equals(other.getSellerInfo()))) &&
            ((this.soldQuan==null && other.getSoldQuan()==null) || 
             (this.soldQuan!=null &&
              this.soldQuan.equals(other.getSoldQuan()))) &&
            ((this.userid==null && other.getUserid()==null) || 
             (this.userid!=null &&
              this.userid.equals(other.getUserid())));
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
        if (getAvailquan() != null) {
            _hashCode += getAvailquan().hashCode();
        }
        if (getItemName() != null) {
            _hashCode += getItemName().hashCode();
        }
        if (getSellerInfo() != null) {
            _hashCode += getSellerInfo().hashCode();
        }
        if (getSoldQuan() != null) {
            _hashCode += getSoldQuan().hashCode();
        }
        if (getUserid() != null) {
            _hashCode += getUserid().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SoldItems.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://viewPackage", "SoldItems"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("availquan");
        elemField.setXmlName(new javax.xml.namespace.QName("http://viewPackage", "availquan"));
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
        elemField.setFieldName("sellerInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://viewPackage", "sellerInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("soldQuan");
        elemField.setXmlName(new javax.xml.namespace.QName("http://viewPackage", "soldQuan"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://viewPackage", "userid"));
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
