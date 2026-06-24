public class CellPhone {
    public String model = "unknown";
    public String[] contacts = new String[3];
    public int count = 0;

    public void printDetails() {
        System.out.println("Phone Model " + this.model);
        System.out.println("Contacts Stored " + this.count);
        if (count != 0) {
            System.out.println("Stored Contacts: ");
            for (int i = 0; i < count; i++) {
                System.out.println(contacts[i]);
            }
        }
    }

    public void storeContact(String contact) {
        if (this.count < 3) {
            this.contacts[count++] = contact;
            System.out.println("Contact Stored");
        }
        else {
            System.out.println("Memory full. New contact can't be stored."); 
        }
    }
}
