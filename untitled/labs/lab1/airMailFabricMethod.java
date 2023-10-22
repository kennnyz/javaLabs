package lab1;

public class airMailFabricMethod implements MailFabricService {
    private airMailFabricMethod getButton() {
        return new airMailFabricMethod();
    }
    public void sendMail() {
        System.out.println("The mail was sent by air mail!");
    }

    public void getMail() {
        System.out.println("The mail was delivered by air mail!");
    }
}