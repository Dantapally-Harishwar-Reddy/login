package sample;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Color;

public class BOOK {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BOOK window = new BOOK();
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
	public BOOK() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 769, 426);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("BOOK STORE APPLICATION");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(195, 11, 252, 39);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
			}
		});
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\online\\Pictures\\Screenshots\\Screenshot 2024-02-21 122110.png"));
		btnNewButton_1.setBounds(68, 124, 95, 169);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\online\\Pictures\\Screenshots\\Screenshot 2024-02-21 122527.png"));
		btnNewButton_2.setBounds(514, 113, 95, 169);
		frame.getContentPane().add(btnNewButton_2);
		
		JLabel lblNewLabel_1 = new JLabel("ITEMS");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(504, 40, 46, 19);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("TOTAL");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2.setBounds(504, 83, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(560, 40, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(560, 81, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("RS 500/-");
		lblNewLabel_3.setForeground(new Color(255, 0, 0));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setBounds(84, 327, 57, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("RS 700/-");
		lblNewLabel_4.setForeground(new Color(255, 0, 0));
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4.setBounds(332, 327, 57, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("RS 400/-");
		lblNewLabel_5.setForeground(new Color(255, 0, 0));
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_5.setBounds(537, 296, 59, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setVerticalAlignment(SwingConstants.TOP);
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\online\\Pictures\\Screenshots\\Screenshot 2024-02-21 120800.png"));
		btnNewButton.setBounds(279, 113, 151, 203);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\online\\Desktop\\122.jpg"));
		lblNewLabel_6.setBounds(10, 0, 743, 376);
		frame.getContentPane().add(lblNewLabel_6);
	}
}
