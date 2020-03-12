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
public class Electrodomestico extends Producto {
    private int garantia;
   
    public Electrodomestico(int precio, String marca, int ID) {
       super();
       this.garantia = 1;
       this.precio = precio;
       this.marca = marca;
       this.ID = ID;
        
    }
    
    public void setGarantia(int garantia) {
        this.garantia = garantia;
    }
    
    public int getGarantia() {
        return garantia;
    }
    
    
}
