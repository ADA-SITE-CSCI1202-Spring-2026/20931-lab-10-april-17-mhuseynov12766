import java.util.*;
import java.util.function.Predicate;

public class ProductMain {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>(List.of(
                new Product("Laptop", 999.99, true),
                new Product("Smartphone", 499.99, false),
                new Product("Headphones", 19.99, true),
                new Product("Monitor", 29.99, true)));

        Predicate<Product> isAffordable = product -> product.getPrice() < 50 && product.isInStock();

        products.removeIf(isAffordable.negate());

        products.forEach(System.out::println);
    }
}