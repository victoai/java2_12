package thread;

public class Thread2 {

	public static void main(String[] args) {
		 //하나의 쓰레드 , 싱글쓰레드, 흐름이 한 개인 프로그램 		 
		
	 		
		ThreadEx th = new ThreadEx();
		th.start();   //   쓰레드 실행요청     :   run();  <=운영체제가 실제 호출함
		
		
		for( int  i=1 ; i<= 1000 ; i++) {
			System.out.println( "hi");
		}
		 

	} 

}
 

class ThreadEx extends Thread{	
	 @Override
	public void run() {		 

			for( int  i=1 ; i<= 1000 ; i++) {
				System.out.println( "bye");
			}	
			
	}
	 
}
