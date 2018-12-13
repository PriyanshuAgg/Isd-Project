import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TenderCategory extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TenderCategory frame = new TenderCategory();
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
	public TenderCategory() {
		this.setTitle("Tender Categories");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		TenderCategory that =this;
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(271, 69, 200, 24);
		comboBox.addItem("Electrical");
		comboBox.addItem("Logistics");
		comboBox.addItem("I.T.");
		comboBox.addItem("Infrastructure");
		comboBox.addItem("Others");
		contentPane.add(comboBox);
		
		
		
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				that.dispose();
			}
		});
		btnBack.setBounds(234, 341, 117, 25);
		contentPane.add(btnBack);
		
		JLabel lblSelectCategory = new JLabel("Select Category");
		lblSelectCategory.setBounds(29, 74, 131, 15);
		contentPane.add(lblSelectCategory);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(29, 194, 533, 121);
		contentPane.add(scrollPane);
		DefaultTableModel model = new DefaultTableModel(); 
		JTable table = new JTable(model); 
		model.addColumn("Tender Name"); 
		model.addColumn("Last Date");
		model.addColumn("Description"); 
		JButton btnViewtenders = new JButton("ViewTenders");
		btnViewtenders.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String value = comboBox.getSelectedItem().toString();
				if(value == "Electrical")
				{
					model.setRowCount(0);
					model.addRow(new Object[]{"<html><a href=\"\">test1</a></html>","20-1-2019","PCB's"});
				}
				else if(value == "Logistics")
				{
					model.setRowCount(0);
					model.addRow(new Object[]{"<html><a href=\"\">test2</a></html>","20-1-2019","item"});
				}
				else if(value == "I.T.")
				{
					model.setRowCount(0);
					model.addRow(new Object[]{"<html><a href=\"\">test3</a></html>","20-1-2019","Keyboard"});
				}
				else if(value == "Infrastructure")
				{
					model.setRowCount(0);
					model.addRow(new Object[]{"<html><a href=\"\">test4</a></html>","20-1-2019","hostel"});
				}
				else if(value == "Others")
				{
					model.setRowCount(0);
					model.addRow(new Object[]{"<html><a href=\"\">test5</a></html>","20-1-2019","xyz"});
				}
			}
		});
		table.addMouseListener(new java.awt.event.MouseAdapter()
        {
			public void mouseClicked(java.awt.event.MouseEvent e)
			{
			int row=table.rowAtPoint(e.getPoint());
				System.out.println("The Row selected is : "+row);
				int col= table.columnAtPoint(e.getPoint());
				if(col==0) {
					TenderNoticee viewapp = new TenderNoticee();
					viewapp.setVisible(true);
				}
			}
		});
		table.setEnabled(false);
		btnViewtenders.setBounds(29, 143, 170, 25);
		contentPane.add(btnViewtenders);
		//model.addColumn("Estimated Cost");
		scrollPane.setViewportView(table);
		//scrollPane.setViewportView(table);
	}
}
