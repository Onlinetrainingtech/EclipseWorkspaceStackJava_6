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
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class UserLogin extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserLogin frame = new UserLogin();
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
	public UserLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUserlogin = new JLabel("UserLogin");
		lblUserlogin.setBounds(159, 11, 76, 14);
		contentPane.add(lblUserlogin);
		
		JLabel lblUsername = new JLabel("UserName");
		lblUsername.setBounds(43, 78, 59, 14);
		contentPane.add(lblUsername);
		
		textField = new JTextField();
		textField.setBounds(131, 75, 125, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(43, 147, 46, 14);
		contentPane.add(lblPassword);
		
		textField_1 = new JTextField();
		textField_1.setBounds(131, 144, 125, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				try
				{
					String uname=textField.getText();
					String pass=textField_1.getText();
					String str1="select * from userreg where uname='"+uname+"' and pass='"+pass+"'";
					Class.forName("org.h2.Driver");
					Connection conn=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/fullstackbatch6","sa","");
					Statement stmt=conn.createStatement();
					ResultSet rs=stmt.executeQuery(str1);
					rs.next();
					String u1=rs.getString(1);
					String p1=rs.getString(2);
					//System.out.println(""+u1+""+p1);
					//System.out.println(""+uname+""+pass);
					if(uname.equals(u1)&&pass.equals(p1))
					{
						
						JOptionPane.showMessageDialog(btnLogin,"LoginSucess!!!");
						new UserHomePage().setVisible(true);
					}
					
				}
				catch(Exception t)
				{
					JOptionPane.showMessageDialog(btnLogin, "LoginFail");
				}
			}
		});
		btnLogin.setBounds(72, 214, 89, 23);
		contentPane.add(btnLogin);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setBounds(233, 214, 89, 23);
		contentPane.add(btnReset);
	}

}
