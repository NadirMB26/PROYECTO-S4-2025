/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Usecases;

/**
 *
 * @author nadir
 */
public class SesionUsuQuery {
    private String correo;
    private String contra;
    
    public SesionUsuQuery(){
        
    }
    
    public SesionUsuQuery (String correo, String contra)throws Exception {
         if (correo.equals(null)||contra.equals(null)) {
            throw new Exception("Falta llenar algun campo");
        }
        this.correo= correo;
        this.contra=contra;
    }
     public String getCorreo() {
        return correo;
    }
     
       public String getContra() {
        return contra;
    }
}
