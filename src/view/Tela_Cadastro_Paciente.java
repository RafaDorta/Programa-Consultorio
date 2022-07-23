package view;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Tela_Cadastro_Paciente {

	private JFrame frame;
	private JTextField textEndereco;
	private JTextField textIdade;
	private JTextField textFone;
	private JTextField textNome;
	private JButton btnNewButton;
	private JTextField textDocumento;
	private JLabel lblEndereco_1;
	private JTextField textResponsavel;
	private JLabel lblEndereco_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela_Cadastro_Paciente window = new Tela_Cadastro_Paciente();
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
	public Tela_Cadastro_Paciente() {
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
		
		textEndereco = new JTextField();
		textEndereco.setBounds(22, 125, 160, 19);
		frame.getContentPane().add(textEndereco);
		textEndereco.setColumns(10);
		
		JLabel lblEndereco = new JLabel("Endereco");
		lblEndereco.setHorizontalAlignment(SwingConstants.CENTER);
		lblEndereco.setBounds(22, 111, 160, 13);
		frame.getContentPane().add(lblEndereco);
		
		JLabel lblIdade = new JLabel("Idade");
		lblIdade.setHorizontalAlignment(SwingConstants.CENTER);
		lblIdade.setBounds(244, 68, 160, 13);
		frame.getContentPane().add(lblIdade);
		
		textIdade = new JTextField();
		textIdade.setColumns(10);
		textIdade.setBounds(244, 82, 160, 19);
		frame.getContentPane().add(textIdade);
		
		JLabel lblTelefone = new JLabel("Telefone");
		lblTelefone.setHorizontalAlignment(SwingConstants.CENTER);
		lblTelefone.setBounds(244, 108, 160, 19);
		frame.getContentPane().add(lblTelefone);
		
		textFone = new JTextField();
		textFone.setColumns(10);
		textFone.setBounds(244, 125, 160, 19);
		frame.getContentPane().add(textFone);
		
		textNome = new JTextField();
		textNome.setColumns(10);
		textNome.setBounds(22, 82, 160, 19);
		frame.getContentPane().add(textNome);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setHorizontalAlignment(SwingConstants.CENTER);
		lblNome.setBounds(22, 65, 160, 19);
		frame.getContentPane().add(lblNome);
		
		
		JButton btnNewButton_3 = new JButton("<-- VOLTA\r\n");
		btnNewButton_3.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 6));
		btnNewButton_3.setBounds(10, 10, 81, 21);
		frame.getContentPane().add(btnNewButton_3);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tela_Incial.main(null);
				frame.setVisible(false);
			}
		});
		
		btnNewButton = new JButton("Cadastrar");
		btnNewButton.setBounds(156, 213, 115, 21);
		frame.getContentPane().add(btnNewButton);
		
		textDocumento = new JTextField();
		textDocumento.setColumns(10);
		textDocumento.setBounds(22, 168, 160, 19);
		frame.getContentPane().add(textDocumento);
		
		lblEndereco_1 = new JLabel("Documento(RG)");
		lblEndereco_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblEndereco_1.setBounds(22, 154, 160, 13);
		frame.getContentPane().add(lblEndereco_1);
		
		textResponsavel = new JTextField();
		textResponsavel.setColumns(10);
		textResponsavel.setBounds(244, 168, 160, 19);
		frame.getContentPane().add(textResponsavel);
		
		lblEndereco_2 = new JLabel("Responsavel");
		lblEndereco_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblEndereco_2.setBounds(244, 154, 160, 13);
		frame.getContentPane().add(lblEndereco_2);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Menu.verificaCadastro(textDocumento.getText(), 0)) {
				Menu.criaPaciente(textNome.getText(), Integer.parseInt(textIdade.getText()),textEndereco.getText(), textFone.getText(),textDocumento.getText(),textResponsavel.getText());
				JOptionPane.showMessageDialog(null, "Paciente cadastrado com Sucesso!!");
				Tela_Incial.main(null);
				frame.setVisible(false);
			}
				else {
					JOptionPane.showMessageDialog(null, "Paciente ja cadastrado no Sistema!!");
				}
			}
		});
		
	}
}
