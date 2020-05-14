import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class TelaRelogio extends JFrame {
	private JLabel horaMinLabel;
	private JButton tictacButton, horaButton, minutoButton;
	private Relogio relogio;
	private Observador observador;

	public TelaRelogio() {
		super("Relógio");
		relogio = new Relogio();
		horaMinLabel = new JLabel(relogio.mostra());
		tictacButton = new JButton("TicTac");
		horaButton = new JButton("Ajustar hora");
		minutoButton = new JButton("Ajustar minuto");
		Font f = new Font("SansSerif", Font.BOLD, 60);

		horaMinLabel.setFont(f);

		JPanel painelCentral = new JPanel(new FlowLayout());
		painelCentral.add(horaButton);
		painelCentral.add(horaMinLabel);
		painelCentral.add(minutoButton);

		JPanel painelSul = new JPanel(new FlowLayout());
		painelSul.add(tictacButton);

		Container caixa = getContentPane();
		caixa.setLayout(new BorderLayout());
		caixa.add(painelCentral, BorderLayout.CENTER);
		caixa.add(painelSul, BorderLayout.SOUTH);

		setSize(500, 150);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		observador = new Observador();
		tictacButton.addActionListener(observador);
		horaButton.addActionListener(observador);
		minutoButton.addActionListener(observador);

	}

	class Observador implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == tictacButton) {
				relogio.ticTac();
			} else if (e.getSource() == horaButton) {

			} else {

			}
		}
	}
}