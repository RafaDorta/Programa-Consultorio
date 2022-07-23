package view;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; 
import java.text.SimpleDateFormat; 
import javax.swing.JFrame;
import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JLabel;

public class Tela_Marcar_Consulta_Ingrid {

	private JFrame frame;
	private JTextField textDocumento;
	private JTextField textHorario;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela_Marcar_Consulta_Ingrid window = new Tela_Marcar_Consulta_Ingrid();
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
	public Tela_Marcar_Consulta_Ingrid() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		SimpleDateFormat formatter =  new SimpleDateFormat("dd MMMM yyyy");
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(25, 47, 171, 19);
		frame.getContentPane().add(dateChooser);
		
		JButton btnProcurar = new JButton("Procurar");
		btnProcurar.setBounds(70, 76, 85, 21);
		frame.getContentPane().add(btnProcurar);
		
		
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(240, 10, 171, 146);
		frame.getContentPane().add(textArea);
		
		textDocumento = new JTextField();
		textDocumento.setBounds(25, 176, 147, 19);
		frame.getContentPane().add(textDocumento);
		textDocumento.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Documento");
		lblNewLabel.setBounds(25, 162, 95, 13);
		frame.getContentPane().add(lblNewLabel);
		
		textHorario = new JTextField();
		textHorario.setColumns(10);
		textHorario.setBounds(25, 219, 147, 19);
		frame.getContentPane().add(textHorario);
		
		JLabel lblHorario = new JLabel("Horario");
		lblHorario.setBounds(25, 205, 95, 13);
		frame.getContentPane().add(lblHorario);
		
		JButton btnMarcar = new JButton("Marcar");
		btnMarcar.setBounds(201, 201, 85, 21);
		frame.getContentPane().add(btnMarcar);
		btnMarcar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				  
				Paciente p = Menu.acharPaciente(textDocumento.getText());
				
				p.marcar_Consulta(Menu.retornaData(formatter.format(dateChooser.getDate())), textHorario.getText()," Ingrid");
				JOptionPane.showMessageDialog(null, "Consulta marcada com Sucesso!!");
				Tela_Incial.main(null);
				frame.setVisible(false);
			}
		});
		
		
		
		btnProcurar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(Menu.imprimeConsultas(Menu.retornaData(formatter.format(dateChooser.getDate()))));
				System.out.println(Menu.retornaData(formatter.format(dateChooser.getDate())));
				
			}
		});
		
		JButton btnNewButton_3 = new JButton("<-- VOLTA\r\n");
		btnNewButton_3.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 6));
		btnNewButton_3.setBounds(10, 10, 81, 21);
		frame.getContentPane().add(btnNewButton_3);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tela_Menu_Ingrid.main(null);
				frame.setVisible(false);
			}
		});
		
		
	}
}
