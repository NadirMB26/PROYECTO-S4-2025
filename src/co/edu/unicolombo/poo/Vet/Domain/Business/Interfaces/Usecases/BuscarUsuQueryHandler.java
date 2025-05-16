
package co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Usecases;

import co.edu.unicolombo.poo.Vet.Domain.Model.Usuario;
import co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Repositories.IUsuRepository;
import co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Queries.IBuscarUsuQuery;


public class BuscarUsuQueryHandler implements IBuscarUsuQuery{
    private IUsuRepository rolRepository;

    public BuscarUsuQueryHandler(IUsuRepository rolRepository) {
     this.rolRepository = rolRepository;
    }

    @Override
    public Usuario obtenerRol(BuscarUsuquery query) throws Exception {
      int rolId=query.getRolID();
      String usu=String.valueOf(rolId);
        return rolRepository.BuscarUsuPorId(usu);
    }
}
