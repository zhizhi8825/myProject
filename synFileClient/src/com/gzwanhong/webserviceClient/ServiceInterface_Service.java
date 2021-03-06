package com.gzwanhong.webserviceClient;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.7
 * 2017-07-31T21:30:14.294+08:00
 * Generated source version: 3.1.7
 * 
 */
@WebServiceClient(name = "serviceInterface", 
                  wsdlLocation = "http://127.0.0.1:8080/synFile/service/serviceInterface?wsdl",
                  targetNamespace = "http://webservice.gzwanhong.com") 
public class ServiceInterface_Service extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://webservice.gzwanhong.com", "serviceInterface");
    public final static QName ServiceInterfacePort = new QName("http://webservice.gzwanhong.com", "serviceInterfacePort");
    static {
        URL url = null;
        try {
            url = new URL("http://127.0.0.1:8080/synFile/service/serviceInterface?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(ServiceInterface_Service.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://127.0.0.1:8080/synFile/service/serviceInterface?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public ServiceInterface_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public ServiceInterface_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ServiceInterface_Service() {
        super(WSDL_LOCATION, SERVICE);
    }
    
//    public ServiceInterface_Service(WebServiceFeature ... features) {
//        super(WSDL_LOCATION, SERVICE, features);
//    }
//
//    public ServiceInterface_Service(URL wsdlLocation, WebServiceFeature ... features) {
//        super(wsdlLocation, SERVICE, features);
//    }
//
//    public ServiceInterface_Service(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
//        super(wsdlLocation, serviceName, features);
//    }    




    /**
     *
     * @return
     *     returns ServiceInterface
     */
    @WebEndpoint(name = "serviceInterfacePort")
    public ServiceInterface getServiceInterfacePort() {
        return super.getPort(ServiceInterfacePort, ServiceInterface.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ServiceInterface
     */
    @WebEndpoint(name = "serviceInterfacePort")
    public ServiceInterface getServiceInterfacePort(WebServiceFeature... features) {
        return super.getPort(ServiceInterfacePort, ServiceInterface.class, features);
    }

}
