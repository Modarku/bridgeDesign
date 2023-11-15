/*  Bridge design structure:
    Appliance, there are 3 kinds: Refrigerator, Oven, Microwave
    Universal Home App: Basic functions
    Advanced Home App: Advanced functions

    Computer system, there are 3 users: Allen, Felicia, Steve
    All users can access 3 apps: MS Office, MS Teams
    Users are the main abstraction, Apps are the implementation bridge
 */
public class Main {
    
    public static void main(String[] args) {
        User Allen = new User.Allen(new Office());
        System.out.println(Allen.welcome());
        User Felicia = new User.Felicia(new Office());
        System.out.println(Felicia.welcome());
        User Steve = new User.Steve(new Office());
        System.out.println(Steve.welcome());
    }
}