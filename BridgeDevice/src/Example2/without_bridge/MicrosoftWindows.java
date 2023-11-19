package Example2.without_bridge;

import java.util.Objects;

public abstract class MicrosoftWindows {
    protected final String version;
    protected final String edition;
    protected boolean state;

    public MicrosoftWindows(String version, String edition) {
        this.version = version;
        this.edition = edition;
        state = false;
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
        if (Objects.equals(edition, "Home")) {
            System.out.println("Classic Start Menu for Home Edition");
            System.out.println("Basic security features for Home Edition");
            System.out.println("Gaming mode is not available for Home Edition");
        } else if (Objects.equals(edition, "Pro")) {
            System.out.println("Enhanced Start Menu for Pro Edition");
            System.out.println("Advanced security features for Pro Edition");
            System.out.println("Gaming mode is available for Pro Edition");
        }
    }

    public abstract MicrosoftWindows upgrade(MicrosoftWindows windows);

    @Override
    public String toString() {
        return version + " (" + edition + ")";
    }
}
