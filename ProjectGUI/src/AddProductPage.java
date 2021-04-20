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
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class AddProductPage extends JFrame {

	private JPanel contentPane;
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
					AddProductPage frame = new AddProductPage();
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
	public AddProductPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 358);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAddproduct = new JLabel("AddProduct");
		lblAddproduct.setBounds(172, 24, 78, 14);
		contentPane.add(lblAddproduct);
		
		JLabel lblPid = new JLabel("ProductId");
		lblPid.setBounds(25, 61, 78, 14);
		contentPane.add(lblPid);
		
		textField = new JTextField();
		textField.setBounds(158, 58, 139, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblProductname = new JLabel("ProductName");
		lblProductname.setBounds(25, 118, 78, 14);
		contentPane.add(lblProductname);
		
		textField_1 = new JTextField();
		textField_1.setBounds(158, 115, 139, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblProductprice = new JLabel("ProductPrice");
		lblProductprice.setBounds(25, 174, 78, 14);
		contentPane.add(lblProductprice);
		
		textField_2 = new JTextField();
		textField_2.setBounds(158, 171, 139, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnAddproduct = new JButton("AddProduct");
		btnAddproduct.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				try
				{
					String pid=textField.getText();
					String pname=textField_1.getText();
					String price=textField_2.getText();
					
					String str1="insert into product values('"+pid+"','"+pname+"','"+price+"')";
					
					Class.forName("org.h2.Driver");
					Connection conn=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/fullstackbatch6","sa","");
					Statement stmt=conn.createStatement();
					
					stmt.executeUpdate(str1);
					
					JOptionPane.showMessageDialog(btnAddproduct,"Insereted..");
					
				}
				catch(Exception t)
				{
					System.out.println(t);
				}
			}
		});
		btnAddproduct.setBounds(24, 238, 89, 23);
		contentPane.add(btnAddproduct);
		
		JButton btnViewproduct = new JButton("ViewProduct");
		btnViewproduct.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				try
				{
					String pid=textField.getText();
					
					String str2="select * from product where pid='"+pid+"'";
					
					Class.forName("org.h2.Driver");
					Connection conn=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/fullstackbatch6","sa","");
					Statement stmt=conn.createStatement();
					ResultSet rs=stmt.executeQuery(str2);
					rs.next();
					String pname=rs.getString(2);
					String price=rs.getString(3);
					
					textField_1.setText(pname);
					textField_2.setText(price);
					
					JOptionPane.showMessageDialog(btnViewproduct, "Searching..");
					
					
					
				}
				catch(Exception t)
				{
					System.out.println(t);
				}
			}
		});
		btnViewproduct.setBounds(161, 238, 89, 23);
		contentPane.add(btnViewproduct);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				try
				{
					String pid=textField.getText();
					String pname=textField_1.getText();
					String price=textField_2.getText();
					
					String str3="update product set pname='"+pname+"',price='"+price+"' where pid='"+pid+"'";
					Class.forName("org.h2.Driver");
					Connection conn=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/fullstackbatch6","sa","");
					Statement stmt=conn.createStatement();
					
					stmt.executeUpdate(str3);
					
					JOptionPane.showMessageDialog(btnUpdate, "Updated..");
				}
				catch(Exception r)
				{
					System.out.println(r);
				}
			}
		});
		btnUpdate.setBounds(297, 238, 89, 23);
		contentPane.add(btnUpdate);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				try
				{
					String pid=textField.getText();
					
					String str4="delete from product where pid='"+pid+"'";
					
					Class.forName("org.h2.Driver");
					Connection conn=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/fullstackbatch6","sa","");
					Statement stmt=conn.createStatement();
					
					stmt.executeUpdate(str4);
					
					JOptionPane.showMessageDialog(btnDelete, "Deleted..");
				}
				catch(Exception t)
				{
					System.out.println(t);
				}
			}
		});
		btnDelete.setBounds(335, 170, 89, 23);
		contentPane.add(btnDelete);
	}
}
