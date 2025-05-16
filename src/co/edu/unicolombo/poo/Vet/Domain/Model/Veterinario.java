
package co.edu.unicolombo.poo.Vet.Domain.Model;

import java.util.List;

public class Veterinario extends Usuario{
    private List<Cita> citas;
    private String especialidad;
    private Horario horario;

    public Veterinario() {
        super();
    }
    
   public Veterinario(String cedula, String nombre, String apellido, String direccion, String correo, String clave, String telefono, List<Cita> citas, Horario horario, String especialidad) {
    super(cedula, nombre, apellido, direccion, correo, clave, telefono, "Veterinario");
    this.especialidad = especialidad; 
    this.citas = citas; 
    this.horario = horario; 
   }


    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public Horario getHorario() {
        return horario;
    }

    public void setHorario(Horario horario) {
        this.horario = horario;
    }

    public List<Cita> getCitas() {
        return citas;
    }

    public void setCitas(List<Cita> citas) {
        this.citas = citas;
    }
    
}
