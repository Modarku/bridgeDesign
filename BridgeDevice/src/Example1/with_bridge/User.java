package Example1.with_bridge;

public abstract class User {
    protected App app;
    public User(App app){
        this.app = app;
    }
    abstract public String welcome();

    public static class Allen extends User {
        public Allen(App app) {
            super(app);
        }

        @Override
        public String welcome() {
            return "Welcome to " + app.open() + "Allen!";
        }
    }

    public static class Felicia extends User {
        public Felicia(App app) {
            super(app);
        }

        @Override
        public String welcome() {
            return "Welcome to " + app.open() + "Felicia!";
        }
    }

    public static class Steve extends User {
        public Steve(App app) {
            super(app);
        }

        @Override
        public String welcome() {
            return "Welcome to " + app.open() + "Steve!";
        }
    }
}

