package assignment3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;
//Class to handle client connections and assign a thread and call run()
//Used to free up serve as to allow server to be free to accept incoming connections
public class ClientHandler extends Thread  {
	final InputStream in;
	final OutputStream outs;
	final Socket socket;
	final TreeSet<String> tokenList;
	
	//Atomic Integer to keep track of clients
	private static AtomicInteger clientnum = new AtomicInteger(0);
	//Contructor taking in socket, treeset, inputstream and outputstream
	public ClientHandler(Socket socket,TreeSet<String> tokenList, InputStream in, OutputStream outs) {
		this.socket = socket;
		this.in = in;
		this.outs = outs;
		this.tokenList = tokenList;
		
	}
	@Override
	//Implementing run method for client handler object threads
	public void run() {
		
		String token = "";
		//Synchronizing TreeSet amongst clients
				synchronized(tokenList) {
		//Starting loop until exit is recieved from client
//		while(true) {
		
			//Incrementing AtomicNumber for each client connected 
			clientnum.getAndIncrement();
			try {
			BufferedReader brin = new BufferedReader(
					new InputStreamReader(in));
			PrintWriter out = new PrintWriter(outs, true);
			
			//Assigning input from client to token string variable
			token = brin.readLine();
						
				while(!token.equalsIgnoreCase("exit")) {
					brin.close();
					out.close();		
					System.out.println("Server: connection to client closed");
					System.out.println("");
					socket.close();  
				//If statment to store tokens in set max 10
				if(token.contains("Submit") && tokenList.size()!=10 ) { 
					//Creating string array, whitespace delimeter
					//Extracting[1] element and storing in set
					String[] res = token.split(" ");
					
				System.out.println("Recieveed from client "+clientnum +":" +res[1]);
				//Adding [1]element to set
				tokenList.add(res[1]);
				//Notifying all other client threads
				tokenList.notifyAll();
				out.println("OK");		
				System.out.println("Server sent OK to client ");
				token = brin.readLine();
				}
				//if statement logic to send and print treeset
				if(token.equalsIgnoreCase("retrieve")) {
					System.out.println("Server recieved message from Client" +clientnum +":" +token);
					out.println(tokenList);
					System.out.println("Server sent response" +tokenList +" to Client");//Need to keep tract of clients and give them number?
					System.out.println();
					token = brin.readLine();		
				}
			}
//			brin.close();
//			out.close();		
//			System.out.println("Server: connection to client closed");
//			System.out.println("");
//			socket.close();  		
			
		}			
		catch (IOException e) {
			System.out.println("Error at ClientHandler Run" +e.getMessage());
				}
			}	
		}
	}



	



