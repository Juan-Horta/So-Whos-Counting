package interfaz;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import controlador.Controlador;

public class PanelBotones extends JPanel implements ActionListener {

	Controlador ctrl;
	PanelRuleta pnlRuleta;
	PanelCPU pnlCPU;
	PanelUser pnlUser;

	private JButton btnGirar;
	private JButton btnNuevo;

	public PanelBotones(Controlador ctrl, PanelRuleta pnlRuleta, PanelCPU pnlCPU, PanelUser pnlUser) {

		this.ctrl = ctrl;
		this.pnlRuleta = pnlRuleta;
		this.pnlCPU = pnlCPU;
		this.pnlUser = pnlUser;
		System.out.println("PanelBotones...");

		btnGirar = new JButton("GIRAR");
		btnNuevo = new JButton("NUEVO JUEGO");
		
		btnGirar.addActionListener(this);
		btnNuevo.addActionListener(this);
		
		btnGirar.setActionCommand("Girar");
		btnNuevo.setActionCommand("Nuevo");
		
		add(btnGirar);
		add(btnNuevo);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String action = e.getActionCommand();
		if (action.equals("Girar")) {
			girar();
		} else if (action.equals("Nuevo")) {
			nuevo();
		}
	}
	
	public void girar() {
		ctrl.girar();
	}
	
	public void nuevo() {
		ctrl.nuevo();
	}
}
