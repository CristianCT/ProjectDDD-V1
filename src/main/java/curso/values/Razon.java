package curso.values;

import generico.Titulo;

import java.io.Serializable;
import java.util.Objects;

public final class Razon implements Serializable {
    private final Titulo titulo;
    private final Detalle detalles;

    public Razon(Titulo titulo, Detalle detalles) {
        this.titulo = Objects.requireNonNull(titulo, "El titulo no debe ser null");
        this.detalles = Objects.requireNonNull(detalles, "Los detalles no deben ser null");
    }
}
