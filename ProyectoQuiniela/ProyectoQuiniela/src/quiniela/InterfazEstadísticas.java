package quiniela;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InterfazEstadísticas extends JFrame {

	private JPanel contentPane;
	private JLabel lbEquipoDeCasa;
	private JLabel lbEquipoVisitante;
	private JLabel lbGolesAFavor;
	private JLabel lbGolesEnContra;
	private JButton btnCancelar;
	private JButton btnSiguiente;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfazEstadísticas frame = new InterfazEstadísticas();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public InterfazEstadísticas() {
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 513, 342);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setForeground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLbEquipoDeCasa());
		contentPane.add(getLbEquipoVisitante());
		contentPane.add(getLbGolesAFavor());
		contentPane.add(getLbGolesEnContra());
		contentPane.add(getBtnCancelar());
		contentPane.add(getBtnSiguiente());
	}
	private JLabel getLbEquipoDeCasa() {
		if (lbEquipoDeCasa == null) {
			lbEquipoDeCasa = new JLabel("Equipo de casa");
			lbEquipoDeCasa.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 15));
			lbEquipoDeCasa.setForeground(Color.WHITE);
			lbEquipoDeCasa.setBounds(149, 35, 116, 14);
		}
		return lbEquipoDeCasa;
	}
	private JLabel getLbEquipoVisitante() {
		if (lbEquipoVisitante == null) {
			lbEquipoVisitante = new JLabel("Equipo visitante");
			lbEquipoVisitante.setForeground(Color.WHITE);
			lbEquipoVisitante.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 15));
			lbEquipoVisitante.setBounds(275, 35, 121, 14);
		}
		return lbEquipoVisitante;
	}
	private JLabel getLbGolesAFavor() {
		if (lbGolesAFavor == null) {
			lbGolesAFavor = new JLabel("Goles a Favor ---->");
			lbGolesAFavor.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lbGolesAFavor.setForeground(Color.WHITE);
			lbGolesAFavor.setBounds(17, 68, 116, 14);
		}
		return lbGolesAFavor;
	}
	private JLabel getLbGolesEnContra() {
		if (lbGolesEnContra == null) {
			lbGolesEnContra = new JLabel("Goles en Contra ->");
			lbGolesEnContra.setForeground(Color.WHITE);
			lbGolesEnContra.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lbGolesEnContra.setBounds(17, 109, 131, 14);
		}
		return lbGolesEnContra;
	}
	private JButton getBtnCancelar() {
		if (btnCancelar == null) {
			btnCancelar = new JButton("Cancelar");
			btnCancelar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					System.exit(0);
				}
			});
			btnCancelar.setBounds(398, 268, 89, 23);
		}
		return btnCancelar;
	}
	private JButton getBtnSiguiente() {
		if (btnSiguiente == null) {
			btnSiguiente = new JButton("Siguiente");
			btnSiguiente.setBounds(299, 268, 89, 23);
		}
		return btnSiguiente;
	}
}
