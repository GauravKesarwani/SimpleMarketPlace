/**
 * MarketServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package DefaultNamespace;

public class MarketServiceServiceLocator extends org.apache.axis.client.Service implements DefaultNamespace.MarketServiceService {

    public MarketServiceServiceLocator() {
    }


    public MarketServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public MarketServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for marketService
    private java.lang.String marketService_address = "http://localhost/SimpleMarketPlace/services/marketService";

    public java.lang.String getmarketServiceAddress() {
        return marketService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String marketServiceWSDDServiceName = "marketService";

    public java.lang.String getmarketServiceWSDDServiceName() {
        return marketServiceWSDDServiceName;
    }

    public void setmarketServiceWSDDServiceName(java.lang.String name) {
        marketServiceWSDDServiceName = name;
    }

    public DefaultNamespace.MarketService getmarketService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(marketService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getmarketService(endpoint);
    }

    public DefaultNamespace.MarketService getmarketService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            DefaultNamespace.MarketServiceSoapBindingStub _stub = new DefaultNamespace.MarketServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getmarketServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setmarketServiceEndpointAddress(java.lang.String address) {
        marketService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (DefaultNamespace.MarketService.class.isAssignableFrom(serviceEndpointInterface)) {
                DefaultNamespace.MarketServiceSoapBindingStub _stub = new DefaultNamespace.MarketServiceSoapBindingStub(new java.net.URL(marketService_address), this);
                _stub.setPortName(getmarketServiceWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("marketService".equals(inputPortName)) {
            return getmarketService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://DefaultNamespace", "marketServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://DefaultNamespace", "marketService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("marketService".equals(portName)) {
            setmarketServiceEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
