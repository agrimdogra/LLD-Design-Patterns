package designpatterns.prototype.PrototypeExample2;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class Square implements ShapePrototype{
    int side;
    String colour;

    public Square(int side, String colour) {
        this.side = side;
        this.colour = colour;
    }

    public Square(Square square){
        this.side = square.side;
        this.colour = square.colour;
    }

    @Override
    public Square shapeClone() {
        return new Square(this);
    }
}
