package profesor.values;

import generico.Id;

public class IdActividad extends Id {
    private IdActividad(String value){
        super(value);
    }

    public IdActividad(){
    }

    public static IdActividad of(String value){
        return new IdActividad(value);
    }
}
