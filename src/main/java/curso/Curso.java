package curso;

import curso.values.*;
import estudiante.values.IdEstudiante;
import generico.AggregateRoot;
import profesor.values.IdProfesor;

import java.util.HashSet;
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
        this.periodo = periodo;
        this.gradoAcademico = gradoAcademico;
        this.estudiantes = new HashSet<>();
        this.profesores = new HashSet<>();
        this.calificaciones = new HashSet<>();
        this.eventos = new HashSet<>();
    }

    public void agregarCalificacion(){

    }

    public void agregarEvento(){

    }

    public void agregarProfesor(){

    }

    public void remplazarProfesor(){

    }

    public void removerProfesor(){

    }

    public void agregarEstudiante(){

    }

    public void removerEstudiante(){

    }

    public void adjuntarEvidenciaAEvento(){

    }

    public void asignarValoracionACalificacion(){

    }

    public void agregarObservacionACalificacion(){

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
