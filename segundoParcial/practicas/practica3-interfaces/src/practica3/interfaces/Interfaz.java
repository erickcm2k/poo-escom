import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import javafx.event.ActionEvent;

public class Interfaz extends JFrame implements ActionListener{

    /*
    Panel
    */ 
    private JPanel panel = new JPanel();
    
    /*
    Labels
    */
    JLabel article = new JLabel("Artículo:");
    JLabel specs = new JLabel("CARACTERÍSTICAS:");
    JLabel id = new JLabel("id:");
    JLabel brand = new JLabel("Marca:");
    JLabel description = new JLabel("Descripción:");
    JLabel price = new JLabel("Precio:");
    JLabel warranty = new JLabel("Garantía:");
    
    JLabel articleLabel = new JLabel();
    JLabel idLabel = new JLabel();
    JLabel brandLabel = new JLabel();
    JLabel descriptionLabel = new JLabel();
    JLabel priceLabel = new JLabel();
    JLabel warrantyLabel = new JLabel();

    ImageIcon shoppingCartImage = new ImageIcon(getClass().getResource("carritoCompras.png"));
    JLabel imageLabel = new JLabel(new ImageIcon(shoppingCartImage.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH)));

    /*
    Buttons
    */ 
    JButton sayHelloButton = new JButton("Click");
    
    public Interfaz() {
        this.setSize(800,800);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Ventana");
        this.setLocationRelativeTo(null); // situa la ventana en el centro de la pantalla
        initComponents();
        //this.setLocation(660,100);
        //this.setBounds(200, 200, 600, 600); // x, y, ancho, alto
        // this.getContentPane().setBackground(Color.blue);
    }
    
    private void initComponents() {
        this.getContentPane().add(panel);
        panel.setLayout(null); // Desactiva el diseño por defecto
        addLabels();
        addButtons();
    }
    
    private void addLabels() {
    
        article.setBounds(20, 20, 110, 20);
        specs.setBounds(20, 45, 150, 20);
        id.setBounds(20, 70, 110, 20);
        brand.setBounds(20, 95, 110, 20);
        description.setBounds(20, 125, 110, 20);
        price.setBounds(20, 150, 110, 20);
        warranty.setBounds(20, 175, 110, 20);
    
        articleLabel.setBounds(220, 20, 110, 20);
        idLabel.setBounds(220, 70, 110, 20);
        brandLabel.setBounds(220, 95, 110, 20);
        descriptionLabel.setBounds(220, 125, 110, 20);
        priceLabel.setBounds(220, 150, 110, 20);
        warrantyLabel.setBounds(220, 175, 110, 20);
    
        imageLabel.setBounds(20, 220, 100, 100);
        imageLabel.setOpaque(true);
    
        panel.add(article);
        panel.add(specs);
        panel.add(id);
        panel.add(brand);
        panel.add(description);
        panel.add(price);
        panel.add(warranty);
    
        panel.add(articleLabel);
        panel.add(idLabel);
        panel.add(brandLabel);
        panel.add(descriptionLabel);
        panel.add(priceLabel);
        panel.add(warrantyLabel);
    
        panel.add(imageLabel);   
    }

    private void addButtons() {
        sayHelloButton.setBounds(200, 300, 100, 20);
        panel.add(sayHelloButton);

        sayHelloButton.addActionListener(new ActionListener() {
        
            public void actionPerformed(ActionEvent e) {
                articleLabel.setText("Hello world");
            }
        }    
        );  

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }        
}
