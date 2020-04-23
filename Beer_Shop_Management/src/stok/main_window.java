package stok;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Panel;
import java.awt.Button;
import java.awt.Label;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class main_window<E> extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main_window frame = new main_window();
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
	public main_window() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 752, 643);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		Panel panel = new Panel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		Button Stock_btn = new Button("STOCK");
		Stock_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Current_Stock CS = new Current_Stock();
				CS.setVisible(true);
			}
		});
		Stock_btn.setFont(new Font("Dialog", Font.BOLD, 20));
		Stock_btn.setBackground(new Color(255, 255, 255));
		Stock_btn.setActionCommand("New button");
		Stock_btn.setBounds(243, 176, 146, 69);
		panel.add(Stock_btn);
		
		Button Seal_btn = new Button("SALE");
		Seal_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Sale S = new Sale();
				S.setVisible(true);
			}
		});
		Seal_btn.setFont(new Font("Dialog", Font.BOLD, 20));
		Seal_btn.setBackground(new Color(255, 255, 255));
		Seal_btn.setActionCommand("New Button");
		Seal_btn.setBounds(243, 291, 146, 69);
		panel.add(Seal_btn);
		
		Button Purchase_btn = new Button("PURCHASE");
		Purchase_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Purchase P = new Purchase();
				P.setVisible(true);
				
			}
		});
		Purchase_btn.setFont(new Font("Dialog", Font.BOLD, 20));
		Purchase_btn.setBackground(new Color(255, 255, 255));
		Purchase_btn.setActionCommand("Purchase button");
		Purchase_btn.setBounds(243, 406, 146, 69);
		panel.add(Purchase_btn);
		
		Label label = new Label("Beer Shop Managment\n");
		label.setFont(new Font("Dialog", Font.BOLD, 22));
		label.setBounds(163, 30, 312, 43);
		panel.add(label);
		
		Label label_1 = new Label("Main Window");
		label_1.setFont(new Font("Dialog", Font.BOLD, 22));
		label_1.setBounds(229, 97, 193, 33);
		panel.add(label_1);
		
		Button button = new Button("LOG OUT");
		button.setFont(new Font("Dialog", Font.BOLD, 15));
		button.setBounds(579, 84, 106, 23);
		panel.add(button);
		
		JButton btnVendor = new JButton("VENDOR");
		btnVendor.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				
				Vendor v = new Vendor();
				v.setVisible(true);
				
			}
		});
		btnVendor.setBounds(509, 185, 146, 60);
		panel.add(btnVendor);
		
		JButton btnReports = new JButton("REPORTS");
		btnReports.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Report R = new Report();
				R.setVisible(true);
				
			}
		});
		btnReports.setBounds(509, 310, 146, 50);
		panel.add(btnReports);
	}
	
	
	
	
	
}
