
package co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Queries;

import co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Usecases.BuscarUsuquery;
import co.edu.unicolombo.poo.Vet.Domain.Model.Cliente;


public interface IBuscarClientQuery {
  public Cliente obtenerRol(BuscarUsuquery query) throws Exception;   
}
