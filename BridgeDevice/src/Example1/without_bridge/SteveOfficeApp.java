package Example1.without_bridge;

public class SteveOfficeApp extends User {
    public SteveOfficeApp() {
        super("Steve", "MS Office");
    }

    @Override
    public String welcome() {
        return "Welcome to " + app + " " + this + "!";
    }
}
