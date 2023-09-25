package myarrays;

//배열정렬

public class MyArrays {	
	//배열을 매개변수로 받아서 정렬
	public static void sort( Object[] arr , MyComparator c) {			
		//selection sort 		
		for(  int i=0; i< arr.length-1 ; i++) {			
			for( int j=i+1 ; j<  arr.length; j++) {
				 if(   c.compare(arr[i], arr[j])   >0) {    // 양수값이 오면 자리바꿈 
		                 Object tmp;
		                 tmp= arr[i];
		                 arr[i]= arr[j];
		                 arr[j]=tmp; 
				 }			 
			}
		} 		
	}
	
	//
	
	
	
	
	
	
}
