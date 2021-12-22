package profesor.values;

import generico.Id;

public class IdProyecto extends Id {
    private IdProyecto(String value){
        super(value);
    }

    public IdProyecto(){
    }

    public static IdProyecto of(String value){
        return new IdProyecto(value);
    }
}
