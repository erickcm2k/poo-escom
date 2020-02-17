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
    
    public Calendar getFecha() {
        return fecha;
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
        System.out.println("La fecha del movimiento es: " + this.fecha);
        System.out.println("El tipo de movimiento es: " + this.tipo);
        System.out.println("El importe es: " + this.importe);
        System.out.println("El saldo historico es " + this.saldoHistorico);
    }

}