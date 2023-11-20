package Example2.with_bridge;

public class ProEdition implements WindowsEdition {
    protected final String edition;

    public ProEdition() {
        edition = "Pro";
    }

    @Override
    public String getEdition() {
        return edition;
    }

    @Override
    public void startMenu() {
        System.out.println("Enhanced Start Menu for Pro Edition");
    }

    @Override
    public void securityFeatures() {
        System.out.println("Advanced security features for Pro Edition");
    }

    @Override
    public void gamingMode() {
        System.out.println("Gaming mode is available for Pro Edition");
    }

    @Override
    public String toString() {
        return edition + " Edition";
    }
}
