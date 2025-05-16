
package co.edu.unicolombo.poo.Domain.Business.Interfaces.Usecases;

public class GuardarRolCommand {
private String nombre;
private String descripcion;

public GuardarRolCommand (String nombre, String descripcion) throws Exception {
if (nombre == null || nombre.trim() .isEmpty ()) {
    throw new Exception ("El nombre es requerido");
}
if (descripcion == null || descripcion.trim().isEmpty()) {
throw new Exception ("La descripcion es requerida");
}
this.nombre = nombre;
this.descripcion = descripcion;
}
public String getDescripcion(){
return descripcion;
}
public String getNombre () {
return nombre;
}
}