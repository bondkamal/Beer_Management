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
import javax.swing.JPasswordField;

public class Log_in_page extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Log_in_page frame = new Log_in_page();
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
	public Log_in_page() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1173, 713);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		Panel panel = new Panel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		Button Seal_btn = new Button("LOGIN");
		Seal_btn.setFont(new Font("Dialog", Font.BOLD, 20));
		Seal_btn.setBackground(new Color(255, 255, 255));
		Seal_btn.setActionCommand("New Button");
		Seal_btn.setBounds(841, 500, 200, 69);
		panel.add(Seal_btn);
		
		Label label = new Label("WELCOME");
		label.setFont(new Font("Dialog", Font.BOLD, 32));
		label.setBounds(400, 10, 256, 55);
		panel.add(label);
		
		JLabel lblEnterYourName = new JLabel("ENTER YOUR NAME");
		lblEnterYourName.setFont(new Font("Dialog", Font.BOLD, 20));
		lblEnterYourName.setBounds(71, 149, 245, 49);
		panel.add(lblEnterYourName);
		
		JLabel lblEnterYourPassword = new JLabel("ENTER YOUR PASSWORD");
		lblEnterYourPassword.setFont(new Font("Dialog", Font.BOLD, 20));
		lblEnterYourPassword.setBounds(50, 302, 289, 42);
		panel.add(lblEnterYourPassword);
		
		textField = new JTextField();
		textField.setBounds(392, 155, 325, 32);
		panel.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(400, 312, 325, 28);
		panel.add(passwordField);
	}
}
