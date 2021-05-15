package assignment3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class Server {
	//Assigning port number to variable
	private static final int PORT_NUM = 9888;

	public static void main(String[] args) throws IOException {
		
		ServerSocket serverSocket = null;
		Socket socket = null;
		//Creating TreeSet object to store tokens
		TreeSet<String> tokenList = new TreeSet<String>();
		try {
			//Server listening on PORT_NUM
			serverSocket = new ServerSocket(PORT_NUM);
		}catch (IOException e) {
			e.printStackTrace();
		}
		//Continous loop
		while(true) {	
			try {
			System.out.println("Server: waiting for a client to connect");

				//Socket object inside while loop continously accepts incoming connections
				socket = serverSocket.accept();
			}
				catch (IOException e) {
					System.out.println("I/O error" +e);
				}
				try {
				//Obtaining input and output streams
				InputStream ins = socket.getInputStream();
				OutputStream outs = socket.getOutputStream();
				//Creating a ClientHandler object passing in socket and list reference
				ClientHandler ch = new ClientHandler(socket, tokenList, ins, outs);
				//Creating new thread object with ClientHandler object
				Thread t1 = new Thread(ch);
				//Start method invoked on newly created thread object	
				t1.start();
				}catch (IOException e) {
					socket.close();
					System.out.println("Server exception" + e.getMessage());
				}
		}
	}
}


