package estudiante.values;

import generico.Id;

public final class IdEntrega extends Id {
    private IdEntrega(String value){
        super(value);
    }

    public IdEntrega(){
    }

    public static IdEntrega of(String value){
        return new IdEntrega(value);
    }
}
