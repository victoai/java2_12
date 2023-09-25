package lamda;

import java.util.ArrayList;
import java.util.function.Consumer;

public class ArrayListEx {

	public static void main(String[] args) {
		 
		
		ArrayList<String> list = new ArrayList<>();	
		list.add("김도기");
		list.add("온하준");
		list.add("박주임");
		list.add("김주임");				
		list.forEach(  str -> System.out.println( str));
		list.forEach(  str -> {  System.out.println("모범택시2: 등장인물");
		                         System.out.println( str) ;
		                      });		
		list.forEach( new Consumer<String>() {
			@Override
			public void accept(String t) {
				 System.out.println("**"+ t) ;				
			}});
		
	 
		
		
		
		

	}

}
