package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;

public class Tela_Menu_Alexandre {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela_Menu_Alexandre window = new Tela_Menu_Alexandre();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Tela_Menu_Alexandre() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Marcar Consulta");
		btnNewButton.setBounds(151, 84, 136, 21);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnVerificarConsulta = new JButton("Verificar Consulta");
		btnVerificarConsulta.setBounds(151, 115, 136, 21);
		frame.getContentPane().add(btnVerificarConsulta);
		btnVerificarConsulta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tela_Verifica_Consulta2.main(null);
				frame.setVisible(false);
			}
		});
		
		JButton btnVerificarAgenda = new JButton("Verificar Agenda");
		btnVerificarAgenda.setBounds(151, 146, 136, 21);
		frame.getContentPane().add(btnVerificarAgenda);
		
		JButton btnNewButton_1 = new JButton("<-- VOLTA\r\n");
		btnNewButton_1.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 6));
		btnNewButton_1.setBounds(10, 10, 81, 21);
		frame.getContentPane().add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tela_Incial.main(null);
				frame.setVisible(false);
			}
		});
	}

}