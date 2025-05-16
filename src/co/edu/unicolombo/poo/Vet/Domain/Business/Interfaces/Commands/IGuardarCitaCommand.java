/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Commands;

import co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Usecases.GuardarCitaCommand;

/**
 *
 * @author HP
 */
public interface IGuardarCitaCommand {
  public int createCita(GuardarCitaCommand comando)throws Exception;      
}
