package thread;

public class Thread3 {

	public static void main(String[] args) {	 
		ThreadEx02 th0 = new ThreadEx02();
		th0.start();//		
		//2.	 
		/*
		 * 
		 *  @FunctionalInterface
		 *  interface Runnable{		 *  
		 *       void run();		 *  
		 *  }
		 */                                  // 100번 hi를 출력
		
	 
		// Thread th = new Thread();  // 1. 인터페이스를 구현한 클래스를 정의  , 객체를 생성 
		                              // 2. 인터페이스를 익명클래스로 정의한다음 객체를 생성 
		                              // 3. 람다식 
		Thread th = new Thread( new Runnable() {

			@Override
			public void run() {
				 for( int i=1; i<=200; i++) {
					 System.out.println("hi");
				 }
				
			}}  );
		th.start();                                             

	}
                    
}

/*  void run(){   
   } 
 */

//1. 쓰레드생성방법  Thread클래스를 상속받아 실제 실행할 코드를  run에 구현함 (쓰레드로 구현할 내용이 들어감 ) // 100번 bye 출력
class ThreadEx02  extends Thread{
	
	@Override
	public void run() {
		 for( int i=1; i<=200; i++) {
			 System.out.println("bye");
		 }      
	}
}