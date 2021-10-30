
import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author reyes
 */
public class prueba implements Serializable  {
    private int id;
    private String estatus;
    
    public prueba(int id, String estatus){
        this.id=id;
        this.estatus=estatus;
        
        
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

     public String getEstatus() {
        return estatus;
    }
    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }
    
}
