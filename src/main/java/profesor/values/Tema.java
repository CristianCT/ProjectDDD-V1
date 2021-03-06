package profesor.values;

import generico.Descripcion;

import java.io.Serializable;
import java.util.Objects;

public final class Tema implements Serializable {
    private final String value;

    public Tema(String value) {
        this.value = Objects.requireNonNull(value, "EL Tema no puede ser null");
        if(this.value.isBlank()){
            throw new IllegalArgumentException("Debe ser un Tema valido");
        }
    }

    public String getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tema that = (Tema) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
