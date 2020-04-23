package stok;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Panel;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Report extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTable table_1;
	private JTextField txtTotal;
	private JTextField txtTotal_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Report frame = new Report();
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
	public Report() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1201, 710);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		Panel panel = new Panel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		Button Stock_btn = new Button("TODAY");
		Stock_btn.setFont(new Font("Dialog", Font.BOLD, 20));
		Stock_btn.setBackground(new Color(255, 255, 255));
		Stock_btn.setActionCommand("New button");
		Stock_btn.setBounds(136, 33, 146, 69);
		panel.add(Stock_btn);
		
		Button Seal_btn = new Button("THIS MONTH");
		Seal_btn.setFont(new Font("Dialog", Font.BOLD, 20));
		Seal_btn.setBackground(new Color(255, 255, 255));
		Seal_btn.setActionCommand("New Button");
		Seal_btn.setBounds(73, 329, 254, 69);
		panel.add(Seal_btn);
		
		table = new JTable();
		table.setBounds(416, 12, 596, 187);
		panel.add(table);
		
		table_1 = new JTable();
		table_1.setBounds(429, 260, 583, 241);
		panel.add(table_1);
		
		txtTotal = new JTextField();
		txtTotal.setText("TOTAL SALE AMOUNT");
		txtTotal.setBounds(569, 208, 232, 38);
		panel.add(txtTotal);
		txtTotal.setColumns(10);
		
		txtTotal_1 = new JTextField();
		txtTotal_1.setText("TOTAL SALE AMOUNT");
		txtTotal_1.setBounds(540, 530, 243, 38);
		panel.add(txtTotal_1);
		txtTotal_1.setColumns(10);
		
		JButton btnSave = new JButton("SAVE ");
		btnSave.setBounds(146, 108, 117, 25);
		panel.add(btnSave);
		
		JButton btnSave_1 = new JButton("SAVE");
		btnSave_1.setBounds(146, 444, 117, 25);
		panel.add(btnSave_1);
	}
}
