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
    
    public EditarCitaCommand(int idcita, String cedulacliente, String mascotaNombre, 
                                String horaEntrada, String horaSalida, String fecha, 
                                String descrip, String veterinario) throws Exception {
        
    validarCampo(cedulacliente, "La cédula del cliente es requerida");
    validarCampo(mascotaNombre, "El nombre de la mascota es requerido");
    validarCampo(horaEntrada, "La hora de entrada es requerida");
    validarCampo(horaSalida, "La hora de salida es requerida");
    validarCampo(fecha, "La fecha es requerida");
    validarCampo(descrip, "La descripción es requerida");
    validarCampo(veterinario, "El veterinario es requerido");

        this.idcita = idcita;
        this.cedulacliente = cedulacliente;
        this.mascotaNombre = mascotaNombre;
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
        this.fecha = fecha;
        this.descrip = descrip;
        this.veterinario = veterinario;
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
