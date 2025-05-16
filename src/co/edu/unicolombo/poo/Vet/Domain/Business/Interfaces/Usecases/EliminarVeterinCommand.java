
package co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Usecases;

/**
 *
 * @author USER
 */
public class EliminarVeterinCommand {

    private int id;

    public EliminarVeterinCommand(int id) throws Exception {
        if (id <= 0) {
            throw new Exception("El ID es requerido");
        }
        this.id = id;
    }
    public int getID() {
        return id;
    }
}
