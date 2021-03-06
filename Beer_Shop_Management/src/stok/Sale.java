package stok;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Label;
import java.awt.Panel;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.JButton;

public class Sale extends JFrame {

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
					Sale frame = new Sale();
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
	public Sale() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 890, 649);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		Panel panel = new Panel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		Button Seal_btn = new Button("PRINT BILL");
		Seal_btn.setFont(new Font("Dialog", Font.BOLD, 20));
		Seal_btn.setBackground(new Color(255, 255, 255));
		Seal_btn.setActionCommand("New Button");
		Seal_btn.setBounds(665, 392, 168, 69);
		panel.add(Seal_btn);
		
		Label label = new Label("SALE");
		label.setFont(new Font("Dialog", Font.BOLD, 22));
		label.setBounds(238, 22, 184, 43);
		panel.add(label);
		
		Button button = new Button("LOG OUT");
		button.setFont(new Font("Dialog", Font.BOLD, 15));
		button.setBounds(463, 529, 106, 23);
		panel.add(button);
		
		JLabel lblNewLabel = new JLabel("BEER NAME");
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 20));
		lblNewLabel.setBounds(12, 121, 183, 43);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("PRICE");
		lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD, 20));
		lblNewLabel_1.setBounds(27, 246, 161, 33);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("QUANTITY  BOTTLE");
		lblNewLabel_2.setFont(new Font("Dialog", Font.BOLD, 20));
		lblNewLabel_2.setBounds(12, 165, 296, 69);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("TOTAL PRICE");
		lblNewLabel_3.setFont(new Font("Dialog", Font.BOLD, 20));
		lblNewLabel_3.setBounds(12, 305, 259, 43);
		panel.add(lblNewLabel_3);
		
		
		
		JList list = new JList();
		list.setBounds(244, 107, 467, 57);
		panel.add(list);
		
		textField = new JTextField();
		textField.setBounds(336, 184, 302, 35);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(346, 249, 292, 31);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(336, 305, 302, 33);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnSaleWithoutBill = new JButton("SALE WITHOUT BILL");
		btnSaleWithoutBill.setFont(new Font("Dialog", Font.BOLD, 20));
		btnSaleWithoutBill.setBounds(163, 404, 259, 57);
		panel.add(btnSaleWithoutBill);
		
	}
}
