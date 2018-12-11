import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTable;
import java.awt.CardLayout;

public class PrevPurchases extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrevPurchases frame = new PrevPurchases();
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
	public PrevPurchases() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 450);
		getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 47, 576, 228);
		getContentPane().add(scrollPane);
		Object rowData[][] = { { 1, "<html><a href=\"\">xyz </a></html>", "2nd Nov 2018", "Completed" },
		        { 2, "<html><a href=\"\">abs </a></html>", "3rd Nov 2018", "Completed" },
		        {3, "<html><a href=\"\">bca </a></html>", "4th Nov 2018", "Rejected"},{ 1, "<html><a href=\"\">xyz </a></html>", "2nd Nov 2018", "Completed" },{ 1, "<html><a href=\"\">xyz </a></html>", "2nd Nov 2018", "Completed" },{ 1, "<html><a href=\"\">xyz </a></html>", "2nd Nov 2018", "Completed" },{ 1, "<html><a href=\"\">xyz </a></html>", "2nd Nov 2018", "Completed" },{ 1, "<html><a href=\"\">xyz </a></html>", "2nd Nov 2018", "Completed" }};
		    Object columnNames[] = { "Id", "Purchase Title", "Date of Purchase", "Status" };
		JTable table = new JTable(rowData,columnNames);
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
		scrollPane.setViewportView(table);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnBack.setBounds(261, 329, 117, 25);
		getContentPane().add(btnBack);
	}
}
