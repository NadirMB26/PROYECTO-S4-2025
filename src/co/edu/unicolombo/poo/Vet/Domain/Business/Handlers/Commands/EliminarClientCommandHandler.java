
package co.edu.unicolombo.poo.Vet.Domain.Business.Handlers.Commands;


import co.edu.unicolombo.poo.Infrastructure.Vet.Repositories.ClienteRepository;
import co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Commands.IEliminarClientCommand;
import co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Repositories.IClientRepository;
import co.edu.unicolombo.poo.Vet.Domain.Model.Cliente;


public class EliminarClientCommandHandler implements IEliminarClientCommand{

private ClienteRepository clientRepository;

    public EliminarClientCommandHandler(ClienteRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Override
    public void eliminarclient(Cliente cedula) throws Exception {  
      clientRepository.deleteClient(cedula.getCedula());
    }

  
  
}