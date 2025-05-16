
package co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Queries;

import co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Usecases.BuscarUsuquery;
import co.edu.unicolombo.poo.Vet.Domain.Model.Usuario;


public interface IBuscarUsuQuery {
  public Usuario obtenerRol(BuscarUsuquery query) throws Exception;   
}
