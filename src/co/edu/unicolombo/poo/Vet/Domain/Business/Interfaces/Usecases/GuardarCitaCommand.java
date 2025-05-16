
package co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Usecases;

import java.util.concurrent.atomic.AtomicInteger;


public class GuardarCitaCommand {
    private int idcita;
    private String cedulaCliente;
    private String mascotaNombre;
    private String horaEntrada;
    private String horaSalida;
    private String fecha;
    private String descrip;
    private String nombreveterinario;
    private String usuarioS;
    
    public GuardarCitaCommand(int idcita, String cedulaCliente, String mascotaNombre, String horaEntrada, String horaSalida, String fecha, String descrip,String nombreveterinario,String usuarioS) throws Exception {
        if (cedulaCliente == null || cedulaCliente.trim().isEmpty()) {
            throw new Exception("La cedula del cliente es requerido");
        }
        if (mascotaNombre == null || mascotaNombre.trim().isEmpty()) {
            throw new Exception("El nombre de la mascota es requerido");
        }
        if (horaEntrada == null || horaEntrada.trim().isEmpty()) {
            throw new Exception("La hora de entrada es requerid");
        }
        if (horaSalida == null || horaSalida.trim().isEmpty()) {
            throw new Exception("La hora de salida es requerida");
        }
        if (fecha == null || fecha.trim().isEmpty()) {
            throw new Exception("La fecha es requerida");
        }
        if (descrip == null || descrip.trim().isEmpty()) {
            throw new Exception("La descripcion es requerida");
        }
          if (nombreveterinario == null || nombreveterinario.trim().isEmpty()) {
            throw new Exception("El veterinario es requerido para registrar tu cita");
        }
            if (usuarioS== null || usuarioS.trim().isEmpty()) {
            throw new Exception("Es necesario que estes logeado para registrar una cita");
        }
        
        this.idcita = idcita;
        this.cedulaCliente = cedulaCliente;
        this.mascotaNombre = mascotaNombre;
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
        this.fecha = fecha;
        this.descrip = descrip;
        this.nombreveterinario=nombreveterinario;
        this.usuarioS=usuarioS;
    }

    public int getIdcita() {
        return idcita;
    }

    public void setIdcita(int idcita) {
        this.idcita = idcita;
    }

    public String getCedulacliente() {
        return cedulaCliente;
    }

    public void setCedulacliente(String cedulacliente) {
        this.cedulaCliente = cedulacliente;
    }

    public String getMascotaNombre() {
        return mascotaNombre;
    }

    public void setMascotaNombre(String mascotaNombre) {
        this.mascotaNombre = mascotaNombre;
    }

    public String getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(String horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public String getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(String horaSalida) {
        this.horaSalida = horaSalida;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
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
