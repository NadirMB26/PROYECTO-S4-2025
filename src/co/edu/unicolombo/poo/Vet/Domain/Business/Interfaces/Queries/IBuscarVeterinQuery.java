
package co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Queries;

import co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Usecases.BuscarVeterinQuery;
import co.edu.unicolombo.poo.Vet.Domain.Model.Veterinario;

public interface IBuscarVeterinQuery {
    public Veterinario obtenerVeterin(BuscarVeterinQuery Query) throws Exception;
}
