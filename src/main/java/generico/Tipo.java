package generico;

import java.io.Serializable;
import java.util.Objects;

public final class Tipo implements Serializable {
    private final String value;

    public Tipo(String value) {
        this.value = Objects.requireNonNull(value, "El valor no debe ser null");
        if (this.value.isBlank())
            throw new IllegalArgumentException("El valor no debe estar vacio");
    }

    public String getValue(){
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tipo that = (Tipo) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
