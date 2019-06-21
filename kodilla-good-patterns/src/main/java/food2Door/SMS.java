package food2Door;

public class SMS implements DeliveryInformation {

    @Override
    public boolean process(DeliveryRequest deliveryRequest) {
        System.out.println("Potwierdzenie zostło wysłane: " + deliveryRequest.getSupplier().getName() + " " +
                deliveryRequest.getSupplier().getSurname() + " , " + deliveryRequest.getSupplier().getTelNr());
        return true;
    }
}
