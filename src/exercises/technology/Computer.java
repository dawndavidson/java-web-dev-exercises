package exercises.technology;

public class Computer extends AbstractEntity  {
    private boolean hasMotherBoard;
    private int ram;
    private int usbPort;

    public Computer(boolean hasMotherBoard, int ram, int usbPort) {
        super();
        this.hasMotherBoard = hasMotherBoard;
        this.ram = ram;
        this.usbPort = usbPort;
    }
    public void increaseRam (int a) {
        this.ram = this.ram + a;
    }

    public void addUsbPort (int b) {
        this.usbPort = this.usbPort + b;
    }

}
