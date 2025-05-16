
package co.edu.unicolombo.poo.Domain.Business.Interfaces.Usecases;

public class EditarRolCommand {
   private int id;
   private String nombre;
   private String descripcion;

public EditarRolCommand (int id,String nombre, String descripcion) throws Exception {
    if (id<=0) {
    throw new Exception ("El ID es requerido");
}
if (nombre == null || nombre.trim() .isEmpty ()) {
    throw new Exception ("El nombre es requerido");
}
if (descripcion == null || descripcion.trim().isEmpty()) {
throw new Exception ("La descripcion es requerida");
}
this.id=id;
this.nombre = nombre;
this.descripcion = descripcion;
}
public int getID(){
return id;
}
public String getDescripcion(){
return descripcion;
}
public String getNombre () {
return nombre;
}   
}
