package Example2.with_bridge;

public class HomeEdition implements WindowsEdition {
    protected final String edition;

    public HomeEdition() {
        edition = "Home";
    }

    @Override
    public String getEdition() {
        return edition;
    }

    @Override
    public void startMenu() {
        System.out.println("Classic Start Menu for Home Edition");
    }

    @Override
    public void securityFeatures() {
        System.out.println("Basic security features for Home Edition");
    }

    @Override
    public void gamingMode() {
        System.out.println("Gaming mode is not available for Home Edition");
    }

    @Override
    public String toString() {
        return edition + " Edition";
    }
}
