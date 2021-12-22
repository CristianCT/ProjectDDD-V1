package profesor.values;

import java.util.HashSet;
import java.util.Set;

public final class Contenido {
    private final Set<Tema> temas;

    private Contenido(Set<Tema> temas){
        this.temas = temas;
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
