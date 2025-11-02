package Singleton;

public class Singletontest {
    public static void main(String[] args) {

        SingletonClass obj1 = SingletonClass.getInstance();
        SingletonClass obj2 = SingletonClass.getInstance();

        System.out.println("One Instance Running: "+(obj1 == obj2));
    }
}
