package thread;

public class ThreadRunnable {

	public static void main(String[] args) {
		 //하나의 쓰레드 , 싱글쓰레드, 흐름이 한 개인 프로그램 		 
		
		 MyThread  r = new MyThread();  //객체생성
		 Thread th = new Thread( r );
		 th.start();
		
		
		
		 Thread  th2 = new Thread(  new Runnable() {
			@Override
			public void run() {
				for( int  i=1 ; i<= 1000 ; i++) {
					System.out.println( "second=" +  i);
				}	
				
		 }});
		 th2.start();				

	}	
	
	

}


//이름있는 클래스를 작성 
class MyThread implements Runnable{

	@Override
	public void run() {
		for( int  i=1 ; i<= 1000 ; i++) {
			System.out.println( "first=" +  i);
		} 
		
	}	
}