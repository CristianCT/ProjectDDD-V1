package estudiante;

import estudiante.values.*;
import generico.*;
import profesor.values.IdActividad;

import java.io.File;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Estudiante extends AggregateRoot<IdEstudiante> {

    private final Nombre nombre;
    private final Apellidos apellidos;
    private final FechaNacimiento fechaNacimiento;
    private Set<Entrega> entregas;
    private Set<Observacion> observaciones;

    public Estudiante(IdEstudiante idEstudiante, Nombre nombre, Apellidos apellidos, FechaNacimiento fechaNacimiento) {
        super(idEstudiante);
        this.nombre = Objects.requireNonNull(nombre, "El nombre no debe ser null");
        this.apellidos = Objects.requireNonNull(apellidos, "El apellido no puede ser null");
        this.fechaNacimiento = Objects.requireNonNull(fechaNacimiento, "La fecha de nacimiento no puede ser null");
        this.entregas = new HashSet<>();
        this.observaciones = new HashSet<>();
    }

    public void agregarEntrega(IdActividad idActividad){
        this.entregas.add(new Entrega(new IdEntrega(), idActividad));
    }

    public void agregarEntrega(IdActividad idActividad, Solucion solucion){
        this.entregas.add(new Entrega(new IdEntrega(), idActividad, solucion));
    }

    public void agregarObservacion(Tipo tipo, Descripcion descripcion, Valoracion valoracion){
        this.observaciones.add(new Observacion(new IdObservacion(), tipo, descripcion, valoracion));
    }

    public void agregarObservacion(Tipo tipo, Descripcion descripcion){
        this.observaciones.add(new Observacion(new IdObservacion(), tipo, descripcion));
    }

    public void adjuntarSolucionAEntrega(IdEntrega idEntrega, Solucion solucion){
        this.entregas.stream()
                .filter(entrega -> entrega.equals(idEntrega))
                .forEach(entrega -> entrega.adjuntarSolucion(solucion));
    }

    public void asignarValoracionObservacion(IdObservacion idObservacion, Double valor){
        this.observaciones.stream()
                .filter(observacion -> observacion.equals(idObservacion))
                .forEach(observacion -> observacion.asignarValoracion(new Valoracion(valor)));
    }

    public void adjuntarArchivoASolucion(IdEntrega idEntrega, File archivo){
        this.entregas.stream()
                .filter(entrega -> entrega.equals(idEntrega))
                .forEach(entrega -> entrega.adjuntarSolucion(entrega.solucion().adjuntarArchivo(archivo)));
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

    public Set<Entrega> entregas() {
        return entregas;
    }

    public Set<Observacion> observaciones() {
        return observaciones;
    }
}
