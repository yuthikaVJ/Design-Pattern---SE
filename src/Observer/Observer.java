package Observer;

//Receive updates when subject's state change
public interface Observer {

    void update(String message);
}
