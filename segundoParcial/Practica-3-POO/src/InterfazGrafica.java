import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import java.io.IOException; 
import java.io.FileWriter;

public class InterfazGrafica extends JFrame implements ActionListener{
    /* elementos graficos */
    private JLabel etiquetasE[];
    private JLabel etiquetasV[];
    private JLabel etiquetasC[];
    private JTextField campos[];
    private JComboBox<Producto> comboElectro;
    private JComboBox<Producto> comboViveres;
    private JComboBox comboCantidad;
    private JTextArea textAreaCompra;
    private JButton botonAgrega;
    private JButton botonTicket;
    private ImageIcon carrito;
    
    private JPanel tabs[];
    private JTabbedPane tabPanel;
    private Producto []productos;
    private float montoTotal;
    Producto prodSelec;
    
    public InterfazGrafica(Producto []productos) {
        montoTotal = 0.0f;
        prodSelec = null;
        this.setTitle("Tienda Virtual");
        this.setSize(500,600);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.productos = productos;
        this.setLayout(new FlowLayout());//new FlowLayout()
        initComponents();
    }
   
    
    public void initComponents(){
        
        etiquetasE = new JLabel[6];
        etiquetasV = new JLabel[6];
        etiquetasC = new JLabel[2];
        String []texto1 = {"Articulo:", "id", "marca:", "descripcion:", "precio:", "garantia:", "Cantidad:", "Total:"};
        String []texto2 = {"Articulo:", "id", "marca:", "descripcion:", "precio:", "caducidad:"};
        
        for(int i=0; i < 6; i++){
            etiquetasE[i] = new JLabel(texto1[i]);
            etiquetasV[i] = new JLabel(texto2[i]);
        }	
        etiquetasC[0] = new JLabel(texto1[6]);
        etiquetasC[1] = new JLabel(texto1[7]);
        
        campos = new JTextField[11];
        for(int i=0; i < 11; i++){
            campos[i] = new JTextField();
            campos[i].setSize(200, 20);
        }
        campos[10].setText("             0.0");
        tabPanel = new JTabbedPane();
        tabs = new JPanel[2];
        for(int i=0; i < 2; i++){
            tabs[i] = new JPanel();
            tabs[i].setPreferredSize(new Dimension(450, 300));
        }
        
        comboElectro = new JComboBox<Producto>();
        for(int i=0;  i < 5; ++i) {
            comboElectro.addItem(productos[i]);
        }
        comboElectro.addActionListener(this);
        
        
        comboViveres = new JComboBox<Producto>();
        for(int i=0;  i < 5; ++i) {
            comboViveres.addItem(productos[i + 5]);
        }
        comboViveres.addActionListener(this);
        
        
        comboCantidad = new JComboBox();
        for(int i=0; i <=10; i++)
            comboCantidad.addItem(i);
        
        textAreaCompra = new JTextArea(10, 40);
        
        Icon icon = new ImageIcon("carrito2.png");
        
        
        botonAgrega = new JButton("agregar al carrito");
        botonAgrega.setSize(200, 200);
        
        //botonAgrega.setIcon(new ImageIcon(this.getClass().getResource("/iconos/carrito2.png")));
        botonAgrega.addActionListener(this);
        botonTicket = new JButton("Genera ticket");
        botonTicket.addActionListener(this);
        
        
        setComponents();
    }
    
