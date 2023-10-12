package designpatterns.prototype.PrototypeExample;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class PrototypeTester {

    @Test
    public void ControlTest(){
        Table table1 = new Table(1,5,5);
        Table table2 = table1.copy();
        table2.setId(2);
        System.out.println(table1);
        System.out.println(table2);
        System.out.println(table1);

    }

    @Test
    public void UploadTableTest(){
        UploadTable t1 = new UploadTable(3,10,20,100);
        Table t2 = t1.copy();
        System.out.println(t2);
        Map<String,Control> registry = new HashMap<>();
        registry.put("t1",t2);
        Control t3 = registry.get("t1").copy();
        System.out.println(t3);
    }
}
