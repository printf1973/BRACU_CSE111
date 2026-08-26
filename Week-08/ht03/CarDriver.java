public class CarDriver extends GenericDriver {
    public String profile;
    public static String[] restrictedAreas = new String[2];
    public static int count;

    public CarDriver(String name) {
        super(name);
        profile = "Premium";
    }

    public String toString() {
        String ret = getName() + "'s driver profile is " + profile;
        return ret;
    }

    public void hasSafetyTraining() {
        super.hasSafetyTraining();
        if (profile.equals("Premium")) {
            System.out.println("Premium drivers receive extra safety briefings.");
        }
    }

    public String acceptRide(boolean hasVehicle) {
        return super.acceptRide(hasVehicle) + "\n" + this.toString();
    }

    public static void restrictedAreas(String ra) {
        restrictedAreas[count++] = ra;
    }

    public void fightRestriction(String[] ra) {
        for (int i = 0; i < ra.length; i++) {
            String perm = "can";
            for (int j = 0; j < count; j++) {
                if (ra[i].equals(restrictedAreas[j])) {
                    perm += "not";
                    break;
                }
            }
            System.out.printf("%s %s enter %s\n", getName(), perm, ra[i]);
        }
    }

}
