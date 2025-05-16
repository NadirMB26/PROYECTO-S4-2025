
package co.edu.unicolombo.poo.Infrastructure.Vet.Repositories;

import co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Repositories.IDiagnosticoRepository;
import co.edu.unicolombo.poo.Vet.Domain.Model.Cita;
import co.edu.unicolombo.poo.Vet.Domain.Model.Diagnostico;

import java.util.ArrayList;
import java.util.List;


public class DiagnosticoRepository implements IDiagnosticoRepository{
    private static List<Diagnostico> diagnosticosDB = new ArrayList<>();

    public DiagnosticoRepository() {
        if (diagnosticosDB == null) {
            diagnosticosDB = new ArrayList<>();
        }
    }
    
    @Override
    public int GuardarCita(Diagnostico citas) throws Exception {
        if(diagnosticosDB.isEmpty() || diagnosticosDB == null){
           diagnosticosDB.add(citas);
           return diagnosticosDB.size();
        }
        for(Cita citas1:diagnosticosDB){
            if(citas.getCedulacliente().equalsIgnoreCase(citas1.getCedulacliente())){
                throw new Exception("El diagnostico de "+citas.getCedulacliente()+" ya existe");
            }
        }
     
           diagnosticosDB.add(citas);
        return diagnosticosDB.size();

    }
    
    @Override
    public Diagnostico buscarCitaPorId(String Ccliente) throws Exception {
        if(diagnosticosDB==null||diagnosticosDB.isEmpty()){
            throw new Exception("La cita registrada al cliente con la cedula "+Ccliente+" No existe");
        }
        Diagnostico citaFound = null;
        for(Diagnostico citas1:diagnosticosDB){
           if(citas1.getCedulacliente().equalsIgnoreCase(Ccliente)){
               citaFound = citas1;
               break;
           } 
        }
        if(citaFound == null){
             throw new Exception("La cita registrada al cliente con la cedula "+Ccliente+" No existe");
        }
        return citaFound;
    }
    
    @Override
    public void editarCita(Diagnostico cita) throws Exception {
        if(cita == null){
           throw new Exception("la cedula del cliente es requerida");
        }
        if(diagnosticosDB.isEmpty()){
           throw new Exception("La cita registrada al cliente con CC "+cita.getCedulacliente()+" No existe");
        }
        Diagnostico citaFound = buscarCitaPorId(cita.getCedulacliente());
      int pos = diagnosticosDB.indexOf(citaFound);
      diagnosticosDB.set(pos, cita);
    }

    @Override
    public int eliminarCita(String citaID) throws Exception {
         if(diagnosticosDB.isEmpty()){
           throw new Exception("La cita con nombre "+citaID+" No existe");
        }
        
        Diagnostico citaFound = buscarCitaPorId(citaID);
        diagnosticosDB.remove(citaFound);
        return diagnosticosDB.size();
    }
    
    @Override
    public List<Diagnostico> getDiagnosticoAll() {
      return diagnosticosDB;
    }

}
