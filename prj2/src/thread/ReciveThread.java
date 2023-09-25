package thread;

public class ReciveThread extends Thread {
	@Override
	public void run() {
		
		//받는 기능  ( while( true) {} )
		for( int i=0; i<1000;i++) {
			System.out.println("메시지 받습니다. ~~~~~");
		}
	 
	}
	
}
