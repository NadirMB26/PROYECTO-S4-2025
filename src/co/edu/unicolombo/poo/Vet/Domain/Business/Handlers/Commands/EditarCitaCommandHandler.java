
package co.edu.unicolombo.poo.Vet.Domain.Business.Handlers.Commands;

import co.edu.unicolombo.poo.Infrastructure.Vet.Repositories.CitaRepository;
import co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Commands.IEditarCitaCommand;
import co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Usecases.EditarCitaCommand;
import co.edu.unicolombo.poo.Vet.Domain.Model.Cita;


public class EditarCitaCommandHandler implements IEditarCitaCommand{
    private CitaRepository citaRepository;

    public EditarCitaCommandHandler(CitaRepository citaRepository) {
        this.citaRepository = citaRepository;
    }   
    
    @Override
    public void editarCita(EditarCitaCommand comand) throws Exception {
        Cita cita = new Cita();
        cita.setIdcita(comand.getIdcita());
        cita.setCedulacliente(comand.getCedulacliente());
        cita.setMascotaNombre(comand.getMascotaNombre());
        cita.setHoraEntrada(comand.getHoraEntrada());
        cita.setHoraSalida(comand.getHoraSalida());
        cita.setFecha(comand.getFecha());
        cita.setConfirmar(comand.getConfirmar());
        cita.setDescrip(comand.getDescrip());
        cita.setNombreveterinario(comand.getVeterinario());
        cita.setUsuarioS(comand.getUsuatend());
        citaRepository.editarCita(cita);
    }
}
