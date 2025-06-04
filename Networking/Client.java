package Networking;
import java.io.*;
import java.net.*;

public class Client {

	public static void main(String[] args) {
		try {
			Socket s = new Socket("AnkurPandey-PC",1000);
			DataOutputStream d1 = new DataOutputStream(s.getOutputStream());
			DataInputStream d2 = new DataInputStream(s.getInputStream()); 
			
			d1.writeUTF("heyyy it's meee pandeyy");
			d1.flush();
			
			String x = (String)d2.readUTF();
			System.out.println("\nReceived : "+x);
			
			d1.close();
			d2.close();
			s.close();			
					
		} catch (UnknownHostException e) {	
			e.printStackTrace();
		} catch (IOException e) {		
			e.printStackTrace();
		}

	}

}
