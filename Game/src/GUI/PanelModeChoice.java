package GUI;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PanelModeChoice extends JPanel {
	
	private JButton btnLocalGame;
	private JButton btnOnLineGame;
	private JLabel imgProgression;
	
	/**
	 * Create the panel.
	 */
	public PanelModeChoice() {
		
		btnLocalGame = new JButton("Jeu en solo");				
		btnOnLineGame = new JButton("Jeu en ligne");		
		imgProgression = new JLabel("Image Score");		
		
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
					.addGap(340)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(btnOnLineGame)
						.addComponent(btnLocalGame))
					.addContainerGap(371, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(582, Short.MAX_VALUE)
					.addComponent(imgProgression)
					.addGap(158))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(148)
					.addComponent(btnLocalGame)
					.addGap(29)
					.addComponent(imgProgression)
					.addGap(26)
					.addComponent(btnOnLineGame)
					.addContainerGap(237, Short.MAX_VALUE))
		);
		setLayout(groupLayout);

	}

	public JButton getBtnLocalGame() {
		return btnLocalGame;
	}

	public void setBtnLocalGame(JButton btnLocalGame) {
		this.btnLocalGame = btnLocalGame;
	}

	public JButton getBtnOnLineGame() {
		return btnOnLineGame;
	}

	public void setBtnOnLineGame(JButton btnOnLineGame) {
		this.btnOnLineGame = btnOnLineGame;
	}

	public JLabel getImgProgression() {
		return imgProgression;
	}

	public void setImgProgression(JLabel imgProgression) {
		this.imgProgression = imgProgression;
	}

}
