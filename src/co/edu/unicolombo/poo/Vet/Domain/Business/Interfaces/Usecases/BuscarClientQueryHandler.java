
package co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Usecases;

import co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Queries.IBuscarClientQuery;
import co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Repositories.IClientRepository;
import co.edu.unicolombo.poo.Vet.Domain.Model.Cliente;


public class BuscarClientQueryHandler implements IBuscarClientQuery{
    private IClientRepository clientRepository;

    public BuscarClientQueryHandler(IClientRepository clientRepository) {
     this.clientRepository = clientRepository;
    }

    @Override
    public Cliente obtenerRol(BuscarUsuquery query) throws Exception {
      int rolId=query.getRolID();
      String usu=String.valueOf(rolId);
        return clientRepository.BuscarClientPorId(usu);
    }
}
