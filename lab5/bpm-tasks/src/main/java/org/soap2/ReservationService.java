
package org.soap2;

import java.util.concurrent.Future;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.AsyncHandler;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.Response;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ReservationService", targetNamespace = "http://asu.dgtu.donetsk.ua/ex/students")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ReservationService {


    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns javax.xml.ws.Response<org.soap2.ReserveSmartphoneResponse>
     */
    @WebMethod(operationName = "ReserveSmartphone")
    @RequestWrapper(localName = "ReserveSmartphone", targetNamespace = "http://asu.dgtu.donetsk.ua/ex/students", className = "org.soap2.ReserveSmartphone")
    @ResponseWrapper(localName = "ReserveSmartphoneResponse", targetNamespace = "http://asu.dgtu.donetsk.ua/ex/students", className = "org.soap2.ReserveSmartphoneResponse")
    public Response<ReserveSmartphoneResponse> reserveSmartphoneAsync(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1);

    /**
     * 
     * @param arg1
     * @param arg0
     * @param asyncHandler
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "ReserveSmartphone")
    @RequestWrapper(localName = "ReserveSmartphone", targetNamespace = "http://asu.dgtu.donetsk.ua/ex/students", className = "org.soap2.ReserveSmartphone")
    @ResponseWrapper(localName = "ReserveSmartphoneResponse", targetNamespace = "http://asu.dgtu.donetsk.ua/ex/students", className = "org.soap2.ReserveSmartphoneResponse")
    public Future<?> reserveSmartphoneAsync(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1,
        @WebParam(name = "asyncHandler", targetNamespace = "")
        AsyncHandler<ReserveSmartphoneResponse> asyncHandler);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns org.soap2.UserReserve
     */
    @WebMethod(operationName = "ReserveSmartphone")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "ReserveSmartphone", targetNamespace = "http://asu.dgtu.donetsk.ua/ex/students", className = "org.soap2.ReserveSmartphone")
    @ResponseWrapper(localName = "ReserveSmartphoneResponse", targetNamespace = "http://asu.dgtu.donetsk.ua/ex/students", className = "org.soap2.ReserveSmartphoneResponse")
    @Action(input = "http://asu.dgtu.donetsk.ua/ex/students/ReservationService/ReserveSmartphoneRequest", output = "http://asu.dgtu.donetsk.ua/ex/students/ReservationService/ReserveSmartphoneResponse")
    public UserReserve reserveSmartphone(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1);

}