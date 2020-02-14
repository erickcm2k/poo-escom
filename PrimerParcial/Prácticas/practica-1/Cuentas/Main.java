class Main {
    public static void main(String[] args) {
        Cuenta[] cuenta = new Cuenta[10];  

        // Reservar memoria para cada elemento del arreglo.
        // en caso de no hacerlo marcará un setnullponterexception
        for(Integer i = 0; i < cuenta.length; i++){
            cuenta[i] = new Cuenta();
        }

        cuenta[0].cambiarNip("1111");
        cuenta[0].transferirCuentas(cuenta[1], 2000);

        double saldo1 = cuenta[0].consultarSaldo();
        double saldo2 = cuenta[1].consultarSaldo();

        System.out.println("Saldo de la primera cuenta: " + saldo1);
        System.out.println("Saldo de la segunda cuenta: " + saldo2);

       System.out.println();
        for(Integer i = 0; i < cuenta.length; i++){
            cuenta[i].imprimirInformacion();
            System.out.println();
        }
        
    }
}