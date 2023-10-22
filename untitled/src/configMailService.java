import java.util.logging.Logger;

public class configMailService {
    private static final int earthMailServiceID = 1;
    private static final int airMailServiceID = 2;

    private int mailService;

    public int getMailService() {
        return mailService;
    }

    public configMailService setMailService(int serviceID) {
        this.mailService = serviceID;
        return this;
    }

    public static configMailService initWithID(int serviceID) {
        if (!isValidID(serviceID)) {
            System.out.println("Invalid serviceID");
            return null;
        }

        return new configMailService().setMailService(serviceID);
    }

    private static boolean isValidID(int serviceID) {
        if (serviceID == earthMailServiceID || serviceID == airMailServiceID) {
            return true;
        };
        return false;
    }
}
