package designpatterns.stratergy.Implementations.AmazonPayment;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Items {
    Double price;
    String description;
    ItemType itemType;

    public Items(ItemType itemType) {
        switch (itemType){
            case PEN -> {
                this.price = 20.0;
                this.description = "This is a Ball Pen";
                this.itemType = itemType;
            }
            case FILE -> {
                this.price = 100.0;
                this.description = "This is a File";
                this.itemType = itemType;
            }
            case NOTEBOOK -> {
                this.price = 50.0;
                this.description = "This is a NoeBook";
                this.itemType = itemType;
            }
            case CARDBOARD -> {
                this.price = 90.0;
                this.description = "This is a CardBoard";
                this.itemType = itemType;
            }
        }
    }
}
