package tecnicas.spring.mvc;

import java.util.ArrayList;

public class Cart {
    private ArrayList<Product> products;

    public Cart() {
        this.products = new ArrayList<Product>();
    }

    public void addProduct(Product product) {
        this.products.add(product);
    }

    public void removeProduct(Product product) {
        this.products.remove(product);
    }

    public ArrayList<Product> getProducts() {
        return this.products;
    }

    public double getTotal() {
        double total = 0.0;
        for (Product product : this.products) {
            total += product.getPrice();
        }
        return total;
    }
    
}
