/**
 * 
 */
package GUI;

import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;

/**
 * @author Corentin Langlais
 *
 */
public class MasterMindWindow extends JFrame {
	
	private PanelHome panelHome = new PanelHome();
	private PanelModeChoice panelModeChoice = new PanelModeChoice();
	private PanelSoloGame panelSoloGame = new PanelSoloGame();
	private PanelProgression panelProgression = new PanelProgression();
		
	public MasterMindWindow() {
		super();
		
		build();
	}
	
	private void build(){
		setTitle("MasterMind"); 
		setSize(800,500); 	
		setResizable(false); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		
		getContentPane().add(panelHome);	
		
		validate();
		
		setLocationRelativeTo(null); 
		
		/*
		 * Listener
		 */
		
		panelHome.getBtnConnexion().addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				
				getContentPane().removeAll();
				getContentPane().add(panelModeChoice);
				validate();
			}
		});
		
		panelModeChoice.getBtnLocalGame().addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				
				getContentPane().removeAll();
				getContentPane().add(panelSoloGame);
				validate();
				
			}
		});
		
		panelModeChoice.getImgProgression().addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				
				getContentPane().removeAll();
				getContentPane().add(panelProgression);
				validate();
			}
		});
		
		panelProgression.getBtnProgressionBack().addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				
				getContentPane().removeAll();
				getContentPane().add(panelModeChoice);
				revalidate();
			}
		});
		
		
	}

	

}
