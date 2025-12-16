public class Product {

    public static String[] name = new String[3];
    public static int[] qty = new int[3];
    private static int count;

    public Product(String n, int q) {
        if (count >= 3) {
            System.out.println("Storage is full! Cannot add " + n);
            return;
        }
        name[count] = n;
        qty[count++] = q;
        System.out.println("Stored: " + n);
    }

    public static void displayProducts() {
        System.out.println("=== Stored Products ===");
        for (int i = 0; i < count; i++) {
            System.out.println(name[i] + " - Qty: " + qty[i]);
        }
    }

    public static void buy(String n, int q) {
        for (int i = 0; i < count; i++) {
            if (name[i].equals(n)) {
                if (q <= qty[i]) {
                    qty[i] -= q;
                    System.out.println("Product Sold");
                    return;
                }
                System.out.println("Quantity low");
                return;
            }
        }
        System.out.println("Product not found");
    }
}
