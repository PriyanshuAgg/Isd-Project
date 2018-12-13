import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Quotation extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Quotation frame = new Quotation();
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
	public Quotation() {
		this.setTitle("Quotation");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 450);
		getContentPane().setLayout(null);
		Quotation that =this;
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 41, 614, 203);
		getContentPane().add(scrollPane);
		String rowData[][] = { { "xyz", "xyz", "xyz", "1040", " ", " " },
		        { "abc", "yxz", "xyz", "2020", " ", " " },
		        {"abc", "abc", "xyz", "450", " ", " "},{ "xyz", "xyz", "xyz", "1040", " ", " " },{ "xyz", "xyz", "xyz", "1040", " ", " " },{ "xyz", "xyz", "xyz", "1040", " ", " " },{ "xyz", "xyz", "xyz", "1040", " ", " " },{ "xyz", "xyz", "xyz", "1040", " ", " " },{ "xyz", "xyz", "xyz", "1040", " ", " " },{ "xyz", "xyz", "xyz", "1040", " ", " " },{ "xyz", "xyz", "xyz", "1040", " ", " " }};
		    String columnNames[] = { "Product Name", "Required specs", "Prefered specs", "Estimated cost", "Vendor's "
		    		+ "Estimated cost", "Specs by vendor" };
		JTable table = new JTable(rowData,columnNames);
		scrollPane.setViewportView(table);
		table.addMouseListener(new java.awt.event.MouseAdapter()

        {

		public void mouseClicked(java.awt.event.MouseEvent e)
		{
			int row=table.rowAtPoint(e.getPoint());
			int col= table.columnAtPoint(e.getPoint());
			if(col==1) {
			//	ViewTender viewtender = new ViewTender();
			//	viewtender.setVisible(true);
			}
		}});
		table.setEnabled(false);
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				that.dispose();
			}
		});
		btnBack.setBounds(286, 335, 117, 25);
		getContentPane().add(btnBack);
		
	}

}
