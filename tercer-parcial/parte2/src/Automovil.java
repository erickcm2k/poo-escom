
import java.util.ArrayList;
import java.util.Scanner;

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
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.serie = serie;
        this.placas = placas;
        this.tipoUso = tipoUso;
        this.valorFactura = valorFactura;
        this.color = color;
        
        this.accesorios = accesorios;
    }  
    
    @Override
    public void corregirDatos() {
        Scanner respuesta = new Scanner(System.in);
        System.out.println("¿Desea modificar la marca del vehículo? (s/n) Actual: " + this.marca);
        String r1 = respuesta.nextLine();
        if(r1.equals("s") || r1.equals("S")) {
            System.out.println("Ingrese los nuevos datos de la marca.");
            this.marca = respuesta.nextLine();
            System.out.println("Nueva marca es: " + this.marca);
        }
        
        System.out.println("¿Desea modificar el modelo del vehículo? (s/n) Actual: " + this.modelo);
        String r2 = respuesta.nextLine();
        if(r2.equals("s") || r2.equals("S")) {
            System.out.println("Ingrese los nuevos datos del modelo.");
            this.modelo = respuesta.nextLine();
            System.out.println("Nuevo modelo es: " + this.modelo);
        }
        
        System.out.println("¿Desea modificar el motor del vehículo? (s/n) Actual: " + this.motor);
        String r3 = respuesta.nextLine();
        if(r3.equals("s") || r3.equals("S")) {
            System.out.println("Ingrese los nuevos datos del motor.");
            this.motor = respuesta.nextLine();
            System.out.println("Nuevo motor es: " + this.motor);
        }

        
        System.out.println("¿Desea modificar el número de serie del vehículo? (s/n) Actual: " + this.serie);
        String r4 = respuesta.nextLine();
        if(r4.equals("s") || r4.equals("S")) {
            System.out.println("Ingrese los nuevos datos del número de serie.");
            this.serie = respuesta.nextLine();
            System.out.println("Nuevo número de serie es: " + this.serie);
        }
        
        System.out.println("¿Desea modificar las placas vehículo? (s/n) Actual: " + this.placas);
        String r5 = respuesta.nextLine();
        if(r5.equals("s") || r5.equals("S")) {
            System.out.println("Ingrese los nuevos datos de las placas.");
            this.placas = respuesta.nextLine();
            System.out.println("Nuevas placas: " + this.placas);
        }        
        
        System.out.println("¿Desea modificar el tipo de uso del vehículo? (s/n) Actual: " + this.tipoUso);
        String r6 = respuesta.nextLine();
        if(r6.equals("s") || r6.equals("S")) {
            System.out.println("Ingrese los nuevos datos del tipo de uso.");
            this.tipoUso = respuesta.nextLine();
            System.out.println("Nuevo tipo de uso es: " + this.tipoUso);
        }        
        
        
        System.out.println("¿Desea modificar el valor de factura del vehículo? (s/n) Actual: " + this.valorFactura);
        String r7 = respuesta.nextLine();
        if(r7.equals("s") || r7.equals("S")) {
            System.out.println("Ingrese los nuevos datos del valor de factura.");
            this.valorFactura = respuesta.nextDouble();
            System.out.println("Nueva marca es: " + this.valorFactura);
        }        
        
        System.out.println("¿Desea modificar el color del vehículo? (s/n) Actual: " + this.color);
        String r8 = respuesta.nextLine();
        if(r8.equals("s") || r8.equals("S")) {
            System.out.println("Ingrese los nuevos datos del color.");
            this.color = respuesta.nextLine();
            System.out.println("Nuevo color es: " + this.color);
        }        

        /*
        
        Propios de vehículo
        
        */
        
    }

    public ArrayList<String> getAccesorios() {
        return accesorios;
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

    public Asegurado getAsegurado() {
        return asegurado;
    }

    public void setAccesorios(ArrayList<String> accesorios) {
        this.accesorios = accesorios;
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

    public void setAsegurado(Asegurado asegurado) {
        this.asegurado = asegurado;
    }
    
    
}
