package estudiante.values;

import java.io.File;
import java.io.Serializable;
import java.util.Objects;

public final class Solucion implements Serializable {
    private final String titulo;
    private final String anotacion;
    private File archivo;

    public Solucion(String titulo, String anotacion, File archivo) {
        this.titulo = Objects.requireNonNull(titulo, "El titulo no debe ser null");
        if (this.titulo.isBlank()) throw new IllegalArgumentException("El titulo no puede estar vacio");

        this.anotacion = Objects.requireNonNull(anotacion, "La anotación no debe ser null");
        if (this.anotacion.isBlank()) throw new IllegalArgumentException("La anotacion no puede estar vacio");

        this.archivo = Objects.requireNonNull(archivo, "El archivo no debe ser null");
    }

    public Solucion(String titulo, String anotacion) {
        this.titulo = Objects.requireNonNull(titulo, "El titulo no debe ser null");
        if (this.titulo.isBlank()) throw new IllegalArgumentException("El titulo no puede estar vacio");

        this.anotacion = Objects.requireNonNull(anotacion, "La anotación no debe ser null");
        if (this.anotacion.isBlank()) throw new IllegalArgumentException("La anotacion no puede estar vacio");
    }

    public Solucion adjuntarArchivo(File archivo){
        return new Solucion(
                this.titulo,
                this.anotacion,
                Objects.requireNonNull(archivo, "El archivo no puede ser null"));
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAnotacion() {
        return anotacion;
    }

    public File getArchivo() {
        return archivo;
    }
}
