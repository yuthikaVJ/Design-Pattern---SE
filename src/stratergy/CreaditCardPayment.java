package stratergy;

public class CreaditCardPayment implements PaymentStratergyin {

    public void pay(int amount) {
        System.out.println("Paid " + amount + " using Credit card");
    }
}
