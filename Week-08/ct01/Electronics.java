public class Electronics extends Product {
    public int warranty;

    public Electronics(String name, double price, int warranty) {
        super(name, price);
        this.warranty = warranty;
    }

    public void displayInfo() {
        System.out.println("Product: " + productName + ", Price: $" + price + ", Warranty: " + warranty);
    }

    public void displayInfo(boolean p) {
        if (p) {
            System.out.println("Product: " + productName + ", Price: $" + price + ", Warranty: " +
                    warranty + " months");
        } else {
            System.out.println("Product: " + productName + ", Warranty: " + warranty + " months");
        }
    }
}
