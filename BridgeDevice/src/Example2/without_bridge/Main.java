package Example2.without_bridge;

public class Main {
    public static void main(String[] args) {
        MicrosoftWindows windows = new Windows7Home();
        windows.boot();
        windows.editionFeatures();

        windows = windows.upgrade(new Windows7Pro());
        windows.boot();

        windows = windows.upgrade(new Windows7Pro());
        windows.boot();
        windows.shutdown();
        windows = windows.upgrade(new Windows11Home());
        windows.boot();

        windows = windows.upgrade(new Windows11Pro());
        windows.boot();
        windows.editionFeatures();
        windows.shutdown();
    }
}
