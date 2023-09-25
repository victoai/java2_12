package thread;

public class MultiThreadEx {

	public static void main(String[] args) {
		 
		
       ThreadEx th = new ThreadEx();  //쓰레드 생성
	   th.start();   // 쓰레드 시작 
		
		for( int i=0; i<1000; i++ ) {
			System.out.println(  "first" +  i );
		}			
	
	  
	}
}


// 쓰레드 만들기 
// run매서드 재정의 
class ThreadEx  extends Thread {	
	@Override
	public void run() {	 
		for( int i=0; i<1000; i++) {
			System.out.println(" second =" + i);
		}
	}
	
}

