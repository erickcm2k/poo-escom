package practica.pkg3;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author miriampescadorrojas
 */
public class Electrodomestico extends Producto{
    private int garantia;
    
     public Electrodomestico(int id, String marca, 
             float precio, int garantia) {
        super(id, marca, precio);
        this.garantia = garantia;
    }

    public void setGarantia(int garantia) {
        this.garantia = garantia;
    }

    public int getGarantia() {
        return garantia;
    }
     
 
}
