package Observer;

//Keep track of observers and notifies them of changes

public interface Subject {

    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
