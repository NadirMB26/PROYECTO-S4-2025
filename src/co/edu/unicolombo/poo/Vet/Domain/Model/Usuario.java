package co.edu.unicolombo.poo.Vet.Domain.Model;

import java.util.List;

public class Usuario {
 protected String cedula ;
 protected String apellido ;
 protected String nombre ;
 protected String direccion ;
 protected String correo ;
 protected String clave ;
 protected String telefono ;
 protected String rol ;
 private List<Mascota> mascotas;

    public Usuario() {
    }
    
    public Usuario(String cedula,String apellido,String nombre,String direccion, String correo, String clave,String telefono,String rol){
        this.cedula=cedula;
        this.nombre=nombre;
        this.apellido=apellido;
        this.direccion=direccion;
        this.correo=correo;
        this.clave=clave;
        this.telefono=telefono;
        this.rol=rol;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String Rol) {
        this.rol = Rol;
    }

    public List<Mascota> getMascotas() {
        return mascotas;
    }

    public void setMascotas(List<Mascota> mascotas) {
        this.mascotas = mascotas;
    }

    public List<Mascota> getUsers() {
        return mascotas;
    }

    public void setUsers(List<Mascota> users) {
        this.mascotas = users;
    }

 
}
