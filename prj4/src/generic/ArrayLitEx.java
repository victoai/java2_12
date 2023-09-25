package generic;

import java.util.ArrayList;
import java.util.function.Consumer;

public class ArrayLitEx {

	public static void main(String[] args) {
		 
				
		ArrayList<String> list = new ArrayList<>();		
		list.add("coffee");
		list.add("icecream");
		list.add("bread");		
		
		
		list.forEach(  str  -> System.out.println( str));		
		
		list.forEach( new Consumer<String> () {
			@Override
			public void accept(String t) {
				 System.out.println( t);			
		}});
		
		//list.f
		 

		
	}

}
