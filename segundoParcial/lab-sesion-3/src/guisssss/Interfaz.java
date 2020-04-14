
//package Practica1;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Interfaz extends JFrame implements ActionListener{
    
    private JPanel tabs[];
    private JTabbedPane tabPanel;
    private JLabel labUser, labPass, winner, screen;
    private JTextField tfUser, tfPass;
    private JButton btChess[];
    private JButton btTicTac[];
    private JButton btCalc[];
    private JButton signIn, initGame, player1, player2;
    private ImageIcon icons[];

    public Interfaz(){
        this.setTitle("Practica 1");
        this.setSize(600,600);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        initComponents();
    }
    
    public void initComponents(){
        tabPanel = new JTabbedPane();
        tabs = new JPanel[4];
        for(int i=0; i < 4; i++){
            tabs[i] = new JPanel();
            tabs[i].setPreferredSize(new Dimension(600, 600));
        }
        tabs[0].setLayout(null);
        tabs[1].setLayout(new GridLayout(8, 8));
        tabs[2].setLayout(new BorderLayout());
        tabs[3].setLayout(new FlowLayout());
        tabPanel.addTab("Iniciar Sesion", tabs[0]);
        tabPanel.addTab("Juego de Ajedrez", tabs[1]);
        tabPanel.addTab("Tic Tac Toe", tabs[2]);
        tabPanel.addTab("Calculadora", tabs[3]);
        this.getContentPane().add(tabPanel, BorderLayout.CENTER);
        iniciarSesion();
        juegoAjedrez();
        juegoGato();
        calculadora();
    }

    public void iniciarSesion(){
        String usuario = "Erick";
        String contrasena = "contrasena";
        labUser = new JLabel("Usuario: ");
        tfUser = new JTextField();
        labPass = new JLabel("Password: ");
        tfPass = new JTextField();        
        signIn = new JButton("Ingresar");
        labUser.setBounds(100, 150, 100, 20);
        tfUser.setBounds(190, 150, 200, 20);
        labPass.setBounds(100, 200, 100, 20);
        tfPass.setBounds(190, 200, 200, 20);
        signIn.setBounds(220, 250, 80, 20);
        tabs[0].add(labUser);
        tabs[0].add(tfUser);
        tabs[0].add(labPass);
        tabs[0].add(tfPass);
        tabs[0].add(signIn);   
        
            signIn.addActionListener(new ActionListener() {

                public void actionPerformed(ActionEvent e) {

                    if( tfUser.getText().equals(usuario) && tfPass.getText().equals(contrasena) ) {

                        JOptionPane.showMessageDialog(null, "Contraseña correcta");
                    } else {
                        JOptionPane.showMessageDialog(null, "Contraseña incorrecta");
                    }
                }
            }    
            );         
            
    }
    
    public void juegoAjedrez(){
        String images[] = {"alfil","caballo","peon","rey","reyna","torre"};
        icons = new ImageIcon[12];
        btChess = new JButton[64];
        for(int i=0; i < 64; i++){
            btChess[i] = new JButton();
            btChess[i].addActionListener(this);
            if(i<6){
                icons[i] = new ImageIcon(new ImageIcon(getClass().getResource("/iconos/" + images[i] + ".png")).getImage().getScaledInstance(55, 55, java.awt.Image.SCALE_SMOOTH));
                btChess[i].setIcon(icons[i]);
            }
            tabs[1].add(btChess[i]);
        }        
    }
    
    public void juegoGato(){
        winner = new JLabel("Ganador: ");
        player1 = new JButton();
        player2 = new JButton();
        initGame = new JButton("Nuevo Juego");
        btTicTac = new JButton[9];
        JPanel casillas = new JPanel();
        casillas.setSize(300, 300);
        casillas.setLayout(new GridLayout(3, 3));
        ImageIcon iC = new ImageIcon(getClass().getResource("/iconos/casilla.png"));
        for(int i=0; i < 9; i++){
            btTicTac[i] = new JButton();
            btTicTac[i].setIcon(iC);
            casillas.add(btTicTac[i]);
        }
        tabs[2].add(casillas);
    }
    
    public void calculadora(){
        screen = new JLabel();
        String texto[] = {"MC","M+","M-","MR","C","+-","/","X","7","8","9","-","4","5","6",
        "+","1","2","3","=","0","."}; 
        tabs[3].add(screen);
        btCalc = new JButton[22];
        for(int i = 0; i < btCalc.length; i++){
            btCalc[i] = new JButton(texto[i]);        
            tabs[3].add(btCalc[i]);
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {

    }
    
    
}
