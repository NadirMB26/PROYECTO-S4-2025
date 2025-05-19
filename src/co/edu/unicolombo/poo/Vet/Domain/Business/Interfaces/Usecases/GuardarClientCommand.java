package co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Usecases;

public class GuardarClientCommand {

    protected String cedula;
    protected String apellido;
    protected String nombre;
    protected String direccion;
    protected String correo;
    protected String telefono;
    protected String rol;

     public GuardarClientCommand(String cedula, String apellido, String nombre,
                                    String direccion, String correo, String telefono,
                                    String rol) throws Exception {

    validarParametros(cedula, "La cédula es requerida");
    validarParametros(apellido, "El apellido es requerido");
    validarParametros(nombre, "El nombre es requerido");
    validarParametros(direccion, "La direccion es requerida");
    if (correo == null & correo.contains("@")&&correo.contains(".com")&correo.trim().isEmpty()) {
            throw new Exception("El correo es requerido o esta incompleto");
        }
    validarParametros(telefono, "El telefono es requerido");
    validarParametros(rol, "El rol es requerido");

        this.cedula = cedula;
        this.apellido = apellido;
        this.nombre = nombre;
        this.direccion = direccion;
        this.correo = correo;
        this.telefono = telefono;
        this.rol = rol;
    }

    private void validarParametros(String valor, String mensajeError) throws Exception {
        if (valor == null || valor.trim().isEmpty()) {
            throw new Exception(mensajeError);
        }
    }

    // Getters
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

    public String getTelefono() {
        return telefono;
    }

    public String getRol() {
        return rol;
    }
}
