import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.JButton;

public class TechReview extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TechReview frame = new TechReview();
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
	public TechReview() {
		this.setTitle("Technical Review");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(37, 54, 476, 88);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JLabel lblReview = new JLabel("Review");
		lblReview.setBounds(37, 227, 97, 15);
		contentPane.add(lblReview);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(120, 217, 385, 126);
		contentPane.add(textPane);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(280, 384, 117, 25);
		contentPane.add(btnSubmit);
	}
}
