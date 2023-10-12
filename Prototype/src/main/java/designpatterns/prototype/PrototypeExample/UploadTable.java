package designpatterns.prototype.PrototypeExample;

import lombok.ToString;

@ToString(callSuper = true)
public class UploadTable extends Table{
    private Integer numberOfAttachments;

    public UploadTable(Integer id, Integer numberOfRows, Integer getNumberOfColumns, Integer numberOfAttachments) {
        super(id, numberOfRows, getNumberOfColumns);
        this.numberOfAttachments = numberOfAttachments;
    }

    public UploadTable(UploadTable t){
        super(t);
        this.numberOfAttachments = t.numberOfAttachments;
    }

    @Override
    public UploadTable copy() {
        return new UploadTable(this);
    }
}
