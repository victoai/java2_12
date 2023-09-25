package prj1;

import java.util.Arrays;
import java.util.Comparator;

public class SortEx2 {

	public static void main(String[] args) {
		 
		
		//selection sort 		
 
		Food[] foods = new Food[3];
		foods[0] = new Food( "크림파스타" , 15000);
	    foods[1] = new Food( "돌솥비빔밥" , 11000);
	    foods[2] = new Food( "쫄면" , 7000);
		
	    
	    
	    for(  Food food: foods) {
	    	System.out.println(food);
	    }	     
	    
	    System.out.println("정렬후 ===>");
	    
	 
	     //Arrays.sort(foods);	    
	 
	    
	    
	    Arrays.sort(foods,  new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				 
				Food f1 = (Food)o1;
				Food f2=  (Food)o2;				
				
			//	return f1.price - f2.price;
				return f1.name.compareTo(f2.name);
			}}   );
	    	    
	    
	    for(  Food food: foods) {
	    	System.out.println(food);
	    }
	    

	}

}
