package Observer;


public class NewsChannel implements Observer {
    private String message;

    @Override
    public void update(String message) {
        this.message = message;
        display();
    }
    private void display() {
        System.out.println("News Channel: " + message);
    }

}
