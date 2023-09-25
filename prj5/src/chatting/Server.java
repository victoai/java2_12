package chatting;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	
	ServerSocket sc;
	Socket s;
	
	DataInputStream in;
	DataOutputStream out;
	
	public Server() {		 
		try {
			sc = new ServerSocket(6077);
			System.out.println( " 서버 준비");
			s =sc.accept();
			System.out.println( "  클라이언트 생성");
			in  = new DataInputStream( s.getInputStream());
			out = new DataOutputStream(s.getOutputStream());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

	
	public static void main(String[] args) {
		  new Server();
	}
}
