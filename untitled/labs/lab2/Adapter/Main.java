package lab2.Adapter;

public class Main {
    public static void main(String[] args) {
       EuropeanSocket socket = new Socket();
       Radio radio = new Radio();
       // we have european socket but to use radio we need UK socket
        // we need to use adapter
        SocketAdapter adapter = new SocketAdapter(socket);
        radio.playMusic(adapter);
    }
}

interface EuropeanSocket {
    public String voltage();
    public String live();
    public String neutral();
    public String earth();
}

class Socket implements EuropeanSocket {
    public String voltage() {
        return "220V";
    }

    public String live() {
        return "L";
    }

    public String neutral() {
        return "N";
    }

    public String earth() {
        return "E";
    }
}

interface UKSocketInterface {
    public String voltage();
    public String live();
    public String neutral();
}

class Radio {
    public void playMusic(UKSocketInterface socket) {
        System.out.println("Playing music...");
        for (int i = 0; i < 10; i++) {
            System.out.println("Ladadi ladada");
            System.out.println("ladadi ladadu");
        }
    }
}

class SocketAdapter implements UKSocketInterface {
    private EuropeanSocket socket;

    public SocketAdapter(EuropeanSocket socket) {
        this.socket = socket;
    }

    public String voltage() {
        return socket.voltage();
    }

    public String live() {
        return socket.live();
    }

    public String neutral() {
        return socket.neutral();
    }
}




