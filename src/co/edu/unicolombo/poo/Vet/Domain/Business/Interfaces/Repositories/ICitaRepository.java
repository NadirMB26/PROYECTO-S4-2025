
package co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Repositories;

import co.edu.unicolombo.poo.Vet.Domain.Model.Cita;
import java.util.List;

public interface ICitaRepository {
    public int GuardarCita (Cita cit) throws Exception;
    public Cita buscarCitaPorId(String Ccliente) throws Exception;
    public void editarCita(Cita cita) throws Exception;
    public int eliminarCita(String nombreMascota) throws Exception;
    public List<Cita> getCitaAll(); 
}
