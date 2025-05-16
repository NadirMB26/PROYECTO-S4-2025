
package co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Queries;

import co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Usecases.BuscarPetQuery;
import co.edu.unicolombo.poo.Vet.Domain.Model.Mascota;


public interface IBuscarPetQuery {
    public Mascota obtenerPet(BuscarPetQuery query) throws Exception;
}
