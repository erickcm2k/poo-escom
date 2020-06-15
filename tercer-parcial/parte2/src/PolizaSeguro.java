
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
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
public class PolizaSeguro extends Cobertura implements PrimaSeguro, Serializable {
    private int numero;
    private LocalDate emision;
    private LocalDate inicioVigencia;
    private LocalDate finVigencia;
    private String tipoPago;
    private Transporte transporte;
    
    public PolizaSeguro(int numero, LocalDate emision, LocalDate inicioVigencia, LocalDate finVigencia, String tipoPago, Transporte transporte) {
        this.numero = numero;
        this.emision = emision;
        this.inicioVigencia = inicioVigencia;
        this.finVigencia = finVigencia;
        this.tipoPago = tipoPago;
        this.transporte = transporte;
    }
    
    
    public File generaPoliza() {
        
        String cadena = obtenerDatosPoliza();
       
            try {
                    File polizaSeguro = new File("ticket.txt");
                    if(polizaSeguro.createNewFile()) {
                        System.out.println("Archivo creado");
                    } else {
                        System.out.println("Archivo no creado, ya existe.");
                    }                
                    try {
                        FileWriter myWriter;
                        myWriter = new FileWriter("ticket.txt");
                        myWriter.write(cadena);
                        myWriter.close();
                        System.out.println("Escritura exitosa.");
                        return polizaSeguro;
                    } catch(IOException x) {
                        System.out.println("Error al escribir en el archivo.");
                      }
                } catch (IOException x) {
                    System.out.println("An error ocurred.");
                }
            
            return null;
        }

    public String obtenerDatosPoliza() {
        String cadena = "";
        cadena += "CONCEPTO \t\t\t COSTO\n\n";
        cadena += "Costo Base \t\t\t $" + costoBaseTransporte() + "\n";
        
        /* Datos de descuentos */
            
            if(obtenerEdadAsegurado() < 25) {
                cadena += "Por edad \t\t\t " + costoBaseTransporte() * 0.1 + "\n"; 
            }
                
            if(obtenerAniosConLicencia() < 2) {
                cadena += "Por antiguedad licencia \t\t\t $1,000 \n"; 
            }
            
            if(tipoPago.toLowerCase().equals("credito")) {
                cadena += "Pago con tarjeta crédito \t +2% \n"; 
            }
            
            if(transporte.tipoUso.equals("Comercial")) {
                cadena += "Por uso comercial \t\t\t $2,000 \n"; 
            }
            
        /* Coberturas adicionales */
        if(this.daniosMat || this.robo || this.asistencia || this. defensa || this.sustitucion) {
            cadena += "COBERTURAS ADICIONALES \n";
            if(this.daniosMat) {
                cadena += "Por daños materiales \t\t $1,500\n";
            }
            if(this.robo) {
                cadena += "Por robo total \t\t\t $2,000\n";                
            }   
            if(this.asistencia) {
                cadena += "Por asistencia \t\t\t $700\n";                
            }
            if(this.defensa) {
                cadena += "Por defensa legal \t\t\t $700\n";                
            }
            if(this.sustitucion) {
                cadena += "Por auto de repuesto \t\t\t $500\n";                
            }
        }
        
        cadena += "Monto total \t\t\t $" + calcularMontoPrima();

        
        return cadena;
    }
    
    /*
    
    Implementaciones de Cobertura
    
    */
    
    @Override
    public void incluirCoberturas()
    {
        System.out.println("Ingresar las coberturas deseadas.\n\n");
        
        Scanner respuesta = new Scanner(System.in);

        
        System.out.println("(1) - Daños materiales (s/n)");
        String r1 = respuesta.nextLine();
        if(r1.equals("s") || r1.equals("S")) {
            this.daniosMat = true;
        }
        
        System.out.println("(2) - Robo total (s/n)");
        String r2 = respuesta.nextLine();
        if(r2.equals("s") || r2.equals("S")) {
            this.robo = true;
        }
        
        System.out.println("(3) - Servicio de asistencia(s/n)");
        String r3 = respuesta.nextLine();
        if(r3.equals("s") || r3.equals("S")) {
            this.asistencia = true;
        }        
        
        System.out.println("(4) - Defensa legal(s/n)");
        String r4 = respuesta.nextLine();
        if(r4.equals("s") || r4.equals("S")) {
            this.defensa = true;
        }
        
        System.out.println("(5) - Vehículo de sustitución (s/n)");
        String r5 = respuesta.nextLine();
        if(r5.equals("s") || r5.equals("S")) {
            this.sustitucion = true;
        }        
        
        
    }

    @Override
    public double calculaCostoCoberturas()
    {
        double costoCoberturas = 0;
        
        if(this.daniosMat == true) {
            costoCoberturas += daniosMateriales;
        } 
        
        if(this.robo == true) {
            costoCoberturas += roboTotal;
        }
        
        if(this.asistencia == true) {
            costoCoberturas += servicioAsistencia;
        }
        
        if(this.defensa == true) {
            costoCoberturas += defensaLegal;
        }
        
        if(this.sustitucion == true) {
            costoCoberturas += autoRepuesto;
        }
        
        return costoCoberturas;
    }
        
