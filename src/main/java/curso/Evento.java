package curso;

import curso.values.*;
import generico.Entity;
import generico.Titulo;

import java.util.Objects;

public class Evento extends Entity<IdEvento> {

    private Titulo titulo;
    private Razon razon;
    private IdResponsable idResponsable;
    private CargoResponsable cargoResponsable;
    private Evidencia evidencia;

    public Evento(IdEvento idEvento, Razon razon, IdResponsable idResponsable, CargoResponsable cargoResponsable, Evidencia evidencia) {
        super(idEvento);
        this.razon = Objects.requireNonNull(razon, "La razon no debe ser null");
        this.idResponsable = Objects.requireNonNull(idResponsable, "El IdResponsable no debe ser null");
        this.cargoResponsable = Objects.requireNonNull(cargoResponsable, "El cargo del responsable no debe ser null");
        this.evidencia = Objects.requireNonNull(evidencia, "La evidencia no debe ser null");
    }

    public Evento(IdEvento idEvento, Razon razon, IdResponsable idResponsable, CargoResponsable cargoResponsable) {
        super(idEvento);
        this.razon = Objects.requireNonNull(razon, "La razon no debe ser null");
        this.idResponsable = Objects.requireNonNull(idResponsable, "El responsable no debe ser null");
        this.cargoResponsable = Objects.requireNonNull(cargoResponsable, "El cargo del responsable no debe ser null");
    }

    public void adjuntarEvidencia(Evidencia evidencia){
        this.evidencia = evidencia;
    }

    public Titulo titulo() {
        return titulo;
    }

    public Razon razon() {
        return razon;
    }

    public IdResponsable responsable() {
        return idResponsable;
    }

    public CargoResponsable cargoResponsable() {
        return cargoResponsable;
    }

    public Evidencia evidencia() {
        return evidencia;
    }
}
