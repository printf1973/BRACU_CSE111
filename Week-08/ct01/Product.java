public class Product {
    public String productName;
    public double price;
    public static int totalProducts = 0;

    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }

    public void displayInfo() {
        System.out.println("Product: " + productName + ", Price: $" + price);
    }
}
