/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicolombo.poo.Infrastructure.Vet.Repositories;

import co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Repositories.IClientRepository;
import co.edu.unicolombo.poo.Vet.Domain.Model.Cliente;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nadir
 */
public class ClienteRepository implements IClientRepository{
  private static List<Cliente> clientesDB;
  
public ClienteRepository(){
    if(clientesDB==null){
        clientesDB=new ArrayList<>(); 
    }
}  


    @Override
    public Cliente BuscarClientPorId(String UsuID) throws Exception {
        if(clientesDB==null||clientesDB.isEmpty()){
            throw new Exception("El Cliente "+UsuID+"No existe");
        }
        Cliente usuEncontrado=null;
        for(Cliente usu:clientesDB){
           if(usu.getCedula().equalsIgnoreCase(UsuID)){
               usuEncontrado=usu;
               break;
           } 
        }
        if(usuEncontrado==null){
             throw new Exception("El Cliente "+UsuID+"No existe");
        }
        return usuEncontrado;
    }



    @Override
    public int GuardarCliente(Cliente client) throws Exception {
        if(clientesDB.isEmpty()){
           clientesDB.add(client);
           return clientesDB.size();
        }
        for(Cliente usu1:clientesDB){
            if(client.getCedula().equalsIgnoreCase(usu1.getCedula())){
                throw new Exception("El Cliente"+client.getCedula()+" ya existe");
            }
        }
     
           clientesDB.add(client);
        return clientesDB.size();

    }

    @Override
    public void editClient(Cliente usu) throws Exception {
        if(usu == null){
           throw new Exception("la cedula es requerida");
        }
        if(clientesDB.isEmpty()){
           throw new Exception("El Cliente "+usu.getCedula()+" no existe");
        }
        Cliente rolEncontrado=BuscarClientPorId(usu.getCedula());
      int pos=clientesDB.indexOf(rolEncontrado);
      clientesDB.set(pos, usu);
    }

    @Override
    public int deleteClient(String usuID) throws Exception {
       if(clientesDB.isEmpty()){
           throw new Exception("El rol "+usuID+" no existe");
        }
        
        Cliente rolEncontrado=BuscarClientPorId(usuID);
        clientesDB.remove(rolEncontrado);
        return clientesDB.size();
    }

    @Override
    public List<Cliente> getClientAll() {
      return clientesDB;
    }

    @Override
    public Cliente BuscarClientPorName(String nombre) throws Exception {
        throw new UnsupportedOperationException("Not supported yet2."); 
    }

   
}