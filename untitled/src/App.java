public class App {
    // get dependencies
    // Паттерн одиночка
    private final singletonRepository repository;
    // Паттерн фабрика
    private final mailFabricMethod fabricMethod;
    private final MailFabricService mailService;

    //абстрактная фабрика метод
    private GUIFactory factory;
    private Button button;


    // builder pattern
    Director director = new Director();
    PhoneBuilder builder = new PhoneBuilder();




    public App() {
        // getting one global repository object with pattern Singleton
        repository = singletonRepository.getInstance("postgres:password/localhost:5432");
        fabricMethod = new mailFabricMethod();
        // getting MailService via ID
        mailService = fabricMethod.getMailService(2);
        factory =getFactory();
        button = factory.createButton();
    }

    private GUIFactory getFactory() {
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            return  new MacOSFactory();
        } else {
            return new WindowsFactory();
        }
    }

    public void run() {
    repository.pingDB();
    mailService.sendMail();
    mailService.getMail();
    button.paint();
    director.constructAndroid(builder);
    Phone android = builder.getFinal();
    System.out.println("Android phone: Core " + android.getCpu() + " Screen " + android.getScreen() + " Cameras " + android.getCameras());
}
}


