public class Movie {
    public String name;
    public String genre;
    public String duration;

    public Movie(String n, String g) {
        this(n, g, "unknown");
    }

    public Movie(String n, String g, String d) {
        name = n;
        genre = g;
        duration = d;
    }
}
