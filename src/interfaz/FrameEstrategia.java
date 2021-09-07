package interfaz;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.*;
import javax.swing.border.*;

import controlador.Controlador;

public class FrameEstrategia extends JFrame {

	private Controlador ctrl;
	private JLabel lblMundo[][];
	private JLabel lblGiros[];
	private JLabel lblNumero[];

	public FrameEstrategia(Controlador ctrl) {

		this.ctrl = ctrl;

		JPanel mainPanel = new JPanel(new BorderLayout());
		JPanel northPanel = new JPanel(new BorderLayout());
		JPanel westPanel = new JPanel(new BorderLayout());
		JPanel bottomPanel = new JPanel(new BorderLayout());

		mainPanel.setBorder(new CompoundBorder(new EmptyBorder(0, 0, 0, 0), new TitledBorder("")));
		mainPanel.setLayout(new GridLayout(10, 5));

		// Instancia atributos de la clase
		lblMundo = new JLabel[10][5];

		// Agrega los atributos al panel
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 5; j++) {
				lblMundo[i][j] = new JLabel("");
				lblMundo[i][j].setBorder(new CompoundBorder(new EmptyBorder(0, 0, 0, 0), new TitledBorder("")));
				lblMundo[i][j].setHorizontalAlignment(JLabel.CENTER);
				lblMundo[i][j].setVerticalAlignment(JLabel.CENTER);
				lblMundo[i][j].setEnabled(true);
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

		add(northPanel, BorderLayout.NORTH);
		add(westPanel, BorderLayout.WEST);
		add(mainPanel, BorderLayout.CENTER);

		setSize(900, 900);
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);

		System.out.println("FrameEstategia...");
	}
}