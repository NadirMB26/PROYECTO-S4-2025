
package co.edu.unicolombo.poo.Vet.Domain.Business.Handlers.Commands;

import co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Commands.IEditarClientCommand;
import co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Repositories.IClientRepository;
import co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Usecases.EditarClientCommand;
import co.edu.unicolombo.poo.Vet.Domain.Model.Cliente;


public class EditarClientCommandHandler implements IEditarClientCommand{

    private IClientRepository clientRepository;

    public EditarClientCommandHandler(IClientRepository repository) {
        this.clientRepository = repository;
    }

    @Override
    public void editar(EditarClientCommand comand) throws Exception {
        Cliente usu1 = new Cliente();
        usu1.setCedula(comand.getCedula());
        usu1.setApellido(comand.getApellido());
        usu1.setNombre(comand.getNombre());
        usu1.setDireccion(comand.getDireccion());
        usu1.setCorreo(comand.getCorreo());
        usu1.setTelefono(comand.getTelefono());
        clientRepository.editClient(usu1);
    }

}