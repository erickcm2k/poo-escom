package polimorfismo;

import java.awt.Color;
import java.awt.Graphics;

public class Circulo extends Figura {
    private int radio;
    public Circulo(int radio) {
        super("Circulo");
        this.radio = radio;
    }
    
    public float calcularArea() {
        return (float)Math.PI * radio * radio;
    }
    
    public float calcularPerimetro() {
        return (float)Math.PI * radio * 2.0f;
    }
    
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.blue);
        g.drawOval(50, 50, radio, radio);
    }
    
}