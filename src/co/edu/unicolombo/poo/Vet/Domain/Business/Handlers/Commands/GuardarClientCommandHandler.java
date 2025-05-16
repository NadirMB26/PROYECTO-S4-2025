/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicolombo.poo.Vet.Domain.Business.Handlers.Commands;

import co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Commands.IGuardarClientComand;
import co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Repositories.IClientRepository;
import co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Usecases.GuardarClientCommand;
import co.edu.unicolombo.poo.Vet.Domain.Model.Cliente;

/**
 *
 * @author nadir
 */
public class GuardarClientCommandHandler implements IGuardarClientComand{
   private IClientRepository clientRepository; 
   public GuardarClientCommandHandler(IClientRepository repository){
       clientRepository=repository;
   }


    @Override
    public int createClient(GuardarClientCommand comand) throws Exception {
        Cliente usu1=new Cliente();
        usu1.setCedula(comand.getCedula());
        usu1.setApellido(comand.getApellido());
        usu1.setNombre(comand.getNombre());
        usu1.setDireccion(comand.getDireccion());
        usu1.setCorreo(comand.getCorreo());
        usu1.setTelefono(comand.getTelefono());
        usu1.setRol(comand.getRol());
        return clientRepository.GuardarCliente(usu1);
    }
}