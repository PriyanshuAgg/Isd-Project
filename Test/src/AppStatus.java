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
//		String[] columns = new String[] {
//            "Id", "Purchase Title", "Date of Submission", "Status"
//        };
//         
//        //actual data for the table in a 2d array
//        Object[][] data = new Object[][] {
//            {1, "xyz", "2nd Nov 2018", "Approved" },
//            {2, "yxz", "3rd Nov 2018", "Approved" },
//            {3, "abc", "4th Nov 2018", "Not Approved" },
//        };
//        //create table with data
//        final Class[] columnClass = new Class[] {
//                Integer.class, String.class, Double.class, Boolean.class
//            };
//            //create table model with data
//            DefaultTableModel model = new DefaultTableModel(data, columns) {
//                /**
//				 * 
//				 */
//				private static final long serialVersionUID = 1L;
//				@Override
//                public boolean isCellEditable(int row, int column)
//                {
//                    return false;
//                }
//                @Override
//                public Class<?> getColumnClass(int columnIndex)
//                {
//                    return columnClass[columnIndex];
//                }
//            };
//             
//            JTable table = new JTable(model);
//         
//        //add the table to the frame
//        this.add(new JScrollPane(table));
//         
//        this.setTitle("Status of Applications");
//        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       
//        this.pack();
//        this.setVisible(true);
		JFrame frame = new JFrame();
		frame.setTitle("Application Status");
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    Object rowData[][] = { { 1, "<html><a href=\"\">xyz </a></html>", "2nd Nov 2018", "Approved" },
	        { 2, "<html><a href=\"\">bca </a></html>", "3rd Nov 2018", "Approved" },
	        {3, "<html><a href=\"\">abc </a></html>", "4th Nov 2018", "Not Approved"}};
	    Object columnNames[] = { "Id", "Purchase Title", "Date of Submission", "Status" };
	    JTable table = new JTable(rowData, columnNames);

	    JScrollPane scrollPane = new JScrollPane(table);
	    frame.getContentPane().add(scrollPane, BorderLayout.CENTER);
	    frame.setSize(600, 450);
	    frame.setVisible(true);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setBounds(100, 100, 450, 300);
	contentPane = new JPanel();
	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	contentPane.setLayout(new BorderLayout(0, 0));
	setContentPane(contentPane);
	GroupLayout gl_contentPane = new GroupLayout(contentPane);
	gl_contentPane.setHorizontalGroup(
		gl_contentPane.createParallelGroup(Alignment.LEADING)
			.addGap(0, 440, Short.MAX_VALUE)
	);
	gl_contentPane.setVerticalGroup(
		gl_contentPane.createParallelGroup(Alignment.LEADING)
			.addGap(0, 290, Short.MAX_VALUE)
	);
	contentPane.setLayout(gl_contentPane);
}
	

	/**
	 * Create the frame.
	 */
	

}
