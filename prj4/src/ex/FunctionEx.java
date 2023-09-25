package ex;

import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionEx {

	public static void main(String[] args) {   // Integer, Double 
		 
		// 입력1  , 반환
		Function<Integer, Integer> f  =  x -> x+x ; 
		Function<Integer, Integer> f2  =  x -> {
			              System.out.println(" function interface test");
			              return x+x;
		} ;
		
		int result = f.apply(3);
		int result2 = f2.apply(5);		
		System.out.println( result);
		System.out.println( result2);
		
		Predicate<String>  p =  s ->  {
			 if( s.equals("hi"))
				 return true;
			 else return false;			
		};
		
		
		boolean result3 = p.test("hi");
		System.out.println( result3);
		
		
		Runnable  r  = ()-> System.out.println("run");
		
		r.run();
		
		Runnable  r1  = ()-> {
			for( int i=1;i<=9;i++) {
				System.out.println( 3*i);
			}
		};
		
		r1.run();

	}

}
