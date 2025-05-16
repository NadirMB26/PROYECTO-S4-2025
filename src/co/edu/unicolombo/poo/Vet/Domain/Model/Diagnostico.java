
package co.edu.unicolombo.poo.Vet.Domain.Model;


public class Diagnostico extends Cita{
    private String sintomas;
    private String tratamiento;
    private String observaciones;

  

    public Diagnostico() {
        super();
    }

    public Diagnostico(int idCita,String cedulacliente,String mascotaNombre,String fecha,String sintomas, String tratamiento, String observaciones,String nombreveterinario, String usuarioS) {
        super(idCita,cedulacliente,mascotaNombre,null,null, fecha,null,null,nombreveterinario,usuarioS);
        this.sintomas = sintomas;
        this.tratamiento = tratamiento;
        this.observaciones = observaciones;
    
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

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

 

 
    
}
