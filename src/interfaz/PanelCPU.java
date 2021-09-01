package interfaz;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.*;


import controlador.Controlador;

public class PanelCPU extends JPanel{
	
	Controlador ctrl;
	private JLabel numeroCPU;
	private JLabel nombreCPU;
	
	
	public PanelCPU(Controlador ctrl) {
		this.ctrl = ctrl;
		System.out.println("PanelCPU...");
		
		numeroCPU = new JLabel(getNumero(), SwingConstants.CENTER);
		numeroCPU.setFont(new Font("Arial", Font.PLAIN, 69));
		nombreCPU = new JLabel("CPU", SwingConstants.CENTER);
		nombreCPU.setFont(new Font("Arial", Font.PLAIN, 32));
		
		JPanel mainPanel = new JPanel(new BorderLayout());
		mainPanel.add(nombreCPU, BorderLayout.NORTH);
		mainPanel.add(numeroCPU, BorderLayout.CENTER);
		
		add(mainPanel);
	}
	
	public String getNumero() {
		return ctrl.getNumeroCPU();
	}
	
	public void printNumero() {
		numeroCPU.setText(getNumero());
	}
	
}
