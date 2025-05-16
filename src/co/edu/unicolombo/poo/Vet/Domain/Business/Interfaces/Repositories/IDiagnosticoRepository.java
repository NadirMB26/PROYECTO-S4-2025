
package co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Repositories;

import co.edu.unicolombo.poo.Vet.Domain.Model.Diagnostico;
import java.util.List;


public interface IDiagnosticoRepository {
    public int GuardarCita (Diagnostico cit) throws Exception;
    public Diagnostico buscarCitaPorId(String Ccliente) throws Exception;
    public void editarCita(Diagnostico cita) throws Exception;
   public int eliminarCita(String nombreMascota) throws Exception;
   public List<Diagnostico> getDiagnosticoAll(); 
}
