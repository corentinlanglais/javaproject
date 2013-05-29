/**
 * 
 */
package GUI;

import javax.swing.SwingUtilities;

/**
 * @author colangla
 *
 */
public class MasterMind {

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				MasterMindWindow window = new MasterMindWindow();
				window.setVisible(true);
			}
		});

	}

}
