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
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Purchase extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField txtAutoFill;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Purchase frame = new Purchase();
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
	public Purchase() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1057, 680);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		Panel panel = new Panel();
		panel.setFont(new Font("Dialog", Font.PLAIN, 17));
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		Button Seal_btn = new Button("ADD ITEM");
		Seal_btn.setFont(new Font("Dialog", Font.BOLD, 20));
		Seal_btn.setBackground(new Color(255, 255, 255));
		Seal_btn.setActionCommand("New Button");
		Seal_btn.setBounds(831, 382, 168, 69);
		panel.add(Seal_btn);
		
		Label label = new Label("PURCHASE");
		label.setFont(new Font("Dialog", Font.BOLD, 22));
		label.setBounds(238, 22, 184, 43);
		panel.add(label);
		
		Button button = new Button("LOG OUT");
		button.setFont(new Font("Dialog", Font.BOLD, 15));
		button.setBounds(871, 558, 106, 23);
		panel.add(button);
		
		JLabel lblNewLabel = new JLabel("DATE");
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 20));
		lblNewLabel.setBounds(12, 121, 100, 43);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(308, 93, 168, 47);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("BILL NO");
		lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD, 20));
		lblNewLabel_1.setBounds(12, 190, 127, 47);
		panel.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(308, 166, 168, 43);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblName = new JLabel("NO OF BOTTLE");
		lblName.setFont(new Font("Dialog", Font.BOLD, 20));
		lblName.setBounds(12, 351, 168, 33);
		panel.add(lblName);
		
		JList list = new JList();
		list.setBounds(255, 240, 256, 69);
		panel.add(list);
		
		JLabel lblName_1 = new JLabel("NAME");
		lblName_1.setFont(new Font("Dialog", Font.BOLD, 20));
		lblName_1.setBounds(12, 263, 88, 33);
		panel.add(lblName_1);
		
		textField_3 = new JTextField();
		textField_3.setBounds(323, 337, 135, 47);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblAmount = new JLabel("AMOUNT OF A BOTTLE");
		lblAmount.setFont(new Font("Dialog", Font.BOLD, 20));
		lblAmount.setBounds(12, 408, 293, 43);
		panel.add(lblAmount);
		
		textField_4 = new JTextField();
		textField_4.setBounds(323, 408, 153, 33);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblTotalAmount = new JLabel("TOTAL AMOUNT");
		lblTotalAmount.setFont(new Font("Dialog", Font.BOLD, 20));
		lblTotalAmount.setBounds(33, 478, 224, 43);
		panel.add(lblTotalAmount);
		
		txtAutoFill = new JTextField();
		txtAutoFill.setText("AUTO FILL");
		txtAutoFill.setBounds(323, 478, 153, 43);
		panel.add(txtAutoFill);
		txtAutoFill.setColumns(10);
		
		JButton btnSetPrice = new JButton("SET PRICE ");
		btnSetPrice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Set_Price SP = new Set_Price();
				SP.setVisible(true);
			}
		});
		btnSetPrice.setBounds(809, 82, 117, 47);
		panel.add(btnSetPrice);
		
		
		
	}
}
