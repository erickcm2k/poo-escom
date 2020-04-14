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
public class Principal {
    public static void main(String[] args){
        /*creamos instancias de los productos */
        Producto []productos = new Producto[4];
        productos[0] = new Electrodomestico(1853,"LG", 7600.0f, 2);
        productos[0].setDescripcion("Televisión LED, 32 pulg");
        productos[0].setExistencias(15);
        
        productos[1] = new Electrodomestico(2026,"Mabe", 5400.0f, 2);
        productos[1].setDescripcion("Lavadora con 8 funciones");
        productos[1].setExistencias(8);
        
        productos[2] = new Vivere(3948,"Gamesa", 35.5f, "09/11/2020");
        productos[2].setDescripcion("Galletas de animalitos");
        productos[2].setExistencias(200);
        
        productos[3] = new Vivere(4757,"Alpura", 13.5f, "12/09/2020");
        productos[3].setDescripcion("Leche deslactosada 1lt");
        productos[3].setExistencias(560);
        
        InterfazGrafica ventana = new InterfazGrafica(productos);
        ventana.setVisible(true);
    }
}
