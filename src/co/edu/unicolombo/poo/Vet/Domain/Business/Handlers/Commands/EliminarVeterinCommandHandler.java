
package co.edu.unicolombo.poo.Vet.Domain.Business.Handlers.Commands;

import co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Commands.IEliminarVeterinCommand;
import co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Repositories.IVeterinRepository;
import co.edu.unicolombo.poo.Vet.Domain.Model.Veterinario;

/**
 *
 * @author USER
 */
public class EliminarVeterinCommandHandler implements IEliminarVeterinCommand{
    private IVeterinRepository veteRepository;

    public EliminarVeterinCommandHandler(IVeterinRepository veteRepository) {
        this.veteRepository = veteRepository;
    }

    @Override
    public void eliminar(Veterinario veterinario) throws Exception {
        Veterinario vete1 = new Veterinario();
        vete1.setCedula(veterinario.getCedula());
        veteRepository.deleteVete(veterinario.getCedula());
    }
    
    
}
