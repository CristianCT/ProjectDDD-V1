package generico;

import java.io.Serializable;
import java.util.Objects;

public final class Valoracion implements Serializable {
    private final Double value;

    public Valoracion(Double valor) {
        this.value = Objects.requireNonNull(valor, "El valor no puede ser null");
        if(this.value < 0)
            throw new IllegalArgumentException("El valor debe ser positivo");
    }

    public Double getValue(){
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Valoracion that = (Valoracion) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
