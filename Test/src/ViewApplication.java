import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ViewApplication extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewApplication frame = new ViewApplication();
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
	public ViewApplication() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		ViewApplication that = this;
		JLabel lblPurchaseApplication = new JLabel("Purchase Application");
		
		JLabel lblDate = new JLabel("Date");
		
		JLabel lblPurchaseTitle = new JLabel("Purchase Title");
		
		JLabel title = new JLabel("Title");
		
		JLabel lblName = new JLabel("Name");
		
		JLabel name = new JLabel("Name");
		
		JLabel lblDescription = new JLabel("Description");
		
		JLabel desc = new JLabel("Description");
		
		JLabel lblBudgetRemain = new JLabel("Budget Remain");
		
		JLabel bgt_rem = new JLabel("Budget Remain");
		
		JScrollPane scrollPane = new JScrollPane();
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				that.dispose();
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(201)
							.addComponent(lblPurchaseApplication))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(64)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblPurchaseTitle)
								.addComponent(lblName)
								.addComponent(lblDescription)
								.addComponent(lblBudgetRemain))))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
									.addGroup(gl_contentPane.createSequentialGroup()
										.addPreferredGap(ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
										.addComponent(lblDate)
										.addGap(55))
									.addGroup(gl_contentPane.createSequentialGroup()
										.addComponent(desc)
										.addContainerGap()))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(bgt_rem)
									.addContainerGap()))
							.addGroup(gl_contentPane.createSequentialGroup()
								.addComponent(name)
								.addContainerGap()))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(title)
							.addContainerGap())))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(286, Short.MAX_VALUE)
					.addComponent(btnBack)
					.addGap(237))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 560, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(18, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblPurchaseApplication)
						.addComponent(lblDate))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblPurchaseTitle)
						.addComponent(title))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblName)
						.addComponent(name))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblDescription)
						.addComponent(desc))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblBudgetRemain)
						.addComponent(bgt_rem))
					.addGap(72)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
					.addComponent(btnBack)
					.addGap(40))
		);
		
		DefaultTableModel model = new DefaultTableModel(); 
		JTable table = new JTable(model); 
		model.addColumn("Name"); 
		model.addColumn("Description");
		model.addColumn("Reason for Purchase"); 
		model.addColumn("Estimated Cost");
		scrollPane.setViewportView(table);
		contentPane.setLayout(gl_contentPane);
	}
}
