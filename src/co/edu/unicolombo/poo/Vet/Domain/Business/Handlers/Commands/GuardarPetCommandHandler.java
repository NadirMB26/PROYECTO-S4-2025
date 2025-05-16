
package co.edu.unicolombo.poo.Vet.Domain.Business.Handlers.Commands;

import co.edu.unicolombo.poo.Infrastructure.Vet.Repositories.MascotasRepository;
import co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Commands.IGuardarPetCommand;
import co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Usecases.GuardarPetCommand;
import co.edu.unicolombo.poo.Vet.Domain.Model.Mascota;


public class GuardarPetCommandHandler implements IGuardarPetCommand{

    private MascotasRepository petRepository;

    public GuardarPetCommandHandler(MascotasRepository petRepository) {
        this.petRepository = petRepository;
    }
    
    @Override
    public int createPet(GuardarPetCommand comando) throws Exception {
        Mascota pet=new Mascota();
        pet.setCedulaUsuario(comando.getCedulaUsuario());
        pet.setNombreMascota(comando.getNombreMascota());
        pet.setColor(comando.getColor());
        pet.setEspecie(comando.getEspecie());
        pet.setTipoSangre(comando.getTipoSangre());
        return petRepository.guardarMascota(pet);
    }
    
}
