
package co.edu.unicolombo.poo.Vet.Domain.Business.Handlers.Commands;

import co.edu.unicolombo.poo.Infrastructure.Vet.Repositories.MascotasRepository;
import co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Commands.IEditarPetCommand;
import co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Usecases.EditarPetCommand;
import co.edu.unicolombo.poo.Vet.Domain.Model.Mascota;


public class EditarPetCommandHandler implements IEditarPetCommand {
   
    private MascotasRepository petRepository;

    public EditarPetCommandHandler(MascotasRepository petRepository) {
        this.petRepository = petRepository;
    }   
    
    @Override
    public void editarPet(EditarPetCommand comand) throws Exception {
        Mascota pet=new Mascota();
        pet.setCedulaUsuario(comand.getCedulaUsuario());
        pet.setNombreMascota(comand.getNombreMascota());
        pet.setColor(comand.getColor());
        pet.setEspecie(comand.getEspecie());
        pet.setTipoSangre(comand.getTipoSangre());
        petRepository.editarMascota(pet);
    }
    
}
