package Example1.without_bridge;

public class AllenTeamsApp extends User {
    public AllenTeamsApp() {
        super("Allen", "MS Teams");
    }

    @Override
    public String welcome() {
        return "Welcome to " + app + " " + this + "!";
    }
}
