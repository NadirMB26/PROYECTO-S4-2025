
package co.edu.unicolombo.poo.Domain.Business.Interfaces.Usecases;

import co.edu.unicolombo.poo.Domain.Business.Interfaces.Commands.IGuardarRoleCommand;
import co.edu.unicolombo.poo.Domain.Business.Interfaces.Repositories.IRoleRepository;
import co.edu.unicolombo.poo.Domain.Model.Role;

public class GuardarRolCommandHandler implements IGuardarRoleCommand{
   private IRoleRepository rolRepository;
   public GuardarRolCommandHandler(IRoleRepository rolRepository){
     this.rolRepository=rolRepository;
   }

    @Override
    public int createRole(GuardarRolCommand comando) throws Exception {
     Role rol1=new Role();
     rol1.setName(comando.getNombre());
     rol1.setDescripcion(comando.getDescripcion());
     return rolRepository.GuardarRole(rol1);
    }
}
