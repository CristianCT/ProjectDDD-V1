package profesor.values;

import generico.Id;

public class IdAsignatura extends Id {
    private IdAsignatura(String value){
        super(value);
    }

    public IdAsignatura(){
    }

    public static IdAsignatura of(String value){
        return new IdAsignatura(value);
    }
}
