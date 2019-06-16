package challenges;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {
        User user = new User("Jan", "Kowalski", "Kolejowa 14", "kowalski_Jan@gmail.com", 514523423);
        Product product = new Product("Mikser", "AGD", "Zelmer", 125.50);
        return new OrderRequest(user, product);
    }
}