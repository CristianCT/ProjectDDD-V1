package profesor.values;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

public final class Fecha implements Serializable {
    private final LocalDateTime value;

    public Fecha(LocalDateTime value) {
        this.value = Objects.requireNonNull(value, "La Fecha no puede ser null");
        if(this.value.isBefore(LocalDateTime.now())){
            throw new IllegalArgumentException("Debe ser una Fecha valida");
        }
    }

    public LocalDateTime getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fecha that = (Fecha) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
