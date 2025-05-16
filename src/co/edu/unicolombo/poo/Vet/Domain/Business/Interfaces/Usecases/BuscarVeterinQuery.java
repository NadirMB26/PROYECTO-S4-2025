package co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Usecases;

/**
 *
 * @author USER
 */
public class BuscarVeterinQuery {

    private String VeterinID;

    public BuscarVeterinQuery(String VeterinID) throws Exception {
        this.VeterinID = VeterinID;
        if (VeterinID == null || VeterinID.trim().isEmpty()) {
            throw new Exception("La ID del veterinario es requerida");
        }
        
    }

    public String getRolID() {
        return VeterinID;
    }
}
