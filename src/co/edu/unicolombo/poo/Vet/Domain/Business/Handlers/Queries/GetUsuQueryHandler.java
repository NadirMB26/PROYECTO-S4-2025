
package co.edu.unicolombo.poo.Vet.Domain.Business.Handlers.Queries;

import co.edu.unicolombo.poo.Vet.Domain.Model.Usuario;
import co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Queries.IGetUsuQuery;
import co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Repositories.IUsuRepository;


public class GetUsuQueryHandler implements IGetUsuQuery {
    
 private IUsuRepository  roleRepository; 
 
 public GetUsuQueryHandler(IUsuRepository roleRepository){
     this.roleRepository=roleRepository;
 }

    @Override
    public Usuario GetRol(String usuID) throws Exception {
      return roleRepository.BuscarUsuPorId(usuID);
    }

 
}
