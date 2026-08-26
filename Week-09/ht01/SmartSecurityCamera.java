public class SmartSecurityCamera extends SmartDevice {
    public int storage, used;
    public boolean isIR;

    public SmartSecurityCamera(String name, double battery, int storage) {
        super(name, battery);
        this.storage = storage;
    }

    public void record(boolean ir) {
        if (!isActive) {
            System.out.println("ERROR: Device must be ON to Record.");
            return;
        }

        if (storage == used) {
            System.out.println("Error: Indoor-Cam storage full.");
            System.out.println("Recording disabled.");
            return;

        }

        if (ir) {
            isIR = ir;
            System.out.println("[IR SENSORS ACTIVE]");
        }
        used += 1;
        System.out.println("Recording standard footage.");
    }

    public void record() {
        record(false);
    }

    @Override
    public void powerOn() {
        if (storage == used) {
            System.out.println("Error: Indoor-Cam storage full.");
            System.out.println("Recording disabled.");
            return;

        }
        super.powerOn();
    }

    @Override
    public void powerOff() {
        if (isIR) {
            System.out.println("Turning off Night Vision.");
        }
        super.powerOff();
    }

    public void formatCard(String pass) {
        System.out.println("REQUEST: Format SD Card initiated.");

        if (!isActive) {
            System.out.println("ERROR: Device must be ON to format.");
            return;
        }

        if (!pass.equals("ADMIN123")) {
            System.out.println("ACCESS DENIED: Incorrect PIN.");
            return;
        }

        used = 0;
        System.out.println("Auth Success. Wiping data.");
        System.out.printf("SUCCESS: Storage restored to %dGB.\n", storage);
    }
}
