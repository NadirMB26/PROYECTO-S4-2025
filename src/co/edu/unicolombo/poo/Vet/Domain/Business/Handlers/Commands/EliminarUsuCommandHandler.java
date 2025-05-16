
package co.edu.unicolombo.poo.Vet.Domain.Business.Handlers.Commands;


import co.edu.unicolombo.poo.Vet.Domain.Model.Usuario;
import co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Repositories.IUsuRepository;
import co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Commands.IEliminarUsuCommand;


public class EliminarUsuCommandHandler implements IEliminarUsuCommand{

private IUsuRepository rolRepository;

    public EliminarUsuCommandHandler(IUsuRepository rolRepository) {
        this.rolRepository = rolRepository;
    }

    @Override
    public void eliminar(Usuario usu) throws Exception {
        Usuario usu1 = new Usuario();
        usu1.setCedula(usu.getCedula());
        rolRepository.deleteUsu(usu.getCedula());
    }
  
}