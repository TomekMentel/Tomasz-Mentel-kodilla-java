package food2Door;

import java.util.HashMap;

public class DeliveryRequest {

    private Supplier supplier;
    private HashMap<Product, Integer> product;
    private DeliveryService deliveryService;

    public DeliveryRequest(HealthyShop deliveryService, Supplier supplier, HashMap<Product, Integer> product) {
        this.supplier = supplier;
        this.product = product;
        this.deliveryService = deliveryService;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public DeliveryService getDeliveryService() {
        return deliveryService;
    }

    public HashMap<Product, Integer> getProduct() {
        return product;
    }
}