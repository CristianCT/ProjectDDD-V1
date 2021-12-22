package estudiante.values;

import generico.Id;

public class IdObservacion extends Id {
    private IdObservacion(String value){
        super(value);
    }

    public IdObservacion(){
    }

    public static IdObservacion of(String value){
        return new IdObservacion(value);
    }
}
