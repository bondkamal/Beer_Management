package stok;

import java.awt.BorderLayout;


import java.awt.Button;
import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.Dimension;
import java.awt.Panel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.awt.Font;
import java.awt.Label;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Vendor<E> extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtname;
	private JTextField txtphone;
	private JTextField txtemail;
	private JTextField txtaddress;
	private JTable vendor_table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Vendor frame = new Vendor();
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
	public Vendor() {
		
		connect();
		/**load();**/
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1008, 642);
		contentPane = new JPanel();
		contentPane.setPreferredSize(new Dimension(100, 100));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		Panel panel = new Panel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		Button add_btn = new Button("ADD");
		add_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					
					String vname = txtname.getText();
					String phone = txtphone.getText();
					String email = txtemail.getText();
					String address = txtaddress.getText();
					String vid = txtid.getText();
					
					pst = con.prepareStatement("insert into Vendor(idVendor,Name,Phone,Email,Address) values(?,?,?,?,?)");
					
					pst.setString(1, vname);
					pst.setString(2, phone);
					pst.setString(3, email);
					pst.setString(4, address);
					pst.setString(5,vid );
					
					pst.executeUpdate();
					
					
					txtname.setText("");
					txtphone.setText("");
					txtemail.setText("");
					txtaddress.setText("");
					txtid.setText("");
					txtname.requestFocus();
					
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});
		add_btn.setBackground(Color.WHITE);
		add_btn.setActionCommand("New button");
		add_btn.setBounds(12, 476, 146, 69);
		panel.add(add_btn);
		
		Button cancel_btn = new Button("CANCEL");
		cancel_btn.setBackground(new Color(255, 255, 255));
		cancel_btn.setActionCommand("New Button");
		cancel_btn.setBounds(586, 464, 146, 69);
		panel.add(cancel_btn);
		
		Button edit_btn = new Button("EDIT");
		edit_btn.setBackground(new Color(255, 255, 255));
		edit_btn.setActionCommand("Purchase button");
		edit_btn.setBounds(189, 476, 146, 69);
		panel.add(edit_btn);
		
		Label label = new Label("VENDOR");
		label.setFont(new Font("Dialog", Font.BOLD, 22));
		label.setBounds(238, 22, 184, 43);
		panel.add(label);
		
		Label label_1 = new Label("DETAILS");
		label_1.setFont(new Font("Dialog", Font.BOLD, 22));
		label_1.setBounds(248, 71, 193, 33);
		panel.add(label_1);
		
		Button logout_btn = new Button("LOG OUT");
		logout_btn.setFont(new Font("Dialog", Font.BOLD, 15));
		logout_btn.setBounds(806, 522, 106, 23);
		panel.add(logout_btn);
		
		JLabel lblNewLabel = new JLabel("Vendor Name");
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 20));
		lblNewLabel.setBounds(12, 149, 183, 15);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Phone");
		lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD, 20));
		lblNewLabel_1.setBounds(12, 186, 161, 33);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Email");
		lblNewLabel_2.setFont(new Font("Dialog", Font.BOLD, 20));
		lblNewLabel_2.setBounds(12, 255, 70, 33);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Address");
		lblNewLabel_3.setFont(new Font("Dialog", Font.BOLD, 20));
		lblNewLabel_3.setBounds(12, 311, 259, 37);
		panel.add(lblNewLabel_3);
		
		txtname = new JTextField();
		txtname.setBounds(199, 142, 273, 33);
		panel.add(txtname);
		txtname.setColumns(10);
		
		txtphone = new JTextField();
		txtphone.setBounds(201, 187, 271, 35);
		panel.add(txtphone);
		txtphone.setColumns(10);
		
		txtemail = new JTextField();
		txtemail.setBounds(211, 248, 261, 40);
		panel.add(txtemail);
		txtemail.setColumns(10);
		
		txtaddress = new JTextField();
		txtaddress.setBounds(209, 301, 263, 33);
		panel.add(txtaddress);
		txtaddress.setColumns(10);
		
		Button delete_btn = new Button("DELETE");
		delete_btn.setBackground(Color.WHITE);
		delete_btn.setActionCommand("New Button");
		delete_btn.setBounds(372, 476, 146, 69);
		panel.add(delete_btn);
		
		vendor_table = new JTable();
		vendor_table.setAutoCreateRowSorter(true);
		vendor_table.setColumnSelectionAllowed(true);
		vendor_table.setCellSelectionEnabled(true);
		vendor_table.setBounds(525, 71, 436, 308);
		panel.add(vendor_table);
		
		JLabel lblVendorId = new JLabel("Vendor ID");
		lblVendorId.setFont(new Font("Dialog", Font.BOLD, 20));
		lblVendorId.setBounds(12, 360, 124, 33);
		panel.add(lblVendorId);
		
		txtid = new JTextField();
		txtid.setBounds(199, 362, 273, 33);
		panel.add(txtid);
		txtid.setColumns(10);
	
	}
	
	
	Connection con;
	PreparedStatement pst;
	DefaultTableModel df;
	
	private JTextField txtid;
	
	public void connect() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost/Beer_Shop", "root", "Sahil@123");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	public void load() {
		int a;
		try {
			pst = con.prepareStatement("select* from Vendor");
			ResultSet rs = pst.executeQuery();
			java.sql.ResultSetMetaData rd = rs.getMetaData();
			a = rd.getColumnCount();
			df = (DefaultTableModel)vendor_table.getModel();
			df.setRowCount(0);
			
			while(rs.next()) {
				Vector<String> v2 = new Vector<String>();
				for (int i=1; i<=a; i++) {
					v2.add(rs.getString("idVendor"));
					v2.add(rs.getString("Name"));
					v2.add(rs.getString("Phone"));
					v2.add(rs.getString("Email"));
					v2.add(rs.getString("Address"));
				}
				df.addRow(v2);
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
	
	
	
	
}
