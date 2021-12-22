package curso.values;

import generico.Id;

public class IdCalificacion extends Id {
    private IdCalificacion(String value){
        super(value);
    }

    public IdCalificacion(){
    }

    public static IdCalificacion of(String value){
        return new IdCalificacion(value);
    }
}
