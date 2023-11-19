package Example2.without_bridge;

public class Windows7Pro extends MicrosoftWindows {
    public Windows7Pro() {
        super("Windows 7", "Pro");
    }

    @Override
    public MicrosoftWindows upgrade(MicrosoftWindows windows) {
        if (!state) {
            System.out.println("Failed to upgrade! " + this + " is currently not running!");
            return this;
        }
        if (windows instanceof Windows7Pro) {
            System.out.println("Failed to upgrade! Windows is already in " + windows);
            return this;
        }
        System.out.println("Successfully upgraded from " + this + " to " + windows);
        return windows;
    }
}
