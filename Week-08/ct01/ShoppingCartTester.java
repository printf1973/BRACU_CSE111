public class ShoppingCartTester {
    public static void main(String[] args) {
        Product p1 = new Product("Notebook", 4.99);
        Clothing c1 = new Clothing("T-Shirt", 19.99, "M");
        Electronics e1 = new Electronics("Laptop", 999.99, 24);
        p1.displayInfo();
        c1.displayInfo();
        e1.displayInfo();
        System.out.println("Total products created: " + Product.totalProducts);
        Electronics e2 = new Electronics("Smartphone", 799.99, 12);
        e2.displayInfo(false);
    }
}
