package designpatterns.stratergy.Implementations.AmazonPayment;

import java.util.List;

public class Amazon {
    Cart cart;
    public Amazon(Cart cart){
        this.cart = cart;
    }

    public Amazon(){
        cart = new Cart();
    }

    public Double getAmount(Cart cart){
        List<Items> items = cart.getAllItems();

        return items.stream()
                .map(Items::getPrice)
                .reduce(0.0, Double::sum);
    }

    public void payment(Mode mode){
        Double amount = getAmount(cart);
        PaymentFactory.paymentType(mode).pay(amount);
    }
}
