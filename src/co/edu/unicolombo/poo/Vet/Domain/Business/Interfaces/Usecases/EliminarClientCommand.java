
package co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Usecases;

public class EliminarClientCommand {
   private int id;

public EliminarClientCommand (int id) throws Exception {
        if (id <= 0) {
            throw new Exception("El ID es requerido");
        }
        this.id = id;
    }

    public int getID() {
        return id;
    }

}
