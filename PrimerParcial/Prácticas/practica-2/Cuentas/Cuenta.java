import java.util.ArrayList;
import java.util.Calendar;

public class Cuenta {
    
    private long numero;
    private double interesAnual;
    private double saldo;
    private Cliente titular;
    private ArrayList<Movimiento> movimientos = new ArrayList<>();

    // Lo que hará la clase por omisión si no recibe parámetros
    public Cuenta(){
        this.saldo = 5000;
        this.interesAnual = 0.25;
        this.numero = 123456789;
    }

    // Lo que hará la clase si recibe todos los parámetros
    public Cuenta(long numero, double interesAnual, double saldo) {
        this.numero = numero;
        this.interesAnual = interesAnual;
        this.saldo = saldo;
    } 

    public long getNumero(long numero) {
        return this.numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }
 
    public double getInteres(){
        return this.interesAnual;
    }
    
    public void setInteres(double interesAnual) {
        this.interesAnual = interesAnual;
    }
    
    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return this.titular;
    }

    public void setCliente(Cliente titular) {
        this.titular = titular;
    }   


    /*
    Asociar cliente
    */
    public void asociarCliente(Cliente titular) {
        this.titular = titular;
    }
    
    /* 
    Función que verificará si es posible retirar la
    cantidad de dinero ingresada 
    */
    public boolean retirarSaldo(double cantidad) {
        if(this.saldo - cantidad > 0){
            this.saldo -= cantidad;
            return true;
        } else {
            return false;
        }
    }

    // Depositar saldo
    public void depositar(float cantidad) {
        this.saldo += cantidad;
    }

    /*
     La función transferencia entre cuentas deberá afectar el saldo
    tanto de la cuenta origen como la cuenta destino
    */
    public boolean transferencia(Cuenta CuentaDestino, double cantidad) {
        if(this.saldo - cantidad >= 0){
            this.saldo -= cantidad;
            CuentaDestino.saldo += cantidad;
            return true;
        } else {
            return false;
        }       
    }


    /*
    La función consultar saldo
    imprime en consola el saldo de la cuenta
    */ 
    public void consultarSaldo() {
        System.out.println("El saldo de la cuenta es: " + this.saldo);
    }



    /*
        Imprimir en consola datos del cliente.
    */
    public void imprimirInformacion() {
        System.out.println("Número de cuenta: " + this.numero);
        System.out.println("Interés: " + this.interesAnual);
        System.out.println("Saldo: " + this.saldo);
        System.out.println("Titular de la cuenta es: " + this.titular.getNombre() + " " + this.titular.getApellidoPaterno() + " " + this.titular.getApellidoMaterno());
    }

    /*
        Registrar movimientos
    */
    public void registrarMovimiento(Movimiento movimiento) {
        movimientos.add(movimiento);
    }

    /* 
        consultarMovimientos 
    */
    public void consultarMovimientos() {
        System.out.println("Movimientos");
        System.out.println();
        for(int i = 0; i < movimientos.size(); i++){
            movimientos.get(i).imprimeInformacion();
            System.out.println();
        }
    }
}