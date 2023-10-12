package designpatterns.stratergy.Implementations.AmazonPayment;

public class PayPal implements PaymentProcessor{
    @Override
    public void pay(Double amount) {
        System.out.println("Paying the amount via PayPal and the amount is " + amount);
    }
}
