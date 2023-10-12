package designpatterns.prototype.PrototypeExample;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString(callSuper = true)
@Setter
@Getter
public class Table extends Control{
    private Integer numberOfRows;
    private Integer NumberOfColumns;

    public Table(Integer id, Integer numberOfRows, Integer NumberOfColumns) {
        super(id);
        this.numberOfRows = numberOfRows;
        this.NumberOfColumns = NumberOfColumns;
    }

    public Table(Table t) {
        super(t);
        this.numberOfRows = t.numberOfRows;
        this.NumberOfColumns = t.NumberOfColumns;
    }

    @Override
    public Table copy() {
        return new Table(this);
    }
}
