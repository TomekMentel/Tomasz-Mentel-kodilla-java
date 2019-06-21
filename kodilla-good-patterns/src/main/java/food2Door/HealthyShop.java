package food2Door;

public class HealthyShop implements DeliveryService {

    @Override
    public boolean process(DeliveryRequest deliveryRequest) {
        System.out.println("Zrealizowano zamowienie" + deliveryRequest.getProduct().keySet());
        return new Mail().process(deliveryRequest);
    }
}
