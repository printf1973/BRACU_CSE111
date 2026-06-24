public class MobilePhone {
    public int capacity;
    public String [] name;
    public int [] number;
    public int count;

    public void setContactCapacity(int capacity) {
        this.capacity = capacity;
        this.name = new String[capacity];
        this.number = new int[capacity];
    }

    public void details() {
        System.out.println("Total Contacts: " + this.count);
        System.out.println("Contact List: ");
        for (int i = 0; i < this.count; i++) {
            System.out.println(name[i] + ":" + number[i]);
        }
    }

    public void addContact(String name, int number) {
        if (this.count < this.capacity) {
            this.name[this.count] = name;
            this.number[this.count] = number;
            this.count++;
            System.out.println("The contact of " + name + " was added.");
        }
        else {
            System.out.println("Storage Full!!!");
        }
    }

    public void makeCall(int number) {
        for (int i = 0; i < this.count; i++) {
            if (this.number[i] == number) {
                System.out.println("Calling " + this.name[i] + " . . .");
                return;
            }
        }
        System.out.println("Calling " + number + " . . .");
    }
}
