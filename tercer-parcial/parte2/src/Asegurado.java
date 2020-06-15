
import java.time.LocalDate;
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
public class Asegurado {
    
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private LocalDate fechaNacimiento;
    private String domicilio;
    private ArrayList<String> telefonos  = new ArrayList();
    private ArrayList<Transporte> transportes = new ArrayList();
    private char[] RFC;
    private LocalDate emisionLicencia;

    /*
    
    Constructor
    
    */
    
    public Asegurado(String nombre, String apellidoPaterno, String apellidoMaterno, LocalDate fechaNacimiento, String domicilio, ArrayList<String> telefonos, ArrayList<Transporte> transportes, LocalDate emisionLicencia) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.fechaNacimiento = fechaNacimiento;
        this.domicilio = domicilio;
        this.telefonos = telefonos;
        this.transportes = transportes;
        this.emisionLicencia = emisionLicencia;
    }
    
    
    /*
    
    Getters
    
    */

    public String getNombre() {
        return nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public ArrayList<String> getTelefonos() {
        return telefonos;
    }

    public ArrayList<Transporte> getTransportes() {
        return transportes;
    }

    public char[] getRFC() {
        return RFC;
    }

    public LocalDate getEmisionLicencia() {
        return emisionLicencia;
    }
    
    /*
    
    Setters
    
    */

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public void setTelefonos(ArrayList<String> telefonos) {
        this.telefonos = telefonos;
    }

    public void setTransportes(ArrayList<Transporte> transportes) {
        this.transportes = transportes;
    }

    public void setRFC(char[] RFC) {
        this.RFC = RFC;
    }

    public void setEmisionLicencia(LocalDate emisionLicencia) {
        this.emisionLicencia = emisionLicencia;
    }
    
    
    
    
}
