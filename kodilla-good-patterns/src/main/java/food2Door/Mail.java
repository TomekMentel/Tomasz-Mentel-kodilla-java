package food2Door;

public class Mail implements DeliveryInformation {

    public boolean process(DeliveryRequest deliveryRequest) {
        System.out.println("Potwierdzenie zostło wysłane: " + deliveryRequest.getSupplier().getName() + " " +
                deliveryRequest.getSupplier().getSurname() + " , " + deliveryRequest.getSupplier().getEmail());
        return true;
    }
}
