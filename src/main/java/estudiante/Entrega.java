package estudiante;

import profesor.values.IdActividad;
import estudiante.values.IdEntrega;
import estudiante.values.Solucion;
import generico.Tipo;
import generico.Entity;

import java.util.Objects;

public class Entrega extends Entity<IdEntrega> {

    private IdActividad idActividad;
    private Solucion solucion;

    public Entrega(IdEntrega id, IdActividad idActividad) {
        super(id);
        this.idActividad = Objects.requireNonNull(idActividad, "El ID de la actividad no puede ser null");
    }

    public Entrega(IdEntrega id, IdActividad idActividad, Tipo tipo, Solucion solucion) {
        super(id);
        this.idActividad = Objects.requireNonNull(idActividad, "El ID de la actividad no puede ser null");
        this.solucion = Objects.requireNonNull(solucion, "La solución no puede ser null");
    }

    public void adjuntarSolucion(Solucion solucion){
        this.solucion = solucion;
    }

    public IdActividad idActividad(){
        return idActividad;
    }

    public Solucion solucion() {
        return solucion;
    }
}
