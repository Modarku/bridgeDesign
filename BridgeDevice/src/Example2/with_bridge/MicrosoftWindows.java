package Example2.with_bridge;

public abstract class MicrosoftWindows {
    protected final String version;
    protected final WindowsEdition edition;
    protected boolean state;

    public MicrosoftWindows(String version, WindowsEdition edition) {
        this.version = version;
        this.edition = edition;
        state = false;
    }

    public boolean getState() {
        return state;
    }

    public void boot() {
        if (state) {
            System.out.println(this + " is already running!");
            return;
        }
        System.out.println("Welcome to " + this);
        state = true;
    }

    public void shutdown() {
        if (!state) {
            System.out.println(this + " is already not running!");
            return;
        }
        System.out.println("Shutting down " + this);
        state = false;
    }

    public void editionFeatures() {
        edition.startMenu();
        edition.securityFeatures();
        edition.gamingMode();
    }

    public abstract MicrosoftWindows upgrade(MicrosoftWindows windows);

    @Override
    public String toString() {
        return version + " (" + edition + ")";
    }
}
