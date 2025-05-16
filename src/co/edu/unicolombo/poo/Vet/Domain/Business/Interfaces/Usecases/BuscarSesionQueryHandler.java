
package co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Usecases;

import co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Queries.IBuscarSesionQuery;
import co.edu.unicolombo.poo.Vet.Domain.Model.Usuario;
import co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Repositories.IUsuRepository;


public class BuscarSesionQueryHandler implements IBuscarSesionQuery{
    private IUsuRepository rolRepository;

    public BuscarSesionQueryHandler(IUsuRepository rolRepository) {
     this.rolRepository = rolRepository;
    }

    @Override
    public Usuario obtenerSesion(SesionUsuQuery query) throws Exception {
      String correo = query.getCorreo(); 
      String contra = query.getContra(); 
      return rolRepository.BuscarSesion(correo, contra);
    }
}
