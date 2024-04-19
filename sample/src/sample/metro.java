package sample;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class metro {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					metro window = new metro();
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
	public metro() {
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
		
		JLabel lblNewLabel = new JLabel("METRO TICKET BOOKING");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setBackground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(114, 11, 192, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("NAME:");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(29, 74, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("ENTRY:");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setBounds(29, 104, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("EXIT:");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setBounds(29, 129, 46, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_1_1 = new JLabel("TICKETS:");
		lblNewLabel_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1.setBounds(29, 166, 46, 14);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		textField = new JTextField();
		textField.setBounds(84, 71, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "KPHB", "KUKATPALLY", "AMEEERPET", "SECUNDERABAD EAST", "UPPAL", "MGBS", "JNTU"}));
		comboBox.setBounds(85, 100, 85, 22);
		frame.getContentPane().add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "KPHB", "KUKATPALLY", "AMEEERPET", "SECUNDERABAD EAST", "UPPAL", "MGBS", "JNTU"}));
		comboBox_1.setBounds(85, 125, 86, 22);
		frame.getContentPane().add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "1", "2", "3", "4", "5"}));
		comboBox_2.setBounds(85, 162, 86, 22);
		frame.getContentPane().add(comboBox_2);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String NAME = NAMEField.getText();
				String ENTRY = (String) entryField.getSelectedItem();
				String EXIT = (String) exitField.getSelectedItem();
				String TICKET = (String) ticketField.getSelectedItem();
				
			}
		});
		btnNewButton.setBounds(60, 203, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\online\\Desktop\\360_F_631526147_uIiqKqWbZEgwLLd0vbLwcim1cKlQyokNmmm.jpg"));
		lblNewLabel_4.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(lblNewLabel_4);
	}
}
