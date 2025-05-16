/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Repositories;

import co.edu.unicolombo.poo.Vet.Domain.Model.Cliente;
import java.util.List;

/**
 *
 * @author nadir
 */
public interface IClientRepository {
 public Cliente BuscarClientPorId (String roleID) throws Exception;
   public Cliente BuscarClientPorName (String nombre) throws Exception;
   public int GuardarCliente(Cliente rol) throws Exception;
   public void editClient (Cliente role) throws Exception;
   public int deleteClient (String roleID) throws Exception;
   public List<Cliente> getClientAll(); 
}
