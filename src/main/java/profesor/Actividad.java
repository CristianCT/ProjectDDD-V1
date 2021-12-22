package profesor;

import generico.Entity;
import profesor.values.*;

import java.util.Objects;

public class Actividad extends Entity<IdActividad> {
    private Categoria categoria;
    private Cuestionario cuestionario;
    private Fecha fecha;
    private Plazo plazo;

    public Actividad(IdActividad id, Categoria categoria, Cuestionario cuestionario, Fecha fecha, Plazo plazo) {
        super(id);
        this.categoria = Objects.requireNonNull(categoria, "La categoria no puede ser null");
        this.cuestionario = Objects.requireNonNull(cuestionario, "El cuestionario no puede ser null");
        this.fecha = Objects.requireNonNull(fecha, "La fecha no puede ser null");
        this.plazo = Objects.requireNonNull(plazo, "El plazo no puede ser null");
    }

    public void modificarFecha(Fecha fecha){
        this.fecha = fecha;
    }

    public void modificarPlazo(Plazo plazo){
        this.plazo = plazo;
    }

    public void remplazarCuestionario(Cuestionario cuestionario){
        this.cuestionario = cuestionario;
    }

    public Categoria categoria() {
        return categoria;
    }

    public Cuestionario cuestionario() {
        return cuestionario;
    }

    public Fecha fecha() {
        return fecha;
    }

    public Plazo plazo() {
        return plazo;
    }
}
