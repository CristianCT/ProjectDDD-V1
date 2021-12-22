package profesor.values;

import generico.Titulo;

import java.io.Serializable;
import java.util.Objects;

public final class Categoria implements Serializable {
    private final Titulo titulo;
    private final DescripcionEvaluacion descripcionEvaluacion;

    public Categoria(Titulo titulo, DescripcionEvaluacion descripcionEvaluacion) {
        this.titulo = Objects.requireNonNull(titulo, "El titulo no puede ser null");
        if(this.titulo.getValue().isBlank()) throw new IllegalArgumentException("Debe ser un titulo valido");

        this.descripcionEvaluacion = Objects.requireNonNull(descripcionEvaluacion, "La descripcion no puede ser null");
        if(this.descripcionEvaluacion.getValue().isBlank()) throw new IllegalArgumentException("Debe ser un titulo valido");

    }
}
