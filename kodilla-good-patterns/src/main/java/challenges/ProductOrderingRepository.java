package challenges;

public class ProductOrderingRepository implements OrderingRepository {

    public boolean createOrdering(User user, Product product) {
        System.out.println("Zamowienie Przyjete dla : " + user.getName() + " " + user.getSurname() + " Product "
                + product.getNameOfProduct() + " za kwote : " + product.price + " zł ");
        return true;
    }

}
