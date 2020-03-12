/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg3;

/**
 *
 * @author erick
 */
public class Producto {
    protected float precio;
    protected String marca;
    protected int ID;
    protected int existencias;
  
    public Producto() {
    }

    public float getPrecio() {
        return precio;
    }
    
   public void setPrecio(float precio) {
        this.precio = precio;
    }    

    public String getmarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }    

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    
    
    
    
}
