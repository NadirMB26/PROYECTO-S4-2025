
package co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Queries;

import co.edu.unicolombo.poo.Vet.Domain.Model.Usuario;

public interface IGetUsuQuery {
  public Usuario GetRol(String rolID) throws Exception;
  
}
