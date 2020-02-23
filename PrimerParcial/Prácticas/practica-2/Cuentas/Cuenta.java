public class Cuenta {
    
    private long numero;
    private double interesAnual;
    private double saldo;
    private String titular;
    private Movimiento[] movimientos;

    // Lo que hará la clase por omisión si no recibe parámetros
    public Cuenta(){
        this.saldo = 5000;
        this.interesAnual = 0.25;
        this.numero = 123456789;
        this.titular = "n/a";
    }

    // Lo que hará la clase si recibe todos los parámetros
    public Cuenta(double saldo, double interesAnual){
        this.saldo = saldo;
        this.interesAnual = interesAnual;
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

    public String getCliente() {
        return this.titular;
    }

    public void setCliente(String titular) {
        this.titular = titular;
    }   

    /* Función que verificará si es posible retirar la
    cantidad de dinero ingresada */
    public boolean retirarSaldo(double cantidad) {
        if(this.saldo - cantidad > 0){
            this.saldo -= cantidad;
            return true;
        } else {
            return false;
        }
    }


    // Depositar saldo

    /*La función consultar saldo
    imprime en consola el saldo de la cuenta*/ 
    public double consultarSaldo() {
        System.out.println("El saldo de la cuenta es: " + this.saldo);
        return this.saldo; 
    }


    /* La función transferencia entre cuentas deberá afectar el saldo
    tanto de la cuenta origen como la cuenta destino*/
    public boolean transferencia(Cuenta CuentaDestino, double cantidad) {
        if(this.saldo > 0 && this.saldo - cantidad > 0){
            this.saldo -= cantidad;
            CuentaDestino.saldo += cantidad;
            return true;
        } else {
            return false;
        }       
    }

    // Imprimir en consola datos del cliente.
    public void imprimirInformacion() {
        System.out.println("El numero de usuario es: " + this.numero);
        System.out.println("El interés anual establecido para la cuenta es: " + this.interesAnual);
        System.out.println("El saldo de la cuenta es: " + this.saldo);
        System.out.println("El nombre del titular de la cuenta es: " + this.titular);
    }

    // consultarMovimientos
}