package GUI;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PanelHome extends JPanel {
	private JTextField tfUsername;
	private JPasswordField tfPassword;
	private JLabel imgGame;
	private JLabel lblUsername;
	private JLabel lblPassword;
	private JButton btnConnexion;

	/**
	 * Create the panel.
	 */
	public PanelHome() {
		
		imgGame = new JLabel("Logo du jeu");		
		lblUsername = new JLabel("Identifiant");		
		lblPassword = new JLabel("Mot de passe");
		
		tfUsername = new JTextField();
		tfUsername.setColumns(10);
		
		tfPassword = new JPasswordField();		
		btnConnexion = new JButton("Connexion");		
		
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(237)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblPassword)
							.addGap(121)
							.addComponent(tfPassword, GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblUsername)
							.addPreferredGap(ComponentPlacement.RELATED, 135, Short.MAX_VALUE)
							.addComponent(tfUsername, GroupLayout.PREFERRED_SIZE, 142, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)))
					.addGap(236))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(346)
					.addComponent(imgGame)
					.addContainerGap(398, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(338)
					.addComponent(btnConnexion)
					.addContainerGap(379, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(50)
					.addComponent(imgGame)
					.addGap(128)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblUsername)
						.addComponent(tfUsername, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(36)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblPassword)
						.addComponent(tfPassword, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(68)
					.addComponent(btnConnexion)
					.addContainerGap(141, Short.MAX_VALUE))
		);
		setLayout(groupLayout);

	}

	public JButton getBtnConnexion() {
		return btnConnexion;
	}

	public void setBtnConnexion(JButton btnConnexion) {
		this.btnConnexion = btnConnexion;
	}
}
