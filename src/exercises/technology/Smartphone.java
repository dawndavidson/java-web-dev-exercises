package exercises.technology;

public class Smartphone extends Computer {

    private int numberOfContacts;
    public Smartphone(boolean hasMotherBoard, int ram, int usbPort) {
        super(hasMotherBoard, ram, usbPort);

        this.numberOfContacts = numberOfContacts;
    }

    public void addNewContact(){
        this.numberOfContacts = this.numberOfContacts + 1;
    }

    public int getNumberOfContacts() {
        return this.numberOfContacts;
    }
}
