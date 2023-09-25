package ex;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public class Ex1_2 {

	public static void main(String[] args) {
		//문제1 문제2 풀이 		
		/*
		    BiConsumer<T,U>  :  두 개 매개변수
            BiFunction<T,U,R>  :  두 개 매개변수, 하나의 반환
            BiPredicate<T,U> :  두 개 매개변수 하나의 boolean 형 반환
		 */
		BiFunction<Integer, Integer, Integer>  bif = ( a,b ) ->  a>b?a:b ;
		BiFunction<Integer, Integer, Integer>  bif2 = ( a,b ) ->  {
			   int result;
			   if( a>b) {
				   result= a;
			   }else {
				   result =b;
			   }
			   return result;
		} ;
		
		BiConsumer<String, Integer> bic = ( name, i) -> System.out.println( name  +":"  +i);
		
	}

}
