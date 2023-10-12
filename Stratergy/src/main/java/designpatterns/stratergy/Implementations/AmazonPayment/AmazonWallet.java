package designpatterns.stratergy.Implementations.AmazonPayment;

public class AmazonWallet implements PaymentProcessor{

    @Override
    public void pay(Double amount) {
        System.out.println("Paying the amount via Amazon Wallet and the amount is " + amount);
    }
}
