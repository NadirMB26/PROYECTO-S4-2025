
package co.edu.unicolombo.poo.Vet.Domain.Business.Handlers.Commands;

import co.edu.unicolombo.poo.Infrastructure.Vet.Repositories.MascotasRepository;
import co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Commands.IEliminarPetCommand;
import co.edu.unicolombo.poo.Vet.Domain.Model.Mascota;


public class EliminarPetCommandHandler implements IEliminarPetCommand{

    private MascotasRepository petRepository;

    public EliminarPetCommandHandler(MascotasRepository petRepository) {
        this.petRepository = petRepository;
    }    
    
    @Override
    public void eliminarPet(Mascota mascota) throws Exception {
        petRepository.eliminarMascota(mascota.getCedulaUsuario());
        
    }
    
}
