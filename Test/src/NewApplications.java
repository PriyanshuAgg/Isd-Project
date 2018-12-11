import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class NewApplications extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewApplications frame = new NewApplications();
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
	public NewApplications() {
		this.setTitle("New Applications");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 12, 426, 199);
		contentPane.add(scrollPane);
		Object rowData[][] = { { 1, "<html><a href=\"\">xyz </a></html>", "2nd Nov 2018", "Completed" },
		        { 2, "<html><a href=\"\">abs </a></html>", "3rd Nov 2018", "Completed" },
		        {3, "<html><a href=\"\">bca </a></html>", "4th Nov 2018", "Rejected"},{ 1, "<html><a href=\"\">xyz </a></html>", "2nd Nov 2018", "Completed" },{ 1, "<html><a href=\"\">xyz </a></html>", "2nd Nov 2018", "Completed" },{ 1, "<html><a href=\"\">xyz </a></html>", "2nd Nov 2018", "Completed" },{ 1, "<html><a href=\"\">xyz </a></html>", "2nd Nov 2018", "Completed" },{ 1, "<html><a href=\"\">xyz </a></html>", "2nd Nov 2018", "Completed" }};
		    Object columnNames[] = { "Id", "Purchase Title", "Intender"};
		JTable table = new JTable(rowData,columnNames);
//		table.addMouseListener(new java.awt.event.MouseAdapter()

		scrollPane.setViewportView(table);
	}

}
