package Controlador;

import interfaz.InterfazApp;
import interfaz.PanelBotones;
import interfaz.PanelCPU;
import interfaz.PanelRuleta;
import interfaz.PanelUser;
import mundo.Computadora;
import mundo.Ruleta;
import mundo.Usuario;

public class Controlador {
	
	InterfazApp intefaz;
	
	//mundo
	Computadora cpu;
	Ruleta ru;
	Usuario user;
	
	//Paneles
	PanelBotones pnlBotones;
	PanelCPU pnlCPU;
	PanelRuleta pnlRuleta;
	PanelUser pnlUser;
	
	public Controlador() {
		cpu = new Computadora();
		ru = new Ruleta();
		user = new Usuario();
		
		System.out.println("Controlador...");
	}
	
	public void Conectar(PanelBotones pnlBotones, PanelCPU pnlCPU, PanelRuleta pnlRuleta, PanelUser pnlUser) {
		this.pnlBotones = pnlBotones;
		this.pnlCPU = pnlCPU;
		this.pnlRuleta = pnlRuleta;
		this.pnlUser = pnlUser;
	}
}
