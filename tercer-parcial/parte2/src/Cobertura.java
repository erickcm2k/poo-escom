/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author erick
 */
public abstract class Cobertura implements CostoCoberturas {
    public boolean daniosMat;
    public boolean robo;
    public boolean asistencia;
    public boolean defensa;
    public boolean sustitucion;
    
    public abstract void incluirCoberturas();
    public abstract double calculaCostoCoberturas();
}
