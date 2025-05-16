/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Usecases;

import co.edu.unicolombo.poo.Infrastructure.Vet.Repositories.CitaRepository;
import co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Queries.IBuscarCitaQuery;
import co.edu.unicolombo.poo.Vet.Domain.Model.Cita;

/**
 *
 * @author HP
 */
public class BuscarCitaQueryHandler implements IBuscarCitaQuery{
    private CitaRepository citaRepository;

    public BuscarCitaQueryHandler(CitaRepository citaRepository) {
        this.citaRepository = citaRepository;
    }
    
    @Override
    public Cita obtenerCita(BuscarCitaQuery query) throws Exception {
        String Ccliente = query.getCedulaClient();
        
        return citaRepository.buscarCitaPorId(Ccliente);
    }
}
