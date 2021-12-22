package curso;

import curso.values.*;
import estudiante.values.IdEntrega;
import estudiante.values.IdEstudiante;
import generico.AggregateRoot;
import generico.Titulo;
import generico.Valoracion;
import profesor.values.IdProfesor;

import java.io.File;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Curso extends AggregateRoot<IdCurso> {
    private Periodo periodo;
    private GradoAcademico gradoAcademico;
    private Set<IdEstudiante> estudiantes;
    private Set<IdProfesor> profesores;
    private Set<Calificacion> calificaciones;
    private Set<Evento> eventos;

    public Curso(IdCurso idCurso, Periodo periodo, GradoAcademico gradoAcademico){
        super(idCurso);
        this.periodo = Objects.requireNonNull(periodo, "El periodo no puede ser null");
        this.gradoAcademico = Objects.requireNonNull(gradoAcademico, "El grado academico no puede ser null");
        this.estudiantes = new HashSet<>();
        this.profesores = new HashSet<>();
        this.calificaciones = new HashSet<>();
        this.eventos = new HashSet<>();
    }

    public void agregarCalificacion(IdEntrega idEntrega, Double valor, String aclaracion){
        this.calificaciones.add(new Calificacion(new IdCalificacion(), new Valoracion(valor), new Aclaracion(aclaracion)));
    }

    public void agregarCalificacion(IdEntrega idEntrega,  String aclaracion){
        this.calificaciones.add(new Calificacion(new IdCalificacion(), new Aclaracion(aclaracion)));
    }

    public void agregarEvento(IdEvento idEvento, Razon razon, IdResponsable idResponsable, CargoResponsable cargoResponsable, Evidencia evidencia){
        this.eventos.add(new Evento(new IdEvento(), razon, idResponsable, cargoResponsable, evidencia));
    }

    public void agregarEvento(IdEvento idEvento, Razon razon, IdResponsable idResponsable, CargoResponsable cargoResponsable){
        this.eventos.add(new Evento(new IdEvento(), razon, idResponsable, cargoResponsable));
    }

    public void agregarProfesor(IdProfesor idProfesor){
        this.profesores.add(idProfesor);
    }

    public void removerProfesor(IdProfesor idProfesor){
        this.profesores.removeIf(profesor -> profesor.equals(idProfesor));
    }

    public void agregarEstudiante(IdEstudiante idEstudiante){
        this.estudiantes.add(idEstudiante);
    }

    public void removerEstudiante(IdEstudiante idEstudiante){
        this.estudiantes.removeIf(estudiante -> estudiante.equals(idEstudiante));
    }

    public void adjuntarEvidenciaAEvento(IdEvento idEvento, String titulo, File documento){
        this.eventos.stream()
                .filter(evento -> evento.equals(idEvento))
                .forEach(evento -> evento.adjuntarEvidencia(new Evidencia(new Titulo(titulo), documento)));
    }

    public void asignarValoracionACalificacion(IdCalificacion idCalificacion, Double valoracion){
        this.calificaciones.stream()
                .filter(calificacion -> calificacion.equals(idCalificacion))
                .forEach(calificacion -> calificacion.asignarValoracion(new Valoracion(valoracion)));
    }

    public void agregarAclaracionACalificacion(IdCalificacion idCalificacion, String aclaracion){
        this.calificaciones.stream()
                .filter(calificacion -> calificacion.equals(idCalificacion))
                .forEach(calificacion -> calificacion.agregarAclaracion(new Aclaracion(aclaracion)));
    }

    public Periodo periodo() {
        return periodo;
    }

    public GradoAcademico gradoAcademico() {
        return gradoAcademico;
    }

    public Set<IdEstudiante> estudiantes() {
        return estudiantes;
    }

    public Set<IdProfesor> profesores() {
        return profesores;
    }

    public Set<Calificacion> calificaciones() {
        return calificaciones;
    }

    public Set<Evento> eventos() {
        return eventos;
    }
}
