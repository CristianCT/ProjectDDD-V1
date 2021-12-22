package profesor;

import generico.Entity;
import profesor.values.*;

public class Actividad extends Entity<IdActividad> {
    private Categoria categoria;
    private Cuestionario cuestionario;
    private FechaInicio fechaInicio;
    private FechaLimite fechaLimite;

    public Actividad(IdActividad id) {
        super(id);
    }

    public void modificarFechaInicio(){

    }

    public void modificarFechaLimite(){

    }

    public void remplazarCuestionario(){

    }

    public Categoria categoria() {
        return categoria;
    }

    public Cuestionario cuestionario() {
        return cuestionario;
    }

    public FechaInicio fechaInicio() {
        return fechaInicio;
    }

    public FechaLimite fechaLimite() {
        return fechaLimite;
    }
}
