
package co.edu.unicolombo.poo.Vet.Domain.Business.Handlers.Commands;

import co.edu.unicolombo.poo.Infrastructure.Vet.Repositories.DiagnosticoRepository;
import co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Commands.IGuardarDiagnosticoCommand;
import co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Usecases.GuardarDiagnosticoCommand;
import co.edu.unicolombo.poo.Vet.Domain.Model.Diagnostico;


public class GuardarDiagnosticoCommandHandler implements IGuardarDiagnosticoCommand{
    private DiagnosticoRepository citaRepository;

    public GuardarDiagnosticoCommandHandler(DiagnosticoRepository citaRepository) {
        this.citaRepository = citaRepository;
    }
    
    @Override
    public int createCita(GuardarDiagnosticoCommand comand) throws Exception {
        Diagnostico cita1=new Diagnostico();
        cita1.setIdcita(comand.getIdCita());
        cita1.setCedulacliente(comand.getCedulacliente());
        cita1.setMascotaNombre(comand.getMascotaNombre());
        cita1.setSintomas(comand.getSintomas());
        cita1.setTratamiento(comand.getTratamiento());
        cita1.setFecha(comand.getFecha());
        cita1.setObservaciones(comand.getObservaciones());
        cita1.setNombreveterinario(comand.getNombreveterinario());
        cita1.setUsuarioS(comand.getUsuarioS());
        return citaRepository.GuardarCita(cita1);
        
    }
}
