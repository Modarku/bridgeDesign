package Example1.without_bridge;

public class SteveTeamsApp extends User {
    public SteveTeamsApp() {
        super("Steve", "MS Teams");
    }

    @Override
    public String welcome() {
        return "Welcome to " + app + " " + this + "!";
    }
}
