package food2Door;

public class DeliveryProcessor {

    DeliveryRequest deliveryRequest;

    public DeliveryProcessor(DeliveryRequest deliveryRequest) {
        this.deliveryRequest = deliveryRequest;
    }

    public boolean process() {
        return deliveryRequest.getDeliveryService().process(deliveryRequest);
    }
}
