package Example1.without_bridge;

public abstract class User {
    protected String app;
    protected String name;

    public User(String name, String app) {
        this.app = app;
        this.name = name;
    }

    public abstract String welcome();

    @Override
    public String toString() {
        return name;
    }
}
