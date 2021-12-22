package profesor;

import generico.*;
import profesor.values.*;

import java.time.LocalDateTime;
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

    public void remplazarProyecto(Set<Objetivo> objetivos, Metodologia metodologia){
        this.proyectoDocente = new ProyectoDocente(new IdProyecto(), objetivos, metodologia);
    }

    public void agregarObjetivoAProyectoDocente(String objetivo){
        this.proyectoDocente.objetivos().add(new Objetivo(objetivo));
    }

    public void remplazarMetodologiaDeProyectoDocente(String metodologia){
        this.proyectoDocente.remplazarMetodologia(new Metodologia(metodologia));
    }

    public void remplazarContenidoDeAsignatura(IdAsignatura idAsignatura, Contenido contenido){
        this.asignaturas.stream()
                .filter(asignatura -> asignatura.equals(idAsignatura))
                .forEach(asignatura -> asignatura.remplazarContenido(contenido));
    }

    public void modificarFechaActividad(IdAsignatura idAsignatura, IdActividad idActividad, LocalDateTime fecha){
        this.asignaturas.stream()
                .filter(asignatura -> asignatura.equals(idAsignatura))
                .forEach(asignatura -> asignatura.actividades().stream()
                        .filter(actividad -> actividad.equals(idActividad))
                        .forEach(actividad -> actividad.modificarFecha(new Fecha(fecha)))
                );
    }

    public void modificarPlazoActividad(IdAsignatura idAsignatura, IdActividad idActividad, Double plazo){
        this.asignaturas.stream()
                .filter(asignatura -> asignatura.equals(idAsignatura))
                .forEach(asignatura -> asignatura.actividades().stream()
                        .filter(actividad -> actividad.equals(idActividad))
                        .forEach(actividad -> actividad.modificarPlazo(new Plazo(plazo)))
                );
    }

    public void remplazarCuestionarioActividad(IdAsignatura idAsignatura, IdActividad idActividad, Cuestionario cuestionario){
        this.asignaturas.stream()
                .filter(asignatura -> asignatura.equals(idAsignatura))
                .forEach(asignatura -> asignatura.actividades().stream()
                        .filter(actividad -> actividad.equals(idActividad))
                        .forEach(actividad -> actividad.remplazarCuestionario(cuestionario))
                );
    }

    public void agregarTemaAAsignatura(IdAsignatura idAsignatura, String tema){
        this.asignaturas.stream()
                .filter(asignatura -> asignatura.equals(idAsignatura))
                .forEach(asignatura -> asignatura.remplazarContenido(asignatura.contenido().agregarTema(new Tema(tema))));
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
