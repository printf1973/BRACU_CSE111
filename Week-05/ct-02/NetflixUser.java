public class NetflixUser {
    public String name;
    public String plan;
    public Movie[] fav = new Movie[3];
    public int count;

    public NetflixUser(String n) {
        this(n, "Free");
    } 

    public NetflixUser(String n, String p) {
        name = n;
        plan = p;
        System.out.println("New user account created!");
    }

    public void addToFavourites(Movie m) {
        if (plan.equals("Free")) {
            System.out.println("Cannot add movies to favourites.");
            System.out.println("Please upgrade to Netflix Premium.");
            return;
        }

        if (count >= 3) {
            System.out.println("Cannot add new movies. Favourites list is full."); 
            return;
        }

        fav[count++] = m;
        System.out.println("Movie added to favourites.");
    }

    public void showFavourites() {
        if (plan.equals("Free")) {
            System.out.println("No available favourites. Please upgrade to Netflix Premium.");
            return;
        }
        System.out.println("Showing " + name + "'s Favourites:");
        for (int i = 0; i < count; i++) {
            System.out.println(fav[i].name + ", " + fav[i].genre + ", Duration: " + fav[i].duration);
        }
    }

    public void upgradePlan() {
        if (plan.equals("Premium")) {
            System.out.println("You already have Netflix Premium!");
            return;
        }
        plan = "Premium";
        System.out.println("Welcome to Netflix Premium!");
    }
}
