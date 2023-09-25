package thread;

public class Chatting2 {

	public static void main(String[] args) {		 
		
		Thread t = new Thread( new  Runnable() {

			@Override
			public void run() {
				for( int i=1 ; i<1000 ; i++) {				 
					System.out.println("메시지 받음~~~~~");
				}
				
			}});
		
		
		t.start();
		
		
		Thread t2 = new Thread( new  Runnable() {

			@Override
			public void run() {
				for( int i=1 ; i<1000 ; i++) {
					System.out.println("메시지 보냄 !!!!!!!!!!!!!!");
				}
				
			}});
		
		
		t2.start();

	}

}
