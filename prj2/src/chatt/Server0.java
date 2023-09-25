package chatt;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server0 {
	ServerSocket serverSocket;
	Socket clientSocket;	
	DataInputStream dataInputStream;
	DataOutputStream dataOutputStream;	
	
	
	 public Server0() {
		 
		 try {
			serverSocket  = new ServerSocket(6100);
			System.out.println(" server waiting");
			clientSocket = serverSocket.accept();
			System.out.println("server start");
			String clientIp = clientSocket.getInetAddress().toString();
			
			
			System.out.println( clientIp +"방가") ;
			// 
			dataInputStream = new DataInputStream( clientSocket.getInputStream());
			dataOutputStream = new DataOutputStream ( clientSocket.getOutputStream());			
			dataRecv();
			dataSend();				
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // �룷�듃踰덊샇  5500~9900		 
	 }
	
	
	private void dataSend() {		 //蹂대궡湲�		
		Scanner in = new Scanner(System.in);		
		try {
			System.out.println(" 메시지 작성");
			String message  = in.nextLine();
			dataOutputStream.writeUTF(message);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
 
	private void dataRecv() {
		try {
			String message  =dataInputStream.readUTF();
			System.out.println( message);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	} 


	public static void main(String[] args) {
		 new Server0();

	}

}
