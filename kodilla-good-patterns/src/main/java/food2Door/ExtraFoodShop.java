package food2Door;

public class ExtraFoodShop implements DeliveryService {

    @Override
    public boolean process(DeliveryRequest deliveryRequest) {
        System.out.println("Zrealizowano zamowienie" + deliveryRequest.getProduct().keySet());
        return new SMS().process(deliveryRequest);
    }
}
