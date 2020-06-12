
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
public class Automovil extends Transporte {
    private ArrayList<String> accesorios;
    
    public Automovil(String marca,String modelo,String motor,String serie,String placas,String tipoUso,double valorFactura,String color, ArrayList<String> accesorios) {
        super();
        this.accesorios = accesorios;
    }  
    
    @Override
    public void corregirDatos() {
        System.out.println("Hello World");
    }
}
