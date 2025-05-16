/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicolombo.poo.Infrastructure.Vet.Repositories;

import co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Repositories.ICitaRepository;
import co.edu.unicolombo.poo.Vet.Domain.Model.Cita;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class CitaRepository implements ICitaRepository{
    private static List<Cita> citasDB = new ArrayList<>();

    public CitaRepository() {
        if (citasDB == null) {
            citasDB = new ArrayList<>();
        }
    }
    
    @Override
    public int GuardarCita(Cita citas) throws Exception {
        if(citasDB.isEmpty() || citasDB == null){
           citasDB.add(citas);
           return citasDB.size();
        }
        for(Cita citas1:citasDB){
            if(citas.getIdcita()==citas1.getIdcita()){
                throw new Exception("La cita "+citas.getIdcita()+" ya existe");
            }
        }
     
           citasDB.add(citas);
        return citasDB.size();

    }
    
    @Override
    public Cita buscarCitaPorId(String Ccliente) throws Exception {
        if(citasDB==null||citasDB.isEmpty()){
           // throw new Exception("La cita registrada al cliente con la cedula "+Ccliente+" No existe");
            return null;
        }
        Cita citaFound = null;
        for(Cita citas1:citasDB){
           if(citas1.getCedulacliente().equalsIgnoreCase(Ccliente)){
               citaFound = citas1;
               break;
           } 
        }
        if(citaFound == null){
            // throw new Exception("La cita registrada al cliente con la cedula "+Ccliente+" No existe");
            return null;
        }
        return citaFound;
    }
    
    @Override
    public void editarCita(Cita cita) throws Exception {
        if(cita == null){
           throw new Exception("la cedula del cliente es requerida");
        }
        if(citasDB.isEmpty()){
           throw new Exception("La cita registrada al cliente con CC "+cita.getCedulacliente()+" No existe");
        }
        Cita citaFound = buscarCitaPorId(cita.getCedulacliente());
      int pos = citasDB.indexOf(citaFound);
      citasDB.set(pos, cita);
    }

    @Override
    public int eliminarCita(String citaID) throws Exception {
         if(citasDB.isEmpty()){
           throw new Exception("La cita con nombre "+citaID+" No existe");
        }
        
        Cita citaFound = buscarCitaPorId(citaID);
        citasDB.remove(citaFound);
        return citasDB.size();
    }
    
     @Override
    public List<Cita> getCitaAll() {
      return citasDB;
    }
}
