
package co.edu.unicolombo.poo.Domain.Business.Interfaces.Repositories;

import co.edu.unicolombo.poo.Domain.Model.Role;
import java.util.List;




public interface IRoleRepository {
   public Role BuscarRolPorId (int roleID) throws Exception;
   public Role BuscarRolPorName (String nombre) throws Exception;
   public int GuardarRole (Role rol) throws Exception;
   public void editRole (Role role) throws Exception;
   public int deleteRole (int roleID) throws Exception;
   public List<Role> getRoleAll();
}
