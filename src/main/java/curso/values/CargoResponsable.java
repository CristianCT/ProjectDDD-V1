package curso.values;

import java.io.Serializable;
import java.util.Objects;

public final class CargoResponsable implements Serializable {
    private final String value;

    public CargoResponsable(String value) {
        this.value = Objects.requireNonNull(value, "El CargoResponsable no puede ser null");
        if(this.value.isBlank()){
            throw new IllegalArgumentException("Debe ser un CargoResponsable valido");
        }
    }

    public String getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CargoResponsable that = (CargoResponsable) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
