package Example1.without_bridge;

public class Main {
    public static void main(String[] args) {
        User Allen = new AllenOfficeApp();
        System.out.println(Allen.welcome());
        User Felicia = new FeliciaOfficeApp();
        System.out.println(Felicia.welcome());
        User Steve = new SteveOfficeApp();
        System.out.println(Steve.welcome());
    }
}

