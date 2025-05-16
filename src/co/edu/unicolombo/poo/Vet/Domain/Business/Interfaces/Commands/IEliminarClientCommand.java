
package co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Commands;


import co.edu.unicolombo.poo.Vet.Domain.Model.Cliente;


public interface IEliminarClientCommand {
 public void eliminarclient (Cliente id)throws Exception;
}
