import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Movimiento {
    public Calendar fecha;
    public char tipo;
    public double importe;
    public double saldoHistorico;

    public Movimiento(Calendar fecha, char tipo, double importe, double saldoHistorico) {
        this.fecha = fecha;
        this.tipo = tipo;
        this.importe = importe;
        this.saldoHistorico = saldoHistorico;
    }
    
    public String getFecha() {
        SimpleDateFormat fechaFormateada =  new SimpleDateFormat("dd/MMM/yyyy");
        return fechaFormateada.format(this.fecha.getTime());
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public double getSaldoHistorico() {
        return saldoHistorico;
    }

    public void setSaldoHistorico(double saldoHistorico) {
        this.saldoHistorico = saldoHistorico;
    }

    public void imprimeInformacion(){
        SimpleDateFormat fechaFormateada =  new SimpleDateFormat("dd/MMM/yyyy");
        /*System.out.println("La fecha del movimiento es: " + fechaFormateada.format(this.fecha.getTime()));
        System.out.println("El tipo de movimiento es: " + this.tipo);
        System.out.println("El importe es: " + this.importe);
        System.out.println("El saldo historico es " + this.saldoHistorico);*/
        System.out.println( fechaFormateada.format(this.fecha.getTime()) + "   " + this.tipo + "   " + this.importe + "   " + this.saldoHistorico);
    }
}