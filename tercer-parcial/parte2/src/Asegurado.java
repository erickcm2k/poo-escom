
import java.util.ArrayList;
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
public class Asegurado {
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private Date fechaNacimiento;
    private String domicilio;
    private ArrayList<String> telefonos  = new ArrayList();
    private ArrayList<Transporte> transportes = new ArrayList();
    private char[] RFC = new char[13];
    private Date emisionLicencia;
}
