
package co.edu.unicolombo.poo.Domain.Business.Interfaces.Queries;

import co.edu.unicolombo.poo.Domain.Model.Role;

public interface IGetRoleQuery {
  public Role GetRol(int rolID) throws Exception;
   public Role GetRol(String roleName) throws Exception;
}
