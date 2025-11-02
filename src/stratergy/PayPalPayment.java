package stratergy;

public class PayPalPayment implements PaymentStratergyin{

    public void pay(int amount) {
        System.out.println("Paid " + amount + " using PaYPal ");
    }
}
