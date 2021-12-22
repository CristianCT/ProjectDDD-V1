package curso;

import curso.values.*;
import generico.Entity;

public class Evento extends Entity<IdEvento> {

    private Titulo titulo;
    private Razon razon;
    private Responsable responsable;
    private CargoResponsable cargoResponsable;
    private Evidencia evidencia;

    public Evento(IdEvento id) {
        super(id);
    }

    public void adjuntarEvidencia(){

    }

    public Titulo titulo() {
        return titulo;
    }

    public Razon razon() {
        return razon;
    }

    public Responsable responsable() {
        return responsable;
    }

    public CargoResponsable cargoResponsable() {
        return cargoResponsable;
    }

    public Evidencia evidencia() {
        return evidencia;
    }
}
