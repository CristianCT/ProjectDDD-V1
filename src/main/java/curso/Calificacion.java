package curso;

import curso.values.Aclaracion;
import curso.values.IdCalificacion;
import estudiante.values.IdEntrega;
import generico.Entity;
import generico.Valoracion;

import java.util.Objects;

public class Calificacion extends Entity<IdCalificacion> {
    private IdEntrega idEntrega;
    private Valoracion valoracion;
    private Aclaracion aclaracion;

    public Calificacion(IdCalificacion id, Valoracion valoracion, Aclaracion aclaracion) {
        super(id);
        this.valoracion = Objects.requireNonNull(valoracion, "La valoracion no puede ser null");
        this.aclaracion = Objects.requireNonNull(aclaracion, "La aclaracion no puede ser null");
    }

    public Calificacion(IdCalificacion id, Aclaracion aclaracion) {
        super(id);
        this.aclaracion = Objects.requireNonNull(aclaracion, "La aclaracion no puede ser null");
    }

    public void asignarValoracion(Valoracion valoracion){
        this.valoracion = Objects.requireNonNull(valoracion, "La valoracion no puede ser null");
    }

    public void agregarAclaracion(Aclaracion aclaracion){
        this.aclaracion = Objects.requireNonNull(aclaracion, "La aclaracion no puede ser null");
    }

    public IdEntrega idEntrega() {
        return idEntrega;
    }

    public Valoracion valoracion() {
        return valoracion;
    }

    public Aclaracion aclaracion() {
        return aclaracion;
    }
}
