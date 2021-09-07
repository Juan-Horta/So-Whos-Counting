package interfaz;

import java.awt.BorderLayout;
import java.awt.GridLayout;


import javax.swing.*;
import javax.swing.border.*;

import controlador.Controlador;

public class FrameEstrategia extends JFrame {
	
	private Controlador ctrl;
	private JLabel lblMundo[][];
	private JLabel lblGiros[];
	
	
	public FrameEstrategia(Controlador ctrl) {
		
		this.ctrl = ctrl;
		
		JPanel mainPanel = new JPanel(new BorderLayout());
		JPanel northPanel = new JPanel(new BorderLayout());
		JPanel westPanel = new JPanel(new BorderLayout());
		JPanel bottomPanel = new JPanel(new BorderLayout());
		
		mainPanel.setBorder(new CompoundBorder(new EmptyBorder(0, 0, 0, 0), new TitledBorder("")));
        mainPanel.setLayout(new GridLayout(10, 5));
        
        // Instancia atributos de la clase   
        lblMundo = new JLabel[10][5];

        // Agrega los atributos al panel   
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 5; j++) {
                lblMundo[i][j] = new JLabel("");
                lblMundo[i][j].setBorder(new CompoundBorder(new EmptyBorder(0, 0, 0, 0), new TitledBorder("")));
                lblMundo[i][j].setHorizontalAlignment(JLabel.CENTER);
                lblMundo[i][j].setVerticalAlignment(JLabel.CENTER);
                lblMundo[i][j].setEnabled(true);
                mainPanel.add(lblMundo[i][j]);
            }
        }
        
        /*
        northPanel.setLayout(new GridLayout(1, 6));
        
        lblGiros = new JLabel[6];
        
        for (int j = 0; j < 6; j++) {
        	lblGiros[j] = new JLabel("Giro " + (j+1));
            lblGiros[j].setBorder(new CompoundBorder(new EmptyBorder(0, 0, 0, 0), new TitledBorder("")));
            lblGiros[j].setHorizontalAlignment(JLabel.CENTER);
            lblGiros[j].setVerticalAlignment(JLabel.CENTER);
            lblGiros[j].setEnabled(true);
            northPanel.add(lblGiros[j]);
        }
        
        add(northPanel);*/
        add(mainPanel);
        
        
        setSize(900,900);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
		
		System.out.println("FrameEstategia...");
	}
}