package profesor;

import generico.*;
import profesor.values.*;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Profesor extends AggregateRoot<IdProfesor> {
    private final Nombre nombre;
    private final Apellidos apellidos;
    private final FechaNacimiento fechaNacimiento;
    private Set<Asignatura> asignaturas;
    private ProyectoDocente proyectoDocente;

    public Profesor(IdProfesor idProfesor, Nombre nombre, Apellidos apellidos, FechaNacimiento fechaNacimiento, ProyectoDocente proyectoDocente) {
        super(idProfesor);
        this.nombre = Objects.requireNonNull(nombre, "El nombre no puede ser null");
        this.apellidos = Objects.requireNonNull(apellidos, "El apellido no puede ser null");
        this.fechaNacimiento = Objects.requireNonNull(fechaNacimiento, "La edad no puede ser null");
        this.proyectoDocente = Objects.requireNonNull(proyectoDocente, "El proyecto docente no puede ser null");
        this.asignaturas = new HashSet<>();
    }

    public void agregarAsignatura(IdAsignatura idAsignatura, Nombre nombre, Contenido contenido){
        this.asignaturas.add(new Asignatura(idAsignatura, nombre, contenido));
    }

    public void removerAsignatura(IdAsignatura idAsignatura){
        this.asignaturas.removeIf(asignatura -> asignatura.getId().equals(idAsignatura));
    }

    public void remplazarProyecto(){

    }

    public void agregarObjetivoAProyectoDocente(){

    }

    public void remplazarMetodologiaDeProyectoDocente(){

    }

    public void remplazarContenidoDeAsignatura(){

    }

    public void modificarFechaInicioActividad(){

    }

    public void modificarFechaLimiteActividad(){

    }

    public void remplazarContenidoActividad(){

    }

    public Nombre nombre() {
        return nombre;
    }

    public Apellidos apellidos() {
        return apellidos;
    }

    public FechaNacimiento fechaNacimiento() {
        return fechaNacimiento;
    }

    public Set<Asignatura> asignaturas() {
        return asignaturas;
    }

    public ProyectoDocente proyectoDocente() {
        return proyectoDocente;
    }
}
