/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author erick
 */
public interface PrimaSeguro {
    public final double comision = 0;
    public final double montoBaseAuto[] = {3500, 5000, 6500};
    public final double montoBaseMoto[] = {5000, 7200, 9000};
    public final double montoBaseCamion[] = {10000, 12000, 14000};
    
    public double calcularMontoPrima();
    public double calcularDeducible(String tipoSiniestro);
    public boolean aplicarDescuento(double porcentaje);
}
