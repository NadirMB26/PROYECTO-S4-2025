package co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Usecases;

public class GuardarPetCommand {
    
    private String cedulaUsuario;
    private String nombreMascota;
    private String color;
    private String TipoSangre;
    private String especie;


    public GuardarPetCommand(String cedulaUsuario, String nombreMascota, String color,
                                String TipoSangre, String especie)throws Exception {
    
    validarCampo(cedulaUsuario, "La cedula del cliente es requerida");
    validarCampo(nombreMascota, "El nombre de la mascota es requerido");
    validarCampo(color, "El color es requerido");
    validarCampo(TipoSangre, "El tipo de sangre es requerido");
    validarCampo(especie, "Laespecie es requerida");
 
        this.cedulaUsuario = cedulaUsuario;
        this.nombreMascota=nombreMascota;
        this.color = color;
        this.TipoSangre = TipoSangre;
        this.especie = especie;
    }

private void validarCampo(String valor, String mensajeError) throws Exception {
    if (valor == null || valor.trim().isEmpty()) {
        throw new Exception(mensajeError);
    }
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
