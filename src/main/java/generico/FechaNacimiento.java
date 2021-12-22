package generico;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

public final class FechaNacimiento implements Serializable {
    private final LocalDateTime value;

    public FechaNacimiento(LocalDateTime value) {
        this.value = Objects.requireNonNull(value, "La fecha no puede ser null"); // Validar que el campo no sea nulo
        if(value.isBefore(LocalDateTime.now())){
            throw new IllegalArgumentException("La fecha no puede ser posterior a la fecha actual");
        }
    }

    public LocalDateTime getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FechaNacimiento that = (FechaNacimiento) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
