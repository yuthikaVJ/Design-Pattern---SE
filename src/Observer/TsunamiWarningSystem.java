package Observer;

import java.util.ArrayList;

public class TsunamiWarningSystem implements Subject {
    private ArrayList<Observer> observers = new ArrayList<>();
    private String message = "";

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    // Setter for message
    public void setMessage(String message) {
        this.message = message;
        notifyObservers();
    }
}
