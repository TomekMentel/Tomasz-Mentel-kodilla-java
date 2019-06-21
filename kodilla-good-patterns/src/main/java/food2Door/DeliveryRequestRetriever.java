package food2Door;

import java.util.HashMap;

public class DeliveryRequestRetriever {

    public static DeliveryRequest retrieve() {
        Supplier supplier = new Supplier("Jan", "Kowalski", "Kolejowa 14",
                "kowalski_Jan@gmail.com", 514523423);

        HashMap<Product, Integer> product = new HashMap<>();
        product.put(new Product("Banany", 10), 0);
        product.put(new Product("Winogrona", 5), 1);
        product.put(new Product("Jabłka", 10), 2);
        product.put(new Product("Śliwki", 5), 3);
        product.put(new Product("Gruszki", 8), 4);

        return new DeliveryRequest(new HealthyShop(), supplier, product);
    }
}
