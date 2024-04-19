package sathvika;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class database {

	private JFrame frame;
	private JTextField tb1;
	private JTextField tb2;
	private JTextField tb3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					database window = new database();
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
	public database() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 192, 203));
		frame.setBounds(100, 100, 508, 372);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("STUDENT REGISTRATION FORM\r\n");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 21));
		lblNewLabel.setBounds(78, 34, 337, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("NAME");
		lblNewLabel_1.setFont(new Font("Verdana", Font.BOLD, 13));
		lblNewLabel_1.setBounds(78, 110, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("ROLL NO");
		lblNewLabel_2.setFont(new Font("Verdana", Font.BOLD, 13));
		lblNewLabel_2.setBounds(78, 156, 76, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("BRANCH");
		lblNewLabel_3.setFont(new Font("Verdana", Font.BOLD, 13));
		lblNewLabel_3.setBounds(78, 207, 76, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("MARKS");
		lblNewLabel_4.setFont(new Font("Verdana", Font.BOLD, 13));
		lblNewLabel_4.setBounds(78, 257, 76, 17);
		frame.getContentPane().add(lblNewLabel_4);
		
		tb1 = new JTextField();
		tb1.setBounds(162, 109, 86, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		tb2 = new JTextField();
		tb2.setBounds(164, 155, 86, 20);
		frame.getContentPane().add(tb2);
		tb2.setColumns(10);
		
		JComboBox cb1 = new JComboBox();
		cb1.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "CSE", "IT", "CS", "DS", "IOT", "AIML", "ECE", "EEE", "MECH", "MINING", "CIVIL"}));
		cb1.setBounds(164, 205, 86, 22);
		frame.getContentPane().add(cb1);
		
		tb3 = new JTextField();
		tb3.setBounds(164, 257, 86, 20);
		frame.getContentPane().add(tb3);
		tb3.setColumns(10);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String rollno=tb2.getText();
				String name=tb1.getText();
				String branch=(String) cb1.getSelectedItem();
				String marks=tb3.getText();
				int m=Integer.parseInt(marks);
				try
				{
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","mysql");
				String q="insert into student values('"+name+"','"+rollno+"','"+branch+"','"+marks+"')";
				Statement stn=con.createStatement();
				stn.executeUpdate(q);
				con.close();
				JOptionPane.showMessageDialog(btnNewButton,"Sucessfully inserted");
			}
			catch(SQLException e1)
			{
				e1.printStackTrace();
			}
			} 
		});
		btnNewButton.setBackground(new Color(255, 182, 193));
		btnNewButton.setFont(new Font("Serif", Font.BOLD, 15));
		btnNewButton.setBounds(184, 299, 102, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\online\\Pictures\\Screenshots\\Screenshot 2024-03-14 161007.png"));
		lblNewLabel_5.setBounds(296, 59, 186, 263);
		frame.getContentPane().add(lblNewLabel_5);
	}
}
