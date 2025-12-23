public class Cricket_Tournament extends Tournament {

    public int teams;
    public String type;

    public Cricket_Tournament(String name, int teams, String type) {
        super(name);
        this.teams = teams;
        this.type = type;
    }

    public Cricket_Tournament() {
        this("Default", 0, "No Type");
    }

    public String info() {
        String ret = "Cricket " + getName() + "\nNumber of Teams: " + teams + "\nType: " + type;
        return ret;
    }
}
