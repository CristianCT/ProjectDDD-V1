package generico;

import java.util.Objects;

public final class Descripcion {
    private final String value;

    public Descripcion(String value) {
        this.value = Objects.requireNonNull(value, "La descripcion no puede ser null");
        if(this.value.isBlank()){
            throw new IllegalArgumentException("Debe ser una descripcion valida");
        }
    }

    public String getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Descripcion that = (Descripcion) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
