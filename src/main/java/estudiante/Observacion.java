package estudiante;

import generico.Descripcion;
import estudiante.values.IdObservacion;
import generico.Tipo;
import generico.Valoracion;
import generico.Entity;

public class Observacion extends Entity<IdObservacion> {

    private Tipo tipo;
    private Descripcion descripcion;
    private Valoracion valoracion;

    public Observacion(IdObservacion id) {
        super(id);
    }
}
