
package co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Usecases;

/**
 *
 * @author nadir
 */
public class SesionVeterQuery {
    private String correo;
    private String contra;
    
    public SesionVeterQuery(){
        
    }
    
    public SesionVeterQuery (String correo, String contra)throws Exception {
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
