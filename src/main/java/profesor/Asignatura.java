package profesor;

import generico.Entity;
import generico.Nombre;
import profesor.values.Contenido;
import profesor.values.IdAsignatura;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Asignatura extends Entity<IdAsignatura> {

    private Nombre nombre;
    private Set<Actividad> actividades;
    private Contenido contenido;


    public Asignatura(IdAsignatura idAsignatura, Nombre nombre, Contenido contenido) {
        super(idAsignatura);
        this.nombre = Objects.requireNonNull(nombre, "El nombre no puede ser null");
        this.contenido = Objects.requireNonNull(contenido, "El contenido no puede ser null");
        this.actividades = new HashSet<>();
    }

    public void remplazarContenido(Contenido contenido){
        this.contenido = contenido;
    }

    public Nombre nombre() {
        return nombre;
    }

    public Set<Actividad> actividades() {
        return actividades;
    }

    public Contenido contenido() {
        return contenido;
    }
}
