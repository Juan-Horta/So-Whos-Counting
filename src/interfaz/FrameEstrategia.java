package interfaz;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.*;

import controlador.Controlador;

public class FrameEstrategia extends JFrame implements ActionListener {

	private Controlador ctrl;
	private JTextField lblMundo[][];
	private JLabel lblGiros[];
	private JLabel lblNumero[];
	private JButton btnGuardar;

	public FrameEstrategia(Controlador ctrl) {

		this.ctrl = ctrl;

		JPanel mainPanel = new JPanel(new BorderLayout());
		JPanel northPanel = new JPanel(new BorderLayout());
		JPanel westPanel = new JPanel(new BorderLayout());
		JPanel bottomPanel = new JPanel(new BorderLayout());

		mainPanel.setLayout(new GridLayout(10, 5));

		// Instancia atributos de la clase
		lblMundo = new JTextField[10][5];

		// Agrega los atributos al panel
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 5; j++) {
				lblMundo[i][j] = new JTextField("");
				lblMundo[i][j].setBorder(new CompoundBorder(new EmptyBorder(0, 0, 0, 0), new TitledBorder("")));
				lblMundo[i][j].setHorizontalAlignment(JLabel.CENTER);
				lblMundo[i][j].setEnabled(true);
				lblMundo[i][j].setFont(new Font("Arial", Font.BOLD, 20));
				mainPanel.add(lblMundo[i][j]);
			}
		}

		northPanel.setLayout(new GridLayout(1, 6));

		lblGiros = new JLabel[6];
		lblGiros[0] = new JLabel("Número observado");
		lblGiros[0].setBorder(new CompoundBorder(new EmptyBorder(0, 0, 0, 0), new TitledBorder("")));
		lblGiros[0].setHorizontalAlignment(JLabel.CENTER);
		lblGiros[0].setVerticalAlignment(JLabel.CENTER);
		lblGiros[0].setEnabled(true);
		northPanel.add(lblGiros[0]);
		for (int j = 1; j < 6; j++) {
			lblGiros[j] = new JLabel("Giro " + (j));
			lblGiros[j].setBorder(new CompoundBorder(new EmptyBorder(0, 0, 0, 0), new TitledBorder("")));
			lblGiros[j].setHorizontalAlignment(JLabel.CENTER);
			lblGiros[j].setVerticalAlignment(JLabel.CENTER);
			lblGiros[j].setEnabled(true);
			northPanel.add(lblGiros[j]);
		}

		westPanel.setLayout(new GridLayout(10, 1));

		lblNumero = new JLabel[10];

		for (int j = 0; j < 10; j++) {
			lblNumero[j] = new JLabel("                       " + (j) + "                       ");
			lblNumero[j].setBorder(new CompoundBorder(new EmptyBorder(0, 0, 0, 0), new TitledBorder("")));
			lblNumero[j].setHorizontalAlignment(JLabel.CENTER);
			lblNumero[j].setVerticalAlignment(JLabel.CENTER);
			lblNumero[j].setEnabled(true);
			westPanel.add(lblNumero[j]);
		}

		bottomPanel.setLayout(new GridLayout(3, 6));
		btnGuardar = new JButton("GUARDAR");
		bottomPanel.add(new JLabel());
		bottomPanel.add(btnGuardar);

		btnGuardar.addActionListener(this);
		btnGuardar.setActionCommand("Guardar");

		add(northPanel, BorderLayout.NORTH);
		add(westPanel, BorderLayout.WEST);
		add(mainPanel, BorderLayout.CENTER);
		add(bottomPanel, BorderLayout.SOUTH);

		setSize(900, 900);
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);

		System.out.println("FrameEstategia...");

	}

	@Override

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		int estrategia[][] = new int[10][5];

		String action = e.getActionCommand();
		if (action.equals("Guardar")) {
			for (int i = 0; i < 10; i++) {
				for (int j = 0; j < 5; j++) {
					try {
						int num = Integer.parseInt(lblMundo[i][j].getText());

						boolean error = false;

						switch (j) {
						case 0:
							if (num > 0 && num <= 5) {
								estrategia[i][j] = num;
							} else {
								error = true;
							}
							break;
						case 1:
							if (num > 0 && num <= 4) {
								estrategia[i][j] = num;
							} else {
								error = true;
							}
							break;
						case 2:
							if (num > 0 && num <= 3) {
								estrategia[i][j] = num;
							} else {
								error = true;
							}
							break;
						case 3:
							if (num > 0 && num <= 2) {
								estrategia[i][j] = num;
							} else {
								error = true;
							}
							break;
						case 4:
							if (num > 0 && num <= 1) {
								estrategia[i][j] = num;
							} else {
								error = true;
							}
							break;
						}

						if (error) {
							JOptionPane.showMessageDialog(null,
									"Se ingreso número fuera de rango en la posición: " + i + "," + (j + 1), "Error",
									JOptionPane.ERROR_MESSAGE);

							return;
						}
					} catch (Exception ex) {
						JOptionPane.showMessageDialog(null,
								"Se ingreso un valor no númerico en la posición: " + i + "," + (j + 1), "Error",
								JOptionPane.ERROR_MESSAGE);
						return;
					}
				}
			}
			ctrl.crearEstrategia(estrategia);
			JOptionPane.showMessageDialog(null, "Estrategia creada", "Atención", JOptionPane.INFORMATION_MESSAGE);
			setVisible(false);
		}
	}
}