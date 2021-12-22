package curso.values;

import generico.Id;

public class IdEvento extends Id {
    private IdEvento(String value){
        super(value);
    }

    public IdEvento(){
    }

    public static IdEvento of(String value){
        return new IdEvento(value);
    }
}
