/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Usecases;

/**
 *
 * @author USER
 */
public class EditarVeterinCommand {

    private String cedula;
    private String nombre;
    private String apellido;
    private String especialidad;
    private String correo;
    private String direccion;
    private String telefono;
    private String clave;


 public EditarVeterinCommand(String cedula, String nombre, String apellido, 
                                String direccion , String correo, String clave, 
                                String telefono, String especialidad) throws Exception {
     
    validarCampo(cedula, "La cédula es requerida");
    validarCampo(nombre, "El nombre es requerido");
    validarCampo(apellido, "El apellido es requerido");
    validarCampo(especialidad, "La especialidad es requerida");
    if (correo == null & correo.contains("@")&&correo.contains(".com")&correo.trim().isEmpty()) {
            throw new Exception("El correo es requerido o esta incompleto");
        }
    validarCampo(direccion, "La direccion es requerida");
    validarCampo(telefono, "El telefono es requerido");
    validarCampo(clave, "La clave es requerida");
 
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.especialidad = especialidad;
        this.correo = correo;
        this.direccion = direccion;
        this.telefono = telefono;
        this.clave=clave;
    }

private void validarCampo(String valor, String mensajeError) throws Exception {
    if (valor == null || valor.trim().isEmpty()) {
        throw new Exception(mensajeError);
    }
}

    public String getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public String getCorreo() {
        return correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }
     public String getClave() {
        return clave;
    }

}
