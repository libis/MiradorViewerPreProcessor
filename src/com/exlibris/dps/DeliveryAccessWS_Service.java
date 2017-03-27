
package com.exlibris.dps;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-2b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "DeliveryAccessWS", targetNamespace = "http://dps.exlibris.com/", wsdlLocation = "http://libis-p-rosetta-1w.cc.kuleuven.be:1801/dpsws/delivery/DeliveryAccessWS?wsdl")
public class DeliveryAccessWS_Service
    extends Service
{

    private final static URL DELIVERYACCESSWS_WSDL_LOCATION;
    private final static WebServiceException DELIVERYACCESSWS_EXCEPTION;
    private final static QName DELIVERYACCESSWS_QNAME = new QName("http://dps.exlibris.com/", "DeliveryAccessWS");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://libis-p-rosetta-1w.cc.kuleuven.be:1801/dpsws/delivery/DeliveryAccessWS?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        DELIVERYACCESSWS_WSDL_LOCATION = url;
        DELIVERYACCESSWS_EXCEPTION = e;
    }

    public DeliveryAccessWS_Service() {
        super(__getWsdlLocation(), DELIVERYACCESSWS_QNAME);
    }


    public DeliveryAccessWS_Service(URL wsdlLocation) {
        super(wsdlLocation, DELIVERYACCESSWS_QNAME);
    }


    public DeliveryAccessWS_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }


    /**
     * 
     * @return
     *     returns DeliveryAccessWS
     */
    @WebEndpoint(name = "DeliveryAccessWSPort")
    public DeliveryAccessWS getDeliveryAccessWSPort() {
        return super.getPort(new QName("http://dps.exlibris.com/", "DeliveryAccessWSPort"), DeliveryAccessWS.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns DeliveryAccessWS
     */
    @WebEndpoint(name = "DeliveryAccessWSPort")
    public DeliveryAccessWS getDeliveryAccessWSPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://dps.exlibris.com/", "DeliveryAccessWSPort"), DeliveryAccessWS.class, features);
    }

    private static URL __getWsdlLocation() {
        if (DELIVERYACCESSWS_EXCEPTION!= null) {
            throw DELIVERYACCESSWS_EXCEPTION;
        }
        return DELIVERYACCESSWS_WSDL_LOCATION;
    }

}
