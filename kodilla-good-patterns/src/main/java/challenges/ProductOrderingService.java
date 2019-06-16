package challenges;

public class ProductOrderingService implements OrderingService {

    public boolean order(final User user, final Product product) {
        System.out.println(user.getName() + " " + user.getSurname() +
                " Zamowienie " + product.getNameOfProduct() + " Marki " +
                product.getMark() + " za " + product.getPrice() + " zł " + " In Category " + product.getCategory());
        return true;
    }
}
