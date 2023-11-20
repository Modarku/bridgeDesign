package Example2.with_bridge;

public class Main {
    public static void main(String[] args) {
        WindowsEdition homeEdition = new HomeEdition();
        WindowsEdition proEdition = new ProEdition();

        MicrosoftWindows windows = new Windows7(homeEdition);
        windows.boot();
        windows.editionFeatures();

        windows = windows.upgrade(new Windows7(proEdition));
        windows.boot();

        windows = windows.upgrade(new Windows7(proEdition));
        windows.boot();
        windows.shutdown();
        windows = windows.upgrade(new Windows11(homeEdition));
        windows.boot();

        windows = windows.upgrade(new Windows11(proEdition));
        windows.boot();
        windows.editionFeatures();
        windows.shutdown();
    }
}
