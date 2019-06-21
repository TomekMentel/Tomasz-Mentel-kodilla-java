package food2Door;

public class Application {
    public static void main(String[] args) {
        DeliveryRequestRetriever deliveryRequestRetriever = new DeliveryRequestRetriever();
        DeliveryRequest deliveryRequest = deliveryRequestRetriever.retrieve();

        DeliveryProcessor deliveryProcessor = new DeliveryProcessor(deliveryRequest);

        if (deliveryProcessor.process()) {
            System.out.println("Zamówienie Powiodło sie:");
        } else {
            System.out.println("Zamówienie NIE Powiodło się:");
        }
    }
}

