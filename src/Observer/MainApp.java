package Observer;

public class MainApp {
    public static void main(String[] args) {
        TsunamiWarningSystem warningSystem = new TsunamiWarningSystem();

        // Create observers
        NewsChannel newsChannel = new NewsChannel();
        MobileApp mobileApp = new MobileApp();

        // Register observers
        warningSystem.addObserver(newsChannel);
        warningSystem.addObserver(mobileApp);

        // Simulate sending alerts
        System.out.println("=== Sending first warning ===");
        warningSystem.setMessage("Tsunami alert: Evacuate coastal areas immediately!");

        System.out.println("\n=== Sending second warning ===");
        warningSystem.setMessage("Tsunami alert canceled: Situation under control.");
    }
}
