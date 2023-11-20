package Example1.with_bridge;

/*  Bridge design structure:
    Appliance, there are 3 kinds: Refrigerator, Oven, Microwave
    Universal Home Example1.with_bridge.App: Basic functions
    Advanced Home Example1.with_bridge.App: Advanced functions

    Computer system, there are 3 users: Allen, Felicia, Steve
    All users can access 3 apps: MS Example1.with_bridge.Office, MS Example1.with_bridge.Teams
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