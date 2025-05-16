/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Usecases;

import co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Repositories.IClientRepository;
import co.edu.unicolombo.poo.Vet.Domain.Model.Cliente;

/**
 *
 * @author nadir
 */
public class GuardarClientComandHandler {
  private IClientRepository clientRepository;
   public GuardarClientComandHandler(IClientRepository clientRepository){
     this.clientRepository=clientRepository;
}
    public int createClient(GuardarUsuCommand comando) throws Exception {
     Cliente usu1=new Cliente();
     usu1.setCedula(comando.getCedula());
     usu1.setApellido(comando.getApellido());
     usu1.setNombre(comando.getNombre());
     usu1.setDireccion(comando.getDireccion());
     usu1.setCorreo(comando.getCorreo());
     usu1.setTelefono(comando.getTelefono());
     usu1.setRol(comando.getRol());
     return clientRepository.GuardarCliente(usu1);
    }
}
