package Example1.without_bridge;

public class AllenOfficeApp extends User {
    public AllenOfficeApp() {
        super("Allen", "MS Office");
    }

    @Override
    public String welcome() {
        return "Welcome to " + app + " " + this + "!";
    }
}
