
package co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Queries;

import co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Usecases.SesionUsuQuery;
import co.edu.unicolombo.poo.Vet.Domain.Model.Usuario;


public interface IBuscarSesionQuery {
  public Usuario obtenerSesion(SesionUsuQuery sesion) throws Exception;   
}
