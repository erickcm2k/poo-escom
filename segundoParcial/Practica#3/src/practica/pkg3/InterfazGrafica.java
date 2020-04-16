package practica.pkg3;

/**
 *
 * @author erick
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class InterfazGrafica extends JFrame implements ActionListener{
    /* elementos graficos */
    private JLabel electronicLabel[];
    private JLabel newElectronicLabel[];
    private JLabel vivereLabel[];
    private JLabel cLabel[];
    private JLabel campos[];
    private JComboBox<Producto> electronicComboBox;
    private JComboBox<String> newElectronicComboBox;
    private JComboBox<Producto> viveresComboBox;
    private JComboBox comboCantidad;
    private JTextArea textAreaCompra;
    private JButton botonAgrega;
    private JButton botonTicket;
    private ImageIcon carrito;
    
    private JPanel tabs[];
    private JTabbedPane tabPanel;
    private Producto []productos;
    private float montoTotal;
    Producto producto;
    
    public InterfazGrafica(Producto []productos) {
        montoTotal = 0.0f;
        producto = null;
        this.setTitle("Tienda Virtual");
        this.setSize(500,600);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.productos = productos;
        this.setLayout(new FlowLayout());//new FlowLayout()
        initComponents();
    }
   
    
    public void initComponents(){
        int i;
        electronicLabel = new JLabel[6];
        newElectronicLabel = new JLabel[6];
        vivereLabel = new JLabel[6];
        cLabel = new JLabel[2];
        String texto1[] = {"Artículo:", "id", "Marca:", "Descripción:", "Precio:", "Garantia:", "Cantidad:", "Total:"};
        String texto2[] = {"Artículo:", "id", "Marca:", "Descripción:", "Precio:", "Caducidad:"};
        
        for(i=0; i < 6; i++){
            electronicLabel[i] = new JLabel(texto1[i]);
            newElectronicLabel[i] = new JLabel(texto1[i]);
            vivereLabel[i] = new JLabel(texto2[i]);
        }	
        
        cLabel[0] = new JLabel(texto1[6]);
        cLabel[1] = new JLabel(texto1[7]);
        
        campos = new JLabel[11];
        for(i=0; i < 11; i++){
            campos[i] = new JLabel();
            campos[i].setSize(200, 20);
        }
        campos[10].setText("             0.0");
        tabPanel = new JTabbedPane();
        tabs = new JPanel[2];
        for(i = 0; i < 2; i++){
            tabs[i] = new JPanel();
            tabs[i].setPreferredSize(new Dimension(450, 300));
        }
        
        electronicComboBox = new JComboBox<Producto>();
        electronicComboBox.addItem(productos[0]);
        electronicComboBox.addItem(productos[1]);
        electronicComboBox.addActionListener(this);
        
        newElectronicComboBox = new JComboBox<String>();
        newElectronicComboBox.addItem(productos[0].descripcion);
        newElectronicComboBox.addItem(productos[1].descripcion);
        newElectronicComboBox.addActionListener(this);
        
        viveresComboBox = new JComboBox<Producto>();
        viveresComboBox.addItem(productos[2]);
        viveresComboBox.addItem(productos[3]);
        viveresComboBox.addActionListener(this);
        
        
    
        
        comboCantidad = new JComboBox();
        for(i=1; i <=10; i++)
            comboCantidad.addItem(i);
        
        textAreaCompra = new JTextArea(10, 40);
        
        Icon icon = new ImageIcon("carrito2.png");
        
        
        botonAgrega = new JButton("Agregar al Carrito");
        botonAgrega.setSize(200, 200);
        
        //botonAgrega.setIcon(new ImageIcon(this.getClass().getResource("/iconos/carrito2.png")));
        botonAgrega.addActionListener(this);
        botonTicket = new JButton("Finalizar Compra");
        botonTicket.addActionListener(this);
        
        
        setComponents();
    }
    
    public void setComponents(){
        this.getContentPane().add(tabPanel, BorderLayout.CENTER);
        /*tab => Electrodomesticos*/
        tabs[0].setLayout(new GridLayout(8, 2, 10, 20));
        
        tabPanel.addTab("Electrodomesticos", tabs[0]);
        
        tabs[0].add(electronicLabel[0]);
        tabs[0].add(electronicComboBox);
        
        tabs[0].add(electronicLabel[1]);
        tabs[0].add(campos[0]);
        
        tabs[0].add(electronicLabel[2]);
        tabs[0].add(campos[1]);
        
        tabs[0].add(electronicLabel[3]);
        tabs[0].add(campos[2]);
        
        tabs[0].add(electronicLabel[4]);
        tabs[0].add(campos[3]);
        
        tabs[0].add(electronicLabel[5]);
        tabs[0].add(campos[4]);
        
        
        tabs[1].setLayout(new GridLayout(8, 2, 10, 20));
        tabPanel.addTab("NEW Electrodomesticos", tabs[1]);
        
        tabs[1].add(newElectronicLabel[0]);
        tabs[1].add(newElectronicComboBox);
        
        tabs[1].add(newElectronicLabel[1]);
        tabs[1].add(campos[5]);
        
        tabs[1].add(newElectronicLabel[2]);
        tabs[1].add(campos[6]);
        
        tabs[1].add(newElectronicLabel[3]);
        tabs[1].add(campos[7]);
        
        tabs[1].add(newElectronicLabel[4]);
        tabs[1].add(campos[8]);
        
        tabs[1].add(newElectronicLabel[5]);
        tabs[1].add(campos[9]);      
        
        /*tab => Viveres*/
        /*tabs[1].setLayout(new GridLayout(7, 2, 10, 20));
        tabPanel.addTab("Viveres", tabs[1]);
        
        tabs[1].add(vivereLabel[0]);
        tabs[1].add(viveresComboBox);
        
        tabs[1].add(vivereLabel[1]);
        tabs[1].add(campos[5]);
        
        tabs[1].add(vivereLabel[2]);
        tabs[1].add(campos[6]);
        
        tabs[1].add(vivereLabel[3]);
        tabs[1].add(campos[7]);
        
        tabs[1].add(vivereLabel[4]);
        tabs[1].add(campos[8]);
        
        tabs[1].add(vivereLabel[5]);
        tabs[1].add(campos[9]);
        /*componentes en comun */
        //cLabel[0].setBounds(x, y, WIDTH, HEIGHT);*/
       
        this.add(cLabel[0]);
        this.add(comboCantidad);
        
        this.add(botonAgrega);
        this.add(textAreaCompra);
        
        this.add(cLabel[1]);
        this.add(campos[10]);
        this.add(botonTicket);
        
        
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {    
        Object selectedElement = e.getSource();
        String cadena;
        float subtotal = 0.0f;
        
        if(selectedElement.equals(electronicComboBox)){
            producto = (Producto)electronicComboBox.getSelectedItem();
            campos[0].setText(String.valueOf(producto.getId()));
            campos[1].setText(producto.getMarca());
            campos[2].setText(producto.getDescripcion());
            campos[3].setText(String.valueOf(producto.getPrecio()));
            Electrodomestico pE = (Electrodomestico)producto;
            campos[4].setText(String.valueOf(pE.getGarantia()));
        }
        
        if(selectedElement.equals(viveresComboBox)){
            producto = (Producto)viveresComboBox.getSelectedItem();
            campos[5].setText(String.valueOf(producto.getId()));
            campos[6].setText(producto.getMarca());
            campos[7].setText(producto.getDescripcion());
            campos[8].setText(String.valueOf(producto.getPrecio()));
            Vivere pV = (Vivere)producto;
            campos[9].setText(String.valueOf(pV.getCaducidad()));
        }
        
        if(selectedElement.equals(botonAgrega)){
            String cant = comboCantidad.getSelectedItem().toString();
            subtotal = Integer.parseInt(cant) * producto.getPrecio();
            montoTotal += subtotal;
            campos[10].setText(String.valueOf(montoTotal));
            cadena  = textAreaCompra.getText() + "\n" + cant + "\t" + producto.getDescripcion() + "\t" + producto.getPrecio() + "\t" + subtotal;
            textAreaCompra.setText(cadena);
        }
        
        if(selectedElement.equals(botonTicket)){
            cadena = "cantidad \t producto \t precio \t subtotal \n";
            cadena += textAreaCompra.getText() +  "\n\n";
            cadena += "TOTAL = " + montoTotal;
            
            JOptionPane.showMessageDialog(rootPane, cadena);
        }
        
    }
    
}
