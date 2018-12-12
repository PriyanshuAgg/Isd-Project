import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MakePurchase extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	public MakePurchase(ViewAppPurchase parentthat) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		MakePurchase that =this;
		//ViewAppPurchase parentthat =new ViewAppPurchase();
		JLabel lblLastDateOf = new JLabel("Enter Last Date of Submission");
		lblLastDateOf.setBounds(25, 76, 233, 15);
		contentPane.add(lblLastDateOf);
		
		textField = new JTextField();
		textField.setBounds(260, 74, 114, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				that.dispose();
				parentthat.dispose();
			}
		});
		btnSubmit.setBounds(34, 206, 117, 25);
		contentPane.add(btnSubmit);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				that.dispose();
			}
		});
		btnBack.setBounds(257, 206, 117, 25);
		contentPane.add(btnBack);
	}
}
