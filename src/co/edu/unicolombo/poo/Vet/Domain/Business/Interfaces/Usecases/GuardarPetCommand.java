
package co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Usecases;




public class GuardarPetCommand {
    
    private String cedulaUsuario;
    private String nombreMascota;
    private String color;
    private String TipoSangre;
    private String especie;


    public GuardarPetCommand(String cedulaUsuario, String nombreMascota, String color, String TipoSangre, String especie)throws Exception {
        
        if (cedulaUsuario == null || cedulaUsuario.trim().isEmpty()) {
            throw new Exception("La cedula del cliente es requerida");
        }
        if (nombreMascota == null || nombreMascota.trim().isEmpty()) {
            throw new Exception("El nombre de la mascota es requerido");
        }
        if (color == null || color.trim().isEmpty()) {
            throw new Exception("El color es requerido");
        }
        if (TipoSangre == null || TipoSangre.trim().isEmpty()) {
            throw new Exception("El Tipo de sangre es requerid");
        }
        if (especie == null || especie.trim().isEmpty()) {
            throw new Exception("La especie es requerida");
        }

        
        
        this.cedulaUsuario = cedulaUsuario;
        this.nombreMascota=nombreMascota;
        this.color = color;
        this.TipoSangre = TipoSangre;
        this.especie = especie;
    }

    public String getCedulaUsuario() {
        return cedulaUsuario;
    }

    public void setCedulaUsuario(String cedulaUsuario) {
        this.cedulaUsuario = cedulaUsuario;
    }

    public String getNombreMascota() {
        return nombreMascota;
    }

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipoSangre() {
        return TipoSangre;
    }

    public void setTipoSangre(String TipoSangre) {
        this.TipoSangre = TipoSangre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }


}
