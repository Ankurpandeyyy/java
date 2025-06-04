package Networking;
import java.net.*;
import java.io.*;
public class Server {
	public static void main(String[] args)
	{
		try {
			ServerSocket ss = new ServerSocket(1000);
			System.out.println("waiting for Client to get Connected\n");
			
			Socket s1 = ss.accept();
			System.out.println("Connection Established\n");
			
			DataInputStream d1 = new DataInputStream(s1.getInputStream());
			InetAddress ipClient = s1.getInetAddress();
			System.out.println("Ip Address of Client : "+ipClient);
			
			String x = ipClient.toString();
			System.out.println("Tp Address : "+x);
			
			String test = "";
			int i=1 ;
			char ch = x.charAt(i);
			
			while(ch!='.')
			{
				test = test + ch ;
				i++;
				ch = x.charAt(i);
			}
			System.out.println("First Octet : "+test);
			
			String x1 = (String)d1.readUTF();
			System.out.println("\nReceived Message : "+x1);
			DataOutputStream d = new DataOutputStream(s1.getOutputStream());
			
			int cl = Integer.parseInt(test);
			if(cl<128)
			{
				test="Class A";
			}
			else if(cl<192)
			{
				test="Class B";
			}
			else if(cl<224)
			{
				test="Class C";
			}		
			else if(cl<240)
			{
				test="Class D";
			}	
			else
			{
				test="Class E";
			}
			d.writeUTF(test);
			ss.close();
			d1.close();
			d.close();	
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}

}
