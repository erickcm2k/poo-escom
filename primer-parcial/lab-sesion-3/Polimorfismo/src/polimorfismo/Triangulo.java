package polimorfismo;

import java.awt.Color;
import java.awt.Graphics;

public class Triangulo extends Figura {
    private int base, altura;
    public Triangulo(int base, int altura) {
        super("Triangulo");
        this.base = base;
        this.altura = altura;
    }
    public float calcularArea() {
        return base * altura / 2.0f;
    }
    
    public float calcularPerimetro() {
        return base + altura + (float)Math.sqrt(Math.pow(base,2) + Math.pow(altura,2));
    }
    
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.black);
        int [] vx1 = {50, 50, 50 + base};
        int [] vy1 = {50, 50 + altura, 50 + altura};
        g.drawPolygon(vx1, vy1, 3);
    }
}


