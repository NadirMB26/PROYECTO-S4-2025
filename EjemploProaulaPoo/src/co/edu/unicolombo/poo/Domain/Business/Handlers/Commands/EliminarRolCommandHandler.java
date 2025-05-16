
package co.edu.unicolombo.poo.Domain.Business.Handlers.Commands;


import co.edu.unicolombo.poo.Domain.Business.Interfaces.Commands.IEliminarRolCommand;
import co.edu.unicolombo.poo.Domain.Business.Interfaces.Repositories.IRoleRepository;
import co.edu.unicolombo.poo.Domain.Model.Role;


public class EliminarRolCommandHandler implements IEliminarRolCommand{

private IRoleRepository rolRepository;

public EliminarRolCommandHandler (IRoleRepository rolRepository) {
this. rolRepository = rolRepository;
}

    @Override
    public void eliminar(Role rol) throws Exception {
       Role rol1 = new Role();
        rol1.setId(rol.getId()); 
        rolRepository.deleteRole(rol1.getId());
    }



  

  
}