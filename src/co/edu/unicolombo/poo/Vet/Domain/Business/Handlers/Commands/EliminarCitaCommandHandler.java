/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicolombo.poo.Vet.Domain.Business.Handlers.Commands;

import co.edu.unicolombo.poo.Infrastructure.Vet.Repositories.CitaRepository;
import co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Commands.IEliminarCitaCommand;
import co.edu.unicolombo.poo.Vet.Domain.Model.Cita;

/**
 *
 * @author HP
 */
public class EliminarCitaCommandHandler implements IEliminarCitaCommand{
    private CitaRepository citaRepository;

    public EliminarCitaCommandHandler(CitaRepository citaRepository) {
        this.citaRepository = citaRepository;
    }    
    
    @Override
    public void eliminarCita(Cita cita) throws Exception {
        citaRepository.eliminarCita(cita.getCedulacliente());
        
    }
}
