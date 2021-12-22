package curso.values;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

public final class GradoAcademico implements Serializable {
    private final Double value;

    public GradoAcademico(Double value) {
        this.value = Objects.requireNonNull(value, "EL GradoAcademico no puede ser null");
        if(this.value < LocalDateTime.now().getYear()){
            throw new IllegalArgumentException("Debe ser un GradoAcademico valido");
        }
    }

    public Double getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GradoAcademico that = (GradoAcademico) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
