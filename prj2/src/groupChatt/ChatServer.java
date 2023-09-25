package groupChatt;

 
import java.io.FileWriter;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;

public class ChatServer {
	Vector<ChatHandler> v;
	FileWriter fw ;
		

	public ChatServer( ) {
		try {
			
			ServerSocket ss = new ServerSocket(6100);
			v= new Vector<>();
			System.out.println("서버 준비 완료");
			fw= new FileWriter("C:\\Users\\user\\Documents\\새 폴더\\log.txt"); 
			while(true) {
				Socket s = ss.accept();
				ChatHandler c= new ChatHandler(this, s);
				System.out.println("클라이언트");
				c.start();			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	public void register(ChatHandler c) {	 
		v.add(c);
	}

	public void unregister(ChatHandler c) {		
		v.remove(c);
	}
	
	 
	public synchronized  void broadcast(String message) {	  
			 System.out.println( message);
			 try {
				fw.write(message);
				fw.flush();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}	 
			 
		
			for(int i=0; i<  v.size(); i++) {				 
				ChatHandler c = v.get(i);
				try {
					c.disp(message);
				}catch(Exception e) {
					e.printStackTrace();
				}
			}	 	 
	}
	
	
	

	public static void main(String[] args) {
	 
		new ChatServer( );

	}

}
