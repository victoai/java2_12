package thread;

public class  쓰레드2 {
	
	static int index =0;  

	
	public static void widhdraw1() {		
		Thread  th= new Thread(  new Runnable() {

			@Override
			public void run() {
				 print();
				
			} });
		
		th.start();
		
	}
	
	public static void widhdraw2() {
		Thread  th= new Thread( new Runnable() {

			@Override
			public void run() {
				 
				print();
			    }  });
		th.start();
		
	}
	
	public   static void print() {
		
		 
		for( int i=1; i<=100; i++) {
			try {
				Thread.sleep(100);
				synchronized(쓰레드2.class)  {
				   index++;
				   System.out.println( "th=" + index );
				}
				  
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
		
	}
	
	public static void main(String[] args) {
		쓰레드2.widhdraw1();
		쓰레드2.widhdraw2(); 

	}

}
