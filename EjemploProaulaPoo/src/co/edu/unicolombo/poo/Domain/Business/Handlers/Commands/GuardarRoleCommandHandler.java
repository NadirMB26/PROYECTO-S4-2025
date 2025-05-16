
package co.edu.unicolombo.poo.Domain.Business.Handlers.Commands;

import co.edu.unicolombo.poo.Domain.Business.Interfaces.Repositories.IRoleRepository;
import co.edu.unicolombo.poo.Domain.Model.Role;
import co.edu.unicolombo.poo.Domain.Business.Interfaces.Commands.IGuardarRoleCommand;
import co.edu.unicolombo.poo.Domain.Business.Interfaces.Usecases.GuardarRolCommand;

public class GuardarRoleCommandHandler implements IGuardarRoleCommand{
   private IRoleRepository rolRepository; 
   public GuardarRoleCommandHandler(IRoleRepository repository){
       rolRepository=repository;
   }

    @Override
    public int createRole(GuardarRolCommand comand) throws Exception {
        Role rol1=new Role();
        rol1.setName(comand.getNombre());
        rol1.setDescripcion(comand.getDescripcion());
        return rolRepository.GuardarRole(rol1);
    }

   
}
