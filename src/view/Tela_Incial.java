package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Tela_Incial {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela_Incial window = new Tela_Incial();
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
	public Tela_Incial() {
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
		
		JButton btnNewButton = new JButton("Dra Ingrid Dorta");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tela_Menu_Ingrid.main(null);
				frame.setVisible(false);
			}
		});
		btnNewButton.setBounds(142, 62, 163, 21);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnDrAlexandreDorta = new JButton("Dr Alexandre Dorta");
		btnDrAlexandreDorta.setBounds(142, 108, 163, 21);
		frame.getContentPane().add(btnDrAlexandreDorta);
		btnDrAlexandreDorta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tela_Menu_Alexandre.main(null);
				frame.setVisible(false);
			}
		});
		
		JButton btnNewButton_1 = new JButton("Cadastrar Paciente");
		btnNewButton_1.setBounds(142, 154, 163, 21);
		frame.getContentPane().add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tela_Cadastro_Paciente.main(null);
				frame.setVisible(false);
			}
		});
		
		
		
	}
}
