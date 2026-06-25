public class Reader {
    public String name = "New User";
    public int capacity = 2;
    public String[] books;
    public int count;

    public Reader(String name) {
        this.name = name;
        this.books = new String[this.capacity];
        System.out.println("A new reader is created!");
    }

    public Reader(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.books = new String[capacity];
        System.out.println("A new reader is created!");
    }

    public void readerInfo() {
        System.out.println("Name: " + name);
        System.out.println("Capacity: " + capacity);
        System.out.println("Books: ");
        if (count == 0) {
            System.out.println("No books added yet");
        }
        else {
            for (int i = 0; i < count; i++) {
                System.out.println("Book " + (i+1) + ": " + books[i]);
            }
        }
    }

    public void addBook(String book) {
        if (count < capacity) {
            books[count++] = book;
        }
        else {
            System.out.println("No more capacity");
        }
    }

    public void updateCapacity(int capacity) {
        this.capacity = capacity;
        String[] arr = new String[capacity];
        if (count > capacity) {
            count = capacity;
        }
        for (int i = 0; i < count; i++) {
            arr[i] = books[i];
        }
        books = arr;
        System.out.println("Capacity has changed to " + capacity);
    }
}
