package window;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.CardLayout;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;

public class Interfaz {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interfaz window = new Interfaz();
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
	public Interfaz() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 479, 525);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("NUEVO USUARIO");
		lblNewLabel.setBounds(141, 32, 174, 25);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre:");
		lblNewLabel_1.setBounds(74, 104, 65, 25);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		frame.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(250, 104, 139, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Contraseña:");
		lblNewLabel_1_1.setBounds(73, 145, 86, 25);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		frame.getContentPane().add(lblNewLabel_1_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(250, 144, 139, 20);
		textField_1.setColumns(10);
		frame.getContentPane().add(textField_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Idioma:");
		lblNewLabel_1_1_1.setBounds(74, 186, 86, 25);
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		frame.getContentPane().add(lblNewLabel_1_1_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(251, 186, 139, 20);
		comboBox.setEnabled(false);
		comboBox.setForeground(Color.BLACK);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Español", "Inglés", "Alemán", "Francés"}));
		comboBox.setToolTipText("");
		frame.getContentPane().add(comboBox);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Correo electrónico:");
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1_1_1.setBounds(74, 223, 145, 25);
		frame.getContentPane().add(lblNewLabel_1_1_1_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(250, 227, 139, 20);
		frame.getContentPane().add(textField_2);
	}
}
