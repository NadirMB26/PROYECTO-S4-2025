
package co.edu.unicolombo.poo.Domain.Business.Interfaces.Usecases;

import co.edu.unicolombo.poo.Domain.Business.Interfaces.Queries.IBuscarRolQuery;
import co.edu.unicolombo.poo.Domain.Business.Interfaces.Repositories.IRoleRepository;
import co.edu.unicolombo.poo.Domain.Model.Role;


public class BuscarRolQueryHandler implements IBuscarRolQuery{
    private IRoleRepository rolRepository;

    public BuscarRolQueryHandler(IRoleRepository rolRepository) {
     this.rolRepository = rolRepository;
    }

    @Override
    public Role obtenerRol(BuscarRolquery query) throws Exception {
      int rolId=query.getRolID();
        return rolRepository.BuscarRolPorId(rolId);
    }
}
