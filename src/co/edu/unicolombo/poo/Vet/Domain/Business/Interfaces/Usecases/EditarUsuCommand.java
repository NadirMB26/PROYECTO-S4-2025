
package co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Usecases;

public class EditarUsuCommand {
 protected String cedula ;
 protected String apellido ;
 protected String nombre ;
 protected String direccion ;
 protected String correo ;
 protected String clave ;
 protected String telefono ;
 
 public EditarUsuCommand(){ 
 }
 
 public EditarUsuCommand (String cedula,String apellido, String nombre,String direccion, 
                            String correo, String clave, String telefono) throws Exception {
     
    validarCampo(cedula, "La cédula es requerida");
    validarCampo(apellido, "El apellido es requerido");
    validarCampo(nombre, "El nombre es requerido");
    validarCampo(direccion, "La direccion es requerida");
    if (correo == null & correo.contains("@")&&correo.contains(".com")&correo.trim().isEmpty()) {
            throw new Exception("El correo es requerido o esta incompleto");
        }
    validarCampo(clave, "La clave es requerida");
    validarCampo(telefono, "El telefono es requerido");
 
        this.cedula=cedula;
        this.apellido = apellido;
        this.nombre = nombre;
        this.direccion = direccion;
        this.correo = correo;
        this.clave = clave;
        this.telefono = telefono;
    }

private void validarCampo(String valor, String mensajeError) throws Exception {
    if (valor == null || valor.trim().isEmpty()) {
        throw new Exception(mensajeError);
    }
}

    public String getCedula() {
        return cedula;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public String getClave() {
        return clave;
    }

    public String getTelefono() {
        return telefono;
    }

}
