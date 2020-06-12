
import java.io.File;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author erick
 */
public class PolizaSeguro extends Cobertura implements PrimaSeguro {
    private int numero;
    private Date emision;
    private Date inicioVigencia;
    private Date finVigencia;
    private String tipoPago;
    private Transporte transporte;
    
    public /*File*/ String generaPoliza() {
        return "";
    }
    
    @Override
    public double calculaCostoCoberturas() {
        double precio = 0;
        if(transporte instanceof Motocicleta) {
            
        } else if(transporte instanceof Automovil){
            
        } else if(transporte instanceof Camion) {
            
        }
        return precio;
    }
    
    @Override
    public void incluirCoberturas() {
        System.out.println("Hello World");
    }
    
    @Override
    public boolean aplicarDescuento(double x) {
        return true;
    }
    
    @Override
    public double calcularDeducible(String tipoSiniestro) {
        return 1;
    }
         
    @Override
    public double calcularMontoPrima() {
        return 1;
    }

    
}
