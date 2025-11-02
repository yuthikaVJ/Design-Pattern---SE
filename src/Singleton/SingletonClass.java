package Singleton;

public class SingletonClass {

    private static SingletonClass instance; //create  private static instance

    private SingletonClass() {} // private Constructor

    public static SingletonClass getInstance() { //Instance Method
        if (instance == null) {
            instance = new SingletonClass();
        }
        return instance;
    }


}
