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
public class Vivere extends Producto{
    private String caducidad; //dd:MM:aaaa

    public Vivere(int id, String marca, 
            float precio, String caducidad) {
        super(id, marca, precio);
        this.caducidad = caducidad;
    }

    public void setCaducidad(String caducidad) {
        this.caducidad = caducidad;
    }

    public String getCaducidad() {
        return caducidad;
    } 
}
