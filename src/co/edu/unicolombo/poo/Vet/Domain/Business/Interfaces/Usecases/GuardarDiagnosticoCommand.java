
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

    
    public GuardarDiagnosticoCommand(int idCita,String cedulacliente,String mascotaNombre,String fecha,String sintomas, String tratamiento, String observaciones,String nombreveterinario, String usuarioS) throws Exception {
        if (cedulacliente == null || cedulacliente.trim().isEmpty()) {
            throw new Exception("La cedula del cliente es requerido");
        }
        if (sintomas == null || sintomas.trim().isEmpty()) {
            throw new Exception("La descripcion del sintoma es requerido");
        }
        if (tratamiento == null || tratamiento.trim().isEmpty()) {
            throw new Exception("El tratamiento es requerido");
        }
         if (observaciones == null || observaciones.trim().isEmpty()) {
            throw new Exception("La observacion es requerida");
        }
            if (usuarioS== null || usuarioS.trim().isEmpty()) {
            throw new Exception("Es necesario que estes logeado para registrar una cita");
        }
        
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
