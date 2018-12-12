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
		
		JButton btnViewtenders = new JButton("ViewTenders");
		btnViewtenders.setBounds(29, 143, 170, 25);
		contentPane.add(btnViewtenders);
		
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
		//model.addColumn("Estimated Cost");
		scrollPane.setViewportView(table);
		//scrollPane.setViewportView(table);
	}
}
