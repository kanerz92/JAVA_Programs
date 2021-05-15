package assignment3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;
//Client class
public class Client {
	
	private static final int PORT_NUM = 9888;

	public static void main(String[] args) throws IOException {

		try {
			//Establishing the socket connection
			Socket socket = new Socket("localhost", PORT_NUM);
			System.out.println("Client: connected to server");
			String token = "";
			String response = "";
			//Creating BufferedReader input stream object
			BufferedReader brin = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			//Creating PrintWriter output stream object, true for auto flush()
			PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
			Scanner scanner = new Scanner(System.in);
			
			//Looping until exit has been entered
			do {
				System.out.println("Please enter token to submit");
				token = scanner.nextLine();
				out.println(token);
			
				response = brin.readLine();
				System.out.println("Client recieved message from server '"+response+"'");
				System.out.println("Client: sent  " +token +" to server");
				
			}while(!token.equals("exit"));
//				brin.close();
//				out.close();
//				socket.close();  //Closing socket and streams after use
//				System.out.println("Client: closed connection to server");
			
		} catch (IOException e) {
            System.out.println("Client Error: " + e.getMessage());
		}
	}
}

			
			
