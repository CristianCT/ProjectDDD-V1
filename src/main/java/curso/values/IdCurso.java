package curso.values;

import generico.Id;

public class IdCurso extends Id {
    private IdCurso(String value){
        super(value);
    }

    public IdCurso(){
    }

    public static IdCurso of(String value){
        return new IdCurso(value);
    }
}
