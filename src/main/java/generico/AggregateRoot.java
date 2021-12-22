package generico;

public abstract class AggregateRoot<I extends Id > extends Entity<Id> {

    public AggregateRoot(Id id) {
        super(id);
    }
}