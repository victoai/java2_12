package prj1;

import java.util.Arrays;
import java.util.Comparator;

public class SortEx {

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
	    
	    for( int i=0 ; i< foods.length-1; i++) {
	    	for( int j=i+1; j< foods.length ;j++) {
	    		
	    		  if( foods[i].price   > foods[j].price) {	    			  
	    			  Food tmp;
	    			  tmp = foods[i];
	    			  foods[i]= foods[j];
	    			  foods[j]=tmp;
	    		  }
	    	}
	    }	     
	    
	 //   Arrays.sort(foods);
	    
	    
	    
	    
	    for(  Food food: foods) {
	    	System.out.println(food);
	    }
	    

	 
	    
	    System.out.println("==> 정렬 후 ");
	    for(  Food food: foods) {
	    	System.out.println(food);
	    }	    
	    
	    //실습  Comparator인터페이스를 구현한 클래스를 작성하시오
	    //     만든 클래스를 이용해서  Arrays.sort() 정렬하기 
	    
	}
	 
	

}
