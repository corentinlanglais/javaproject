package GUI;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JProgressBar;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PanelProgression extends JPanel {
	
	private JLabel lblProgressionTitle;
	private JLabel lblProgressionLevel;
	private JProgressBar pbProgressionLevel;
	private JLabel lblChallenges;
	private JLabel lblFight;
	private JLabel lblRatio;
	private JButton btnProgressionBack;

	/**
	 * Create the panel.
	 */
	public PanelProgression() {
		
		lblProgressionTitle = new JLabel("Votre progression");
		lblProgressionTitle.setFont(new Font("Tahoma", Font.BOLD, 22));
		
		lblProgressionLevel = new JLabel("Niveau de progression");
		lblProgressionLevel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		pbProgressionLevel = new JProgressBar();
		
		lblChallenges = new JLabel("Challenges");
		lblChallenges.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		lblFight = new JLabel("Combats");
		lblFight.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		lblRatio = new JLabel("Ratio");
		lblRatio.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		btnProgressionBack = new JButton("Retour");		
		
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(285)
							.addComponent(lblProgressionTitle))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(85)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblChallenges)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblProgressionLevel)
									.addGap(120)
									.addComponent(pbProgressionLevel, GroupLayout.PREFERRED_SIZE, 185, GroupLayout.PREFERRED_SIZE))
								.addComponent(lblFight)
								.addComponent(lblRatio))))
					.addContainerGap(303, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(664, Short.MAX_VALUE)
					.addComponent(btnProgressionBack)
					.addGap(47))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(44)
					.addComponent(lblProgressionTitle)
					.addGap(79)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblProgressionLevel)
						.addComponent(pbProgressionLevel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(39)
					.addComponent(lblChallenges)
					.addGap(41)
					.addComponent(lblFight)
					.addGap(51)
					.addComponent(lblRatio)
					.addPreferredGap(ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
					.addComponent(btnProgressionBack)
					.addGap(53))
		);
		setLayout(groupLayout);

	}

	public JButton getBtnProgressionBack() {
		return btnProgressionBack;
	}

	public void setBtnProgressionBack(JButton btnProgressionBack) {
		this.btnProgressionBack = btnProgressionBack;
	}
}
