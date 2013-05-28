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
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JSeparator;
import javax.swing.JSlider;
import javax.swing.JProgressBar;
import javax.swing.JToggleButton;
import javax.swing.JSpinner;
import javax.swing.JPasswordField;
import javax.swing.JScrollBar;
import javax.swing.Popup;
import javax.swing.PopupFactory;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import network.*;

public class MasterMindServer {

	private JFrame frmMastermindServer;
	private JTextField serverPort;
	private JLabel lblPort;
	private JPanel panel;
	private JScrollPane scrollPane;
	private JTable playerList;
	private JSeparator separator;
	private JToggleButton tglbtnMarche;

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
				ColumnSpec.decode("164px"),
				FormFactory.LABEL_COMPONENT_GAP_COLSPEC,
				ColumnSpec.decode("110px"),
				FormFactory.LABEL_COMPONENT_GAP_COLSPEC,
				ColumnSpec.decode("246px"),
				FormFactory.LABEL_COMPONENT_GAP_COLSPEC,
				ColumnSpec.decode("48px"),
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,},
			new RowSpec[] {
				FormFactory.LINE_GAP_ROWSPEC,
				RowSpec.decode("32px"),}));
		
		tglbtnMarche = new JToggleButton("Marche");
		tglbtnMarche.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent arg0) {
				
				Server server;
				String vServerPort = serverPort.getText();
				
				if(vServerPort.isEmpty()){
					System.out.println("empty");
					 
				}else{
					server = new Server(Integer.parseInt(vServerPort));
					
					if(tglbtnMarche.isSelected()){
						tglbtnMarche.setText("En Marche");
						server.start();
					}else{
						tglbtnMarche.setText("A l'arrêt");
						server.stop();
						
					}
				}
				
				
				
			}
		});
		
		header.add(tglbtnMarche, "2, 2");
		
		lblPort = new JLabel("Port");
		lblPort.setHorizontalAlignment(SwingConstants.CENTER);
		header.add(lblPort, "8, 2, left, center");
		
		serverPort = new JTextField();
		lblPort.setLabelFor(serverPort);
		serverPort.setHorizontalAlignment(SwingConstants.CENTER);
		header.add(serverPort, "10, 2, left, center");
		serverPort.setColumns(10);
		
		panel = new JPanel();
		frmMastermindServer.getContentPane().add(panel, BorderLayout.CENTER);
		
		scrollPane = new JScrollPane();
		
		JLabel lblListeDesJoueurs = new JLabel("Liste des joueurs connect\u00E9s");
		
		separator = new JSeparator();
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(separator, GroupLayout.DEFAULT_SIZE, 774, Short.MAX_VALUE))
						.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_panel.createSequentialGroup()
								.addGap(134)
								.addComponent(lblListeDesJoueurs))
							.addGroup(gl_panel.createSequentialGroup()
								.addGap(27)
								.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 329, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(separator, GroupLayout.PREFERRED_SIZE, 2, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
					.addComponent(lblListeDesJoueurs)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 186, GroupLayout.PREFERRED_SIZE)
					.addGap(184))
		);
		
		String[] columnNames = {"Pseudo",
                "Adresse IP",
                "Meilleur score"};
		
		Object[][] data = {
			    {"Kathy", "Smith",
			     "Snowboarding"},
			    {"John", "Doe",
			     "Rowing"},
			    {"Sue", "Black",
			     "Knitting"},
			    {"Jane", "White",
			     "Speed reading"},
			    {"Joe", "Brown",
			     "Pool"}
			};
		
		playerList = new JTable(data,columnNames);
		playerList.setToolTipText("Liste des joueurs connect\u00E9s");
		playerList.setShowVerticalLines(false);
		scrollPane.setViewportView(playerList);
		panel.setLayout(gl_panel);
		
		
		
		
		
	}
}
