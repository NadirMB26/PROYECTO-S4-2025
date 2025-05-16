
package co.edu.unicolombo.poo.Vet.Domain.Business.Handlers.Commands;

import co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Usecases.EditarUsuCommand;
import co.edu.unicolombo.poo.Vet.Domain.Model.Usuario;
import co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Repositories.IUsuRepository;
import co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Commands.IEditarUsuCommand;


public class EditarUsuCommandHandler implements IEditarUsuCommand{

    private IUsuRepository usuRepository;

    public EditarUsuCommandHandler(IUsuRepository repository) {
        this.usuRepository = repository;
    }

    @Override
    public void editar(EditarUsuCommand comand) throws Exception {
        Usuario usu1 = new Usuario();
        usu1.setCedula(comand.getCedula());
        usu1.setApellido(comand.getApellido());
        usu1.setNombre(comand.getNombre());
        usu1.setDireccion(comand.getDireccion());
        usu1.setCorreo(comand.getCorreo());
        usu1.setClave(comand.getClave());
        usu1.setTelefono(comand.getTelefono());
        usuRepository.editUsu(usu1);
    }

}