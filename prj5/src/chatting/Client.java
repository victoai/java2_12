package chatting;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Client {		
	Socket s;	
	DataInputStream in;
	DataOutputStream out;	
	
	public Client() {
		try {
			s= new Socket("localhost", 6077);
			System.out.println("서버 접속 요청");			
			in = new DataInputStream(  s.getInputStream());
			out = new DataOutputStream( s.getOutputStream());
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args){
		
		 new Client();
	}

}
