
package co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Usecases;

import co.edu.unicolombo.poo.Vet.Domain.Model.Usuario;
import co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Repositories.IUsuRepository;
import co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Commands.IGuardarUsuCommand;

public class GuardarUsuCommandHandler implements IGuardarUsuCommand{
   private IUsuRepository usuRepository;
   public GuardarUsuCommandHandler(IUsuRepository usuRepository){
     this.usuRepository=usuRepository;
   }

    @Override
    public int createUsu(GuardarUsuCommand comando) throws Exception {
     Usuario usu1=new Usuario();
     usu1.setCedula(comando.getCedula());
     usu1.setApellido(comando.getApellido());
     usu1.setNombre(comando.getNombre());
     usu1.setDireccion(comando.getDireccion());
     usu1.setCorreo(comando.getCorreo());
     usu1.setClave(comando.getClave());
     usu1.setTelefono(comando.getTelefono());
     usu1.setRol(comando.getRol());
     return usuRepository.GuardarUsuario(usu1);
    }
}
