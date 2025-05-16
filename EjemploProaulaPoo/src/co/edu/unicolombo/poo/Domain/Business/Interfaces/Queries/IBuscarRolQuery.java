
package co.edu.unicolombo.poo.Domain.Business.Interfaces.Queries;

import co.edu.unicolombo.poo.Domain.Business.Interfaces.Usecases.BuscarRolquery;
import co.edu.unicolombo.poo.Domain.Model.Role;


public interface IBuscarRolQuery {
  public Role obtenerRol(BuscarRolquery query) throws Exception;   
}
