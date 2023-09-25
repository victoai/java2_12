package chatt;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {	
	
	Socket socket;	
	DataInputStream dataInputStream;   // 보조스트림  in
	DataOutputStream dataOutputStream;	  // 보조스트림 out
	
	
	public Client() {		
		try {			
			socket = new Socket("localhost", 6100);   // 서버의 ip , 포트번호 			
			dataInputStream = new DataInputStream( socket.getInputStream());
			dataOutputStream = new DataOutputStream( socket.getOutputStream());			
			//보내기	
			sendMsg();
			//받기	
			receiveMsg();
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	} 	
	
	private  void sendMsg() {
		  System.out.println("메시지 작성");
		  Scanner sc = new Scanner(System.in);
		  String msg = sc.nextLine();
		  try {
			dataOutputStream.writeUTF(msg );
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
	}
	
	
	
	private void receiveMsg() {		
		try {
			 
		    String  msg = dataInputStream.readUTF();
			System.out.println( msg);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void main( String[] args) {
		 new Client();
		 
	}

}
