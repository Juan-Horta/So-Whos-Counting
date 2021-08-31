package interfaz;

import controlador.Controlador;

public class InterfazApp {
		
	Controlador ctrl;
	PanelBotones pnlBotones;
	PanelCPU pnlCPU;
	PanelRuleta pnlRuleta;
	PanelUser pnlUser;
	
	public InterfazApp(Controlador ctr) {
		this.ctrl = ctr;
		
		pnlBotones = new PanelBotones(ctrl,pnlRuleta,pnlCPU,pnlUser);
		pnlCPU = new PanelCPU(ctrl);
		pnlRuleta = new PanelRuleta(ctrl);
		pnlUser = new PanelUser(ctrl);
		
		ctrl.Conectar(pnlBotones, pnlCPU, pnlRuleta, pnlUser);
		
		System.out.println("InterfazApp...");
	}
	
	public static void main(String[] args) {
		//new InterfazApp(new Controlador());
	}
}
