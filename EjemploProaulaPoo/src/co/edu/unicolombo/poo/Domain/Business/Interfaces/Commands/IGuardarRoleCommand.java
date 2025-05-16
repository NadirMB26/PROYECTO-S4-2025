
package co.edu.unicolombo.poo.Domain.Business.Interfaces.Commands;

import co.edu.unicolombo.poo.Domain.Business.Interfaces.Usecases.GuardarRolCommand;

public interface IGuardarRoleCommand {
  public int createRole(GuardarRolCommand comando)throws Exception;  
}
