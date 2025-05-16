
package co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Queries;


import co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Usecases.SesionVeterQuery;
import co.edu.unicolombo.poo.Vet.Domain.Model.Veterinario;



public interface IBuscarSesionVeterQuery {
  public Veterinario obtenerSesion(SesionVeterQuery sesion) throws Exception;   
}
