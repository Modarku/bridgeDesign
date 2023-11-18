package Example2.with_bridge;

import java.util.Objects;

public class Windows7 extends MicrosoftWindows {
    public Windows7(WindowsEdition edition) {
        super("Windows 7", edition);
    }

    @Override
    public MicrosoftWindows upgrade(MicrosoftWindows windows) {
        if (!this.getState()) {
            System.out.println("Failed to upgrade! " + this + " is currently not running!");
            return this;
        }
        if (windows instanceof Windows7 && Objects.equals(windows.edition.getEdition(), this.edition.getEdition())) {
            System.out.println("Failed to upgrade! Windows is already in " + windows);
            return this;
        }
        System.out.println("Successfully upgraded from " + this + " to " + windows);
        return windows;
    }
}
