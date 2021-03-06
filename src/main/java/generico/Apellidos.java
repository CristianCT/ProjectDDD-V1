package generico;

import java.io.Serializable;
import java.util.Objects;

public final class Apellidos implements Serializable {
    private final String value;

    public Apellidos(String value) {
        this.value = Objects.requireNonNull(value, "El nombre no puede ser null");
        if(this.value.length() < 3 || this.value.isBlank()){
            throw new IllegalArgumentException("Debe ser un nombre valido");
        }
    }

    public String getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Apellidos that = (Apellidos) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
