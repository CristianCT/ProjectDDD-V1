package profesor.values;

import java.io.Serializable;
import java.util.Objects;

public final class Objetivo implements Serializable {
    private final String value;

    public Objetivo(String value) {
        this.value = Objects.requireNonNull(value, "El Objetivo no puede ser null");
        if(this.value.isBlank()){
            throw new IllegalArgumentException("Debe ser un Objetivo valido");
        }
    }

    public String getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Objetivo that = (Objetivo) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
