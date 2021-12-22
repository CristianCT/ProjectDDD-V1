package curso;

import curso.values.IdCalificacion;
import estudiante.values.IdEntrega;
import generico.Descripcion;
import generico.Entity;
import generico.Valoracion;

public class Calificacion extends Entity<IdCalificacion> {
    private IdEntrega idEntrega;
    private Valoracion valoracion;
    private Descripcion descripcion;

    public Calificacion(IdCalificacion id) {
        super(id);
    }

    public void asignarValoracion(){

    }

    public IdEntrega idEntrega() {
        return idEntrega;
    }

    public Valoracion valoracion() {
        return valoracion;
    }

    public Descripcion descripcion() {
        return descripcion;
    }
}
