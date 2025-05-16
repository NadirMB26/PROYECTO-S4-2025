
package co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Repositories;

import co.edu.unicolombo.poo.Vet.Domain.Model.Usuario;
import java.util.List;




public interface IUsuRepository {
   public Usuario BuscarUsuPorId (String roleID) throws Exception;
   public Usuario BuscarSesion (String correo, String contra) throws Exception;
   //public Usuario BuscarUsuPorName (String nombre) throws Exception;
   public int GuardarUsuario (Usuario rol) throws Exception;
   public void editUsu (Usuario role) throws Exception;
   public int deleteUsu (String roleID) throws Exception;
   public List<Usuario> getUsuAll();
}
