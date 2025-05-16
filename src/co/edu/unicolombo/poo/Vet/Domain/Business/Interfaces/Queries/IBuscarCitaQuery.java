/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Queries;

import co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Usecases.BuscarCitaQuery;
import co.edu.unicolombo.poo.Vet.Domain.Model.Cita;

/**
 *
 * @author HP
 */
public interface IBuscarCitaQuery {
    public Cita obtenerCita(BuscarCitaQuery query) throws Exception;
}