    public void setComponents(){
        this.getContentPane().add(tabPanel, BorderLayout.CENTER);
        /*tab => Electrodomesticos*/
        tabs[0].setLayout(new GridLayout(8, 2, 10, 20));
        
        tabPanel.addTab("Electrodomesticos", tabs[0]);
        
        tabs[0].add(etiquetasE[0]);
        tabs[0].add(comboElectro);
        
        tabs[0].add(etiquetasE[1]);
        tabs[0].add(campos[0]);
        
        tabs[0].add(etiquetasE[2]);
        tabs[0].add(campos[1]);
        
        tabs[0].add(etiquetasE[3]);
        tabs[0].add(campos[2]);
        
        tabs[0].add(etiquetasE[4]);
        tabs[0].add(campos[3]);
        
        tabs[0].add(etiquetasE[5]);
        tabs[0].add(campos[4]);
        
        /*tab => Viveres*/
        tabs[1].setLayout(new GridLayout(7, 2, 10, 20));
        tabPanel.addTab("Viveres", tabs[1]);
        
        tabs[1].add(etiquetasV[0]);
        tabs[1].add(comboViveres);
        
        tabs[1].add(etiquetasV[1]);
        tabs[1].add(campos[5]);
        
        tabs[1].add(etiquetasV[2]);
        tabs[1].add(campos[6]);
        
        tabs[1].add(etiquetasV[3]);
        tabs[1].add(campos[7]);
        
        tabs[1].add(etiquetasV[4]);
        tabs[1].add(campos[8]);
        
        tabs[1].add(etiquetasV[5]);
        tabs[1].add(campos[9]);
        /*componentes en comun */
        //etiquetasC[0].setBounds(x, y, WIDTH, HEIGHT);
       
        this.add(etiquetasC[0]);
        this.add(comboCantidad);
        
        this.add(botonAgrega);
        this.add(textAreaCompra);
        
        this.add(etiquetasC[1]);
        this.add(campos[10]);
        this.add(botonTicket);
        
        
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {    
         Object command = e.getSource();
        String cadena;
        float subtotal = 0.0f;
        if(command.equals(comboElectro)){
            prodSelec = (Producto)comboElectro.getSelectedItem();
            campos[0].setText(String.valueOf(prodSelec.getId()));
            campos[1].setText(prodSelec.getMarca());
            campos[2].setText(prodSelec.getDescripcion());
            campos[3].setText(String.valueOf(prodSelec.getPrecio()));
            Electrodomestico pE = (Electrodomestico)prodSelec;
            campos[4].setText(String.valueOf(pE.getGarantia()));
        }
        if(command.equals(comboViveres)){
            prodSelec = (Producto)comboViveres.getSelectedItem();
            campos[5].setText(String.valueOf(prodSelec.getId()));
            campos[6].setText(prodSelec.getMarca());
            campos[7].setText(prodSelec.getDescripcion());
            campos[8].setText(String.valueOf(prodSelec.getPrecio()));
            Vivere pV = (Vivere)prodSelec;
            campos[9].setText(String.valueOf(pV.getCaducidad()));
        }
        if(command.equals(botonAgrega)){
            String cant = comboCantidad.getSelectedItem().toString();
            subtotal = Integer.parseInt(cant) * prodSelec.getPrecio();
            montoTotal += subtotal;
            campos[10].setText(String.valueOf(montoTotal));
            cadena  = textAreaCompra.getText() + "\n" + cant + "\t" + prodSelec.getDescripcion() + "\t" + prodSelec.getPrecio() + "\t" + subtotal;
            textAreaCompra.setText(cadena);
        }
        if(command.equals(botonTicket)){
            cadena = "cantidad \t producto \t precio \t subtotal \n";
            cadena += textAreaCompra.getText() +  "\n\n";
            cadena += "TOTAL = " + montoTotal;
            
            try {
                File ticket = new File("ticket.txt");
                if(ticket.createNewFile()) {
                    System.out.println("Archivo creado");
                } else {
                    System.out.println("Archivo no creado, ya existe.");
                }
                
                try {
                     FileWriter myWriter = new FileWriter("ticket.txt");
                     myWriter.write(cadena);
                     myWriter.close();
                     System.out.println("Escritura exitosa.");
                } catch(IOException x) {
                    System.out.println("Error al escribir en el archivo.");
                    x.printStackTrace();
                }
                

                
                
            } catch (IOException x) {
                System.out.println("An error ocurred.");
                x.printStackTrace();
            }

            
            JOptionPane.showMessageDialog(rootPane, cadena);
        }
        //
    }
    
}