package Observer;

public class MobileApp implements Observer {
    private String message;

    @Override
    public void update(String message) {
        this.message = message;
        display();
    }

    private void display() {
        System.out.println("Mobile App: Message updated - " + message);
    }
}
