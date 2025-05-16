package co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Usecases;

import co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Queries.IBuscarVeterinQuery;
import co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Repositories.IVeterinRepository;
import co.edu.unicolombo.poo.Vet.Domain.Model.Veterinario;

public class BuscarVeterinQueryHandler implements IBuscarVeterinQuery {

    private IVeterinRepository veteRepository;

    public BuscarVeterinQueryHandler(IVeterinRepository veteRepository) {
        this.veteRepository = veteRepository;
    }

    @Override
    public Veterinario obtenerVeterin(BuscarVeterinQuery Query) throws Exception {
        String rolID = Query.getRolID();
        return veteRepository.BuscarVetePorId(rolID);
    }

}
