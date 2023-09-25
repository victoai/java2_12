package generic;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {		
		ArrayList<String> list = new ArrayList<>();
		list.add("one");
		list.add("two");
		print( list); 			 
	}

	
	
	public	  static void print( List< ? extends  String> list) {		
		list.forEach( str -> System.out.println(str));		
	}
	
	
	 
}
