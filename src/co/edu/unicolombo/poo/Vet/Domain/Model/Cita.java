package co.edu.unicolombo.poo.Vet.Domain.Model;

import java.util.concurrent.atomic.AtomicInteger;

public class Cita {

    private int idcita;
    private String cedulacliente;
    private String mascotaNombre;
    private String horaEntrada;
    private String horaSalida;
    private String fecha;
    private String confirmar;
    private String descrip;
    private String nombreveterinario;
    private String usuarioS;
    private static AtomicInteger incrementID;

    public Cita() {
    }

    public Cita(int idcita, String cedulacliente, String mascotaNombre, String horaEntrada, String horaSalida, String fecha, String confirmar, String descrip, String nombreveterinario, String usuarioS) {
        
    if (incrementID == null) {
            incrementID = new AtomicInteger(0);
        }
        this.idcita= getIncrementeID();
        this.cedulacliente = cedulacliente;
        this.mascotaNombre = mascotaNombre;
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
        this.fecha = fecha;
        this.confirmar = confirmar;
        this.descrip = descrip;
        this.nombreveterinario = nombreveterinario;
        this.usuarioS = usuarioS;
           
    }
           



public int getIdcita() {
        return idcita;
    }

    public void setIdcita(int idcita) {
        this.idcita = idcita;
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

    public String getConfirmar() {
        return confirmar;
    }

    public void setConfirmar(String confirmar) {
        this.confirmar = confirmar;
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

    public static AtomicInteger getIncrementID() {
        return incrementID;
    }

    public static void setIncrementID(AtomicInteger incrementID) {
        Cita.incrementID = incrementID;
    }

    private int getIncrementeID() {
        if (incrementID == null) {
            incrementID = new AtomicInteger(1);
        }
        return incrementID.incrementAndGet();
    }
    
    
        
 }
