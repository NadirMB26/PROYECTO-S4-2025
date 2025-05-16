
package co.edu.unicolombo.poo.Domain.Business.Interfaces.Usecases;


public class BuscarRolquery {
   private int rolID; 

    public BuscarRolquery(int rolID) throws Exception {
        if(rolID<=0){
            throw new Exception("El ID del Rol es requerido");
        }
        this.rolID = rolID;
    }
   public int getRolID(){
       return rolID;
   }
}
