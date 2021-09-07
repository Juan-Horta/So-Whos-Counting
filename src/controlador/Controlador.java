package controlador;

import javax.swing.JOptionPane;

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
	
	public String getNumeroUser() {
		return user.generarString();
	}
	
	public String getNumeroCPU() {
		return cpu.generarString();
	}
	
	public void girar() {
		int num = ru.random();
		
		int ronda = getRonda();
		
		if(ronda == 5) {
			printGanador();
			nuevo();
		}
		
		pnlRuleta.printNumero(num);
	}
	
	public void nuevo() {
		user.nuevo();
		cpu.nuevo();
		pnlUser.printNumero();
		pnlCPU.printNumero();
	}
	
	public void jugarUser(int digito, int casilla) {
		user.elegir(digito, casilla);
	}
	
	public void jugarCPU(int digito, int casilla) {
		cpu.elegir(digito, casilla);
		pnlCPU.printNumero();
	}
	
	public int getRonda() {
		return user.getRonda();
	}

	public void printGanador() {
		int numCPU = cpu.generarInt();
		int numUser = user.generarInt();
		
		if(numCPU > numUser){
			JOptionPane.showMessageDialog(null, "Ganó CPU!!!");
		} else if(numUser > numCPU) {
			JOptionPane.showMessageDialog(null, "Ganó el Usuario!!!");
		} else {
			JOptionPane.showMessageDialog(null, "Hubo un empate!!!");
		}
	}

	public void crearEstrategia(int[][] estrategia) {
		// TODO Auto-generated method stub
		cpu.setTablaEstrategia(estrategia);
	}
}
