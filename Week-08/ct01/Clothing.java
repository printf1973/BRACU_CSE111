public class Clothing extends Product {
    public String size;

    public Clothing(String name, double price, String size) {
        super(name, price);
        this.size = size;
    }

    public void displayInfo() {
        System.out.println("Product: " + productName + ", Price: $" + price + ", Size: " + size);
    }
}
