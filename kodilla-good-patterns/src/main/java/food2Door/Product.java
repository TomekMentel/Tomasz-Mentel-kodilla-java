package food2Door;

import java.util.Objects;

public class Product {

    private String name;
    private int kgQuantity;

    public Product(String name, int kgQuantity) {
        this.name = name;
        this.kgQuantity = kgQuantity;
    }

    public String getName() {
        return name;
    }

    public int getKgQuantity() {
        return kgQuantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return name + "-" +
                +kgQuantity +
                "kg";
    }
}
