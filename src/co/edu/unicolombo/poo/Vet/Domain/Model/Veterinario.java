
package co.edu.unicolombo.poo.Vet.Domain.Model;


public class Veterinario extends Usuario{

    private String especialidad;
 

    public Veterinario() {
        super();
    }
    
   public Veterinario(String cedula, String nombre, String apellido, String direccion, String correo, String clave, String telefono, String especialidad) {
    super(cedula, nombre, apellido, direccion, correo, clave, telefono, "Veterinario");
    this.especialidad = especialidad; 

   }


    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    
}
