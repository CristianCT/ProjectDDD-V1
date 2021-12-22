package profesor.values;

import java.io.Serializable;
import java.util.Objects;

public final class Plazo implements Serializable {
    private final Double value;

    public Plazo(Double value) {
        this.value = Objects.requireNonNull(value, "El Plazo no puede ser null");
        if(this.value < 1){
            throw new IllegalArgumentException("Debe ser un Plazo valido");
        }
    }

    public Double getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Plazo that = (Plazo) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
