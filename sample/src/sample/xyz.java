package sample;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;

public class xyz {

	private JFrame frmMovieTicketBooking;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					xyz window = new xyz();
					window.frmMovieTicketBooking.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public xyz() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMovieTicketBooking = new JFrame();
		frmMovieTicketBooking.setTitle("MOVIE TICKET BOOKING\r\n");
		frmMovieTicketBooking.setBounds(100, 100, 450, 300);
		frmMovieTicketBooking.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMovieTicketBooking.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("NAME:");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setBounds(29, 31, 46, 14);
		frmMovieTicketBooking.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("MOVIE NAME:");
		lblNewLabel_2_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_2_1.setBounds(29, 70, 88, 14);
		frmMovieTicketBooking.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("NUM OF TICKETS:");
		lblNewLabel_2_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2_2.setBounds(29, 117, 88, 14);
		frmMovieTicketBooking.getContentPane().add(lblNewLabel_2_2);
		
		textField = new JTextField();
		textField.setBounds(102, 28, 86, 20);
		frmMovieTicketBooking.getContentPane().add(textField);
		textField.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "SANAM TERI KHASAM", "SHIDATH", "HEY JAWANI HUYI DIWANI", "CHICHORE", "MS DHONI UNTOLD STORY"}));
		comboBox.setBounds(101, 66, 87, 22);
		frmMovieTicketBooking.getContentPane().add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "1", "2", "3 ", "4 ", " 5"}));
		comboBox_1.setBounds(127, 113, 87, 22);
		frmMovieTicketBooking.getContentPane().add(comboBox_1);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.setBounds(69, 172, 89, 23);
		frmMovieTicketBooking.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("ASIAN CINE PLANET MAISAMAGUDA\r\n");
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(102, 11, 236, 14);
		frmMovieTicketBooking.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\online\\Desktop\\360_F_631526147_uIiqKqWbZEgwLLd0vbLwcim1cKlQyokNmmm.jpg"));
		lblNewLabel_1.setBounds(-15, -16, 468, 283);
		frmMovieTicketBooking.getContentPane().add(lblNewLabel_1);
	}
}
