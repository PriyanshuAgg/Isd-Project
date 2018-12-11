import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class test2 extends JFrame {
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					test2 frame = new test2();
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
	public test2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 41, 426, 136);
		getContentPane().add(scrollPane);
		Object rowData[][] = { { 1, "<html><a href=\"\">xyz </a></html>", "2nd Nov 2018", "2nd Dec 2018" },
		        { 2, "<html><a href=\"\">yxz</a></html>", "3rd Nov 2018", "3rd Dec 2018" },
		        {3, "<html><a href=\"\">abc</a></html>", "4th Nov 2018", "4th Dec 2018"},{ 1, "<html><a href=\"\">xyz </a></html>", "2nd Nov 2018", "2nd Dec 2018" },{ 1, "<html><a href=\"\">xyz </a></html>", "2nd Nov 2018", "2nd Dec 2018" },{ 1, "<html><a href=\"\">xyz </a></html>", "2nd Nov 2018", "2nd Dec 2018" },{ 1, "<html><a href=\"\">xyz </a></html>", "2nd Nov 2018", "2nd Dec 2018" },{ 1, "<html><a href=\"\">xyz </a></html>", "2nd Nov 2018", "2nd Dec 2018" },{ 1, "<html><a href=\"\">xyz </a></html>", "2nd Nov 2018", "2nd Dec 2018" },{ 1, "<html><a href=\"\">xyz </a></html>", "2nd Nov 2018", "2nd Dec 2018" },{ 1, "<html><a href=\"\">xyz </a></html>", "2nd Nov 2018", "2nd Dec 2018" },{ 1, "<html><a href=\"\">xyz </a></html>", "2nd Nov 2018", "2nd Dec 2018" },{ 1, "<html><a href=\"\">xyz </a></html>", "2nd Nov 2018", "2nd Dec 2018" },{ 1, "<html><a href=\"\">xyz </a></html>", "2nd Nov 2018", "2nd Dec 2018" },{ 1, "<html><a href=\"\">xyz </a></html>", "2nd Nov 2018", "2nd Dec 2018" },{ 1, "<html><a href=\"\">xyz </a></html>", "2nd Nov 2018", "2nd Dec 2018" },{ 1, "<html><a href=\"\">xyz </a></html>", "2nd Nov 2018", "2nd Dec 2018" },{ 1, "<html><a href=\"\">xyz </a></html>", "2nd Nov 2018", "2nd Dec 2018" },{ 1, "<html><a href=\"\">xyz </a></html>", "2nd Nov 2018", "2nd Dec 2018" },{ 1, "<html><a href=\"\">xyz </a></html>", "2nd Nov 2018", "2nd Dec 2018" },{ 1, "<html><a href=\"\">xyz </a></html>", "2nd Nov 2018", "2nd Dec 2018" },{ 1, "<html><a href=\"\">xyz </a></html>", "2nd Nov 2018", "2nd Dec 2018" },{ 1, "<html><a href=\"\">xyz </a></html>", "2nd Nov 2018", "2nd Dec 2018" },{ 1, "<html><a href=\"\">xyz </a></html>", "2nd Nov 2018", "2nd Dec 2018" },{ 1, "<html><a href=\"\">xyz </a></html>", "2nd Nov 2018", "2nd Dec 2018" },{ 1, "<html><a href=\"\">xyz </a></html>", "2nd Nov 2018", "2nd Dec 2018" },{ 1, "<html><a href=\"\">xyz </a></html>", "2nd Nov 2018", "2nd Dec 2018" },{ 1, "<html><a href=\"\">xyz </a></html>", "2nd Nov 2018", "2nd Dec 2018" },{ 1, "<html><a href=\"\">xyz </a></html>", "2nd Nov 2018", "2nd Dec 2018" }};
		    Object columnNames[] = { "Id", "Tender Title", "Date of Issue", "Last date for quotation submission" };
		table = new JTable(rowData,columnNames);
		scrollPane.setViewportView(table);
		table.setEnabled(false);
		JButton btnBack = new JButton("Back");
		btnBack.setBounds(163, 218, 117, 25);
		getContentPane().add(btnBack);
		
	    
	    
	}
}
