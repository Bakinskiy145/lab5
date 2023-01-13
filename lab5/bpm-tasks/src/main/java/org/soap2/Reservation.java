
package org.soap2;

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
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "Reservation", targetNamespace = "http://asu.dgtu.donetsk.ua/ex/students", wsdlLocation = "http://localhost:8085/Reservation?wsdl")
public class Reservation
    extends Service
{

    private final static URL RESERVATION_WSDL_LOCATION;
    private final static WebServiceException RESERVATION_EXCEPTION;
    private final static QName RESERVATION_QNAME = new QName("http://asu.dgtu.donetsk.ua/ex/students", "Reservation");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8085/Reservation?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        RESERVATION_WSDL_LOCATION = url;
        RESERVATION_EXCEPTION = e;
    }

    public Reservation() {
        super(__getWsdlLocation(), RESERVATION_QNAME);
    }

    public Reservation(WebServiceFeature... features) {
        super(__getWsdlLocation(), RESERVATION_QNAME, features);
    }

    public Reservation(URL wsdlLocation) {
        super(wsdlLocation, RESERVATION_QNAME);
    }

    public Reservation(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, RESERVATION_QNAME, features);
    }

    public Reservation(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Reservation(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ReservationService
     */
    @WebEndpoint(name = "ReservationPort")
    public ReservationService getReservationPort() {
        return super.getPort(new QName("http://asu.dgtu.donetsk.ua/ex/students", "ReservationPort"), ReservationService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ReservationService
     */
    @WebEndpoint(name = "ReservationPort")
    public ReservationService getReservationPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://asu.dgtu.donetsk.ua/ex/students", "ReservationPort"), ReservationService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (RESERVATION_EXCEPTION!= null) {
            throw RESERVATION_EXCEPTION;
        }
        return RESERVATION_WSDL_LOCATION;
    }

}
