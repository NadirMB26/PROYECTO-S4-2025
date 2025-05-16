
package co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Commands;


import co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Usecases.GuardarDiagnosticoCommand;


public interface IGuardarDiagnosticoCommand {
  public int createCita(GuardarDiagnosticoCommand comando)throws Exception;      
}
