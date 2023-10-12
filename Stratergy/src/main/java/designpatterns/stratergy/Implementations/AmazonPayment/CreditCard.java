package designpatterns.stratergy.Implementations.AmazonPayment;

import lombok.Getter;
import lombok.NoArgsConstructor;

public class CreditCard implements PaymentProcessor{
    @Override
    public void pay(Double amount) {
        System.out.println("Paying the amount via CreditCard and the amount is " + amount);
    }
}
