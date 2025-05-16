
package co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Commands;

import co.edu.unicolombo.poo.Vet.Domain.Model.Mascota;
import co.edu.unicolombo.poo.Vet.Domain.Model.Usuario;


public interface IEliminarPetCommand {
    public void eliminarPet(Mascota nombre)throws Exception;
}
