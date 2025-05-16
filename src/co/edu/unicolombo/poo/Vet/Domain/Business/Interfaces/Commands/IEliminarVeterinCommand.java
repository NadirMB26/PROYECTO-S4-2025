
package co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Commands;


import co.edu.unicolombo.poo.Vet.Domain.Model.Veterinario;


public interface IEliminarVeterinCommand {
 public void eliminar (Veterinario rol)throws Exception;
}
