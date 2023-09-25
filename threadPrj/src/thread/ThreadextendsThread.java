package thread;

public class ThreadextendsThread {

	public static void main(String[] args) {		
		//비동기 		
		ThreadEx2 th  = new ThreadEx2();
		th.start();//   쓰레드 실행			
		System.out.println(" main입니다");	 
	}

}



class ThreadEx2  extends Thread{
	@Override
	public void run() {
		 // 작업  
		for( int i=0; i<100 ;i ++) {
			System.out.println("hi");
		}
		
	}
	
}
