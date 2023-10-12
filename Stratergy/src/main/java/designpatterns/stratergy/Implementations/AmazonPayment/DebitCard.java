package designpatterns.stratergy.Implementations.AmazonPayment;

public class DebitCard implements PaymentProcessor{
    @Override
    public void pay(Double amount) {
        System.out.println("Paying the amount via Debit Card and the amount is " + amount);
    }
}
