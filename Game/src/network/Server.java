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
	private ServerSocket socket;
	private ManageClient mServerThread;
	/**
	 * 
	 */
	public Server(int pPort) {
		this.port = pPort;		
	}
	
	public void start(){
		// playerList.add(new Player());	
		
		try {
			this.socket = new ServerSocket(this.port);
			this.mServerThread = new ManageClient(socket);
			this.mServerThread.start();
			System.out.println("Server lancé sur le port : " + this.port + " !");

		} catch (IOException e) {

			e.printStackTrace();
		}
	}
	
	public void stop(){
		try{
			this.mServerThread.setIsRunning(false);
			this.socket.close();
			
		} catch (IOException e) {

			e.printStackTrace();
		}
		
	}
}
