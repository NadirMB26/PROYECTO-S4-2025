
package co.edu.unicolombo.poo.Vet.Domain.Business.Handlers.Commands;

import co.edu.unicolombo.poo.Vet.Domain.Model.Usuario;
import co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Usecases.GuardarUsuCommand;
import co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Repositories.IUsuRepository;
import co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Commands.IGuardarUsuCommand;

public class GuardarUsuCommandHandler implements IGuardarUsuCommand{
   private IUsuRepository usuRepository; 
   public GuardarUsuCommandHandler(IUsuRepository repository){
       usuRepository=repository;
   }

    @Override
    public int createUsu(GuardarUsuCommand comand) throws Exception {
        Usuario usu1=new Usuario();
        usu1.setCedula(comand.getCedula());
        usu1.setApellido(comand.getApellido());
        usu1.setNombre(comand.getNombre());
        usu1.setDireccion(comand.getDireccion());
        usu1.setCorreo(comand.getCorreo());
        usu1.setClave(comand.getClave());
        usu1.setTelefono(comand.getTelefono());
        usu1.setRol(comand.getRol());
        return usuRepository.GuardarUsuario(usu1);
    }

   
}
