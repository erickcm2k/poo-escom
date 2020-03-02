package polimorfismo;

import java.awt.Color;
import java.awt.Graphics;

public class Cuadrado extends Figura {
    private int lado;
    public Cuadrado(int lado) {
        super("Cuadrado");
        this.lado = lado;
    }
    
    public float calcularArea() {
        return lado * lado;
    }
    
    public float calcularPerimetro() {
        return 4.0f * lado;
    }
    
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.red);
        g.drawRect(50, 50, lado, lado);
    }
}