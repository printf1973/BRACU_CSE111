public class NikeBD {

    public static String products[] = { "Jordan", "Cortez", "Kobe" };
    public static int totalStock[] = { 0, 0, 0 };
    public static int totalSold = 0;
    public static int count = 0;

    public String branch;
    public int sold;
    public int localStock[] = { 0, 0, 0 };

    public NikeBD(String b) {
        branch = b;
        count++;
    }

    public static void status() {
        System.out.println("Nike Bangladesh Status:");
        System.out.println("Branches opened: " + count);
        System.out.print("Currently Stocked: ");
        for (int i = 0; i < 2; i++) {
            System.out.print(products[i] + ": " + totalStock[i] + ", ");
        }
        System.out.print(products[2] + ": " + totalStock[2]);
        System.out.println();
        System.out.println("Sold: " + totalSold);
    }

    public void details() {
        System.out.println("Nike " + branch + " outlet:");
        System.out.println("Products Currently Stocked: ");
        for (int i = 0; i < 2; i++) {
            System.out.print(products[i] + ": " + localStock[i] + ", ");
        }
        System.out.print(products[2] + ": " + localStock[2]);
        System.out.println();
        System.out.println("Sold: " + sold);
    }

    public void restockProducts(String p, int s) {
        for (int i = 0; i < 3; i++) {
            if (products[i].equals(p)) {
                totalStock[i] += s;
                localStock[i] += s;
            }
        }
    }

    public void restockProducts(String[] p, int[] q) {
        for (int i = 0; i < p.length; i++) {
            restockProducts(p[i], q[i]);
        }
    }

    public void productSold(String p1, int q1, String p2, int q2) {
        for (int i = 0; i < 3; i++) {
            if (products[i].equals(p1)) {
                if (localStock[i] >= q1) {
                    totalStock[i] -= q1;
                    localStock[i] -= q1;
                    sold += q1;
                    totalSold += q1;
                }
            } else if (products[i].equals(p2)) {
                if (localStock[i] >= q2) {
                    totalStock[i] -= q2;
                    localStock[i] -= q2;
                    sold += q2;
                    totalSold += q2;
                }
            }
        }
    }

}
