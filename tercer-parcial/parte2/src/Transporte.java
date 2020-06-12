
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
public abstract class Transporte {
    protected String marca;
    protected String modelo;
    protected String motor;
    protected String serie;
    protected String placas;
    protected String tipoUso;
    protected double valorFactura;
    protected String color;
    protected ArrayList<PolizaSeguro> polizas = new ArrayList();
    protected Asegurado titular;
    
    public abstract void corregirDatos();
}
