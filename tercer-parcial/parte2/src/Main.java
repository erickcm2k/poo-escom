
import java.time.LocalDate;
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
        
        
        /*
        
        En esta primera sección se muestran las declaraciones de transportes y asegurados.
        
        */
        
        Motocicleta miMoto = new Motocicleta("BMW", "2018", "MOTOR", "1J1N1", "ABC430", "Personal", 140000, "Azul", 200, 4);       
        ArrayList<String> accesorios = new ArrayList<String>(Arrays.asList("Asientos Piel", "Retrovisor electrónico"));
        Automovil miAuto = new Automovil("Audi", "2019", "2.0 TSI", "ABCDE123", "430UDE", "Comercial", 600000, "Negro", accesorios);
        Camion miCamion = new Camion("Freightliner", "2010", "Detroit DD13","BCDA503", "502MDE","Comercial",1200000,"Blanco", 6, 10);
        
        ArrayList<Transporte> transportesAs1 = new ArrayList(Arrays.asList(miMoto, miAuto, miCamion));  
        ArrayList<String> telefonosAs1 = new ArrayList(Arrays.asList("1122334455", "6677889900"));
        
        Asegurado as1 = new Asegurado("Erick", "Castañeda", "Martínez", LocalDate.of(2000,7,10), "domicilio1", telefonosAs1, transportesAs1 , LocalDate.of(2000,10,10));
        
        miMoto.setAsegurado(as1);
        miAuto.setAsegurado(as1);
        miCamion.setAsegurado(as1);
        
        /*
        
        En esta parte se declaran las polizas de seguro y se hacen las asociaciones con los transportes.
        
        */
        PolizaSeguro polMiMoto = new PolizaSeguro(1234, LocalDate.of(2020,9,10), LocalDate.of(2020,9,10),LocalDate.of(2021,9,10), "Credito", miMoto);
        PolizaSeguro polMiAuto = new PolizaSeguro(1235, LocalDate.of(2020,9,10), LocalDate.of(2020,9,10),LocalDate.of(2021,9,10), "Credito", miAuto);
        PolizaSeguro polMiCamion = new PolizaSeguro(1236, LocalDate.of(2020,9,10), LocalDate.of(2020,9,10),LocalDate.of(2021,9,10), "Credito", miCamion);
                
        
        // Agregando algunas coberturas...
        
        polMiMoto.daniosMat = true;
        polMiMoto.asistencia = true;
        polMiMoto.robo = true;
        
        polMiMoto.generaPoliza();
    }
    
}
