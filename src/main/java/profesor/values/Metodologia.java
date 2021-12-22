package profesor.values;

import generico.Descripcion;

import java.io.Serializable;
import java.util.Objects;

public final class Metodologia implements Serializable {
    private final String value;

    public Metodologia(String value) {
        this.value = Objects.requireNonNull(value, "La Metodologia no puede ser null");
        if(this.value.isBlank()){
            throw new IllegalArgumentException("Debe ser una Metodologia valida");
        }
    }

    public String getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Metodologia that = (Metodologia) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
