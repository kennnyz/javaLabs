package lab1;

public class earthMailFabricMethod implements MailFabricService {

    public earthMailFabricMethod getButton() {
        return new earthMailFabricMethod();
    }
    public void sendMail() {
        System.out.println("The mail was sent by earth mail!");
    }

    public void getMail() {
        System.out.println("The mail was delivered by earth mail!");
    }
}
