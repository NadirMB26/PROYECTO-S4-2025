package co.edu.unicolombo.poo.Vet.Domain.Business.Handlers.Commands;

import co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Commands.IEditarVeterinCommand;
import co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Repositories.IVeterinRepository;
import co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Usecases.EditarVeterinCommand;
import co.edu.unicolombo.poo.Vet.Domain.Model.Veterinario;

/**
 *
 * @author USER
 */
public class EditarVeterinCommandHandler implements IEditarVeterinCommand {

    private IVeterinRepository veteRepository;

    public EditarVeterinCommandHandler(IVeterinRepository veteRepository) {
        this.veteRepository = veteRepository;
    }

    @Override
    public void editar(EditarVeterinCommand comand) throws Exception {
        Veterinario vet = new Veterinario();
        vet.setNombre(comand.getNombre());
        vet.setApellido(comand.getApellido());
        vet.setCedula(comand.getCedula());
        vet.setCorreo(comand.getCorreo());
        vet.setDireccion(comand.getDireccion());
        vet.setEspecialidad(comand.getEspecialidad());
        vet.setTelefono(comand.getTelefono());
        vet.setClave(comand.getClave());
        veteRepository.editVete(vet);
        
    }

}
