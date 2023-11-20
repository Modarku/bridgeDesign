package Example1.without_bridge;

public class FeliciaTeamsApp extends User {

    public FeliciaTeamsApp() {
        super("Felicia", "MS Teams");
    }

    @Override
    public String welcome() {
        return "Welcome to " + app + " " + this + "!";
    }
}
