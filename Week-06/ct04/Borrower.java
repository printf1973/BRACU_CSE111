public class Borrower {

    public static int[] book_count = { 3, 3, 3 };
    public static String[] book_name = { "Pather Panchali", "Durgesh Nandini", "Anandmath" };

    public String name;
    public String[] books = new String[3];
    public int count;

    public Borrower(String n) {
        name = n;
    }

    public static int remainingBooks(String b) {
        int idx = 0;
        for (int i = 0; i < 3; i++) {
            if (book_name[i].equals(b)) {
                idx = i;
            }
        }
        return book_count[idx];
    }

    public static void bookStatus() {
        System.out.println("Available Books:");
        for (int i = 0; i < 3; i++) {
            System.out.println(book_name[i] + ": " + book_count[i]);
        }

    }

    public void borrowBook(String b) {
        if (remainingBooks(b) == 0) {
            System.out.println("This book is not available.");
            return;
        }
        books[count++] = b;
        for (int i = 0; i < 3; i++) {
            if (book_name[i].equals(b)) {
                book_count[i]--;
                break;
            }
        }
    }

    public void borrowerDetails() {
        System.out.println("Name: " + name);
        System.out.println("Books Borrowed:");
        for (int i = 0; i < count; i++) {
            System.out.println(books[i]);
        }
    }
}
