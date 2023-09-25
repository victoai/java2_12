package thread;

public class ChattingThreadEx {

	public static void main(String[] args) {
		 
		
		
		//보내는 기능 ( while(true) {} )	
		for( int i=0; i<1000; i++) {
			System.out.println("메시지 보냅니다. !!!!!");
		}
		
				
		ReciveThread thR = new ReciveThread();   // 쓰레드 생성
		thR.start();  // 쓰레드시작		
		

	}

}
