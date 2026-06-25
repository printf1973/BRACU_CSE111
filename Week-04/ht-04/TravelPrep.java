public class TravelPrep {
    public String t_name;
    public int budget;
    public int cost;
    public TravelPrep[] places = new TravelPrep[3];
    public int count;

    public TravelPrep() {
        this("Unknown", 1250);
    }

    public TravelPrep(String s, int n) {
        t_name = s;
        budget = n;
        System.out.println(t_name + " package would cost at most " + budget + " yen");
    }

    public TravelPrep(String s1, String s2) {
        this(s1, s2, 300);
    }

    public TravelPrep(String s1, String s2, int n) {
        if (s1.equals("Shrine") || s1.equals("Lake")) {
            t_name = s2 + " " + s1;
        }
        else {
            t_name = s1 + " " + s2;
        }
        cost = n; 
        System.out.println(t_name + " costs " + cost + " yen");
    }

    public void add_to_itinerary(TravelPrep t) {
        if (count < 3) {
            if (cost+t.cost <= budget) {
                places[count++] = t;
                cost += t.cost;
            }
            else {
                System.out.println("Budget going overboard");
            }
        }
    }

    public void add_to_itinerary(TravelPrep t1, TravelPrep t2) {
        add_to_itinerary(t1);
        add_to_itinerary(t2);
    }

    public String updateCost(int n) {
        cost += n;
        return "Cost of " + t_name + " updated to " + cost;
    }

    public void show_itinerary() {
        System.out.println("Itinerary for " + t_name);
        for (int i = 0; i < count; i++) {
            System.out.print(""+(i+1)+". ");
            System.out.println(places[i].t_name + " - " + places[i].cost + " yen");
        }
        System.out.println("Total cost of " + count + " destinations: " + cost + " yen");
    }
}
