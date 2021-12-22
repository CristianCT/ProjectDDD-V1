package estudiante.values;

import generico.Id;

public final class IdEstudiante extends Id {

    private IdEstudiante(String value){
        super(value);
    }

    public IdEstudiante(){
    }

    public static IdEstudiante of(String value){
        return new IdEstudiante(value);
    }
}