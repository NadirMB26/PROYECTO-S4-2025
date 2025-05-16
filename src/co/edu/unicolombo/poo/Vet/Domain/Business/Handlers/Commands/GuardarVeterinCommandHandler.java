
package co.edu.unicolombo.poo.Vet.Domain.Business.Handlers.Commands;

import co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Commands.IGuardarVeterinComand;
import co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Repositories.IVeterinRepository;
import co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Usecases.GuardarVeterinCommand;
import co.edu.unicolombo.poo.Vet.Domain.Model.Veterinario;

/**
 *
 * @author USER
 */
public class GuardarVeterinCommandHandler implements IGuardarVeterinComand{
    private IVeterinRepository veteRepository;

    public GuardarVeterinCommandHandler(IVeterinRepository veteRepository) {
        this.veteRepository = veteRepository;
    }

    @Override
    public int createVeterin(GuardarVeterinCommand comando) throws Exception{
         Veterinario vete = new Veterinario();
         vete.setNombre(comando.getNombre());
         vete.setApellido(comando.getApellido());
         vete.setCedula(comando.getCedula());
         vete.setCorreo(comando.getCorreo());
         vete.setDireccion(comando.getDireccion());
         vete.setClave(comando.getClave());
         vete.setTelefono(comando.getTelefono());
         vete.setEspecialidad(comando.getEspecialidad());
         return veteRepository.GuardarVeterinario(vete);
    }
    
    
}
