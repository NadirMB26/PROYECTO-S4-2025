
package co.edu.unicolombo.poo.Vet.Domain.Business.Handlers.Commands;

import co.edu.unicolombo.poo.Infrastructure.Vet.Repositories.CitaRepository;
import co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Commands.IGuardarCitaCommand;
import co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Usecases.GuardarCitaCommand;
import co.edu.unicolombo.poo.Vet.Domain.Model.Cita;


public class GuardarCitaCommandHandler implements IGuardarCitaCommand{
    private CitaRepository citaRepository;

    public GuardarCitaCommandHandler(CitaRepository citaRepository) {
        this.citaRepository = citaRepository;
    }
    
    @Override
    public int createCita(GuardarCitaCommand comand) throws Exception {
        Cita cita1=new Cita();
        cita1.setIdcita(comand.getIdcita());
        cita1.setCedulacliente(comand.getCedulacliente());
        cita1.setMascotaNombre(comand.getMascotaNombre());
        cita1.setHoraEntrada(comand.getHoraEntrada());
        cita1.setHoraSalida(comand.getHoraSalida());
        cita1.setFecha(comand.getFecha());
        cita1.setDescrip(comand.getDescrip());
        cita1.setNombreveterinario(comand.getNombreveterinario());
        cita1.setUsuarioS(comand.getUsuarioS());
        return citaRepository.GuardarCita(cita1);
        
    }
}
