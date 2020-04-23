package stok;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Label;
import java.awt.Panel;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Set_Price extends JFrame {

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
					Set_Price frame = new Set_Price();
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
	public Set_Price() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1043, 679);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		Panel panel = new Panel();
		panel.setFont(new Font("Dialog", Font.PLAIN, 17));
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		Button set_btn = new Button("SET PRICE");
		set_btn.setFont(new Font("Dialog", Font.BOLD, 20));
		set_btn.setBackground(new Color(255, 255, 255));
		set_btn.setActionCommand("New Button");
		set_btn.setBounds(831, 382, 168, 69);
		panel.add(set_btn);
		
		Label label = new Label("PRICE SETUP");
		label.setFont(new Font("Dialog", Font.BOLD, 22));
		label.setBounds(238, 22, 184, 43);
		panel.add(label);
		
		Button button = new Button("LOG OUT");
		button.setFont(new Font("Dialog", Font.BOLD, 15));
		button.setBounds(871, 558, 106, 23);
		panel.add(button);
		
		JLabel lblBeerName = new JLabel("BEER NAME");
		lblBeerName.setFont(new Font("Dialog", Font.BOLD, 20));
		lblBeerName.setBounds(38, 122, 141, 50);
		panel.add(lblBeerName);
		
		textField = new JTextField();
		textField.setBounds(262, 122, 114, 19);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblPrice = new JLabel("PRICE");
		lblPrice.setFont(new Font("Dialog", Font.BOLD, 20));
		lblPrice.setBounds(38, 216, 118, 50);
		panel.add(lblPrice);
		
		textField_1 = new JTextField();
		textField_1.setBounds(262, 234, 114, 19);
		panel.add(textField_1);
		textField_1.setColumns(10);
	}
}
