package co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Usecases;

public class GuardarVeterinCommand {

    private String cedula;
    private String nombre;
    private String apellido;
    private String especialidad;
    private String correo;
    private String direccion;
    private String telefono;
    private String clave;
                                  
    public GuardarVeterinCommand(String cedula, String nombre, String apellido, String direccion , String correo, String clave, String telefono, String especialidad) throws Exception {

        if (cedula == null || cedula.trim().isEmpty()) {
            throw new Exception("La cedula es requerida");
        }
        if (apellido == null || apellido.trim().isEmpty()) {
            throw new Exception("El apellido es requerido");
        }
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new Exception("El nombre es requerido");
        }
        if (direccion == null || direccion.trim().isEmpty()) {
            throw new Exception("La direccion es requerida");
        }
        if (correo == null & correo.contains("@")&&correo.contains(".com")&correo.trim().isEmpty()) {
            throw new Exception("El correo es requerido o esta incompleto");
        }
        if (especialidad == null || especialidad.trim().isEmpty()) {
            throw new Exception("La especialidad es requerida");
        }
        if (telefono == null || telefono.trim().isEmpty()) {
            throw new Exception("El telefono es requerido");

        }
            if (clave == null || clave.trim().isEmpty()) {
            throw new Exception("La clave es requerida");

        }

        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.especialidad = especialidad;
        this.correo = correo;
        this.direccion = direccion;
        this.telefono = telefono;
        this.clave=clave;
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
