package quiniela;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.IOException;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class InterfazQuiniela extends JFrame {

	private JPanel contentPane;
	private Equipos teams= new Equipos();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfazQuiniela frame = new InterfazQuiniela();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws IOException 
	 */
	public InterfazQuiniela() throws IOException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("La Quiniela");
		setBounds(100, 100, 450, 300);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setForeground(Color.LIGHT_GRAY);
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		etiquetaCasa();
		
		etiquetaVisit();
		
		desplegableVisit();
		
		desplegableCasa();
		
		botonCancelar();
		
		botonSiguiente();
	}

	private void etiquetaVisit() {
		JLabel lbEquipoFuera = new JLabel("Equipo visitante");
		lbEquipoFuera.setForeground(Color.WHITE);
		lbEquipoFuera.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 13));
		lbEquipoFuera.setBounds(298, 48, 126, 14);
		contentPane.add(lbEquipoFuera);
	}

	private void etiquetaCasa() {
		JLabel lbEquipoCasa = new JLabel("Equipo de casa");
		lbEquipoCasa.setBackground(Color.WHITE);
		lbEquipoCasa.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 13));
		lbEquipoCasa.setForeground(Color.WHITE);
		lbEquipoCasa.setBounds(42, 48, 126, 14);
		contentPane.add(lbEquipoCasa);
	}

	private void desplegableVisit() {
		JComboBox cbEquipoVisit = new JComboBox();
		cbEquipoVisit.setBounds(241, 73, 168, 20);
		contentPane.add(cbEquipoVisit);
		String[] equipos= new String[20];
		for (int i=0; i < 20; i++)
		{
			equipos[i]= teams.getTeams()[i];
		}
		cbEquipoVisit.setModel(new DefaultComboBoxModel(equipos));
	}

	private void desplegableCasa() {
		JComboBox cbEquipoCasa = new JComboBox();
		cbEquipoCasa.setBounds(34, 73, 158, 20);
		contentPane.add(cbEquipoCasa);
		String[] equipos= new String[20];
		for (int i=0; i < 20; i++)
		{
			equipos[i]= teams.getTeams()[i];
		}
		cbEquipoCasa.setModel(new DefaultComboBoxModel(equipos));
	}

	private void botonCancelar() {
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setForeground(Color.WHITE);
		btnCancelar.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) 
		{
			System.exit(0);
		}
		});
		btnCancelar.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 12));
		btnCancelar.setBackground(Color.BLACK);
		btnCancelar.setBounds(320, 214, 89, 23);
		contentPane.add(btnCancelar);
	}

	private void botonSiguiente() {
		JButton btnSiguiente = new JButton("Siguiente");
		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				InterfazEstad�sticas estadisticas= new InterfazEstad�sticas();
				estadisticas.setVisible(true);
				InterfazQuiniela.this.dispose();
			}
		});
		btnSiguiente.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 12));
		btnSiguiente.setBackground(Color.BLACK);
		btnSiguiente.setForeground(Color.WHITE);
		btnSiguiente.setBounds(211, 214, 89, 23);
		contentPane.add(btnSiguiente);
	}
}