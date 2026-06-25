public class Library {
    public int capacity;
    public String [] books;
    public int count;

    public Library(int capacity) {
        this.capacity = capacity;
        this.books = new String [capacity];
        System.out.println("A library has been created with capacity " + capacity);
    }

    public void addBook(String name) {
        if (count < capacity) {
            this.books[count++] = name;
            System.out.printf("Book '%s' added to the library%n", name);
        }
        else {
            System.out.printf("Exceeds maximum capacity. You can't add more than %d books%n", this.capacity);
        }
    }

    public void printDetail() {
        System.out.println("Maximum Capacity: " + this.capacity);
        System.out.println("Total Books: " + this.count);
        if (count != 0) {
            System.out.println("Book list:");
            for (int i = 0; i < count; i++) {
                System.out.println(books[i]);
            }
        }
    }
}
