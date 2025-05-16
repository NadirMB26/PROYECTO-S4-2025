
package co.edu.unicolombo.poo.Infrastructure.Repositories;

import co.edu.unicolombo.poo.Domain.Model.Role;
import java.util.ArrayList;
import java.util.List;
import co.edu.unicolombo.poo.Domain.Business.Interfaces.Repositories.IRoleRepository;


public class RoleRepository implements IRoleRepository{
  private static List<Role> rolesDB;
  
public RoleRepository(){
    if(rolesDB==null){
        rolesDB=new ArrayList<>(); 
    }
}  


    @Override
    public Role BuscarRolPorId(int roleID) throws Exception {
        if(rolesDB==null||rolesDB.isEmpty()){
            throw new Exception("El rol "+roleID+"No existe");
        }
        Role rolEncontrado=null;
        for(Role rol:rolesDB){
           if(rol.getId()==roleID){
               rolEncontrado=rol;
               break;
           } 
        }
        if(rolEncontrado==null){
             throw new Exception("El rol "+roleID+"No existe");
        }
        return rolEncontrado;
    }

    @Override
    public Role BuscarRolPorName(String nombre) throws Exception {
        if(rolesDB==null||rolesDB.isEmpty()){
            throw new Exception("El rol "+nombre+"No existe");
        }
        Role roleFound=null;
        for(var r:rolesDB){
           if(r.getName().equalsIgnoreCase(nombre)){
               roleFound=r;
               break;
            } 
        }
        if(roleFound==null){
             throw new Exception("El rol "+nombre+"No existe");
        }
        return roleFound;
    }

    @Override
    public int GuardarRole(Role rol) throws Exception {
        if(rolesDB.isEmpty()){
           rolesDB.add(rol);
           return rolesDB.size();
        }
        for(Role rol1:rolesDB){
            if(rol.getName().equalsIgnoreCase(rol1.getName())){
                throw new Exception("El rol "+rol.getName()+" ya existe");
            }
        }
     
           rolesDB.add(rol);
        return rolesDB.size();

    }

    @Override
    public void editRole(Role role) throws Exception {
        if(role == null){
           throw new Exception("El rol es requerido");
        }
        if(rolesDB.isEmpty()){
           throw new Exception("El rol "+role.getName()+" no existe");
        }
        Role rolEncontrado=BuscarRolPorId(role.getId());
      int pos=rolesDB.indexOf(rolEncontrado);
      rolesDB.set(pos, role);
    }

    @Override
    public int deleteRole(int roleID) throws Exception {
       if(rolesDB.isEmpty()){
           throw new Exception("El rol "+roleID+" no existe");
        }
        
        Role rolEncontrado=BuscarRolPorId(roleID);
        rolesDB.remove(rolEncontrado);
        return rolesDB.size();
    }

    @Override
    public List<Role> getRoleAll() {
      return rolesDB;
    }
}
