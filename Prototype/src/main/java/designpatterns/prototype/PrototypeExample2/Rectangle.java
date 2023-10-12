package designpatterns.prototype.PrototypeExample2;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Rectangle implements ShapePrototype{
    int length;
    int width;
    String colour;

    public Rectangle(int length, int width, String colour) {
        this.length = length;
        this.width = width;
        this.colour = colour;
    }

    public Rectangle(Rectangle rectangle){
        this.length = rectangle.length;
        this.width = rectangle.width;
        this.colour = rectangle.colour;
    }

    @Override
    public Rectangle shapeClone() {
        return new Rectangle(this);
    }
}
