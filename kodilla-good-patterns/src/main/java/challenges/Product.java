package challenges;

public class Product {

    String nameOfProduct;
    String category;
    String mark;
    double price;

    public Product(String nameOfProduct, String categori, String mark, double price) {
        this.nameOfProduct = nameOfProduct;
        this.category = categori;
        this.mark = mark;
        this.price = price;
    }

    public String getNameOfProduct() {
        return nameOfProduct;
    }

    public String getCategory() {
        return category;
    }

    public String getMark() {
        return mark;
    }

    public double getPrice() {
        return price;
    }
}
