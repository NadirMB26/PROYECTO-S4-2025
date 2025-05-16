
package co.edu.unicolombo.poo.Vet.Domain.Model;

class Horario {
    private String entrada;
    private String salida;
    private String resesos;

    public Horario(String entrada, String salida, String resesos) {
        this.entrada = entrada;
        this.salida = salida;
        this.resesos = resesos;
    }

    public String getEntrada() {
        return entrada;
    }

    public void setEntrada(String entrada) {
        this.entrada = entrada;
    }

    public String getSalida() {
        return salida;
    }

    public void setSalida(String salida) {
        this.salida = salida;
    }

    public String getResesos() {
        return resesos;
    }

    public void setResesos(String resesos) {
        this.resesos = resesos;
    }
    
    
}
