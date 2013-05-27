/**
 * 
 */
package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import game.*;


/**
 * @author colangla
 *
 */
public class Server{
	
	private int port;
	/**
	 * 
	 */
	public Server(int pPort) {
		this.port = pPort;

		// playerList.add(new Player());

		ServerSocket socket;
		
		try {
			socket = new ServerSocket(this.port);
			Thread t = new Thread(new ManageClient(socket));
			t.start();
			System.out.println("Server lancé sur le port : " + this.port + " !");

		} catch (IOException e) {

			e.printStackTrace();
		}
	}
}
