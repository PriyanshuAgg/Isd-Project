import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.GroupLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.EmptyBorder;

public class AppStatus extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						AppStatus frame = new AppStatus();
						frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}
	public AppStatus() {
		this.setTitle("Application Status");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		//OngoingApplications that = this;
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 37, 576, 215);
		contentPane.add(scrollPane);
		Object rowData[][] = { { 1, "<html><a href=\"\">xyz </a></html>", "2nd Nov 2018", "Approved" },
		        { 2, "<html><a href=\"\">bca </a></html>", "3rd Nov 2018", "Approved" },
		        {3, "<html><a href=\"\">abc </a></html>", "4th Nov 2018", "Not Approved"}};
		    Object columnNames[] = { "Id", "Purchase Title", "Date of Submission", "Status" };
		
		JTable table = new JTable(rowData,columnNames);
		scrollPane.setViewportView(table);
}
}
