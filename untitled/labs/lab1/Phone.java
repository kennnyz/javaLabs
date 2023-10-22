package lab1;

public class Phone {
    private PhoneType phoneType;
    private CPU cpu;
    private Screen screen;
    private int cameras;

    public Phone(PhoneType phoneType, CPU cpu, Screen screen, int cameras) {
        this.phoneType = phoneType;
        this.cpu = cpu;
        this.screen = screen;
        this.cameras = cameras;
    }

    public PhoneType getPhoneType() {
        return phoneType;
    }

    public CPU getCpu() {
        return cpu;
    }

    public Screen getScreen() {
        return screen;
    }


    public int getCameras() {
        return cameras;
    }
}
