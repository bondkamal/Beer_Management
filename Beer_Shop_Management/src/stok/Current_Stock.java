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
import javax.swing.JTable;

public class Current_Stock extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Current_Stock frame = new Current_Stock();
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
	public Current_Stock() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1185, 701);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		
		Panel panel = new Panel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		Button Seal_btn = new Button("SEARCH ITEM");
		Seal_btn.setFont(new Font("Dialog", Font.BOLD, 20));
		Seal_btn.setBackground(new Color(255, 255, 255));
		Seal_btn.setActionCommand("New Button");
		Seal_btn.setBounds(841, 500, 200, 69);
		panel.add(Seal_btn);
		
		Label label = new Label("CURRENT AVAILABLE STOCK");
		label.setFont(new Font("Dialog", Font.BOLD, 22));
		label.setBounds(238, 10, 481, 55);
		panel.add(label);
		
		Button button = new Button("LOG OUT");
		button.setFont(new Font("Dialog", Font.BOLD, 15));
		button.setBounds(268, 524, 106, 23);
		panel.add(button);
		
		table = new JTable();
		table.setBounds(84, 82, 957, 301);
		panel.add(table);
		
		textField = new JTextField();
		textField.setBounds(825, 426, 216, 32);
		panel.add(textField);
		textField.setColumns(10);
	}
}
