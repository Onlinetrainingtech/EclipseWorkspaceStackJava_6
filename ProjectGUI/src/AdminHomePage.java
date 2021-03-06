import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdminHomePage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminHomePage frame = new AdminHomePage();
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
	public AdminHomePage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAdminhomepage = new JLabel("AdminHomePage");
		lblAdminhomepage.setBounds(161, 28, 89, 14);
		contentPane.add(lblAdminhomepage);
		
		JButton btnAddproduct = new JButton("AddProduct");
		btnAddproduct.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				new AddProductPage().setVisible(true);
			}
		});
		btnAddproduct.setBounds(161, 68, 117, 23);
		contentPane.add(btnAddproduct);
		
		JButton btnAddstaff = new JButton("AddStaff");
		btnAddstaff.setBounds(161, 125, 117, 23);
		contentPane.add(btnAddstaff);
		
		JButton btnAddcategory = new JButton("AddCategory");
		btnAddcategory.setBounds(161, 187, 117, 23);
		contentPane.add(btnAddcategory);
	}
}
