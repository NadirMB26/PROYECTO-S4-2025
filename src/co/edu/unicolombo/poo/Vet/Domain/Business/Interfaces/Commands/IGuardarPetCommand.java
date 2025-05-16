
package co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Commands;

import co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Usecases.GuardarPetCommand;



public interface IGuardarPetCommand {
    public int createPet(GuardarPetCommand comando)throws Exception; 
}
