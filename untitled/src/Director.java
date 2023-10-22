// Builder
public class Director {
    public void constructIphone(Builder builder) {
        builder.setPhoneType(PhoneType.Iphone);
        builder.setCpu(CPU.Intel);
        builder.setScreen(Screen.GorillaGlass);
        builder.setCameras(2);
    }

    public void constructAndroid(Builder builder) {
        builder.setPhoneType(PhoneType.Android);
        builder.setCpu(CPU.Samsung);
        builder.setScreen(Screen.GorillaGlass);
        builder.setCameras(3);
    }
}
