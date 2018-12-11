import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import javax.swing.JButton;

public class ViewTender extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewTender frame = new ViewTender();
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
	public ViewTender() {
		this.setTitle("View all Tenders");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 41, 426, 136);
		getContentPane().add(scrollPane);
		Object rowData[][] = { { 1, "<html><a href=\"\">xyz </a></html>", "2nd Nov 2018", "2nd Dec 2018" }};
		        Object columnNames[] = { "Id", "Tender Title", "Date of Issue", "Last date for quotation submission" };
		JTable table = new JTable(rowData,columnNames);
		scrollPane.setViewportView(table);
		table.addMouseListener(new java.awt.event.MouseAdapter()

        {

	public void mouseClicked(java.awt.event.MouseEvent e)
	{
	int row=table.rowAtPoint(e.getPoint());
	
	int col= table.columnAtPoint(e.getPoint());
	if(col==1) {
	ViewTender viewtender = new ViewTender();
	viewtender.setVisible(true);}
	}});
		table.setEnabled(false);
		JButton back = new JButton("Back");
		back.setBounds(163, 218, 117, 25);
		getContentPane().add(back);
	}

}
