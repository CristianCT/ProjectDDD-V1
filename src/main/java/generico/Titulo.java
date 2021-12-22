package generico;

import java.io.Serializable;
import java.util.Objects;

public final class Titulo implements Serializable {
    private final String value;

    public Titulo(String value) {
        this.value = Objects.requireNonNull(value, "El Titulo no puede ser null");
        if(this.value.isBlank()){
            throw new IllegalArgumentException("Debe ser un Titulo valido");
        }
    }

    public String getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Titulo that = (Titulo) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
