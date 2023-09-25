package thread;

public class SingleThreadEx_ {

	public static void main(String[] args) {
		 
		
		for( int i=0; i<100; i++ ) {
			System.out.println(  "first" +  i );
		}
				
		for( int i=0; i<100; i++) {
			System.out.println(" second =" + i);
		}

	}

}

