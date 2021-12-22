package curso.values;

import generico.Id;

public final class IdResponsable extends Id {
    private IdResponsable(String value){
        super(value);
    }

    public IdResponsable(){
    }

    public static IdResponsable of(String value){
        return new IdResponsable(value);
    }
}
