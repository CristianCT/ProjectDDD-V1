package profesor.values;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public final class Contenido implements Serializable {
    private final Set<Tema> temas;

    private Contenido(Set<Tema> temas){
        this.temas = Objects.requireNonNull(temas, "Los temas no pueden ser null");
    }

    public Contenido(){
        this.temas = new HashSet<>();
    }

    public Contenido agregarTema(Tema tema){
        Set<Tema> auxiliar = this.temas;
        auxiliar.add(tema);
        return new Contenido(auxiliar);
    }
}
