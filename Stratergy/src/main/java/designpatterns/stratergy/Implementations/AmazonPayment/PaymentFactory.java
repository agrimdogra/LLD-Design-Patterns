package designpatterns.stratergy.Implementations.AmazonPayment;

public class PaymentFactory {
    public static PaymentProcessor paymentType(Mode mode){
        switch (mode){
            case CREDIT_CARD -> {
                return new CreditCard();
            }

            case DEBIT_CARD -> {
                return new DebitCard();
            }

            case PAY_PAL -> {
                return new PayPal();
            }

            case AMAZON_WALLET -> {
                return new AmazonWallet();
            }

        }
        throw new RuntimeException("Select Correct payment mode");
    }
}
