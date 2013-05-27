/**
 * 
 */
package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @author colangla
 *
 */
public class Client {

	private Socket socket;
	/**
	 * 
	 */
	public Client(int port) {
		
		BufferedReader in;
		PrintWriter out;

		try {

			this.socket = new Socket(InetAddress.getLocalHost(), port);
			System.out.println("Client : Demande de connexion");

			in = new BufferedReader(new InputStreamReader(this.socket.getInputStream()));
			String message_distant = in.readLine();
			System.out.println("Client _ msg server : " + message_distant);		

		} catch (UnknownHostException e) {

			e.printStackTrace();
			
		} catch (IOException e) {

			e.printStackTrace();
		}
	}
	
	public void close(){
		try{
			
			this.socket.close();	
			
		}catch(IOException e){
			
			e.printStackTrace();
		}
		
	}

}
