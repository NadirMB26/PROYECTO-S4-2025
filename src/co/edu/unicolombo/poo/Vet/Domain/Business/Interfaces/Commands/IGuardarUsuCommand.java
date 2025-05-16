
package co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Commands;

import co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Usecases.GuardarUsuCommand;

public interface IGuardarUsuCommand {
  public int createUsu(GuardarUsuCommand comando)throws Exception;  
}
