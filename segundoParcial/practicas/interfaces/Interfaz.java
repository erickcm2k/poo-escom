import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.*;

public class Interfaz extends JFrame {
    
    public Interfaz() {
        this.setSize(600,600);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Ventana");
        //this.setLocation(660,100);
        //this.setBounds(200, 200, 600, 600); // x, y, ancho, alto
        this.setLocationRelativeTo(null); // situa la ventana en el centro de la pantalla
        //this.getContentPane().setBackground(Color.yellow);
        initComponents();
    }
    
    private void initComponents() {
        JPanel panel = new JPanel();
        this.getContentPane().add(panel);
        panel.setLayout(null); // Desactiva el diseño por defecto

        JLabel articleLabel = new JLabel("Artículo:");
        JLabel specsLabel = new JLabel("CARACTERÍSTICAS:");
        JLabel idLabel = new JLabel("id:");
        JLabel brandLabel = new JLabel("Marca:");
        JLabel descriptionLabel = new JLabel("Descripción:");
        JLabel priceLabel = new JLabel("Precio:");
        JLabel warrantyLabel = new JLabel("Garantía:");

        articleLabel.setBounds(20, 20, 110, 20);
        specsLabel.setBounds(20, 45, 110, 20);
        idLabel.setBounds(20, 70, 110, 20);
        brandLabel.setBounds(20, 95, 110, 20);
        descriptionLabel.setBounds(20, 125, 110, 20);
        descriptionLabel.setForeground(Color.green);
        panel.add(articleLabel);
        panel.add(specsLabel);
        panel.add(idLabel);
        panel.add(brandLabel);
        panel.add(descriptionLabel);
        panel.add(priceLabel);
        panel.add(warrantyLabel);
    }
}
