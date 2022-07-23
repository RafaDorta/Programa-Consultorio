package view;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Tela_Verifica_Consulta2 {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	public int i =0;
	public int flag = 1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela_Verifica_Consulta2 window = new Tela_Verifica_Consulta2();
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
	public Tela_Verifica_Consulta2() {
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
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Pesquisa por Nome");
		rdbtnNewRadioButton.setBounds(39, 39, 218, 21);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Pesquisa por Documento");
		rdbtnNewRadioButton_1.setBounds(39, 131, 189, 21);
		frame.getContentPane().add(rdbtnNewRadioButton_1);
		
		textField = new JTextField();
		textField.setBounds(39, 62, 174, 19);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Pesquisar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(39, 92, 99, 21);
		frame.getContentPane().add(btnNewButton);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(39, 157, 174, 19);
		frame.getContentPane().add(textField_1);
		
		JButton btnNewButton_1 = new JButton("Pesquisar");
		btnNewButton_1.setBounds(39, 187, 99, 21);
		frame.getContentPane().add(btnNewButton_1);
		
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i++;
				if(i%2 == 1) {
					btnNewButton_1.setEnabled(false);
					rdbtnNewRadioButton_1.setEnabled(false);
					flag =0;
				}else {
					btnNewButton_1.setEnabled(true);
					rdbtnNewRadioButton_1.setEnabled(true);
					flag =1;
				}
				
			}
		});
		
		rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i++;
				if(i%2 == 1) {
					btnNewButton.setEnabled(false);
					rdbtnNewRadioButton.setEnabled(false);
					flag =0;
				}else {
					btnNewButton.setEnabled(true);
					rdbtnNewRadioButton.setEnabled(true);
					flag =1;
				}
				
			}
		});
		
		JButton btnNewButton_3 = new JButton("<-- VOLTA\r\n");
		btnNewButton_3.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 6));
		btnNewButton_3.setBounds(10, 10, 81, 21);
		frame.getContentPane().add(btnNewButton_3);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tela_Menu_Alexandre.main(null);
				frame.setVisible(false);
			}
		});
		
	}
}
