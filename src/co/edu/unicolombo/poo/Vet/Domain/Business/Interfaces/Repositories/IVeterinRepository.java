
package co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Repositories;
import co.edu.unicolombo.poo.Vet.Domain.Model.Veterinario;
import java.util.List;


public interface IVeterinRepository {
   public Veterinario BuscarVetePorId (String roleID) throws Exception;
   public Veterinario BuscarSesion (String correo, String contra) throws Exception;
   public int GuardarVeterinario (Veterinario rol) throws Exception;
   public void editVete (Veterinario role) throws Exception;
   public int deleteVete (String roleID) throws Exception;
   public List<Veterinario> getVeteuAll();
}
