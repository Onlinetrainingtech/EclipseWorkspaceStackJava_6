import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class RegisterUserPage extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegisterUserPage frame = new RegisterUserPage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public RegisterUserPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 368);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblRegisterpage = new JLabel("RegisterPage");
		lblRegisterpage.setBounds(165, 11, 79, 14);
		contentPane.add(lblRegisterpage);
		
		JLabel lblUsername = new JLabel("UserName");
		lblUsername.setBounds(52, 64, 65, 14);
		contentPane.add(lblUsername);
		
		textField = new JTextField();
		textField.setBounds(165, 61, 124, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(52, 123, 46, 14);
		contentPane.add(lblPassword);
		
		textField_1 = new JTextField();
		textField_1.setBounds(165, 120, 124, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblEmailid = new JLabel("EmailId");
		lblEmailid.setBounds(52, 183, 46, 14);
		contentPane.add(lblEmailid);
		
		textField_2 = new JTextField();
		textField_2.setBounds(165, 180, 124, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setBounds(52, 235, 46, 14);
		contentPane.add(lblGender);
		
		textField_3 = new JTextField();
		textField_3.setBounds(165, 232, 124, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				try
				{
					String u1=textField.getText();
					String p1=textField_1.getText();
					String e1=textField_2.getText();
					String g1=textField_3.getText();
					
					String str1="insert into userreg values('"+u1+"','"+p1+"','"+e1+"','"+g1+"')";
					
					Class.forName("org.h2.Driver");
					Connection conn=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/fullstackbatch6","sa","");
					Statement stmt=conn.createStatement();
					
					stmt.executeUpdate(str1);
					
					JOptionPane.showMessageDialog(btnRegister,"Insereted..");
				}
				catch(Exception t)
				{
					System.out.println(t);
				}
			}
		});
		btnRegister.setBounds(82, 284, 89, 23);
		contentPane.add(btnRegister);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
			}
		});
		btnReset.setBounds(224, 284, 89, 23);
		contentPane.add(btnReset);
	}

}
