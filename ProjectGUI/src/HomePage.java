import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class HomePage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomePage frame = new HomePage();
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
	public HomePage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 334);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHrSystem = new JLabel("HR SYSTEM");
		lblHrSystem.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblHrSystem.setBounds(163, 22, 186, 14);
		contentPane.add(lblHrSystem);
		
		JButton btnAdminlogin = new JButton("AdminLogin");
		btnAdminlogin.setBounds(113, 68, 186, 23);
		contentPane.add(btnAdminlogin);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.setBounds(113, 133, 186, 23);
		contentPane.add(btnRegister);
		
		JButton btnUserlogin = new JButton("UserLogin");
		btnUserlogin.setBounds(113, 206, 186, 23);
		contentPane.add(btnUserlogin);
	}
}
