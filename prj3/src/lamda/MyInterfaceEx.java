package lamda;

public class MyInterfaceEx {

	public static void main(String[] args) {		
		
		MyInterface f0 = new MyInterface() {
			@Override
			public void print(int x) {
				  System.out.println(" lamda ======");
                  System.out.println( x);				
			}};				 
		MyInterface f  = x -> System.out.println(x);		
		MyInterface f2 = x -> {
			                    System.out.println(" lamda ======");
                                System.out.println( x);
                                if( x>5)System.out.println("A");
                              }	;                      
		
		
       f0.print(3);
       f.print(2);
       f2.print(6);
       
                              
		

	}

}
