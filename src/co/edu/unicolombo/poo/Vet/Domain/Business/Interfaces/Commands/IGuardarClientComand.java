/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Commands;

import co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Usecases.GuardarClientCommand;

/**
 *
 * @author nadir
 */
public interface IGuardarClientComand {
     public int createClient(GuardarClientCommand comando)throws Exception;  
}
