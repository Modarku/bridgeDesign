package Example1.with_bridge;

public abstract class User {
    protected App app;
    protected String name;
    public User(String name, App app){
        this.name = name;
        this.app = app;
    }
    abstract public String welcome();

    public static class Allen extends User {
        public Allen(App app) {
            super("Allen", app);
        }

        @Override
        public String welcome() {
            return "Welcome to " + app.open() + " " + this + "!";
        }
    }

    public static class Felicia extends User {
        public Felicia(App app) {
            super("Felicia", app);
        }

        @Override
        public String welcome() {
            return "Welcome to " + app.open() + " " + this + "!";
        }
    }

    public static class Steve extends User {
        public Steve(App app) {
            super("Steve", app);
        }

        @Override
        public String welcome() {
            return "Welcome to " + app.open() + " " + this + "!";
        }
    }

    @Override
    public String toString() {
        return name;
    }
}

