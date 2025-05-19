package co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Usecases;

import co.edu.unicolombo.poo.Infrastructure.Vet.Repositories.CitaRepository;
import co.edu.unicolombo.poo.Vet.Domain.Model.Cita;
import java.text.SimpleDateFormat;
import java.util.Date;

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
    private final CitaRepository citaRepository;

    
    public GuardarCitaCommand(int idcita, String cedulaCliente, String mascotaNombre, String horaEntrada,
                               String horaSalida, String fecha, String descrip,
                               String nombreveterinario, String usuarioS, CitaRepository citaRepository) throws Exception {

        validarCampo(cedulaCliente, "La cédula del cliente es requerida");
        validarCampo(mascotaNombre, "El nombre de la mascota es requerido");
        validarCampo(horaEntrada, "La hora de entrada es requerida");
        validarCampo(horaSalida, "La hora de salida es requerida");
        validarCampo(fecha, "La fecha es requerida");
        validarCampo(descrip, "La descripción es requerida");
        validarCampo(nombreveterinario, "El veterinario es requerido para registrar tu cita");
        validarCampo(usuarioS, "Es necesario que estés logueado para registrar una cita");

        this.idcita = idcita;
        this.cedulaCliente = cedulaCliente;
        this.mascotaNombre = mascotaNombre;
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
        this.fecha = fecha;
        this.descrip = descrip;
        this.nombreveterinario = nombreveterinario;
        this.usuarioS = usuarioS;
        this.citaRepository = citaRepository;
        
        validarDisponibilidadCita();
    }

    private void validarDisponibilidadCita() throws Exception {
    SimpleDateFormat sdfFecha = new SimpleDateFormat("yyyy-MM-dd");
    SimpleDateFormat sdfHora = new SimpleDateFormat("HH:mm");

    Date nuevaFecha = sdfFecha.parse(fecha);
    Date nuevaEntrada = sdfHora.parse(horaEntrada);
    Date nuevaSalida = sdfHora.parse(horaSalida);

    for (Cita cita : citaRepository.getCitaAll()) {
        Date fechaCita = sdfFecha.parse(cita.getFecha());
        if (nuevaFecha.equals(fechaCita)) {
            Date entradaCita = sdfHora.parse(cita.getHoraEntrada());
            Date salidaCita = sdfHora.parse(cita.getHoraSalida());

            // ❌ 1. Validar si se solapan las horas
            if ((nuevaEntrada.before(salidaCita)) && (nuevaSalida.after(entradaCita))) {
                throw new Exception("Ya existe una cita registrada entre esas horas.");
            }

            // ❌ 2. Validar si la hora exacta ya existe
            if (nuevaEntrada.equals(entradaCita)) {
                throw new Exception("Ya existe una cita registrada a esa hora.");
            }
        }
    }
}

    private void validarCampo(String valor, String mensajeError) throws Exception {
        if (valor == null || valor.trim().isEmpty()) {
            throw new Exception(mensajeError);
        }
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
