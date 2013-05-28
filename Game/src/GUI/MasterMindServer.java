package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.factories.FormFactory;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class MasterMindServer {

	private JFrame frmMastermindServer;
	private JTextField textField;
	private JButton btnMarche;
	private JButton btnArrt;
	private JLabel lblPort;
	private JPanel panel;
	private JScrollPane scrollPane;
	private JTable playerList;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MasterMindServer window = new MasterMindServer();
					window.frmMastermindServer.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MasterMindServer() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMastermindServer = new JFrame();
		frmMastermindServer.setFont(new Font("Arial", Font.PLAIN, 12));
		frmMastermindServer.setTitle("MasterMind Server");
		frmMastermindServer.setResizable(false);
		frmMastermindServer.setBounds(100, 100, 800, 500);
		frmMastermindServer.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel header = new JPanel();
		frmMastermindServer.getContentPane().add(header, BorderLayout.NORTH);
		header.setLayout(new FormLayout(new ColumnSpec[] {
				ColumnSpec.decode("6px"),
				ColumnSpec.decode("78px"),
				FormFactory.LABEL_COMPONENT_GAP_COLSPEC,
				ColumnSpec.decode("68px"),
				FormFactory.LABEL_COMPONENT_GAP_COLSPEC,
				ColumnSpec.decode("246px"),
				FormFactory.LABEL_COMPONENT_GAP_COLSPEC,
				ColumnSpec.decode("48px"),
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,},
			new RowSpec[] {
				FormFactory.LINE_GAP_ROWSPEC,
				RowSpec.decode("32px"),}));
		
		btnMarche = new JButton("Marche");
		header.add(btnMarche, "2, 2, left, top");
		
		btnArrt = new JButton("Arr\u00EAt");
		header.add(btnArrt, "4, 2, left, top");
		
		lblPort = new JLabel("Port");
		lblPort.setHorizontalAlignment(SwingConstants.CENTER);
		header.add(lblPort, "8, 2, left, center");
		
		textField = new JTextField();
		lblPort.setLabelFor(textField);
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		header.add(textField, "10, 2, left, center");
		textField.setColumns(10);
		
		panel = new JPanel();
		frmMastermindServer.getContentPane().add(panel, BorderLayout.CENTER);
		
		scrollPane = new JScrollPane();
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(34)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 261, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(499, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap(66, Short.MAX_VALUE)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 323, GroupLayout.PREFERRED_SIZE)
					.addGap(46))
		);
		
		String[] columnNames = {"First Name",
                "Last Name",
                "Sport",
                "# of Years",
                "Vegetarian"};
		
		Object[][] data = {
			    {"Kathy", "Smith",
			     "Snowboarding", new Integer(5), new Boolean(false)},
			    {"John", "Doe",
			     "Rowing", new Integer(3), new Boolean(true)},
			    {"Sue", "Black",
			     "Knitting", new Integer(2), new Boolean(false)},
			    {"Jane", "White",
			     "Speed reading", new Integer(20), new Boolean(true)},
			    {"Joe", "Brown",
			     "Pool", new Integer(10), new Boolean(false)}
			};
		
		playerList = new JTable(data,columnNames);
		scrollPane.setViewportView(playerList);
		panel.setLayout(gl_panel);
		
		
		
		
		
	}
}
