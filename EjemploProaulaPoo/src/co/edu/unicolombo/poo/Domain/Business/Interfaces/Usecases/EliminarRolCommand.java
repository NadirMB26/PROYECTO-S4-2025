
package co.edu.unicolombo.poo.Domain.Business.Interfaces.Usecases;

public class EliminarRolCommand {
   private int id;

public EliminarRolCommand (int id) throws Exception {
    if (id<=0) {
    throw new Exception ("El ID es requerido");
    }

}
public int getID(){
return id;
}
 
}
