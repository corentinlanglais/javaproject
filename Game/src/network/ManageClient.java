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
public class ManageClient implements Runnable {

	private ServerSocket socketserver;
    private Socket socket; 
	
	/**
	 * 
	 */
	public ManageClient(ServerSocket pSocket) {
		this.socketserver = pSocket;
	}
	
	public void run() {
		
		BufferedReader in;
		PrintWriter out;

		try {
			
			while (true) {
				
				this.socket = this.socketserver.accept(); 
				System.out.println("Server : Un client vient de se connecter !");
				
				out = new PrintWriter(this.socket.getOutputStream());
                out.println("Bienvenue !");
                out.flush();
				
				this.socket.close();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
