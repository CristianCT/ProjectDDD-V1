package curso.values;

import generico.Titulo;

import java.io.File;
import java.io.Serializable;
import java.util.Objects;

public final class Evidencia implements Serializable {
    private final Titulo titulo;
    private final File documento;

    public Evidencia(Titulo titulo, File documento) {
        this.titulo = titulo;
        this.documento = documento;
    }

    public Evidencia(Titulo titulo) {
        this.titulo = titulo;
        this.documento = null;
    }

    public Evidencia adjuntarDocuemnto(File documento){
        return new Evidencia(this.titulo, Objects.requireNonNull(documento, "El documento no puede ser null"));
    }
}
