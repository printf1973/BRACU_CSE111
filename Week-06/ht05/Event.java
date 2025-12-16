public class Event {

    public static Event[] events = new Event[5];
    public static int count;

    private String name;
    public String date;

    public Event(String n, String d) {
        if (count >= 5) {
            System.out.println("Event class can create a maximum of 5 event objects.");
            return;
        }
        name = n;
        date = d;
        events[count++] = this;
    }

    public String getName() {
        return name;
    }

    public String details() {
        return "Name: " + name + "\nDate: " + date;
    }

    public static void allEventInfo() {
        System.out.println("Total Events: " + count);
        System.out.println("Event Details: ");
        for (int i = 0; i < count; i++) {
            System.out.printf("Event %d: %n", i + 1);
            System.out.println(events[i].details());
        }
    }
}
