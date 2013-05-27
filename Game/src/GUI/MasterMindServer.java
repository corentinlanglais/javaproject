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

public class MasterMindServer {

	private JFrame frame;
	private JTextField textField;
	private JPanel lists;
	private JButton btnMarche;
	private JButton btnArrt;
	private JLabel lblPort;
	private JTable playerList;
	private JTable matchList;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MasterMindServer window = new MasterMindServer();
					window.frame.setVisible(true);
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
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel header = new JPanel();
		frame.getContentPane().add(header, BorderLayout.NORTH);
		header.setLayout(new FormLayout(new ColumnSpec[] {
				ColumnSpec.decode("6px"),
				ColumnSpec.decode("78px"),
				FormFactory.LABEL_COMPONENT_GAP_COLSPEC,
				ColumnSpec.decode("68px"),
				FormFactory.LABEL_COMPONENT_GAP_COLSPEC,
				ColumnSpec.decode("44px"),
				FormFactory.LABEL_COMPONENT_GAP_COLSPEC,
				ColumnSpec.decode("36px"),
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
		
		lists = new JPanel();
		frame.getContentPane().add(lists, BorderLayout.CENTER);
		lists.setLayout(new GridLayout(0, 2, 0, 0));
		
		playerList = new JTable();
		lists.add(playerList);
		
		matchList = new JTable();
		lists.add(matchList);
	}

}
