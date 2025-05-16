
package co.edu.unicolombo.poo.Domain.Business.Handlers.Queries;

import co.edu.unicolombo.poo.Domain.Business.Interfaces.Queries.IGetRoleQuery;
import co.edu.unicolombo.poo.Domain.Business.Interfaces.Repositories.IRoleRepository;
import co.edu.unicolombo.poo.Domain.Model.Role;


public class GetRoleQueryHandler implements IGetRoleQuery {
    
 private IRoleRepository  roleRepository; 
 
 public GetRoleQueryHandler(IRoleRepository roleRepository){
     this.roleRepository=roleRepository;
 }

    @Override
    public Role GetRol(int rolID) throws Exception {
      return roleRepository.BuscarRolPorId(rolID);
    }

    @Override
    public Role GetRol(String roleName) throws Exception {
    return roleRepository.BuscarRolPorName(roleName);
    }
}
