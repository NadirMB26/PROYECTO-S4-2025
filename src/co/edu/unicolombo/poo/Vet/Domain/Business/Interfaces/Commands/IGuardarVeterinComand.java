
package co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Commands;

import co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Usecases.GuardarVeterinCommand;

/**
 *
 * @author nadir
 */
public interface IGuardarVeterinComand {
     public int createVeterin(GuardarVeterinCommand comando)throws Exception;  
}
