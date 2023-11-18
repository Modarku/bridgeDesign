package Example2.without_bridge;

public class Windows11Pro extends MicrosoftWindows {
    public Windows11Pro() {
        super("Windows 11", "Pro");
    }

    @Override
    public MicrosoftWindows upgrade(MicrosoftWindows windows) {
        if (!this.getState()) {
            System.out.println("Failed to upgrade! " + this + " is currently not running!");
            return this;
        }
        if (windows instanceof Windows11Pro) {
            System.out.println("Failed to upgrade! Windows is already in " + windows);
            return this;
        }
        System.out.println("Successfully upgraded from " + this + " to " + windows);
        return windows;
    }
}
