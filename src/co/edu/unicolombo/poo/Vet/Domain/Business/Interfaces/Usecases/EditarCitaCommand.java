/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Usecases;

//import co.edu.unicolombo.poo.Vet.Domain.Model.Diagnostico;
//import co.edu.unicolombo.poo.Vet.Domain.Model.HistorialCitas;
/**
 *
 * @author HP
 */
public class EditarCitaCommand {
    private int idcita;
    private String cedulacliente;
    private String mascotaNombre;
    private String horaEntrada;
    private String horaSalida;
    private String fecha;
    private String descrip;
    private String veterinario;

    public EditarCitaCommand(int idcita, String cedulacliente, String mascotaNombre, String horaEntrada, String horaSalida, String fecha, String descrip, String veterinario) throws Exception {
        if (cedulacliente == null || cedulacliente.trim().isEmpty()) {
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
        if (veterinario == null || veterinario.trim().isEmpty()) {
            throw new Exception("El veterinario es requerido");
        }
        
        this.idcita = idcita;
        this.cedulacliente = cedulacliente;
        this.mascotaNombre = mascotaNombre;
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
        this.fecha = fecha;
        this.descrip = descrip;
        this.veterinario = veterinario;
        
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

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }
    
    public String getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(String veterinario) {
        this.veterinario = veterinario;
    }
}
