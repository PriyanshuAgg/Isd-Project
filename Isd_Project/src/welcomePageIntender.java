import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class welcomePageIntender extends JFrame {

	private JPanel pur_req;

	public welcomePageIntender(Intender intn) {
		this.setTitle("Welcome Page");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		pur_req = new JPanel();
		pur_req.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(pur_req);
		welcomePageIntender that = this;
		
		JLabel lblWelcomeUser = new JLabel("WELCOME "+intn.getName());
		
		JButton pur_rqst = new JButton("Create Purchase Request");
		pur_rqst.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				PurchaseReq purchase =new PurchaseReq(intn);
				purchase.setVisible(true);
			}
		});
	
		JButton prev_pur = new JButton("Show Previous Purchases");
		prev_pur.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				PrevPurchases previous = new PrevPurchases();
				previous.setVisible(true);
			}
		});
		
		JButton app_stat = new JButton("Show Application Status");
		app_stat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AppStatus app = new AppStatus();
				app.setVisible(true);
			}
		});
		
		JButton bgt_stat = new JButton("Show Budget Status");
		
		JButton log_out = new JButton("Log Out");
		
		
		GroupLayout gl_pur_req = new GroupLayout(pur_req);
		gl_pur_req.setHorizontalGroup(
			gl_pur_req.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pur_req.createSequentialGroup()
					.addGap(97)
					.addComponent(pur_rqst, GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
					.addGap(80))
				.addGroup(gl_pur_req.createSequentialGroup()
					.addGap(97)
					.addComponent(prev_pur, GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
					.addGap(80))
				.addGroup(gl_pur_req.createSequentialGroup()
					.addGap(97)
					.addComponent(app_stat, GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
					.addGap(80))
				.addGroup(gl_pur_req.createSequentialGroup()
					.addGap(97)
					.addComponent(bgt_stat, GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
					.addGap(80))
				.addGroup(gl_pur_req.createSequentialGroup()
					.addGap(7)
					.addComponent(lblWelcomeUser, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 215, Short.MAX_VALUE)
					.addComponent(log_out, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
					.addGap(7))
		);
		gl_pur_req.setVerticalGroup(
			gl_pur_req.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pur_req.createSequentialGroup()
					.addGap(14)
					.addGroup(gl_pur_req.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pur_req.createSequentialGroup()
							.addGap(5)
							.addComponent(lblWelcomeUser))
						.addComponent(log_out))
					.addGap(27)
					.addComponent(pur_rqst, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addGap(22)
					.addComponent(prev_pur, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addGap(25)
					.addComponent(app_stat, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addGap(25)
					.addComponent(bgt_stat, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(52, Short.MAX_VALUE))
		);
		pur_req.setLayout(gl_pur_req);
	}
}
