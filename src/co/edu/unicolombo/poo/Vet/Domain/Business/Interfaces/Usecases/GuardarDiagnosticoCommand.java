
package co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Usecases;

public class GuardarDiagnosticoCommand {
    
    protected int idCita;
    protected String cedulacliente;
    protected String mascotaNombre;
    protected String sintomas;
    protected String tratamiento;
    protected String fecha;
    protected String observaciones;
    protected String nombreveterinario;
    protected String usuarioS;

    public GuardarDiagnosticoCommand(int idCita,String cedulacliente,String mascotaNombre,
                                        String fecha,String sintomas, String tratamiento, 
                                        String observaciones, String nombreveterinario, 
                                        String usuarioS) throws Exception {

    validarCampo(cedulacliente, "La cédula del cliente es requerida");
    validarCampo(sintomas, "La descripcion del sintoma es requerido");
    validarCampo(tratamiento, "El tratamiento es requerido");
    validarCampo(observaciones, "La observacion es requerida");
    validarCampo(usuarioS, "El correo es requeridoEs necesario que estes logeado para registrar una cita");

        this.idCita = idCita;
        this.cedulacliente = cedulacliente;
        this.mascotaNombre = mascotaNombre;
        this.sintomas = sintomas;
        this.tratamiento = tratamiento;
        this.fecha = fecha;
        this.observaciones = observaciones;
        this.nombreveterinario=nombreveterinario;
        this.usuarioS=usuarioS;
    }

    private void validarCampo(String valor, String mensajeError) throws Exception {
        if (valor == null || valor.trim().isEmpty()) {
            throw new Exception(mensajeError);
        }
    }

    public int getIdCita() {
        return idCita;
    }

    public void setIdCita(int idCita) {
        this.idCita = idCita;
    }

    public String getCedulacliente() {
        return cedulacliente;
    }

    public void setCedulacliente(String cedulacliente) {
        this.cedulacliente = cedulacliente;
    }

    public String getMascotaNombre() {
        return mascotaNombre;
    }

    public void setMascotaNombre(String mascotaNombre) {
        this.mascotaNombre = mascotaNombre;
    }

    public String getSintomas() {
        return sintomas;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getNombreveterinario() {
        return nombreveterinario;
    }

    public void setNombreveterinario(String nombreveterinario) {
        this.nombreveterinario = nombreveterinario;
    }

    public String getUsuarioS() {
        return usuarioS;
    }

    public void setUsuarioS(String usuarioS) {
        this.usuarioS = usuarioS;
    }

    
    
    
}
