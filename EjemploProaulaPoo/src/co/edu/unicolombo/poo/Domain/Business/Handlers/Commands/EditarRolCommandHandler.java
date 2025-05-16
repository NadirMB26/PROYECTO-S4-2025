
package co.edu.unicolombo.poo.Domain.Business.Handlers.Commands;

import co.edu.unicolombo.poo.Domain.Business.Interfaces.Commands.IEditarRolCommand;
import co.edu.unicolombo.poo.Domain.Business.Interfaces.Repositories.IRoleRepository;
import co.edu.unicolombo.poo.Domain.Business.Interfaces.Usecases.EditarRolCommand;
import co.edu.unicolombo.poo.Domain.Model.Role;


public class EditarRolCommandHandler implements IEditarRolCommand{

private IRoleRepository rolRepository;

public EditarRolCommandHandler (IRoleRepository rolRepository) {
this. rolRepository = rolRepository;
}



    @Override
    public void editar(EditarRolCommand comand) throws Exception {
    Role rol1 = new Role ();
    rol1.setId(comand.getID());
    rol1.setName( comand.getNombre()) ;
    rol1.setDescripcion(comand.getDescripcion()) ;
    rolRepository.editRole(rol1);
    }

  
}