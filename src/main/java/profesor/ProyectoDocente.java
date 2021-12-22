package profesor;

import generico.Entity;
import profesor.values.IdProyecto;
import profesor.values.Metodologia;
import profesor.values.Objetivo;

import java.util.Objects;
import java.util.Set;

public class ProyectoDocente extends Entity<IdProyecto> {

    private Set<Objetivo> objetivos;
    private Metodologia metodologia;

    public ProyectoDocente(IdProyecto id, Set<Objetivo> objetivos, Metodologia metodologia) {
        super(id);
        this.objetivos = Objects.requireNonNull(objetivos, "Los objetivos no pueden ser null");
        if (this.objetivos.size() < 3) throw new IllegalArgumentException("Debe tener un minimo de 3 objetivos");
        this.metodologia = Objects.requireNonNull(metodologia, "La metodologia no puede ser null");
    }

    public void agregarObjetivo(Objetivo objetivo){
        this.objetivos.add(objetivo);
    }

    public void remplazarMetodologia(Metodologia metodologia){
        this.metodologia = metodologia;
    }

    public Set<Objetivo> objetivos() {
        return objetivos;
    }

    public Metodologia metodologia() {
        return metodologia;
    }
}
