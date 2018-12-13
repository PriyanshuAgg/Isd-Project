import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ViewAppPurchase extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewAppPurchase frame = new ViewAppPurchase();
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
	public ViewAppPurchase() {
		//ViewAppPurchase that =this;
		this.setTitle("View App Purchases ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPurchaseApplication = new JLabel("Purchase Application");
		lblPurchaseApplication.setBounds(233, 42, 149, 15);
		contentPane.add(lblPurchaseApplication);
		
		JLabel lblNewLabel = new JLabel("Purchase Title");
		lblNewLabel.setBounds(66, 93, 119, 15);
		contentPane.add(lblNewLabel);
		
		JLabel lblPurtitle = new JLabel("PurTitle");
		lblPurtitle.setBounds(320, 93, 119, 15);
		contentPane.add(lblPurtitle);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setBounds(66, 120, 119, 15);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(320, 120, 119, 15);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Description");
		lblNewLabel_3.setBounds(66, 147, 119, 15);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setBounds(320, 147, 119, 15);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Budget Remaining");
		lblNewLabel_5.setBounds(66, 174, 140, 15);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setBounds(320, 174, 119, 15);
		contentPane.add(lblNewLabel_6);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(43, 212, 530, 140);
		contentPane.add(scrollPane);
		DefaultTableModel model = new DefaultTableModel(); 
		JTable table = new JTable(model); 
		model.addColumn("Name"); 
		model.addColumn("Description");
		model.addColumn("Reason for Purchase"); 
		model.addColumn("Estimated Cost");
		model.addRow(new Object [] {"<html><a href=\\\"\\\">abc</a></html>","gojfshf","fsdb","1000"});
		scrollPane.setViewportView(table);
		table.addMouseListener(new java.awt.event.MouseAdapter()
		{																
			public void mouseClicked(java.awt.event.MouseEvent e)
			{
				int row=table.rowAtPoint(e.getPoint());
				System.out.println("The Row selected is : "+row);
				int col= table.columnAtPoint(e.getPoint());
				if (col==0) {
					//int intn_id  = (int)model.getValueAt(row, col);
					ViewProduct vap =  new ViewProduct();
					vap.setVisible(true);
				}
			}
		}
		);
		
		ViewAppPurchase that =this;
		JButton btnMakePurchase = new JButton("Make Purchase");
		btnMakePurchase.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MakePurchase mkpur = new MakePurchase(that);
				mkpur.setVisible(true);
			}
		});
		btnMakePurchase.setBounds(43, 374, 187, 25);
		contentPane.add(btnMakePurchase);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			that.dispose();
			}
		});
		table.setEnabled(false);
		btnBack.setBounds(426, 374, 117, 25);
		contentPane.add(btnBack);
	}
}
