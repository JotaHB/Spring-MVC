package tecnicas.spring.mvc;

public class Product {
    private String id;
    private String name;
    private String description;
    private double price;
    
    // constructor
    public Product(String id, String name, String d, double price) {
        this.id = id;
        this.name = name;
        this.description = d;
        this.price = price;
    }
    
    // getters and setters
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
}
