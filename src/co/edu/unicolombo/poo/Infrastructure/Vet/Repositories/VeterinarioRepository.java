package co.edu.unicolombo.poo.Infrastructure.Vet.Repositories;

import co.edu.unicolombo.poo.Vet.Domain.Business.Interfaces.Repositories.IVeterinRepository;
import co.edu.unicolombo.poo.Vet.Domain.Model.Veterinario;
import java.util.ArrayList;

import java.util.List;

public class VeterinarioRepository implements IVeterinRepository {

    private static List<Veterinario> veterinariosDB;

    public VeterinarioRepository() {
        if (veterinariosDB == null) {
            veterinariosDB = new ArrayList<>();
        }
    }

    @Override
    public Veterinario BuscarVetePorId(String veteID) throws Exception {
        if (veterinariosDB == null || veterinariosDB.isEmpty()) {
            throw new Exception("El Veterinario " + veteID + "No existe");
        }
        Veterinario veteEncontrado = null;
        for (Veterinario vete : veterinariosDB) {
            if (vete.getCedula().equalsIgnoreCase(veteID)) {
                veteEncontrado = vete;
                break;
            }
        }
        if (veteEncontrado == null) {
            throw new Exception("El Veterinario " + veteID + "No existe");
        }
        return veteEncontrado;
    }

    @Override
    public int GuardarVeterinario(Veterinario vete) throws Exception {
        if (veterinariosDB.isEmpty()) {
            veterinariosDB.add(vete);
            return veterinariosDB.size();
        }
        for (Veterinario vete1 : veterinariosDB) {
            if (vete.getCedula().equalsIgnoreCase(vete1.getCedula())) {
                throw new Exception("El Veterinario " + vete.getCedula() + " ya existe");
            }
        }

        veterinariosDB.add(vete);
        return veterinariosDB.size();

    }

    @Override
    public void editVete(Veterinario vete) throws Exception {
        if (vete == null) {
            throw new Exception("la cedula es requerida");
        }
        if (veterinariosDB.isEmpty()) {
            throw new Exception("El veterinario " + vete.getCedula() + " no existe");
        }
        Veterinario rolEncontrado = BuscarVetePorId(vete.getCedula());
        int pos = veterinariosDB.indexOf(rolEncontrado);
        veterinariosDB.set(pos, vete);
    }

    @Override

    public int deleteVete(String veteID) throws Exception {
        if (veterinariosDB.isEmpty()) {
            throw new Exception("El rol " + veteID + " no existe");
        }

        Veterinario rolEncontrado = BuscarVetePorId(veteID);
        veterinariosDB.remove(rolEncontrado);
        return veterinariosDB.size();
    }

    @Override
    public List<Veterinario> getVeteuAll() {
        return veterinariosDB;
    }
    
     @Override
    public Veterinario BuscarSesion(String correo, String contra) throws Exception {
        if(veterinariosDB==null||veterinariosDB.isEmpty()){
            throw new Exception("El Usuario con correo "+correo+" No existe");
        }
        Veterinario usuEncontrado=null;
        for(var usu:veterinariosDB){
            if(usu.getCorreo().equalsIgnoreCase(correo)&&usu.getClave().equalsIgnoreCase(contra)){
            usuEncontrado=usu;
            }else{
                throw new Exception("Correo o Clave incorrectos");
            }
        }
        return usuEncontrado;
    }
}
