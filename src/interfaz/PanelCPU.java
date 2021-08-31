package interfaz;

import controlador.Controlador;

public class PanelCPU {
	
	Controlador ctrl;
	
	public PanelCPU(Controlador ctrl) {
		this.ctrl = ctrl;
		System.out.println("PanelCPU...");
	}
}
