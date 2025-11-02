package stratergy;

public class Cilent {
    public static void main(String[] args) {
        shoppingCart cart = new shoppingCart();

        cart.setPaymentStratergyin(new CreaditCardPayment());
        cart.checkout(500);

        cart.setPaymentStratergyin(new PayPalPayment());
        cart.checkout(1000);

        cart.setPaymentStratergyin(new BankTransferPayment());
        cart.checkout(250);

        BankTransferPayment payment = new BankTransferPayment();

    }
}
