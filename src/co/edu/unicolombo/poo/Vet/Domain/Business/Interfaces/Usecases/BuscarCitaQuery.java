/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Usecases;

/**
 *
 * @author HP
 */
public class BuscarCitaQuery {
    private String cedulaClient;

    public BuscarCitaQuery(String cedulaClient) throws Exception {
        if (cedulaClient == null || cedulaClient.trim().isEmpty()) {
            throw new Exception("La cédula del usuario es requerida");
        }
        this.cedulaClient = cedulaClient;
    }

    public String getCedulaClient() {
        return cedulaClient;
    }

    public void setCedulaClient(String cedulaCliente) {
        this.cedulaClient = cedulaCliente;
    }
    
    
}
