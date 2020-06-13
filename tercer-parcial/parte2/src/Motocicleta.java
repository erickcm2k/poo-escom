
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
public class Motocicleta extends Transporte {
    private int potencia;
    private int cilindrada;
    
    /*
        
     Constructor
        
     */
    
    public Motocicleta(String marca,String modelo,String motor,String serie,String placas,String tipoUso,double valorFactura,String color,int potencia, int cilindrada) {
        super();
        this.potencia = potencia;
        this.cilindrada = cilindrada;
    }   
    
    /*
    
    Getters
    
    */
    
    public int getPotencia() {
        return potencia;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMotor() {
        return motor;
    }

    public String getSerie() {
        return serie;
    }

    public String getPlacas() {
        return placas;
    }

    public String getTipoUso() {
        return tipoUso;
    }

    public double getValorFactura() {
        return valorFactura;
    }

    public String getColor() {
        return color;
    }

    public ArrayList<PolizaSeguro> getPolizas() {
        return polizas;
    }
    
    public Asegurado getTitular() {
        return asegurado;
    }
        

    /*
    
    Setters
    
    */

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public void setPlacas(String placas) {
        this.placas = placas;
    }

    public void setTipoUso(String tipoUso) {
        this.tipoUso = tipoUso;
    }

    public void setValorFactura(double valorFactura) {
        this.valorFactura = valorFactura;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPolizas(ArrayList<PolizaSeguro> polizas) {
        this.polizas = polizas;
    }

    public void setTitular(Asegurado titular) {
        this.asegurado = titular;
    }
    
    
    /*
    
    
    Métodos
    
    */
        
    public void agregarDatos() {
        
    }
    
    @Override
    public void corregirDatos() {
        System.out.println("Hello World");
    }
}
