
import java.util.ArrayList;
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author erick
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Motocicleta miMoto = new Motocicleta("BMW", "2018", "MOTOR", "1J1N1", "ABC430", "Personal", 140000, "Azul", 200, 4);       
        ArrayList<String> accesorios = new ArrayList<String>(Arrays.asList("Asientos Piel", "Retrovisor electrónico"));
        Automovil miAuto = new Automovil("Audi", "2019", "2.0 TSI", "ABCDE123", "430UDE", "Comercial", 600000, "Negro", accesorios);
        Camion miCamion = new Camion("Freightliner", "2010", "Detroit DD13","BCDA503", "502MDE","Comercial",1200000,"Blanco", 6, 10);
    }
    
}
