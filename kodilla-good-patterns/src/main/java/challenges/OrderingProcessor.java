package challenges;

public class OrderingProcessor {
    private InformationService informationService;
    private OrderingService orderingService;
    private OrderingRepository orderingRepository;

    public OrderingProcessor(final InformationService informationService,
                             final OrderingService orderingService,
                             final OrderingRepository orderingRepository) {
        this.informationService = informationService;
        this.orderingRepository = orderingRepository;
        this.orderingService = orderingService;
    }

    public OrderingDto process(final OrderRequest orderRequest) {
        boolean isOrdered = orderingService.order(orderRequest.getUser(), orderRequest.getProduct());

        if (isOrdered) {
            informationService.inform(orderRequest.getUser());
            orderingRepository.createOrdering(orderRequest.getUser(), orderRequest.getProduct());
            return new OrderingDto(orderRequest.getUser(), true);
        } else {
            return new OrderingDto(orderRequest.getUser(), false);
        }
    }
}
