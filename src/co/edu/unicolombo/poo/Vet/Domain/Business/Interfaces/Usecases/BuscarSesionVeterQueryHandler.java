
package co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Usecases;


import co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Queries.IBuscarSesionVeterQuery;
import co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Repositories.IVeterinRepository;
import co.edu.unicolombo.poo.Vet.Domain.Model.Veterinario;


public class BuscarSesionVeterQueryHandler implements IBuscarSesionVeterQuery{
    private IVeterinRepository rolRepository;

    public BuscarSesionVeterQueryHandler(IVeterinRepository rolRepository) {
     this.rolRepository = rolRepository;
    }

    @Override
    public Veterinario obtenerSesion(SesionVeterQuery query) throws Exception {
      String correo = query.getCorreo(); 
      String contra = query.getContra(); 
      return rolRepository.BuscarSesion(correo, contra);
    }
}
