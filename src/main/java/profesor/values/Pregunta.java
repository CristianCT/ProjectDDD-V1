package profesor.values;

import java.io.Serializable;
import java.util.Objects;

public final class Pregunta implements Serializable {
    private final String value;

    public Pregunta(String value) {
        this.value = Objects.requireNonNull(value, "La Pregunta no puede ser null");
        if(this.value.isBlank()){
            throw new IllegalArgumentException("Debe ser una Pregunta valida");
        }
    }

    public String getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pregunta that = (Pregunta) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
