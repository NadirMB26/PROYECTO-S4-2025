
package co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Usecases;


public class BuscarUsuquery {

    private int usuID;

    public BuscarUsuquery(int usuID) throws Exception {
        if (usuID <= 0) {
            throw new Exception("La Cedula es requerid");
        }
        this.usuID = usuID;
    }

    public int getRolID() {
        return usuID;
    }
}
