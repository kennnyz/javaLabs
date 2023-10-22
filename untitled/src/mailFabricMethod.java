public class mailFabricMethod {

    public MailFabricService getMailService(int MailServiceID) {
        configMailService config = configMailService.initWithID(MailServiceID);
        if (config == null) {
            return null;
        }

        MailFabricService mailService;

        switch (config.getMailService()) {
            case (1):
                mailService = new earthMailFabricMethod();
                break;
            case (2):
                mailService = new airMailFabricMethod();
                break;
            default:
                System.out.println("Не известный тип платформы");
                return null;
        }

        return  mailService;
    }
}
