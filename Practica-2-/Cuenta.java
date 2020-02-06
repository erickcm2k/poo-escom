public class Cuenta {
    private long numero;
    private String nip;
    private double interesAnual;
    private double saldo;
    private String titular;

    // Lo que hará la clase por omisión si no recibe parámetros
    public Cuenta(){
        this.saldo = 1500.00;
    }

    // Lo que hará la clase si recibe estos parámetros
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

    public boolean retirarSaldo(double cantidad) {
        if(this.saldo > 0 && this.saldo - cantidad > 0){
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
        return this.saldo; // Si retorna, ¿por qué debería imprimir?
    }


    /*La función cambiar nip debe verificar que la nueva cadena contenga 4
    caracteres numéricos y no repetidos entre sí.*/
    public boolean cambiarNip(String nuevoNip) {
        Integer validaciones = 0;

        if(nuevoNip.length() == 4){
            validaciones++;
        } else {
            return false;
        }

        char caracterAnterior = nuevoNip.charAt(0);
        for(Integer i = 1; i < nuevoNip.length(); i++){
            if(nuevoNip.charAt(i) == caracterAnterior){
                return false;
            } else {
                caracterAnterior = nuevoNip.charAt(i);
            }
        }
        validaciones++;




        if(validaciones == 3){
            return true;
        } else {
            return false;
        }
    }
    /* La
    función transferencia entre cuentas deberá afectar el saldo
    tanto de la cuenta origen como la cuenta destino*/
    // public boolean transferirCuentas(Cuenta CuentaDestino, double cantidad) {

    //     if() {
    //         return true;
    //     } else {
    //         return false;
    //     }
    // }

    // Imprimir en consola datos del cliente.
    public void imprimirInformacion() {
        System.out.println("El numero de usuario es: " + this.numero);
        System.out.println("El nip de la cuenta es: " + this.nip);
        System.out.println("El interés anual establecido para la cuenta es: " + this.interesAnual);
        System.out.println("El saldo de la cuenta es: " + this.saldo);
        System.out.println("El nombre del titular de la cuenta es" + this.titular);
    }

}