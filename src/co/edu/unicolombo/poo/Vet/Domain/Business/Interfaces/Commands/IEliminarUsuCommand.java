
package co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Commands;


import co.edu.unicolombo.poo.Vet.Domain.Model.Usuario;


public interface IEliminarUsuCommand {
 public void eliminar (Usuario rol)throws Exception;
}
