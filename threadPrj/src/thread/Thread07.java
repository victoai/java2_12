package thread;

public class Thread07 {

	public static void main(String[] args) {
		
		
		/*
		 
		 for( int i=0; i<100; i++) {
					 System.out.println("hi");
		 }
		  
		 */
		
//		Runnable r = new Runnable() {};
 
    	Runnable r = new Runnable() {

			@Override
			public void run() {
				 for( int i=0; i<100; i++) {
					 System.out.println("hi");
				 }
				
			}};		
		
		Thread th = new Thread(r);
		th.start();
		
		
		
		System.out.println(" main입니다");
		 
		 

	}

}



 