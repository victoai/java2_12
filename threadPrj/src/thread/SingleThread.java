package thread;

public class SingleThread {

	public static void main(String[] args) {
		 //하나의 쓰레드 , 싱글쓰레드, 흐름이 한 개인 프로그램 		 
		
		for( int  i=1 ; i<= 1000 ; i++) {
			System.out.println( "first=" +  i);
		}
		 
		
		for( int  i=1 ; i<= 1000 ; i++) {
			System.out.println( "second=" +  i);
		}	
		

	}

}
