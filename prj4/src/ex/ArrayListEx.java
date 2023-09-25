package ex;

import java.util.ArrayList;
import java.util.function.Consumer;

public class ArrayListEx {

	public static void main(String[] args) {
		 
		ArrayList<Score> list =new ArrayList<> ();
		
		list.add(  new Score("김도기", 100,90));
		list.add(  new  Score("장성철", 90 ,50));
		list.add(  new  Score("온하준", 40 ,99));
		list.add(  new  Score("안고은", 100 ,100));
		
		
		for( Score s: list){
			System.out.println( s);
		}
		
		list.forEach( s -> System.out.println(s));
		
		list.forEach( new Consumer<Score>() {
			@Override
			public void accept(Score t) {
				    System.out.println( t);
				
		 }});
		
		  
		
	}

}
