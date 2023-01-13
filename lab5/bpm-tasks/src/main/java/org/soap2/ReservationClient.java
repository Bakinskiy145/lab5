package org.soap2;

import javax.xml.namespace.QName;
import javax.xml.ws.AsyncHandler;
import javax.xml.ws.Response;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class ReservationClient {

    private final static QName RESERVATION_QNAME = new QName(
            "http://asu.dgtu.donetsk.ua/ex/students", "Reservation"
    );
    // User choice reserve
    private String SMARTPHONE_MODEL = "CLASS";
    private int QUANTITY_RESERVE = 2;
    class ReserveAsyncHandler implements AsyncHandler<ReserveSmartphoneResponse> {
        private ReserveSmartphoneResponse response;
        @Override
        public void handleResponse(Response<ReserveSmartphoneResponse> res) {
            try {
                response = res.get(2000, TimeUnit.MILLISECONDS);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        public UserReserve getResponse() {
            return response.getReturn();
        }
    }

    public static URL getWSDLURL(String urlStr) {
        URL url = null;
        try {
            url = new URL(urlStr);
        } catch (MalformedURLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        return url;
    }

    public UserReserve processCallback(URL url, String modelRes, int quantityRes) {
        Reservation svc = new Reservation(url, RESERVATION_QNAME);
        ReservationService port = svc.getReservationPort();
        ReserveAsyncHandler asyncHandler = new ReserveAsyncHandler();
        Future<?> futureResponse = port.reserveSmartphoneAsync(modelRes, quantityRes, asyncHandler);

        while (!futureResponse.isDone()) {
            try {
                System.out.println("Product Reservation, please wait...");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        UserReserve userSmartphoneReserve = asyncHandler.getResponse();
        return userSmartphoneReserve;
    }

    public static void printUserReserve(UserReserve reserve) {
        if (reserve != null) {
            System.out.println("\n*** Вы зарезервировали товар ***\n --------------------------------");
            Smartphone smartphone = reserve.getSmartphone();
            System.out.println(smartphone.firm + " | " +
                    smartphone.model + " | " +
                    smartphone.color + " | " +
                    smartphone.ramGB + "GB | " +
                    smartphone.memoryGB + "GB | " +
                    smartphone.price + "P | " +
                    " | quantity: " + reserve.quantity +
                    " | total sum: " + reserve.totalAmount);
        } else {
            System.out.println("\n*** Не удалось зарезервировать товар ***\n --------------------------------");
        }
    }

    public static void main(String[] args) {
        URL url = getWSDLURL("http://localhost:8085/Reservation?wsdl");
        ReservationClient client = new ReservationClient();
        UserReserve userSmartphoneReserve = client.processCallback(url, client.SMARTPHONE_MODEL, client.QUANTITY_RESERVE);
        printUserReserve(userSmartphoneReserve);
    }


}
