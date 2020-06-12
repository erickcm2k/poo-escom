package polimorfismo;

import java.awt.Graphics;
import javax.swing.JPanel;

public abstract class Figura extends JPanel {
    private String nombre;
    Figura(String nombre) {
        this.nombre = nombre;
        this.setSize(200,200);
    }
    
    public abstract float calcularArea();
    public abstract float calcularPerimetro();
    
    @Override 
    public void paint(Graphics g) {
        super.paint(g);
    }
}



