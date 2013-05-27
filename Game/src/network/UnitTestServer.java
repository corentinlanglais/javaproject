/**
 * 
 */
package network;

/**
 * @author colangla
 *
 */
public class UnitTestServer {

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Server serveur = new Server(26175);
		Client client = new Client(26175);

	}

}
