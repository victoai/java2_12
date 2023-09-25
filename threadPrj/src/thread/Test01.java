package thread;

public class Test01 {

	public static void main(String[] args) {	 
		
		 Thread1 th1 = new Thread1();
		 th1.start();
		  

		 Thread  th2 = new Thread( new RunnableImp());
		 th2.start();
	}

}




class Thread1 extends Thread{
	
	@Override
	public void run() {
		  for( int i=0 ; i< 100 ;i++) {
			  System.out.println( "thread1" +  i);
		  }
	}
	
}

//인터페이스구현한 클래스 
class RunnableImp  implements Runnable{

	@Override
	public void run() {
		  for( int i=0 ; i< 100 ;i++) {
			  System.out.println( "thread2" +  i);
		  }
		
	}
	
}