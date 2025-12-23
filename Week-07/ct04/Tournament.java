public class Tournament {
    private String name;

    public Tournament() {
        this.name = "Default";
    }

    public Tournament(String name) {
        this.name = name;
    }

    public String getName() {
        return "Tournament Name: " + name;
    }
}
