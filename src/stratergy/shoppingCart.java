package stratergy;

public class shoppingCart {

    private  PaymentStratergyin paymentStratergyin;

    public void setPaymentStratergyin(PaymentStratergyin paymentStratergyin){
        this.paymentStratergyin = paymentStratergyin;
    }

    public void checkout(int amount){
        if(paymentStratergyin == null){
            throw new IllegalStateException("No payment method selected");
        }
        paymentStratergyin.pay(amount);
    }
}


