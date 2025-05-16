package co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Usecases;

import co.edu.unicolombo.poo.Infrastructure.Vet.Repositories.MascotasRepository;
import co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Queries.IBuscarPetQuery;
import co.edu.unicolombo.poo.Vet.Domain.Model.Mascota;

public class BuscarPetQueryHandler implements IBuscarPetQuery {

    private MascotasRepository petRepository;

    public BuscarPetQueryHandler(MascotasRepository petRepository) {
        this.petRepository = petRepository;
    }

    @Override
    public Mascota obtenerPet(BuscarPetQuery query) throws Exception {
        String CCliente = query.getCedulaUsuario();
        
        return petRepository.buscarMascotaPorId(CCliente);
    }

}
