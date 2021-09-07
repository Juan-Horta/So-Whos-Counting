package interfaz;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import controlador.Controlador;

public class PanelUser extends JPanel implements ActionListener {

	Controlador ctrl;
	PanelRuleta pnlRuleta;
	private JLabel numeroUser;
	private JLabel nombreUser;
	private JButton btnDiezMil;
	private JButton btnMil;
	private JButton btnCien;
	private JButton btnDiez;
	private JButton btnUno;
	
	public PanelUser(Controlador ctrl, PanelRuleta pnlRuleta) {
		this.ctrl = ctrl;
		this.pnlRuleta = pnlRuleta;
		System.out.println("PanelUser...");

		numeroUser = new JLabel(getNumero(), SwingConstants.CENTER);
		numeroUser.setFont(new Font("Arial", Font.PLAIN, 69));
		nombreUser = new JLabel("Usuario", SwingConstants.CENTER);
		nombreUser.setFont(new Font("Arial", Font.PLAIN, 32));
		btnDiezMil = new JButton("DM");
		btnMil = new JButton("M");
		btnCien = new JButton("C");
		btnDiez = new JButton("D");
		btnUno = new JButton("U");

		btnDiezMil.addActionListener(this);
		btnMil.addActionListener(this);
		btnCien.addActionListener(this);
		btnDiez.addActionListener(this);
		btnUno.addActionListener(this);

		btnDiezMil.setActionCommand("DM");
		btnMil.setActionCommand("M");
		btnCien.setActionCommand("C");
		btnDiez.setActionCommand("D");
		btnUno.setActionCommand("U");

		JPanel mainPanel = new JPanel(new BorderLayout());
		JPanel botPanel = new JPanel(new GridLayout(0, 5));

		botPanel.add(btnDiezMil);
		botPanel.add(btnMil);
		botPanel.add(btnCien);
		botPanel.add(btnDiez);
		botPanel.add(btnUno);
		mainPanel.add(nombreUser, BorderLayout.NORTH);
		mainPanel.add(numeroUser, BorderLayout.CENTER);
		mainPanel.add(botPanel, BorderLayout.SOUTH);

		add(mainPanel);
	}

	public String getNumero() {
		return ctrl.getNumeroUser();
	}

	public void printNumero() {
		numeroUser.setText(getNumero());
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String action = e.getActionCommand();
		int digito = pnlRuleta.numeroInt;
		int ronda = ctrl.getRonda();

		if (action.equals("DM")) {
			ctrl.jugarUser(digito, 0);
			btnDiezMil.setEnabled(false);
		} else if (action.equals("M")) {
			ctrl.jugarUser(digito, 1);
			btnMil.setEnabled(false);
		} else if (action.equals("C")) {
			ctrl.jugarUser(digito, 2);
			btnCien.setEnabled(false);
		} else if (action.equals("D")) {
			ctrl.jugarUser(digito, 3);
			btnDiez.setEnabled(false);
		} else if (action.equals("U")) {
			ctrl.jugarUser(digito, 4);
			btnUno.setEnabled(false);
		}
		printNumero();
		ctrl.jugarCPU(digito, ronda);
		ctrl.girar();
	}

	public void habilitar() {
		btnDiezMil.setEnabled(true);
		btnMil.setEnabled(true);
		btnCien.setEnabled(true);
		btnDiez.setEnabled(true);
		btnUno.setEnabled(true);
		
	}
}
