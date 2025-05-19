/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Usecases;

/**
 *
 * @author HP
 */
public class EliminarCitaCommand {
    private int idcita;

    public EliminarCitaCommand(int idcita) throws Exception {
        if (idcita <= 0) {
            throw new Exception("El ID es requerido");
        }
        this.idcita = idcita;
    }

    public int getIdcita() {
        return idcita;
    }
    
}
