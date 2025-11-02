package stratergy;

public class BankTransferPayment  implements PaymentStratergyin{
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using Bank Transfer ");
    }
}
