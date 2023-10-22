public class PhoneBuilder implements Builder{
    private PhoneType type;
    private Screen screen;
    private CPU cpu;
    private int cameras;
    @Override
    public void setPhoneType(PhoneType type) {
        this.type = type;
    }

    @Override
    public void setCameras(int cameras) {
        this.cameras = cameras;
    }

    @Override
    public void setCpu(CPU cpu) {
        this.cpu= cpu;
    }

    @Override
    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public Phone getFinal() {
        return new Phone(type, cpu, screen, cameras);
    };
}
