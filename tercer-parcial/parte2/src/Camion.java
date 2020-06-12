
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author erick
 */
public class Camion extends Transporte {
    public int capacidadCarga;
    public int capacidadRemolque;
    
    public Camion(String marca,String modelo,String motor,String serie,String placas,String tipoUso,double valorFactura,String color, int capacidadCarga, int capacidadRemolque) {
        super();
        this.capacidadCarga = capacidadCarga;
    }  
    
    @Override
    public void corregirDatos() {
        System.out.println("Hello World");
    }
}
