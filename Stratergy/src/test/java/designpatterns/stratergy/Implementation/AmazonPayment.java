package designpatterns.stratergy.Implementation;

import designpatterns.stratergy.Implementations.AmazonPayment.Amazon;
import designpatterns.stratergy.Implementations.AmazonPayment.Cart;
import designpatterns.stratergy.Implementations.AmazonPayment.ItemType;
import designpatterns.stratergy.Implementations.AmazonPayment.Mode;
import org.junit.jupiter.api.Test;

public class AmazonPayment {
    @Test
    public void checkCart(){
        Cart cart = new Cart();
        cart.addItem(ItemType.CARDBOARD);
        cart.addItem(ItemType.PEN);
        cart.addItem(ItemType.NOTEBOOK);

        System.out.println(cart.getAllItems());
    }

    @Test
    public void checkPayment(){
        Cart cart = new Cart();
        cart.addItems();
        Amazon amazon = new Amazon(cart);
        amazon.payment(Mode.DEBIT_CARD);
    }

    @Test
    public void checkPayment2(){
        Cart cart = new Cart();
        cart.addItem(ItemType.CARDBOARD);
        cart.addItem(ItemType.FILE);
        Amazon amazon = new Amazon(cart);
        amazon.payment(Mode.AMAZON_WALLET);
    }
}
