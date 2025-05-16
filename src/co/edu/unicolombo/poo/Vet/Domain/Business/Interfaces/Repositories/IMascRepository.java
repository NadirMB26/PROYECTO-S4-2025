
package co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Repositories;


import java.util.List;
import co.edu.unicolombo.poo.Vet.Domain.Model.Mascota;

public interface IMascRepository {
    
   public Mascota buscarMascotaPorId(String CCliente) throws Exception;
   public int guardarMascota(Mascota cedula) throws Exception;
   public void editarMascota(Mascota mascota) throws Exception;
   public int eliminarMascota(String nombreMascota) throws Exception;
   public List<Mascota> getPetsAll();
}
