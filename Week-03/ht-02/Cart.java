public class Cart {
    public int id;
    public int capacity = 3;
    public double discount;
    public double total;
    public String[] items = new String[capacity];
    public double[] prices = new double[capacity];
    public int count;

    public void create_cart(int id) {
        this.id = id;
    }

    public void addItem(String item, double price) {
        if (count < capacity) {
            this.items[count] = item;
            this.prices[count] = price;
            this.total += price;
            count++;
            System.out.println(item + " added to cart " + this.id + ".");
            System.out.println("You have " + count + " item(s) in your cart now.");
        }
        else {
            System.out.println("You already have 3 items on your cart");
        }
    }

    public void addItem(double price, String item) {
        addItem(item, price);
    }

    public void cartDetails() {
        System.out.println("Your cart(c" + this.id + ")");
        for (int i = 0; i < count; i++) {
            System.out.println(this.items[i] + " - " + this.prices[i]);
        }
        System.out.println("Discount Applied: " + this.discount + "%");
        System.out.println("Total: " + this.total);
    }

    public void giveDiscount(double discount) {
        this.discount = discount;
        this.total = this.total * (1 - this.discount/100);
    }
}
