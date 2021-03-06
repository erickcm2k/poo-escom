public class Cuenta {
    
    private long numero;
    private String nip;
    private double interesAnual;
    private double saldo;
    private String titular;

    // Lo que hará la clase por omisión si no recibe parámetros
    public Cuenta(){
        this.saldo = 5000;
        this.interesAnual = 0.25;
        this.nip = "1234";
        this.numero = 123456789;
        this.titular = "n/a";
    }

    // Lo que hará la clase si recibe todos los parámetros
    public Cuenta(Integer numero, String nip, double saldo, double interesAnual, String titular){
        this.numero = numero;
        this.nip = nip;
        this.saldo = saldo;
        this.interesAnual = interesAnual;
        this.titular = titular;
    }

    public long getNumero(long numero) {
        return this.numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }
    
    public String getNip(){
        return this.nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
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

    /*La función consultar saldo
    imprime en consola el saldo de la cuenta*/ 
    public double consultarSaldo() {
        System.out.println("El saldo de la cuenta es: " + this.saldo);
        return this.saldo; 
    }


    /*La función cambiar nip debe verificar que la nueva cadena contenga 4
    caracteres numéricos y no repetidos entre sí.*/
    public boolean cambiarNip(String nuevoNip) {
        if(nipEsValido(nuevoNip)){
            this.nip = nuevoNip;
            return true;
        } else {
            return false;
        }
    }

    // Función de ayuda para la función cambiarNip, ejecuta las funciones esNumerica,
    // noTieneRepetidos y verifica que la longitud del nip sea de 4
    public boolean nipEsValido(String nip) {
        if(esNumerica(nip) && nip.length() == 4 && noTieneRepetidos(nip)){
            //System.out.println("El NIP " + nip + " es válido");
            return true;
        } else {
            System.out.println("El NIP " + nip + " NO es válido, ingrese un NIP válido.");
            return false;
        }
    }
    // Verifica que todos los caracteres del NIP sean números
    public boolean esNumerica(String nip) { 
        Integer caracteresValidos = 0;
        for(Integer i = 0; i < nip.length(); i++){
            if (Character.isDigit(nip.charAt(i))){
                caracteresValidos++;
            }
        }        
        boolean esNumerica = (caracteresValidos == nip.length() ) ? true : false;
        return esNumerica;
    }

    /* Verifica que no haya dos o más caracteres contiguos en el NIP*/
    public boolean noTieneRepetidos(String nip) {
        char caracterAnterior = nip.charAt(0);
        for(Integer i = 1; i < nip.length(); i++){
            if(nip.charAt(i) == caracterAnterior){
                return false;
            } else {
                caracterAnterior = nip.charAt(i);
            }
        }            
        return true;
    }

    /* La función transferencia entre cuentas deberá afectar el saldo
    tanto de la cuenta origen como la cuenta destino*/
    public boolean transferirCuentas(Cuenta CuentaDestino, double cantidad) {
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
        System.out.println("El nip de la cuenta es: " + this.nip);
        System.out.println("El interés anual establecido para la cuenta es: " + this.interesAnual);
        System.out.println("El saldo de la cuenta es: " + this.saldo);
        System.out.println("El nombre del titular de la cuenta es: " + this.titular);
    }

}