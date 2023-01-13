
package org.soap2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.soap2 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ReserveSmartphone_QNAME = new QName("http://asu.dgtu.donetsk.ua/ex/students", "ReserveSmartphone");
    private final static QName _ReserveSmartphoneResponse_QNAME = new QName("http://asu.dgtu.donetsk.ua/ex/students", "ReserveSmartphoneResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.soap2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ReserveSmartphoneResponse }
     * 
     */
    public ReserveSmartphoneResponse createReserveSmartphoneResponse() {
        return new ReserveSmartphoneResponse();
    }

    /**
     * Create an instance of {@link ReserveSmartphone }
     * 
     */
    public ReserveSmartphone createReserveSmartphone() {
        return new ReserveSmartphone();
    }

    /**
     * Create an instance of {@link Smartphone }
     * 
     */
    public Smartphone createSmartphone() {
        return new Smartphone();
    }

    /**
     * Create an instance of {@link UserReserve }
     * 
     */
    public UserReserve createUserReserve() {
        return new UserReserve();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReserveSmartphone }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://asu.dgtu.donetsk.ua/ex/students", name = "ReserveSmartphone")
    public JAXBElement<ReserveSmartphone> createReserveSmartphone(ReserveSmartphone value) {
        return new JAXBElement<ReserveSmartphone>(_ReserveSmartphone_QNAME, ReserveSmartphone.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReserveSmartphoneResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://asu.dgtu.donetsk.ua/ex/students", name = "ReserveSmartphoneResponse")
    public JAXBElement<ReserveSmartphoneResponse> createReserveSmartphoneResponse(ReserveSmartphoneResponse value) {
        return new JAXBElement<ReserveSmartphoneResponse>(_ReserveSmartphoneResponse_QNAME, ReserveSmartphoneResponse.class, null, value);
    }

}
