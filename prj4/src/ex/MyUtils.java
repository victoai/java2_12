package ex;

public class MyUtils {
	
	String[] arr;
	
	public MyUtils() {
		
	}
	
	public MyUtils( String[] arr) {
		this.arr = arr;
	}
	
	public void forEach( MyConsumer c) {		 
		for( int i=0 ; i< arr.length ; i++) {
			c.accept( arr[i]);   // c.accept( "coffee");   i=0
		}		                 // c.accept( "icecream");  i=1
		                         // c.accept ("bread") ;    i=2
		              
	}		
	public static void main( String[] args) {	
		 String[] str= { "coffee" , "icecream" , "bread"};		 
		 MyUtils  u = new MyUtils(str);
		 u.forEach( s -> System.out.println( s + "****"));
		 
		 u.forEach( new MyConsumer() {
			@Override
			public void accept(String str) {
				System.out.println( str +"메뉴입니다");
				
		}});
		 
	}

}
