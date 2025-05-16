package co.edu.unicolombo.poo.Domain.Model;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;


public class Role {
 private int id;
 private String name;
 private String descripcion;
 private List<User> users;
 private static AtomicInteger incrementID;
 
 public Role(){
     if(incrementID==null){
         incrementID=new AtomicInteger(0);
     }
     id=getIncrementeID();
 }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public static AtomicInteger getIncrementID() {
        return incrementID;
    }

    public static void setIncrementID(AtomicInteger incrementID) {
        Role.incrementID = incrementID;
    }
    
    private int getIncrementeID(){
        if(incrementID==null){
            incrementID=new AtomicInteger(1);
        }
        return incrementID.incrementAndGet();
    }
 
}
