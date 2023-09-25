package myarrays;

import java.util.Arrays;

public class SelectionSortEx {

	public static void main(String[] args) {
		 
		
		int[] kors  =  { 80,100,90,50};   // 오름차순 , 내림차순
		
		
		//selection sort 
		for( int i=0 ; i< kors.length-1 ; i++) {			
			for( int j=i+1 ; j< kors.length ; j++) {
				if( kors[i]  >kors[j] ) {					  
					int  tmp;
					tmp= kors[i];
					kors[i] =kors[j];
					kors[j] = tmp;					
				}				
			}
		}
		
		
		System.out.println( Arrays.toString(kors));
	}

}
