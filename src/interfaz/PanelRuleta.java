package interfaz;

import java.awt.*;

import javax.swing.*;
import controlador.Controlador;

public class PanelRuleta extends JPanel{
	
	private static final String ruletaGIF = "data/giraRuleta.gif"; 
	public int numeroInt;
	private ImageIcon imgRuleta = new ImageIcon(ruletaGIF);
	private JLabel numero;
	private JLabel ruleta;
	Controlador ctrl;
	
	public PanelRuleta(Controlador ctrl) {
		this.ctrl = ctrl;
		System.out.println("PanelRuleta...");
		ruleta = new JLabel(imgRuleta);
		numero = new JLabel("Número: -", SwingConstants.CENTER);
		numero.setFont(new Font("Arial",Font.PLAIN, 32));
		
		JPanel mainPanel = new JPanel(new BorderLayout());
		mainPanel.add(ruleta, BorderLayout.CENTER);
		mainPanel.add(numero, BorderLayout.SOUTH);
		
		add(mainPanel);
	}
	
	public void printNumero(int num) {
		numeroInt = num;
		numero.setText("Número: " + num);
	}
}
