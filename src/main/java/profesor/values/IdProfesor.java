package profesor.values;

import generico.Id;

public class IdProfesor extends Id {
    private IdProfesor(String value){
        super(value);
    }

    public IdProfesor(){
    }

    public static IdProfesor of(String value){
        return new IdProfesor(value);
    }
}
