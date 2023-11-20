package Example1.without_bridge;

public class FeliciaOfficeApp extends User {

    public FeliciaOfficeApp() {
        super("Felicia", "MS Office");
    }

    @Override
    public String welcome() {
        return "Welcome to " + app + " " + this + "!";
    }
}
