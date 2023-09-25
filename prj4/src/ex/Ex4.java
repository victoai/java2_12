package ex;

import java.util.function.Supplier;

public class Ex4 {

	public static void main(String[] args) {		 
		
	 Supplier<Integer>  i4 =  () -> (int) (Math.random() *6) ;
	 int  result  =  i4.get();	 
	 System.out.println( result);
	 	 
	 Interface4 i = new Interface4() {

		@Override
		public int method() {			 
			return  (int)( Math.random() *6);
	 }}; 
		
	 int result2 =i.method()	;	 
	 System.out.println( result2);
	 
	 
		
	 Supplier<String>  s1 =   () -> "hello  supplier ";
	 String result3= s1.get();
	 System.out.println( result);
	
		
	 
	 
	 
	}
	
  
	
	

}
