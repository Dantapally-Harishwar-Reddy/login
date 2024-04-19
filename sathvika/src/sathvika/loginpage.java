package sathvika;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class loginpage {

	private JFrame frame;
	private JTextField tb1;
	private JPasswordField p1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					loginpage window = new loginpage();
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
	public loginpage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 240, 245));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("LOGIN PAGE");
		lblNewLabel.setForeground(new Color(255, 255, 224));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel.setBounds(175, 29, 91, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("USER NAME");
		lblNewLabel_1.setForeground(new Color(255, 255, 224));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_1.setBounds(106, 90, 91, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("PASSWORD");
		lblNewLabel_2.setForeground(new Color(250, 235, 215));
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_2.setBounds(106, 149, 86, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		tb1 = new JTextField();
		tb1.setBounds(221, 87, 86, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		p1 = new JPasswordField();
		p1.setBounds(221, 146, 86, 20);
		frame.getContentPane().add(p1);
		
		JButton btnNewButton_1 = new JButton("SUBMIT");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String username=tb1.getText();
				String password=p1.getText();
				try
				{
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","mysql");
				PreparedStatement ps=con.prepareStatement("select username,password from userlogin where username=? and password=?");
			    ps.setString(1, username);
				ps.setString(2, password);
				ResultSet rs=ps.executeQuery();
				if(rs.next())
				{
					JOptionPane.showMessageDialog(btnNewButton_1,"valid user");
				}
				else
				{
					JOptionPane.showMessageDialog(btnNewButton_1,"Invalid user");

				}
			}
			catch(SQLException e1)
			{
				e1.printStackTrace();
			}
			}
		});
		btnNewButton_1.setBounds(175, 201, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\online\\Downloads\\anime-one-piece-portgas-d-ace-wallpaper-preview.jpg"));
		lblNewLabel_3.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(lblNewLabel_3);
	}
}
