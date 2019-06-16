package challenges;

public class Application {

    public static void main(String[] args) {
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        OrderingProcessor orderingProcessor = new OrderingProcessor(
                new MailService(), new ProductOrderingService(), new ProductOrderingRepository());
        orderingProcessor.process(orderRequest);
    }
}
