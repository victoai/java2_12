package thread;

public class ChattingThreadEx2 {

	public static void main(String[] args) {
	    // Runnable Interface 구현 		
		/*
		    Interface  Runnable(){
		       void run();
		    }
		 */
		// Runnable 인터페이스  1. 이름있는 클래스 작성 2. 익명클래스 작성
		
		// Thread th = new Thread( new Thread1());
		// th.start();			
		 
		   Thread th = new Thread( new Runnable() {

			@Override
			public void run() {
				for( int i=0 ; i<1000;i++) {
					System.out.println(" 보냅니다!!!!");
				}	
				
			}});
		   
		  th.start(); 
		 
		 
		
		for( int i=0 ; i< 1000; i++) {
			System.out.println(" 받습니다.~~~~~~~~");
		}
		

	}
}

class Thread1 implements Runnable{
	@Override
	public void run() {
		for( int i=0 ; i<1000;i++) {
			System.out.println(" 보냅니다!!!!");
		}		
	}
	
}