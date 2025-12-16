public class Organizer {

    public String name;
    public Event[] events = new Event[4];
    public int count;

    public Organizer(String n) {
        name = n;
    }

    public Organizer() {
        System.out.println("Please provide the organizer's name");
    }

    public void organizeEvent(Event e) {
        if (count >= 4) {
            System.out.println("Organizer can organize a maximum of 4 events.");
        }
        events[count++] = e;
        System.out.printf("%s successfully organized %s%n", name, e.getName());
    }

    public void searchEventByDate(String d) {
        for (int i = 0; i < count; i++) {
            if (events[i].date.equals(d)) {
                System.out.println(events[i].getName());
                return;
            }
        }
        System.out.println("No event is scheduled for " + d);
    }
}
