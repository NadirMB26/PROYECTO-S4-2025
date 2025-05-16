/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Commands;

import co.edu.unicolombo.poo.Vet.Domain.Model.Cita;

/**
 *
 * @author HP
 */
public interface IEliminarCitaCommand {
    public void eliminarCita(Cita cita)throws Exception;
    
}
