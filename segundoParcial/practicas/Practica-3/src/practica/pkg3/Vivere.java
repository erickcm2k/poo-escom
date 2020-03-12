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
public class Vivere extends Producto {
    private int caducidad;
    
    public Vivere(int precio, String marca, int ID, int caducidad) {
       super();
       this.precio = precio;
       this.marca = marca;
       this.ID = ID;     
       this.caducidad = caducidad;
    }

    public int getCaducidad() {
        return caducidad;
    }

    public void setCaducidad(int caducidad) {
        this.caducidad = caducidad;
    }
    
    
}
