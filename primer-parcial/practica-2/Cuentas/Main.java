import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

class Main {
    public static void main(String[] args) {

        ArrayList<Cliente> clientes = new ArrayList<>();
        Cliente cliente1 = new Cliente("Mauricio", "Jimenez", "Garcia", "Saltillo 135 Lomas de Chapultepec");
        clientes.add(cliente1);
        //Cliente cliente2 = new Cliente("Andrea", "Perez", "Suarez", "Av. Lindavista S/N Torres Lindavista");
        //Cliente cliente3 = new Cliente("José", "Manuel", "Marquez", "Calle 5 No. 17 Coyoacán fecha de");
        
        ArrayList<Cuenta> cuentas = new ArrayList<>();
        
        Cuenta cuenta1Cliente1 =  new Cuenta(21545612, 0.0, 145622.50);
        Cuenta cuenta2Cliente1 =  new Cuenta(65126290, 5.5, 5000);
        
        cuentas.add(cuenta1Cliente1);
        cuentas.add(cuenta2Cliente1);

        cuenta1Cliente1.asociarCliente(cliente1);
        //cuenta2Cliente1.asociarCliente(cliente1);

        cuenta1Cliente1.imprimirInformacion();

        Calendar cuenta1Fecha1 = Calendar.getInstance();
        Calendar cuenta1Fecha2 = Calendar.getInstance();
        Calendar cuenta1Fecha3 = Calendar.getInstance();
        cuenta1Fecha1.set(2019, Calendar.AUGUST, 10);
        cuenta1Fecha2.set(2019, Calendar.SEPTEMBER, 12);
        cuenta1Fecha3.set(2019, Calendar.SEPTEMBER, 13);
        Movimiento movimiento1Cuenta1 = new Movimiento(cuenta1Fecha1, 'R', 1500, 5000);
        Movimiento movimiento2Cuenta1 = new Movimiento(cuenta1Fecha2, 'D', 450, 5000);
        Movimiento movimiento3Cuenta1 = new Movimiento(cuenta1Fecha3, 'R', 0, 5000);
        // los movimientos deben ser creador por composicion
        cuenta1Cliente1.registrarMovimiento(movimiento1Cuenta1);
        cuenta1Cliente1.registrarMovimiento(movimiento2Cuenta1);
        cuenta1Cliente1.registrarMovimiento(movimiento3Cuenta1);

        cuenta1Cliente1.consultarMovimientos();
     /*   Calendar calendario = Calendar.getInstance();
        calendario.set(1983, Calendar.FEBRUARY, 24);
        //SimpleDateFormat fechaFormateada =  new SimpleDateFormat("dd/MMM/yyyy");
        //System.out.println(fechaFormateada.format(calendario.getTime()));
        
        Movimiento movimiento1Cuenta1Cliente1 =  new Movimiento(calendario, 'R', 1500.0, 20.20);
        System.out.println(movimiento1Cuenta1Cliente1.getFecha());
*/
    }
}