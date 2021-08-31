package interfaz;

import controlador.Controlador;

public class PanelBotones {

	Controlador ctrl;
	PanelRuleta pnlRuleta;
	PanelCPU pnlCPU;
	PanelUser pnlUser;

	public PanelBotones(Controlador ctrl, PanelRuleta pnlRuleta, PanelCPU pnlCPU, PanelUser pnlUser) {
		
		this.ctrl = ctrl;
		this.pnlRuleta = pnlRuleta;
		this.pnlCPU= pnlCPU;
		this.pnlUser = pnlUser;
		System.out.println("PanelBotones...");
	}
}
