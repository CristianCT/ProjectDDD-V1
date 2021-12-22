package estudiante;

import generico.Descripcion;
import estudiante.values.IdObservacion;
import generico.Tipo;
import generico.Valoracion;
import generico.Entity;

import java.util.Objects;

public class Observacion extends Entity<IdObservacion> {

    private Tipo tipo;
    private Descripcion descripcion;
    private Valoracion valoracion;

    public Observacion(IdObservacion id, Tipo tipo, Descripcion descripcion, Valoracion valoracion) {
        super(id);
        this.tipo = Objects.requireNonNull(tipo, "El tipo de observacion no puede ser null");
        this.descripcion = Objects.requireNonNull(descripcion,"La descripcion no debe ser null");
        this.valoracion = Objects.requireNonNull(valoracion,"La valoracion no debe ser null");
    }

    public Observacion(IdObservacion id, Tipo tipo, Descripcion descripcion) {
        super(id);
        this.tipo = Objects.requireNonNull(tipo, "El tipo de observacion no puede ser null");
        this.descripcion = Objects.requireNonNull(descripcion,"La descripcion no debe ser null");
    }

    public void asignarValoracion(Valoracion valoracion){
        this.valoracion = Objects.requireNonNull(valoracion,"La valoracion no debe ser null");;
    }
}
