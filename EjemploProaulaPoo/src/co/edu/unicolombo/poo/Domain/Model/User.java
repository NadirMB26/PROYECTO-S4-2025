
package co.edu.unicolombo.poo.Domain.Model;

import java.util.concurrent.atomic.AtomicInteger;


public class User {
 private String codigo;
 private String password;
 private String nombre;
 private String email;
 private Role role;
 

    public User(String codigo, String nombre, Role rol) throws Exception {
      
        if(codigo==null||codigo.isEmpty()){
            throw new Exception("El codigo es requerido");
        }
         if(nombre==null||nombre.isEmpty()){
            throw new Exception("El nombre es requerido");
        }
        if(role==null){
            throw new Exception("El rol es requerido");
        }
        this.codigo=codigo;
        this.nombre=nombre;
        this.role=role;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
  


}
