
package co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Usecases;


public class BuscarClientquery {

    private int usuID;

    public BuscarClientquery(int usuID) throws Exception {
        if (usuID <= 0) {
            throw new Exception("La Cedula es requerid");
        }
        this.usuID = usuID;
    }

    public int getRolID() {
        return usuID;
    }
}
