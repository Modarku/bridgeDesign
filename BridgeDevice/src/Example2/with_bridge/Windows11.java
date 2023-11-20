package Example2.with_bridge;

import java.util.Objects;

public class Windows11 extends MicrosoftWindows {
    public Windows11(WindowsEdition edition) {
        super("Windows 11", edition);
    }

    @Override
    public MicrosoftWindows upgrade(MicrosoftWindows windows) {
        if (!state) {
            System.out.println("Failed to upgrade! " + this + " is currently not running!");
            return this;
        }
        if (windows instanceof Windows11 && Objects.equals(windows.edition.getEdition(), this.edition.getEdition())) {
            System.out.println("Failed to upgrade! Windows is already in " + windows);
            return this;
        }
        System.out.println("Successfully upgraded from " + this + " to " + windows);
        return windows;
    }
}
