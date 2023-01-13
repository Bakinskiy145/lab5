package org.soap1;

import javax.xml.namespace.QName;
import java.net.MalformedURLException;
import java.net.URL;

public class StoreClient {

    private final static QName SHOWASSORTMENT_QNAME = new QName(
            "http://asu.dgtu.donetsk.ua/ex/passexam", "DisplayAssortment"
    );

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

    private void printStoreAssortment(StoreAssortment assortment) {
        for (int i = 0; i < assortment.getSmartphones().size(); i++) {
            Smartphone smartphone = assortment.getSmartphones().get(i);
            int quantity = assortment.getQuantity().get(i);
            System.out.println(smartphone.firm + " | " +
                    smartphone.model + " | " +
                    smartphone.color + " | " +
                    smartphone.ramGB + "GB | " +
                    smartphone.memoryGB + "GB | " +
                    smartphone.price + "P | " +
                    " | quantity: " + quantity);
        }
    }

    public void process(URL url) {
        DisplayAssortment service = new DisplayAssortment(url, SHOWASSORTMENT_QNAME);
        StoreService storeSvcPort = service.getDisplayAssortmentPort();
        StoreAssortment assortment = storeSvcPort.getStoreAssortment();
        System.out.println("*** Store Assortment *** \n -----------------------");
        printStoreAssortment(assortment);
    }

    public static void main(String[] args) {
        URL url = getWSDLURL("http://localhost:8083/StoreSvcWeb/displayassortment?wsdl");
        StoreClient client = new StoreClient();
        client.process(url);
    }


}
