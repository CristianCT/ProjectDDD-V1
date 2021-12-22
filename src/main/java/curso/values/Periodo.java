package curso.values;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

public final class Periodo implements Serializable {
    private final Double value;

    public Periodo(Double value) {
        this.value = Objects.requireNonNull(value, "EL Periodo no puede ser null");
        if(this.value < LocalDateTime.now().getYear()){
            throw new IllegalArgumentException("Debe ser un Periodo validO");
        }
    }

    public Double getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Periodo that = (Periodo) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