    /*
    
    Implementaciones de PrimaSeguro
    
    */
    
    @Override
    public double calcularMontoPrima() 
    {
        double montoPrima = costoBaseTransporte();

        // 1.- Si la edad del titular es menor o igual a 25 años, el costo base aumenta 10%.    
        if(obtenerEdadAsegurado() <= 25) {
            montoPrima += montoPrima * 0.1;
        }  
        // 2.- Si el asegurado tiene menos de dos años con su licencia, el costo aumenta $1,000.00.
        if(obtenerAniosConLicencia() < 2) {
            montoPrima += 1000;
        } 
        // 3.- Si la póliza se paga con tarjeta de crédito, se cobra un 2% de comisión en el valor total de la prima.
        double comision = 1.0;
        if(tipoPago.toLowerCase().equals("credito")) {
            comision = 0.02;
        }
        
        // 4.- Sí el vehículo es de uso comercial, aumenta $2,0000.00.
        if(transporte.tipoUso.equals("Comercial")) {
            montoPrima += 2000;
        }
        
        montoPrima += calculaCostoCoberturas();
        montoPrima += montoPrima * comision;
        
        return montoPrima;
    }
    
    // Función auxiliar para calcularMontoPrima
    public double costoBaseTransporte() {
        double costoBase = 0;
        String modelo = transporte.modelo;
        int modeloTransporte = Integer.parseInt(modelo);  
            
        if(transporte instanceof Motocicleta) {
            
            if(modeloTransporte < 2010) {
                costoBase = this.montoBaseMoto[0];
            } else if(modeloTransporte > 2010 && modeloTransporte <= 2016) {
                costoBase = this.montoBaseMoto[1];
            } else if(modeloTransporte >= 2017 && modeloTransporte <= 2020) {
                costoBase = this.montoBaseMoto[2];
            }    
            
        } else if(transporte instanceof Automovil){
            
            if(modeloTransporte < 2010) {
                costoBase = this.montoBaseAuto[0];
            } else if(modeloTransporte > 2010 && modeloTransporte <= 2016) {
                costoBase = this.montoBaseAuto[1];
            } else if(modeloTransporte >= 2017 && modeloTransporte <= 2020) {
                costoBase = this.montoBaseAuto[2];
            }            
            
        
        } else if(transporte instanceof Camion) {
            
            if(modeloTransporte < 2010) {
                costoBase = this.montoBaseCamion[0];
            } else if(modeloTransporte > 2010 && modeloTransporte <= 2016) {
                costoBase = this.montoBaseCamion[1];
            } else if(modeloTransporte >= 2017 && modeloTransporte <= 2020) {
                costoBase = this.montoBaseCamion[2];
            }            
            
        }
        
        return costoBase;
    }
    
    // Función auxiliar para calcularMontoPrima
    public int obtenerEdadAsegurado() {
        LocalDate fNacAsegurado = this.transporte.asegurado.getFechaNacimiento();        
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaHoy = LocalDate.now();
        Period periodo = Period.between(fNacAsegurado, fechaHoy);        
        int edadAsegurado = periodo.getYears();
        
        return edadAsegurado;
    }
    
    // Función auxiliar para calcularMontoPrima
    public int obtenerAniosConLicencia() {
        LocalDate fechaEmisionLicencia = this.transporte.asegurado.getEmisionLicencia();        
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaHoy = LocalDate.now();
        Period periodo = Period.between(fechaEmisionLicencia, fechaHoy);        
        int aniosConLicencia = periodo.getYears();      
        
        return aniosConLicencia;
    }    
    
    @Override
    public double calcularDeducible(String tipoSiniestro)
    {
        // Asumiendo un deducible por el 5% del valor del vehículo.
        return transporte.valorFactura * 0.05;
    }

    @Override
    public boolean aplicarDescuento(double x) 
    {
        return true;
    }
    
    /*
    
    Getters
    
    */
        

    public int getNumero() {
        return numero;
    }

    public LocalDate getEmision() {
        return emision;
    }

    public LocalDate getInicioVigencia() {
        return inicioVigencia;
    }

    public LocalDate getFinVigencia() {
        return finVigencia;
    }

    public String getTipoPago() {
        return tipoPago;
    }

    public Transporte getTransporte() {
        return transporte;
    }

    /*
    
    Setters
    
    */
    
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setEmision(LocalDate emision) {
        this.emision = emision;
    }

    public void setInicioVigencia(LocalDate inicioVigencia) {
        this.inicioVigencia = inicioVigencia;
    }

    public void setFinVigencia(LocalDate finVigencia) {
        this.finVigencia = finVigencia;
    }

    public void setTipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
    }

    public void setTransporte(Transporte transporte) {
        this.transporte = transporte;
    }


    
}
