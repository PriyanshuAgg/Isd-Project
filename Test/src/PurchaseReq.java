import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;

@SuppressWarnings("serial")
public class PurchaseReq extends JFrame {

	private JTextField p_title;
	private ArrayList<Product> p = new ArrayList<Product>()  ;

	
	public PurchaseReq(Intender intn) {
		this.setTitle("New Purchase");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 450);
		PurchaseReq that = this;
		
		JLabel lblNewLabel = new JLabel("Budget Remain");
		
		JLabel lblNewLabel_1 = new JLabel(Float.toString(intn.getBudget()));
		
		JLabel lblNewLabel_2 = new JLabel("Name");
		
		JLabel lblArtClub = new JLabel(intn.getName());
		
		JLabel lblPurchaseTitle = new JLabel("Purchase Title");
		
		p_title = new JTextField();
		p_title.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		DefaultTableModel model = new DefaultTableModel(); 
		JTable table = new JTable(model); 
		model.addColumn("Name"); 
		model.addColumn("Description");
		model.addColumn("Reason for Purchase"); 
		model.addColumn("Estimated Cost");
		scrollPane.setViewportView(table);
		JButton btnAddProducts = new JButton("Add Products");
		btnAddProducts.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AddProducts addp = new AddProducts();
				addp.setVisible(true);
				addp.getSubmit().addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Product P = new Product(addp.getName(),addp.getDesc().getText(),addp.getRsn_purch().getText(),Float.valueOf(addp.getCost().getText()),addp.getReq_specs().getText(),addp.getPref_specs().getText());
						System.out.println("HEllo"+P.getName());
						p.add(P);
						model.addRow(new Object[]{P.getName(),P.getDesc(),P.getReason(),P.getCost()});
						System.out.println(p);
					}
				});
			}
		});
		JTextPane textPane = new JTextPane();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate localDate = LocalDate.now();
		JLabel lblDasas = new JLabel(dtf.format(localDate));
		
		JLabel lblAddItems = new JLabel("Purchase Application");
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Application appl = new Application(1, intn.getId(), p_title.getText(), "Created", "New",dtf.format(localDate),textPane.getText());
				new PurchReqCont(intn,p,appl);
				that.setVisible(false);
			}
		});
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				that.setVisible(false);
			}
		});
		
		JLabel lblDate = new JLabel("Date");
		
		
		
		
		JLabel lblDescription = new JLabel("Description");
		
		
		
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(96)
					.addComponent(btnSubmit, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 220, Short.MAX_VALUE)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)
					.addGap(64))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(249, Short.MAX_VALUE)
					.addComponent(btnAddProducts, GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE)
					.addGap(204))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 584, Short.MAX_VALUE)
					.addContainerGap())
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(44)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(lblPurchaseTitle, GroupLayout.PREFERRED_SIZE, 166, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblDescription)))
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(41)
									.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE)))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(textPane, GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
								.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
								.addComponent(p_title, GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
								.addComponent(lblArtClub, GroupLayout.PREFERRED_SIZE, 178, GroupLayout.PREFERRED_SIZE)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(206)
							.addComponent(lblAddItems, GroupLayout.PREFERRED_SIZE, 156, GroupLayout.PREFERRED_SIZE)
							.addGap(94)
							.addComponent(lblDate)))
					.addGap(32)
					.addComponent(lblDasas)
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblAddItems)
						.addComponent(lblDate)
						.addComponent(lblDasas))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblPurchaseTitle)
						.addComponent(p_title, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2)
						.addComponent(lblArtClub))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblDescription)
						.addComponent(textPane, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(lblNewLabel_1))
					.addPreferredGap(ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
					.addGap(59)
					.addComponent(btnAddProducts)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton)
						.addComponent(btnSubmit))
					.addGap(23))
		);
		getContentPane().setLayout(groupLayout);
	}
}
