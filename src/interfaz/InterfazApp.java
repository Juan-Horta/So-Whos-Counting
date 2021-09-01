package interfaz;

import java.awt.*;
import javax.swing.*;
import controlador.Controlador;

public class InterfazApp extends JFrame{
		
	Controlador ctrl;
	PanelBotones pnlBotones;
	PanelCPU pnlCPU;
	PanelRuleta pnlRuleta;
	PanelUser pnlUser;
	
	//Atributos
	private JMenuBar mbrOpciones;
	private JMenu mnuAcerca;
	private JMenu mnuAyuda;
	private JMenuItem mitAcerca;
	private JMenuItem mitAyuda;
	private JLabel label;
	
	
	public InterfazApp(Controlador ctr) {
		
		setTitle("So, Who's Counting?");
		getContentPane().setLayout(new GridLayout(2,3));
		
		// Instancia controles de menu
        mbrOpciones = new JMenuBar();
        
        // Acerca de..
        mnuAcerca = new JMenu();
        mnuAcerca.setText("About");
        mitAcerca = new JMenuItem();
        mitAcerca.setText("Authors: Juan Sebastián Castaño Ramírez. Juan José Horta Osorio.");
        mnuAcerca.add(mitAcerca);
        mbrOpciones.add(mnuAcerca);
		
        setJMenuBar(mbrOpciones);
        
		//Ayuda
        mnuAyuda = new JMenu();
        mnuAyuda.setText("Help");
        mitAyuda = new JMenuItem();
        mitAyuda.setText("Ayuda");
        mnuAyuda.add(mitAyuda);
        mbrOpciones.add(mnuAyuda);
   
        
		this.ctrl = ctr;
		
		pnlCPU = new PanelCPU(ctrl);
		pnlRuleta = new PanelRuleta(ctrl);
		pnlUser = new PanelUser(ctrl, pnlRuleta);
		pnlBotones = new PanelBotones(ctrl,pnlRuleta,pnlCPU,pnlUser);
		
		getContentPane().add(new JLabel());
        getContentPane().add(pnlRuleta);
        getContentPane().add(new JLabel());
        
        getContentPane().add(pnlUser);
        getContentPane().add(pnlBotones);
        getContentPane().add(pnlCPU);
		
		ctrl.Conectar(pnlBotones, pnlCPU, pnlRuleta, pnlUser);
		
		
		
		setSize(900,900);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        System.out.println("InterfazApp...");
        setLocationRelativeTo(null);
        pack();
        setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new InterfazApp(new Controlador());
	}
}
