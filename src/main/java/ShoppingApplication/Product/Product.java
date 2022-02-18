package ShoppingApplication.Product;


import ShoppingApplication.Color;

public class Product {

    private String productName;
    private String id;
    private double price;
    Color color;

    public Product(String productName, String id, double price, Color color) {
        this.productName = productName;
        this.id = id;
        this.price = price;
        this.color = color;
    }

    public Product() {

    }

    public String getProductName() {

        return productName;
    }

    public void setProductName(String name) {
        for (int i = 1; i < name.length() ; i++) {
            if ((name.charAt(0) > 65 && name.charAt(0) < 90) &&
                         (name.charAt(i) > 97 && name.charAt(i) < 122)) {
                this.productName = productName;
            }
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;

    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
