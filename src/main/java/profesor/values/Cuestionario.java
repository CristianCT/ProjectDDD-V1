package profesor.values;

import generico.Titulo;

import java.io.Serializable;
import java.util.Objects;
import java.util.Set;

public final class Cuestionario implements Serializable {
    private final Titulo titulo;
    private Set<Pregunta> preguntas;

    public Cuestionario(Titulo titulo, Set<Pregunta> preguntas) {
        this.titulo = Objects.requireNonNull(titulo, "El titulo no puede ser null");
        this.preguntas = Objects.requireNonNull(preguntas, "Las preguntas no pueden ser null");
        if (this.preguntas.size() < 1) throw new IllegalArgumentException("Debe tener almenos una pregunta");
    }
}
