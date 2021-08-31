package interfaz;

import controlador.Controlador;

public class PanelUser {
	
Controlador ctrl;
	
	public PanelUser(Controlador ctrl) {
		this.ctrl = ctrl;
		System.out.println("PanelUser...");
	}
}
