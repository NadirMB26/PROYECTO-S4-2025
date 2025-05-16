package co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Usecases;

public class BuscarPetQuery {

    private String cedulaUsuario;
    private String nombreMascota;

    public BuscarPetQuery(String cedulaUsuario)throws Exception {

        if (cedulaUsuario == null || cedulaUsuario.trim().isEmpty()) {
            throw new Exception("La cédula del usuario es requerida");
        }
        this.cedulaUsuario = cedulaUsuario;
    }
    
    public String getCedulaUsuario() {
        return cedulaUsuario;
    }

    public String getNombreMascota() {
        return nombreMascota;
    }

    public void setCedulaUsuario(String cedulaUsuario) {
        this.cedulaUsuario = cedulaUsuario;
    }
    
}
