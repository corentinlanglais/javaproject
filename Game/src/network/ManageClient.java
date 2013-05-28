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
public class ManageClient extends Thread {

	private ServerSocket socketserver;
    private Socket socket; 
    private Boolean isRunning;
	
	/**
	 * 
	 */
	public ManageClient(ServerSocket pSocket) {
		this.socketserver = pSocket;
		this.isRunning = true;
	}
	
	/**
	 * Getter / Setter
	 */
	public Boolean getIsRunning() {
		return isRunning;
	}

	public void setIsRunning(Boolean isRunning) {
		this.isRunning = isRunning;
	}

	public void run() {
		
		BufferedReader in;
		PrintWriter out;

		try {
			
			while (isRunning) {
				
				this.socket = this.socketserver.accept(); 
				System.out.println("Server : Un client vient de se connecter !");
				
				//out = new PrintWriter(this.socket.getOutputStream());
                //out.println("Bienvenue !");
                //out.flush();
				
				this.socket.close();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
