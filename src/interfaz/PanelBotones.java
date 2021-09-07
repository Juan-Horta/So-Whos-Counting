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

	private JButton btnEstrategia;
	private JButton btnNuevo;

	public PanelBotones(Controlador ctrl, PanelRuleta pnlRuleta, PanelCPU pnlCPU, PanelUser pnlUser) {

		this.ctrl = ctrl;
		this.pnlRuleta = pnlRuleta;
		this.pnlCPU = pnlCPU;
		this.pnlUser = pnlUser;
		System.out.println("PanelBotones...");

		btnEstrategia = new JButton("CREAR ESTRATEGIA");
		btnNuevo = new JButton("NUEVO JUEGO");
		
		btnEstrategia.addActionListener(this);
		btnNuevo.addActionListener(this);
		
		btnEstrategia.setActionCommand("Crear Estrategia");
		btnNuevo.setActionCommand("Nuevo");
		
		add(btnEstrategia);
		add(btnNuevo);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String action = e.getActionCommand();
		if (action.equals("Crear Estrategia")) {
			estrategia();
		} else if (action.equals("Nuevo")) {
			nuevo();
		}
	}
	
	public void estrategia() {
		new FrameEstrategia(ctrl);
	}
	
	public void nuevo() {
		ctrl.nuevo();
		ctrl.girar();
	}
}