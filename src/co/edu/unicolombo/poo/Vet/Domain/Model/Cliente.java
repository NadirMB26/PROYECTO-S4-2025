
package co.edu.unicolombo.poo.Vet.Domain.Model;

import java.util.List;

public class Cliente extends Usuario {
    private List<Mascota> mascotas;

    // Constructor por defecto
    public Cliente() {
        super();
    }

    // Constructor con parámetros
    public Cliente(String cedula, String nombre, String apellido, String direccion, String correo, String telefono, String rol, List<Mascota> mascotas) {
        super(cedula, nombre, apellido, direccion, correo, null, telefono, rol);  // Se pasa 'null' para la contraseña
        this.mascotas = mascotas;
    }

    // Getters y setters
    public List<Mascota> getMascotas() {
        return mascotas;
    }

    public void setMascotas(List<Mascota> mascotas) {
        this.mascotas = mascotas;
    }
}

