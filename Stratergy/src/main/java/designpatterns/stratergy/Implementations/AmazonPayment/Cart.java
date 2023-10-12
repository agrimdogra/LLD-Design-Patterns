package designpatterns.stratergy.Implementations.AmazonPayment;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    List<Items> items = new ArrayList<>();
    public void addItems(){
        items.add(new Items(ItemType.FILE));
        items.add(new Items(ItemType.NOTEBOOK));
        items.add(new Items(ItemType.PEN));
    }

    public void addItem(ItemType type){
        items.add(new Items(type));
    }

    public void removeItem(ItemType itemType){
        items.remove(itemType);
    }

    public List<Items> getAllItems(){
        return items;
    }



}
