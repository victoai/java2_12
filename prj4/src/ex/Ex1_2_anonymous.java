package ex;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public class Ex1_2_anonymous {

	public static void main(String[] args) {
		
		BiFunction<Integer, Integer, Integer>  bif = new BiFunction<>(){

			@Override
			public Integer apply(Integer t, Integer u) {
				 
				return  t*u;
			}};		 
		
	    int result  =bif.apply(3, 2);
	    System.out.println( result);
			
		BiConsumer<String, Integer> bic =  new BiConsumer< >() {

			@Override
			public void accept(String t, Integer u) {
				 System.out.println(t + " :" +  u);				
			}
		};
				
		bic.accept("lamda", 8);
	}
	
	
	

}
