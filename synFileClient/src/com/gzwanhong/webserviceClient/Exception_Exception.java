
package com.gzwanhong.webserviceClient;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.1.7
 * 2017-07-31T21:30:14.275+08:00
 * Generated source version: 3.1.7
 */

@WebFault(name = "Exception", targetNamespace = "http://webservice.gzwanhong.com")
public class Exception_Exception extends java.lang.Exception {
    
    private com.gzwanhong.webserviceClient.Exception exception;

    public Exception_Exception() {
        super();
    }
    
    public Exception_Exception(String message) {
        super(message);
    }
    
    public Exception_Exception(String message, Throwable cause) {
        super(message, cause);
    }

    public Exception_Exception(String message, com.gzwanhong.webserviceClient.Exception exception) {
        super(message);
        this.exception = exception;
    }

    public Exception_Exception(String message, com.gzwanhong.webserviceClient.Exception exception, Throwable cause) {
        super(message, cause);
        this.exception = exception;
    }

    public com.gzwanhong.webserviceClient.Exception getFaultInfo() {
        return this.exception;
    }
}
