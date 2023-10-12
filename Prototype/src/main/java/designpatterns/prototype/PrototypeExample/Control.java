package designpatterns.prototype.PrototypeExample;

import lombok.Generated;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class Control implements PrototypeClone{
    private Integer id;

    public Control(Integer id) {
        this.id = id;
    }

    public Control(Control c){
        this.id = c.id;
    }

    @Override
    public Control copy() {
        return new Control(this);
    }
}
