package exercises.technology;

public class Laptop extends Computer{

    private int applications;

    public Laptop(boolean hasMotherBoard, int ram, int usbPort) {
        super(hasMotherBoard, ram, usbPort);
        this.applications = applications;
    }
    public void downloadApplications() {
        this.applications = this.applications + 1;
    }

    public int getApplications() {
        return this.applications;
    }
}
